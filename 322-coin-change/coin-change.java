class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        int ans = helper(n - 1, amount, coins, dp);
        return (ans >= (int)1e9) ? -1 : ans; // agar answer infinity hua toh -1
    }

    private int helper(int idx, int target, int[] coins, int[][] dp) {
        // base case
        if (idx == 0) {
            if (target % coins[0] == 0) return target / coins[0];
            else return (int)1e9; // impossible
        }

        if (dp[idx][target] != -1) return dp[idx][target];

        // notTake
        int notTake = helper(idx - 1, target, coins, dp);

        // take
        int take = (int)1e9;
        if (coins[idx] <= target) {
            take = 1 + helper(idx, target - coins[idx], coins, dp);
        }

        return dp[idx][target] = Math.min(take, notTake);
    }
}
