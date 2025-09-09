/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int idx = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }

        return build(preorder, map, 0, inorder.length-1);
    }
    public TreeNode build(int[] preorder, HashMap<Integer, Integer> map, int left, int right){
        if(left > right){
            return null;
        }
        int item = preorder[idx++];
        TreeNode root = new TreeNode(item);
        int inIdx = map.get(item);
        root.left = build(preorder, map, left, inIdx-1);
        root.right = build(preorder, map, inIdx+1, right);
        return root;
    }
    
}