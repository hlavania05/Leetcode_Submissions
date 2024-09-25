class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0.00;
        long sum = 0;
        int i = 0;
        int j = 0;
        while(j < k){
            sum += nums[j];
            j++;
        }
        avg = (double)(sum)/k;
        while(j < nums.length){
            sum = sum - nums[i];
            i++;
            sum = sum + nums[j];
            j++;
            avg = Math.max(avg, (double)(sum)/k);
        }
        return avg;
    }
}