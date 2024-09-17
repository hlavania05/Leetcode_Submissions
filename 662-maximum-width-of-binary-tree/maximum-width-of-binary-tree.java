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
class Pair{
    TreeNode node;
    int idx;
    Pair(TreeNode Node, int idx){
        this.node = Node;
        this.idx = idx;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        Pair pair = new Pair(root, 1);
        q.offer(pair);
        int maxWidth = 0;
        while(!q.isEmpty()){
            int size = q.size();
            int first = 0;
            int last = 0;
            for(int i=0; i<size; i++){
                Pair pair2 = q.poll();
                int curr_id = pair2.idx;
                TreeNode node = pair2.node;
                if(i == 0){
                    first = curr_id;
                }
                if(i == size-1){
                    last = curr_id;
                }
                if(node.left != null){
                    int j = 2*(curr_id - 1) + 1;
                    q.offer(new Pair(node.left, j));
                }
                if(node.right != null){
                    int j1 = 2*(curr_id - 1) + 2;
                    q.offer(new Pair(node.right, j1));
                }
            }
            maxWidth = Math.max(maxWidth, last-first+1);
        }
        return maxWidth;
    }
}