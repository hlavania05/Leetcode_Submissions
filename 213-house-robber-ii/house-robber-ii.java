class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        int[] dp1 = new int[n+1];
        int[] dp2 = new int[n+1];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int case1 = help(nums, 0, n-2, dp1);
        int case2 = help(nums, 1, n-1, dp2);

        return Math.max(case1, case2);
    }
    public int help(int[] nums, int start, int end, int[] dp){
        if(start > end){
            return 0;
        }
        if(dp[start] != -1){
            return dp[start];
        }
        int take = nums[start] + help(nums, start+2, end, dp);
        int notTake = help(nums, start+1, end, dp);
        return dp[start] = Math.max(take, notTake);
    }
}