class Solution {
    public int triangularSum(int[] nums) {
        return step(nums, nums.length);
    }
    public int step(int[] nums, int size) {
        if(size == 1){
            return nums[0];
        }
        for(int i=0; i<size-1 ; i++){
            nums[i] = (nums[i] + nums[i + 1]) % 10;
        }
        return step(nums, size - 1);
    }
}