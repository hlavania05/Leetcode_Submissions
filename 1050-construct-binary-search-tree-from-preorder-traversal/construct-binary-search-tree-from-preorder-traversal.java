/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return func(preorder, Integer.MAX_VALUE, new int[]{0}, preorder.length);
    }
    public TreeNode func(int[] preorder, int upperBound, int[] i, int n){
        if(i[0] >= n || preorder[i[0]] > upperBound){
            return null;
        }
        TreeNode root = new TreeNode(preorder[i[0]++]);

        root.left = func(preorder, root.val, i, n);
        root.right = func(preorder, upperBound, i, n);
        return root;
    }

    
}