class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] a : dp){
            Arrays.fill(a, -1);
        }
        return func(grid, 0, 0, dp);
    }
    public int func(int[][] grid, int i, int j, int[][] dp){
        if(i == grid.length-1 && j == grid[0].length-1){
            return grid[i][j];
        }
        if(i >= grid.length || j >= grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int right = func(grid, i, j+1, dp);
        int down = func(grid, i+1, j, dp);
        return dp[i][j] = grid[i][j] + Math.min(right, down);
    }
}