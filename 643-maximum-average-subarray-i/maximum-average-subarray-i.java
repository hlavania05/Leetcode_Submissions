class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int sum = 0;
        double max_avg = Integer.MIN_VALUE;
        while(right < k){
            sum += nums[right];
            right++;
        }
        double avg = (double)sum/k;
        max_avg = Math.max(max_avg, avg);

        while(right < nums.length){
            sum = sum - nums[left];
            left++;
            sum = sum + nums[right];
            right++;
            avg = (double)sum/k;
            max_avg = Math.max(max_avg, avg);
        }
        return max_avg;

    }
}