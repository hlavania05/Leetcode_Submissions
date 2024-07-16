class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return func(nums, 0, dp);
    }
    public static int func(int[] house, int idx, int[] dp){
        if(idx >= house.length){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int choose = house[idx] + func(house, idx+2, dp);
        int not_choose = func(house, idx+1, dp);

        return dp[idx] = Math.max(choose, not_choose);
    }
}