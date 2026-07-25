class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0){
            return;
        }
        if(m == 0){
            for(int i=0; i<nums1.length; i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        int i = m-1;
        int j = n-1;
        int k = m + n - 1;
        while(i >= 0 && j >= 0){
            if(nums1[i] < nums2[j]){
                nums1[k] = nums2[j];
                j--;
                k--;
            }
            else{
                nums1[k] = nums1[i];
                i--;
                k--;
            }
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}