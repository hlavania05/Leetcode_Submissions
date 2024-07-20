public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }
    
    private void serializeHelper(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null,");
            return;
        }
        sb.append(root.val).append(",");
        serializeHelper(root.left, sb);
        serializeHelper(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] dataArray = data.split(",");
        Queue<String> dataQueue = new LinkedList<>(Arrays.asList(dataArray));
        return deserializeHelper(dataQueue);
    }
    
    private TreeNode deserializeHelper(Queue<String> dataQueue) {
        String val = dataQueue.poll();
        if (val.equals("null")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = deserializeHelper(dataQueue);
        root.right = deserializeHelper(dataQueue);
        return root;
    }
}
