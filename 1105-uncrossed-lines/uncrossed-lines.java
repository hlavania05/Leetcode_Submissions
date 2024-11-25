class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length][nums2.length];
        for(int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        return helper(nums1, nums2, dp, 0, 0);
    }
    public int helper(int[] arr1, int[] arr2, int[][] dp, int i, int j){
        if(i == arr1.length || j == arr2.length){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans = 0;
        if(arr1[i] == arr2[j]){
            ans = 1 + helper(arr1, arr2, dp, i+1, j+1);
        }
        else{
            int f = helper(arr1, arr2, dp, i+1, j);
            int s = helper(arr1, arr2, dp, i, j+1);
            ans = Math.max(f,s);
        }
        return dp[i][j] = ans;
    }
}