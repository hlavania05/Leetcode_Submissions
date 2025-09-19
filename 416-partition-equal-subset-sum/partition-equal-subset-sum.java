class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = sum(nums);
        if(totalSum % 2 != 0){
            return false;
        }
        int target = totalSum/2;
        Boolean[][] dp = new Boolean[nums.length][target+1];
        return helper(nums, 0, target, dp); 
    }
    public boolean helper(int[] arr, int idx, int target, Boolean[][] dp){
        if(target == 0){
            return true;
        }
        if(idx == arr.length){
            return false;
        }
        if(dp[idx][target] != null) {
            return dp[idx][target];
        }
        boolean notTake = helper(arr, idx+1, target, dp);
        boolean take = false;
        if(arr[idx] <= target){
            take = helper(arr, idx+1, target-arr[idx], dp);
        }
        return dp[idx][target] = notTake || take;
    }
    public static int sum(int[] arr){
        int sum = 0;
        for(int item : arr){
            sum += item;
        }
        return sum;
    }
}