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
    int i = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, preorder.length, Integer.MAX_VALUE);
    }
    public TreeNode helper(int[] preorder, int n, int upperBound){
        if(i >= n || preorder[i] > upperBound){
            return null;
        }
        TreeNode root = new TreeNode(preorder[i++]);
        root.left = helper(preorder, n, root.val);
        root.right = helper(preorder, n, upperBound);
        return root;
    }
}