class Solution {
    public boolean canFinish(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
        }
        
        int[] visited = new int[V];
        int[] path = new int[V];
        for(int i=0; i<V; i++){
            if(visited[i] == 0){
                if(!dfs(i, adj, visited, path)){
                    return false;
                }
            }
        }
        return true;        
    }
    private static boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] visited, int[] path){
        visited[node] = 1;
        path[node] = 1;
        for(int item : adj.get(node)){
            if(visited[item] == 0){
                if(!dfs(item, adj, visited, path)){
                    return false;
                }
            }
            if(path[item] == 1){
                return false;
            }
            path[item] = 0;
        }
        path[node] = 0;
        return true;
    }
    
}