class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return helper(text1, text2, 0, 0, dp);
    }
    public int helper(String s, String t, int i, int j, int[][] dp){
        if(i == s.length() || j == t.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s.charAt(i) == t.charAt(j)){
            return dp[i][j] = 1 + helper(s, t, i+1, j+1, dp);
        }
        else{
            int a = helper(s, t, i+1, j, dp);
            int b = helper(s, t, i, j+1, dp);
            return dp[i][j] = Math.max(a,b);
        }
    }
}