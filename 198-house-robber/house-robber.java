class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return help(nums, 0, dp);
    }
    public int help(int[] nums, int i, int[] dp){
        if(i >= nums.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int take = nums[i] + help(nums, i+2, dp);
        int notTake = help(nums, i+1, dp);
        return dp[i] = Math.max(take, notTake);
    }
}