class Solution {
    public int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        return help(n, dp); 
    }
    public int help(int n, int[] dp){
        if(n == 0 || n == 1){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        return dp[n] = help(n-1, dp) + help(n-2, dp);
    }
}