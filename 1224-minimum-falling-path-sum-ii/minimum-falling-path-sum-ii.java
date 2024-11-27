class Solution {
    public int minFallingPathSum(int[][] grid) {
        int min = Integer.MAX_VALUE;
        int[][] dp = new int[grid.length][grid.length];
        for(int[] a : dp){
            Arrays.fill(a, 101);
        }
        for(int i=0; i<grid.length; i++){
            min = Math.min(helper(grid, 0, i, dp), min);
        }
        return min;
    }
    public int helper(int[][] matrix, int row, int col, int[][] dp){
        if(row == matrix.length-1){
            return matrix[row][col];
        }
        if(dp[row][col] != 101){
            return dp[row][col];
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<matrix[0].length; i++){
            if(col != i){
                ans = Math.min(ans, helper(matrix, row+1, i, dp));
            }
        }
        return dp[row][col] = ans + matrix[row][col];
    }
}