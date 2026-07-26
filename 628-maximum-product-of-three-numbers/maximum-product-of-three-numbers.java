class Solution {
    public int maximumProduct(int[] nums) {
        return max_product(nums);
    }
    public static int max_product(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        int temp = arr[n-1]*arr[n-2]*arr[n-3];
        int temp1 = arr[0]*arr[1]*arr[n-1];
        int max_mul = Math.max(temp, temp1);
        return max_mul;
    }
    
}