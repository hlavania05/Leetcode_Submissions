class Solution {
    public int arrSum(int[] arr){
        int sum = 0;
        for(int item : arr){
            sum += item;
        }
        return sum;
    }
    public boolean canPartition(int[] nums) {
        int N = nums.length;
        int totalSum = arrSum(nums);
        if(totalSum % 2 == 1){
            return false;
        }
        int sum = totalSum/2;
        Boolean[][] dp = new Boolean[N+1][sum+1];
        
        return helper(dp, nums, sum, N-1);
    }
    public boolean helper(Boolean[][] dp, int[] arr, int sum, int n){
        if(n < 0 || sum < 0){
            return false;
        }
        if(sum == 0 || arr[n] == sum){
            return true;
        }
        
        if(dp[n][sum] != null){
            return dp[n][sum];
        }
        boolean take = helper(dp, arr, sum - arr[n], n-1);
        boolean notTake = helper(dp, arr, sum, n-1);
        dp[n][sum] = notTake || take;
        return dp[n][sum];
    }
}