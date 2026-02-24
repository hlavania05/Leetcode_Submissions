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
    public int sumRootToLeaf(TreeNode root) {
        return getSum(root, "");
    }
    public int getSum(TreeNode root, String path){
        if(root == null){
            return 0;
        }
        path = path + root.val;
        if(root.left == null && root.right == null){
            return Integer.parseInt(path, 2);
        }
        int left = getSum(root.left, path);
        int right = getSum(root.right, path);
        return left+right;
    }
    
}