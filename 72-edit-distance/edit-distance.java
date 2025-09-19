class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return helper(word1, word2, 0, 0, dp);
    }
    public int helper(String s, String t, int i, int j, int[][] dp){
        if(i == s.length()){
            return t.length()-j;
        }
        if(j == t.length()){
            return s.length()-i;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s.charAt(i) == t.charAt(j)){
            return dp[i][j] = helper(s, t, i+1, j+1, dp);
        }
        else{
            int insert = helper(s, t, i, j+1, dp);
            int delete = helper(s, t, i+1, j, dp);
            int update = helper(s, t, i+1, j+1, dp);
            return dp[i][j] = 1 + Math.min(insert, Math.min(delete, update));
        }
    }
}