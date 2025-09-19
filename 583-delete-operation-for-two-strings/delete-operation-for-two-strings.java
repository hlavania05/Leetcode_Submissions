class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int ans = lcs(word1, word2, m, n);
        return (m-ans)+(n-ans);
    }
    public int lcs(String text1, String text2, int m, int n) {
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