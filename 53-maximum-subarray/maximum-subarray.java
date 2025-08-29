class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int item : nums){
            sum += item;
            MaxSum = Math.max(MaxSum, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return MaxSum;
    }
}