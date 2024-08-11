class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int startr = 0;
        int endr = n-1;
        int startc = 0;
        int endc = n-1;
        int a = 1;
        while(startr <= endr && startc <= endc){
            // right to left
            for(int i=startc; i<=endc; i++){
                ans[startr][i] = a;
                a++;
            }
            startr++;
            
            // top to bottom
            for(int i=startr; i<=endr; i++){
                ans[i][endc] = a;
                a++;
            }
            endc--;
            
            // left to right
            for(int i=endc; i>=startc; i--){
                ans[endr][i] = a;
                a++;
            }
            endr--;
            
            // bottom to top
            for(int i=endr; i>=startr; i--){
                ans[i][startc] = a;
                a++;
            }
            startc++;

        }
        return ans;
    }
}