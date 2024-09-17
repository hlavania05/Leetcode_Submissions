/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Node> level = new ArrayList<>();
            for(int i=0; i<size; i++){
                Node node = q.poll();
                level.add(node);
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
            }
            convertToLinkedList(level);
        }
        return root;
    }
    public static void convertToLinkedList(List<Node> lst){
        for(int i=0; i<lst.size(); i++){
            if(i != lst.size()-1){
                lst.get(i).next = lst.get(i+1);
            }
            else{
                lst.get(i).next = null;
            }
        }
    }
}