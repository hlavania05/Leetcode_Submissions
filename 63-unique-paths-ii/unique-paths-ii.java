class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1] == 1){
            return 0;
        }
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return helper(obstacleGrid, dp, 0, 0, m-1, n-1);
    }
    public int helper(int[][] arr, int[][] dp, int i, int j, int m, int n){
        if(i == m && j == n){
            return 1;
        }
        if(i > m || i < 0 || j > n || j < 0){
            return 0;
        }
        if(arr[i][j] == 1){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int r = helper(arr, dp, i, j+1, m, n);
        int d = helper(arr, dp, i+1, j, m, n);
        return dp[i][j] = r+d;
    }
}