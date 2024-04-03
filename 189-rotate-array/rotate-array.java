class Solution {
    public void rotate(int[] nums, int k) {
        Rotate_arr(nums,k);
    }
    // rotating the array 
    public static void Rotate_arr(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

    }
    // Reversing the values from index 2 to index 6
    public static void reverse(int[] arr, int a, int b){
        int i = a;
        int j = b;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    
}