class Solution {
    public int[] findOrder(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        // Build adjacency list
        for(int[] edge : edges){
            int u = edge[1];  // ✅ reverse direction: prerequisite -> course
            int v = edge[0];
            adj.get(u).add(v);
        }

        // Compute indegree
        int[] InDegree = new int[V];
        for(int u = 0; u < V; u++){
            for(int v : adj.get(u)){
                InDegree[v]++;
            }
        }

        // Initialize queue with 0 indegree
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < V; i++){
            if(InDegree[i] == 0){
                queue.offer(i);
            }
        }

        int[] ans = new int[V];
        int idx = 0;

        while(!queue.isEmpty()){
            int node = queue.poll();
            ans[idx++] = node;   // ✅ add when polled

            for(int neigh : adj.get(node)){
                InDegree[neigh]--;
                if(InDegree[neigh] == 0){
                    queue.offer(neigh);  // ✅ enqueue, don't add directly
                }
            }
        }

        // If cycle detected (not all nodes processed)
        if(idx != V) return new int[]{};
        return ans;
    }
}
