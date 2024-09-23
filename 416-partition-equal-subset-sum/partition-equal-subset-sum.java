class Solution {
    public int arrSum(int[] arr){
        int sum = 0;
        for(int item : arr){
            sum += item;
        }
        return sum;
    }
    public boolean canPartition(int[] nums) {
        int arrSum = arrSum(nums);
        if(arrSum % 2 != 0){
            return false;
        }
        int targetSum = arrSum/2;
        int n = nums.length;
        Boolean[][] dp = new Boolean[n+1][targetSum+1];
        return func(dp, nums, n-1, targetSum);
    }
    public boolean func(Boolean[][] dp, int[] arr, int n, int sum){
        if(n < 0 || sum < 0){
            return false;
        }
        if(sum == 0 || arr[n] == sum){
            return true;
        }
        if(dp[n][sum] != null){
            return dp[n][sum];
        }
        boolean take = func(dp, arr, n-1, sum - arr[n]);
        boolean notTake = func(dp, arr, n-1, sum);
        dp[n][sum] = take || notTake;
        return dp[n][sum];
    }
}