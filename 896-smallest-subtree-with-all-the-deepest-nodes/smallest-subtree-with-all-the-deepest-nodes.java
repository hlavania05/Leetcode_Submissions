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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        HashMap<TreeNode, Integer> map = new HashMap<>();
        deepestNodes(root, 0, map);
        return LCA(root, 0);
    }
    int maxDepth = Integer.MIN_VALUE;
    public void deepestNodes(TreeNode root, int depth, HashMap<TreeNode, Integer> map){
        if(root == null){
            return;
        }
        map.put(root, depth);
        maxDepth = Math.max(depth, maxDepth);

        deepestNodes(root.left, depth+1, map);
        deepestNodes(root.right, depth+1, map);
    }

    public TreeNode LCA(TreeNode root, int depth){
        if(root == null || depth == maxDepth){
            return root;
        }

        TreeNode left = LCA(root.left, depth+1);
        TreeNode right = LCA(root.right, depth+1);

        if(left != null && right != null){
            return root;
        }
        if(left == null){
            return right;
        }
        return left;
    }
}