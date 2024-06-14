class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer = 1;
        int num = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] != num){
                num = nums[i];
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        return pointer;
    }
}