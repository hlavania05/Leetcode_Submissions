class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length+1][amount+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        int ans = func(coins, amount, dp, coins.length-1);
        return ans >= (int)1e9 ? -1 : ans;
    }
    public int func(int[] arr, int amount, int[][] dp, int idx){
        if(idx == 0){
            if(amount % arr[idx] == 0){
                return amount / arr[idx];
            }
            return (int)1e9;
        }

        if(dp[idx][amount] != -1){
            return dp[idx][amount];
        }
        int notTake = func(arr, amount, dp, idx-1);
        int take = (int)1e9;
        if(arr[idx] <= amount){
            take = 1 + func(arr, amount-arr[idx], dp, idx);
        }

        return dp[idx][amount] = Math.min(take, notTake);
    }
}