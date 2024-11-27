class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        int[][] dp = new int[matrix.length][matrix.length];
        for(int[] a : dp){
            Arrays.fill(a, 101);
        }
        for(int i=0; i<matrix.length; i++){
            min = Math.min(helper(matrix, 0, i, dp), min);
        }
        return min;
    }
    public int helper(int[][] matrix, int row, int col, int[][] dp){
        if(row >= matrix.length || col >= matrix.length || row < 0 || col < 0){
            return Integer.MAX_VALUE;
        }
        if(row == matrix.length-1){
            return matrix[row][col];
        }
        if(dp[row][col] != 101){
            return dp[row][col];
        }
        int down = helper(matrix, row+1, col, dp);
        int dleft = helper(matrix, row+1, col+1, dp);
        int dright = helper(matrix, row+1, col-1, dp);
        return dp[row][col] = matrix[row][col] + Math.min(down, Math.min(dleft, dright));
    }
    
}