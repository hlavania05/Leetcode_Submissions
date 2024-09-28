class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return countSubarrays(nums, k);
    }
    public static int countSubarrays(int[] arr, int k){
        int cnt = 0;
        int l = 0;
        int r = 0;
        int product = 1;
        while(r < arr.length){
            product = product * arr[r];
            while(product >= k && l <= r){
                product = product / arr[l];
                l++;
            }
            cnt += (r-l+1);
            r++;
        }
        return cnt;
    }
}