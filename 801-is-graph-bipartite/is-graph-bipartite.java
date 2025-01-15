class BipartitePair{
    int vtx;
    int dis;
    public BipartitePair(int vtx, int dis){
        this.dis = dis;
        this.vtx = vtx;
    }
}
class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<BipartitePair> q = new LinkedList<>();
        HashMap<Integer, Integer> visited = new HashMap<>();

        for(int vtx=0; vtx<graph.length; vtx++){
            if(visited.containsKey(vtx)){
                continue;
            }
            // BFS
            q.add(new BipartitePair(vtx, 0));
            while(!q.isEmpty()){
                //1. Remove
                BipartitePair rp = q.poll();

                //2. Ignore
                if(visited.containsKey(rp.vtx)){
                    if(visited.get(rp.vtx) != rp.dis){
                        return false;
                    }
                    continue;
                }
                //3. Add visited
                visited.put(rp.vtx, rp.dis);

                //5. Add university nbrs
                for(int nbrs: graph[rp.vtx]){
                    if(!visited.containsKey(nbrs)){
                        q.add(new BipartitePair(nbrs, rp.dis+1));
                    }
                }

            }
        }
        return true;
    }

}