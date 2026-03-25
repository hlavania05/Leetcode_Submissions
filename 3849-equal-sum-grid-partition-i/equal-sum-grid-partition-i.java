class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        long[] rowSum = new long[n];
        long totalSum = 0;

        // row sum
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                rowSum[i] += grid[i][j];
            }
            totalSum += rowSum[i];
        }

        // column sum
        long[] colSum = new long[m];
        for(int j = 0; j < m; j++){
            for(int i = 0; i < n; i++){
                colSum[j] += grid[i][j];
            }
        }

        // horizontal cut
        long upperSum = 0;
        for(int i = 0; i < n - 1; i++){
            upperSum += rowSum[i];
            if(upperSum == totalSum - upperSum){
                return true;
            }
        }

        // vertical cut
        long leftSum = 0;
        for(int j = 0; j < m - 1; j++){
            leftSum += colSum[j];
            if(leftSum == totalSum - leftSum){
                return true;
            }
        }

        return false;
    }
}