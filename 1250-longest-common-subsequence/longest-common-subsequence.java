class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for(int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        return helper(text1, text2, 0, 0, dp);

    }
    public int helper(String str1, String str2, int i, int j, int[][] dp){
        if(i == str1.length() || j == str2.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans = 0;
        if(str1.charAt(i) == str2.charAt(j)){
            ans = 1 + helper(str1, str2, i+1, j+1, dp);
        }
        else{
            int f = helper(str1, str2, i+1, j, dp);
            int s = helper(str1, str2, i, j+1, dp);
            ans = Math.max(f, s);
        }
        return dp[i][j] = ans;
    }
}