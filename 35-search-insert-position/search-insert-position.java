class Solution {
    public int searchInsert(int[] nums, int target) {
        return lowerBound(nums, target);
    }
    public int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        int idx = arr.length;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] >= target){
                idx = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return idx;
        
    }
}