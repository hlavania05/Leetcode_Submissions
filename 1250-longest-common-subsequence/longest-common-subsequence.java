class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length()+1;
        int l2 = text2.length()+1;
        int[][] dp = new int[l1][l2];
        for(int i=1; i<l1; i++){
            for(int j= 1; j<l2; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    int f = dp[i-1][j];
                    int s = dp[i][j-1];
                    dp[i][j] = Math.max(f,s);
                }
            }
        }
        return dp[l1-1][l2-1];

    }
}