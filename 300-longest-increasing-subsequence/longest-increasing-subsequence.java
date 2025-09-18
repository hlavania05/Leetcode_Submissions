class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr, 1);

        for(int i=0; i<n; i++){
            for(int j=i-1; j>=0; j--){
                if(nums[i] > nums[j]){
                    arr[i] = Math.max(arr[i], arr[j]+1);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int item : arr){
            max = Math.max(max, item);
        }
        return max;
    }
}