class Solution {
    public int lengthOfLIS(int[] nums) {
        return lis(nums);
    }
    public static int lis(int[] arr){
        int[] dp = new int[arr.length];
        Arrays.fill(dp,1);
        for(int i=1; i<dp.length; i++){
            for(int j = 0; j<i; j++){
                if(arr[j] < arr[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        int max = 0;
        for (int length : dp) {
            if (length > max) {
                max = length;
            }
        }

        return max;
    }
}