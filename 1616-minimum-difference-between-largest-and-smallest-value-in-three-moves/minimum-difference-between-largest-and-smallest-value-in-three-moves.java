class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        if(n < 5){
            return 0;
        }
        Arrays.sort(nums);
        int diff1 = nums[n-4] - nums[0];
        int diff2 = nums[n-3] - nums[1];
        int diff3 = nums[n-2] - nums[2];
        int diff4 = nums[n-1] - nums[3];

        return Math.min(Math.min(diff1, diff2), Math.min(diff3, diff4));
    }
}