class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] istaken = new boolean[nums.length+1];
        for(int num : nums){
            if(istaken[num]){
                return num;
            }
            istaken[num] = true;
        }
        return -1;
    }
}