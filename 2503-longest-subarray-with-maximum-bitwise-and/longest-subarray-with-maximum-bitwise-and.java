class Solution {
    public int longestSubarray(int[] nums) {
        int maxVal = 0;
        for(int num : nums){
            maxVal = Math.max(maxVal, num);
        }
        
        int maxLen = 0;
        int currentLen = 0;
        
        for(int num : nums){
            if (num == maxVal) {
                currentLen++;
                maxLen = Math.max(maxLen, currentLen);
            } else {
                currentLen = 0;
            }
        }
        
        return maxLen;
    }
}
