class Solution {
    public int[] searchRange(int[] nums, int target) {
        return find(nums, target);
    }
    public int[] find(int arr[], int k) {
        // code here
        int[] ans = new int[2];
        int firstOcc = first(arr, k);
        if(firstOcc == -1){
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        int lastOcc = last(arr, k);
        ans[0] = firstOcc;
        ans[1] = lastOcc;
        return ans;
    }
    int first(int[] arr, int k){
        int low = 0;
        int high = arr.length-1;
        int idx = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == k){
                idx = mid;
                high = mid-1;
            }
            else if(arr[mid] < k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return idx;
    }
    int last(int[] arr, int k){
        int low = 0;
        int high = arr.length-1;
        int idx = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == k){
                idx = mid;
                low = mid+1;
            }
            else if(arr[mid] < k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return idx;
    }
}