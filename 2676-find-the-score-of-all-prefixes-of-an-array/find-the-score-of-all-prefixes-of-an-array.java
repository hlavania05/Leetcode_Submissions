class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long max = nums[0];
        long[] conver = new long[n];
        conver[0] = 2 * nums[0];
        for(int i=1; i<n; i++){
            max = Math.max(nums[i], max);
            long score = nums[i] + max;
            conver[i] = score + conver[i-1];
        }
        return conver;
    }
}