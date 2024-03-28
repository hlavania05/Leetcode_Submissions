class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            max_sum = Math.max(sum, max_sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return max_sum;
    }
}