class Solution {
    public int minReorder(int n, int[][] connections) {
        return minflip(connections, n);
    }
    public static int minflip(int[][] routes, int n){
        HashMap<Integer, List<int[]>> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(i, new ArrayList<>());
        }
        for(int[] route : routes){
            int a = route[0];
            int b = route[1];
            map.get(a).add(new int[]{b, 1});
            map.get(b).add(new int[]{a, 0});
        }

        return DFS(map, 0, -1);
    }

    public static int DFS(HashMap<Integer, List<int[]>> graph, int source, int parent){
        int cnt = 0;

        for(int[] item : graph.get(source)){
            int nextNode = item[0];
            int dir = item[1];
            if(nextNode == parent){
                continue;
            }
            cnt += dir;
            cnt += DFS(graph, nextNode, source);

        }
        return cnt;

    }
}