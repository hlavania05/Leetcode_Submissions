class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            if(nums[low] != nums[low+1]){
                return nums[low];
            }
            if(nums[high] != nums[high-1]){
                return nums[high];
            }
            high -= 2;
            low += 2;
        }
        return -1;
    }
}