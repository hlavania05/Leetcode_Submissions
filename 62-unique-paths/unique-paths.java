class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return helper(m-1, n-1, 0, 0, dp);
    }
    public int helper(int m, int n, int i, int j, int[][] dp){
        if(i == m && j == n){
            return 1;
        }
        if(i < 0 || i > m || j < 0 || j > n){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int r = helper(m, n, i, j+1, dp);
        int d = helper(m, n, i+1, j, dp);
        return dp[i][j] = r+d;
    }
}