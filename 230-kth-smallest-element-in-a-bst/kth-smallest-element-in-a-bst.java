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
    private int result = 0;
    private int cnt = 0;

    public int kthSmallest(TreeNode root, int k) {
        func(root, k);
        return result;
    }
    public void func(TreeNode root, int k){
        if(root == null){
            return;
        }
        func(root.left, k);
        cnt++;
        if(cnt == k){
            result = root.val;
            return;
        }
        func(root.right, k);
    }
}