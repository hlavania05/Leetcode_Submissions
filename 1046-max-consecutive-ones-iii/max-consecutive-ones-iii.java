class Solution {
    // max subarray length with at most k 0's
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxLen  = 0;
        int zeroes = 0;

        while(right < nums.length){
            int item = nums[right];
            if(item == 0){
                zeroes++;
            }
            while(zeroes > k){
                if(nums[left]==0){
                    zeroes--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }
}