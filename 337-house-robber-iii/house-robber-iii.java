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
    HashMap<TreeNode, Integer> dp = new HashMap<>();

    public int rob(TreeNode root) {
        return help(root);
    }
    public int help(TreeNode root){
        if(root == null){
            return 0;
        }
        if(dp.containsKey(root)){
            return dp.get(root);
        }
        int rob = root.val;
        if(root.left != null){
            rob += help(root.left.left) + help(root.left.right);
        }
        if(root.right != null){
            rob += help(root.right.left) + help(root.right.right);
        }
        int skip = help(root.left) + help(root.right);
        int ans = Math.max(rob, skip);
        dp.put(root, ans);
        return ans;
    }
}