class Solution {
    public int[] twoSum(int[] numbers, int target) {
        return two_sum(numbers, target);
    }
    public static int[] two_sum(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            if(arr[start] + arr[end] == target){
                return new int[]{start+1, end+1};
            }
            else if(arr[start] + arr[end] > target){
                end--;
            }
            else{
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}