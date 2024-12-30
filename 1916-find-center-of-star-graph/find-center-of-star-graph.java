class Solution {
    public int findCenter(int[][] edges) {
        int[] count = new int[edges.length+2];
        for(int i=0; i<edges.length; i++){
            for(int j=0; j<edges[0].length; j++){
                count[edges[i][j]]++;
            }
        }
        for(int i=0; i<count.length; i++){
            if(count[i] > 1){
                return i;
            }
        }
        return 1;


    }
}