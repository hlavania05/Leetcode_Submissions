class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return func(nums, goal) - func(nums, goal-1);
    }
    public int func(int[] nums, int goal){
        int l = 0;
        int r = 0;
        int sum = 0;
        int cnt = 0;
        while(r < nums.length){
            sum += nums[r];
            while(sum > goal && l <= r){
                sum = sum - nums[l];
                l++;
            }
            cnt += (r-l+1);
            r++;
        }
        return cnt;
    }
}