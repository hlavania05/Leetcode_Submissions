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
    public TreeNode bstFromPreorder(int[] preorder) {
        return func(preorder, new int[]{0}, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public TreeNode func(int[] preorder, int[] idx, int min, int max) {
        if (idx[0] >= preorder.length) {
            return null;
        }

        int key = preorder[idx[0]];
        TreeNode root = null;

        if (key > min && key < max) {
            root = new TreeNode(key);
            idx[0]++;
            root.left = func(preorder, idx, min, key);
            root.right = func(preorder, idx, key, max);
        }
        return root;
    }
}