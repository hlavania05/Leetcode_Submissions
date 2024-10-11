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
class triple{
    TreeNode node;
    int line;
    int level;
    public triple(TreeNode node, int line, int level){
        this.node = node;
        this.line = line;
        this.level = level;
    }
}
class Solution {
    public static List<List<Integer>> verticalTraversal(TreeNode root){
        Queue<triple> q = new LinkedList<>();
        q.offer(new triple(root, 0, 0));
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                triple curr = q.poll();
                TreeNode curr_node = curr.node;
                int curr_line = curr.line;
                int curr_level = curr.level;
                putItem(map, curr_line, curr_level, curr_node.val);
                if(curr_node.left != null){
                    q.offer(new triple(curr_node.left, curr_line-1, curr_level+1));
                }
                if(curr_node.right != null){
                    q.offer(new triple(curr_node.right, curr_line+1, curr_level+1));
                }

            }
        }
        // Convert the map into a nested list
        List<List<Integer>> result = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> innerMap : map.values()) {
            List<Integer> lineList = new ArrayList<>();
            for (PriorityQueue<Integer> pq : innerMap.values()) {
                while (!pq.isEmpty()) {
                    lineList.add(pq.poll());
                }
            }
            result.add(lineList);
        }
        return result;
    }
    public static void putItem(TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map, int outerKey, int innerKey, int value) {
        map.putIfAbsent(outerKey, new TreeMap<>());
        TreeMap<Integer, PriorityQueue<Integer>> innerMap = map.get(outerKey);
        innerMap.putIfAbsent(innerKey, new PriorityQueue<>());
        innerMap.get(innerKey).add(value);
    }
}