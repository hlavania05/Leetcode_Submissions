class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        while(r < n){
            sum += nums[r];
            while(sum >= target){
                minLen = Math.min(minLen, r-l+1);
                sum = sum - nums[l];
                l++;
            }
            r++;
        }
        return (minLen == Integer.MAX_VALUE ? 0 : minLen);
    }
}