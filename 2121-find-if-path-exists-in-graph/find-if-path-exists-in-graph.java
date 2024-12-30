class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        return graph(edges, source, destination, n);
    }
    public boolean graph(int[][] edges, int source, int destination, int n){
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            if(map.containsKey(a)){
                map.get(a).add(b);
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(b);
                map.put(a, list);
            }
            if(map.containsKey(b)){
                map.get(b).add(a);
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(a);
                map.put(b, list);
            }
        }
        return BFS(map, source, destination, n);
    }
    public boolean BFS(HashMap<Integer, List<Integer>> map, int src, int dest, int n){
        int[] visited = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(src);
        visited[src] = 1;
        while(!queue.isEmpty()){
            int front = queue.poll();
            if(front == dest){
                return true;
            }
            List<Integer> lst = map.get(front);
            for(int item : lst){
                if(visited[item] == 0) {
                    queue.offer(item);
                    visited[item] = 1;
                }
            }
        }
        return false;
    }
}