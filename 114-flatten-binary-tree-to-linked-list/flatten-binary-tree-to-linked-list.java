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
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        List<TreeNode> ans = new ArrayList<>();
        func(root, ans);
        TreeNode curr = root;
        curr.left = null;
        for(int i=1; i<ans.size(); i++){
            curr.right = ans.get(i);
            curr = curr.right;
            curr.left = null;
        }
    }
    public void func(TreeNode root, List<TreeNode> ans){
        if(root == null){
            return;
        }
        ans.add(root);
        func(root.left, ans);
        func(root.right, ans);
    }
}