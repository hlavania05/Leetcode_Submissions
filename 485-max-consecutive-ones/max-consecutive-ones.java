class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0;
        int r = 0;
        int maxLen = 0;
        while(r < nums.length){
            if(nums[r] == 1){
                maxLen = Math.max(maxLen, r-l+1);
                r++;
            }
            else{
                r++;
                l = r;
            }
        }
        return maxLen;
    }
}