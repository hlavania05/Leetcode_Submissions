class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = nums.length-1, c = 0;
        while(i < j){
            int sum = nums[i] + nums[j];
            if(sum == k){
                i++;
                j--;
                c++;
            }
            else if(sum > k){
                j--;
            }
            else{
                i++;
            }
        }
        return c;

    }
}