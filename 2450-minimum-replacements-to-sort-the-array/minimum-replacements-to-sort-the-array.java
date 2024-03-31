class Solution {
    public long minimumReplacement(int[] nums) {
        long ans = 0;
        int n = nums.length;
        long max = nums[n-1];
        for(int i=n-2; i >= 0; i--){
            long parts = nums[i]/max;
            if(nums[i]%max != 0){
                parts++;
            }
            ans += parts-1;
            max = nums[i]/parts;
        }
        return ans;
    }
}