class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        return func(n,dp);
        
    }
    public int func(int n, int[] dp){
        if(n == 1 || n==0){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        return dp[n] = func(n-1, dp) + func(n-2, dp);
    }
}