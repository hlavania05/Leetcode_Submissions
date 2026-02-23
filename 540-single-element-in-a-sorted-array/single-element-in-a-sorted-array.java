class Solution {
    public int singleNonDuplicate(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            if(arr[low] != arr[low+1]){
                return arr[low];
            }
            if(arr[high] != arr[high-1]){
                return arr[high];
            }
            low += 2;
            high -= 2;
        }
        return -1;
    }
}