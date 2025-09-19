class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int[] row : dp){
            Arrays.fill(row, Integer.MIN_VALUE);
        }
        return helper(triangle, 0, 0, dp);
    }
    public int helper(List<List<Integer>> triangle, int row, int col, int[][] dp){
        if(row == triangle.size()-1){
            return triangle.get(row).get(col);
        }
        if(dp[row][col] != Integer.MIN_VALUE){
            return dp[row][col];
        }
        int a = helper(triangle, row+1, col, dp); 
        int b = helper(triangle, row+1, col+1, dp);
        return dp[row][col] = triangle.get(row).get(col) + Math.min(a, b);
    }
}