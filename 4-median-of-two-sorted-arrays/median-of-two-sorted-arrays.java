class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = merge(nums1, nums2);
        int n = ans.length;
        if(n % 2 != 0){
            return (double)ans[n/2];
        }
        double a1 = ans[n/2];
        double a2 = ans[n/2 - 1];
        return (a1+a2)/2;
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int i=0; 
        int j=0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] ans = new int[n1 + n2];
        int k = 0;
        while(i < n1 & j < n2){
            if(arr1[i] <= arr2[j]){
                ans[k++] = arr1[i++];
            }
            else{
                ans[k++] = arr2[j++];
            }
        }
        while(i < n1){
            ans[k++] = arr1[i++];
        }
        while(j < n2){
            ans[k++] = arr2[j++];
        }
        return ans;
    } 
}