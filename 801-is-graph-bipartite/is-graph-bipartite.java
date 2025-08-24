class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] visited = new int[n];
        Arrays.fill(visited, -1);
 
        for(int i=0; i<n; i++){
            if(visited[i] == -1){
                if(!dfs(i, -1, graph, visited)){
                    return false;
                }
            }
        }
        return true;
    }
    // public boolean bfs(int src, int[][] graph, int[] visited){
    //     Queue<Integer> queue = new LinkedList<>();
    //     queue.offer(src);
    //     visited[src] = 0;

    //     while(queue.size() != 0){
    //         int parent = queue.poll();
    //         for(int neighbour : graph[parent]){
    //             if(visited[neighbour] == -1){
    //                 visited[neighbour] = 1 - visited[parent];
    //                 queue.offer(neighbour);
    //             }
    //             else if(visited[neighbour] == visited[parent]){
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }
    public boolean dfs(int src, int parent, int[][] graph, int[] visited){
        if(parent == -1){
            visited[src] = 0;
        }
        else{
            visited[src] = 1-visited[parent];
        }
        for(int item : graph[src]){
            if(visited[item] == -1){
                if(!dfs(item, src, graph, visited)){
                    return false;
                }
            }
            if(visited[item] == visited[src]){
                return false;
            }
        }
        return true;

    }

}