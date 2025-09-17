class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return func(n, dp);
    }
    public int func(int n, int[] dp){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        return dp[n] = func(n-1, dp) + func(n-2, dp);
    }
}