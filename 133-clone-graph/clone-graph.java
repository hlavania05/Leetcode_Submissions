/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        HashMap<Node, Node> map = new HashMap<>();
        return clone(node, map);
    }
    public Node clone(Node node, HashMap<Node, Node> map){
        if(node == null){
            return null;
        }
        if(map.containsKey(node)){
            return map.get(node);
        }

        Node copy = new Node(node.val, new ArrayList<>());
        map.put(node, copy);
        for(Node neighbor : node.neighbors){
            copy.neighbors.add(clone(neighbor, map));
        }
        return copy;

    }
}