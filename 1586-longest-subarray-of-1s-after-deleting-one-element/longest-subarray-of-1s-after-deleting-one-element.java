class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int maxLen = 0;
        int zeroes = 0;
        while(r < nums.length){
            sum += nums[r];
            if(nums[r] == 0){ zeroes++; }
            while(zeroes > 1){
                sum = sum - nums[l];
                if(nums[l] == 0){
                    zeroes--;
                }
                l++;
            }
            if(zeroes == 1){
                maxLen = Math.max(maxLen, r-l);
            }
            else if(zeroes == 0){
                maxLen = Math.max(maxLen, r-l);
            }
            r++;
        }
        return maxLen;
    }
}