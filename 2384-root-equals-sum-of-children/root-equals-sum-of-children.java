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
    public boolean checkTree(TreeNode root) {
        int a = root.val;
        int b = findSum(root.left) + findSum(root.right);
        return a == b;
    }
    public int findSum(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftSum = findSum(node.left);
        int rightSum = findSum(node.right);
        return node.val + leftSum + rightSum;
    }
}