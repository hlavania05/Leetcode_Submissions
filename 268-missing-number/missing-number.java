class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = sum(nums);
        int totalSum = (n*(n+1))/2;
        return totalSum - sum;
    }
    public int sum(int[] arr){
        int sum = 0;
        for(int item : arr){
            sum += item;
        }
        return sum;
    }
}