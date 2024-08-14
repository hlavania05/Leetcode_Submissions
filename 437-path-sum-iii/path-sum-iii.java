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
    public int path(TreeNode root, long targetSum) {
        return pathSum(root, targetSum);
    }
    public int pathSum(TreeNode root, long targetSum) {
        if (root == null) {
            return 0;
        }
        int c = countPaths(root, targetSum);
        int l = pathSum(root.left, targetSum);
        int r = pathSum(root.right, targetSum);
        
        return l + r + c;
    }

    private int countPaths(TreeNode node, long targetSum) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        if(node.val - targetSum == 0){
            count++;
        }
        int left = countPaths(node.left, targetSum - node.val);
        int right = countPaths(node.right, targetSum - node.val);
        return left + right + count;
    }
}
