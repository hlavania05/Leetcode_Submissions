class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = merge_array(nums1, nums2);
        Arrays.sort(arr);
        return (double)median(arr);
        
    }
    public static int[] merge_array(int[] arr1, int[] arr2){
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0;
        while(i<arr1.length){
            merged[i] = arr1[i];
            i++;
        }
        int j = 0;
        while(i < merged.length){
            merged[i] = arr2[j];
            j++;
            i++;
        }
        return merged;
    }
    public static float median(int[] arr){
        int n = arr.length;
        if(n%2 != 0){
            return (float)arr[n/2];
        }
        return ((float)arr[n/2] + (float)arr[(n-1)/2])/2;
        
    }
}