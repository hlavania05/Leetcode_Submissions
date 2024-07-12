class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max_avg = 0.00;
        long sum = 0;
        int i = 0;
        int j = 0;
        while(j < k){
            sum += nums[j];
            j++;
        }
        max_avg = (double)(sum)/k;

        while(j < nums.length){
            sum = sum - nums[i];
            i++;
            sum = sum + nums[j];
            j++;
            double avg = (double)(sum)/k;
            max_avg = Math.max(max_avg, avg);
        }
        return max_avg;
    }
}