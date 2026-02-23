class Solution {
    public int findMin(int[] nums) {
        find(nums, 0, nums.length-1);
        return minValue;
    }

    int minValue = Integer.MAX_VALUE;
    public void find(int[] arr, int low, int high){
        if(low > high){
            return;
        }
        int mid = low + (high-low)/2;
        if(arr[low] <= arr[mid]){
            minValue = Math.min(minValue, arr[low]);
            find(arr, mid+1, high);
        }
        else{
            minValue = Math.min(minValue, arr[mid]);
            find(arr, low, mid-1);
        }
    }
}