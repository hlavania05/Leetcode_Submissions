class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] prefixSum = new int[n][m];
        int ans = 0;
        for(int row=0; row<n; row++){
            for(int col=0; col<m; col++){
                if(row==0){
                    if(col==0){
                        prefixSum[row][col] = grid[row][col];
                    }
                    else{
                        prefixSum[row][col] = grid[row][col] + prefixSum[row][col-1];
                    }
                }
                else{
                    if(col==0){
                        prefixSum[row][col] = grid[row][col] + prefixSum[row-1][col];
                    }
                    else{
                        prefixSum[row][col] = grid[row][col] + prefixSum[row][col-1] + (prefixSum[row-1][col] - prefixSum[row-1][col-1]);
                    }
                }

                if(prefixSum[row][col] <= k){
                    ans++;
                }
            }
        }

        
        return ans;
    }
}