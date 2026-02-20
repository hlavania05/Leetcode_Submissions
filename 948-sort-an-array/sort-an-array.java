class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
    public int[] mergeSort(int[] arr, int i, int j){
        if(i == j){
            int[] ans = new int[1];
            ans[0] = arr[i];
            return ans;
        }
        int mid = (i+j)/2;
        int[] left = mergeSort(arr, i, mid);
        int[] right = mergeSort(arr, mid+1, j);
        return mergeArrays(left, right);

    }
    public int[] mergeArrays(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] newArr = new int[n+m];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n && j < m){
            if(arr1[i] <= arr2[j]){
                newArr[k] = arr1[i];
                i++;
            }
            else{
                newArr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i < n){
            newArr[k] = arr1[i];
            i++;
            k++;
        }
        while(j < m){
            newArr[k] = arr2[j];
            j++;
            k++;
        }
        return newArr;
    }
}