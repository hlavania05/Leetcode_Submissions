class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = merge_array(nums1, nums2);
        Arrays.sort(arr);
        return (double)median(arr);
        
    }
    public static int[] merge_array(int[] arr1, int[] arr2){
        int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[n + m];
		int i = 0, j = 0, k = 0;
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < n) {
			ans[k] = arr1[i];
			i++;
			k++;
		}
		while (j < m) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;
    }
    public static float median(int[] arr){
        int n = arr.length;
        if(n%2 != 0){
            return (float)arr[n/2];
        }
        return ((float)arr[n/2] + (float)arr[(n-1)/2])/2;
        
    }
}