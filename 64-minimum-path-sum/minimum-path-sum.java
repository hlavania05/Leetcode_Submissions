class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return helper(grid, 0, 0, m, n, dp);
    }
    public int helper(int[][] grid, int i, int j, int m, int n, int[][]dp){
        if(i >= m || j >= n){
            return Integer.MAX_VALUE;
        }
        if(i == m-1 && j == n-1){
            return grid[i][j];
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int r = helper(grid, i, j+1, m, n, dp);
        int d = helper(grid, i+1, j, m, n, dp);
        return dp[i][j] = grid[i][j] + Math.min(r, d);
    }
}