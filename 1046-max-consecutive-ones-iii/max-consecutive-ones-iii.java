class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int maxLen = 0;
        int zeroes = 0;
        while(j < nums.length){
            int right = nums[j];
            zeroes = right == 0 ? zeroes + 1 : zeroes + 0;
            while(zeroes > k){
                int left = nums[i];
                zeroes = left == 0 ? zeroes - 1 : zeroes - 0;
                i++;
            }
            maxLen = Math.max(maxLen, j-i+1);
            j++;
        }
        return maxLen;
    }
}