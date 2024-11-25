class Solution {
    public int change(int amount, int[] coins) {
        int size = coins.length;
        int[][] dp = new int[size][amount+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return coinChange(coins, 0, amount, dp);
    }
    public int coinChange(int[] arr, int i, int amt, int[][] dp){
        if(amt == 0){
            return 1;
        }
        if(i == arr.length){
            return 0;
        }
        if(dp[i][amt] != -1){
            return dp[i][amt];
        }
        int take = 0;
        int notTake = 0;
        if(arr[i] <= amt){
            take = coinChange(arr, i, amt - arr[i], dp);
        }
        notTake = coinChange(arr, i+1, amt, dp);
        return dp[i][amt] = take + notTake;
    }
}