class Solution {
    public int trap(int[] height) {
        return Trapping(height);
    }
    public static int Trapping(int[] arr){
        int l = arr.length;
        int[] arr_left = new int[l];
        arr_left[0] = arr[0];
        for(int i=1; i<arr_left.length; i++){
            arr_left[i] = Math.max(arr_left[i-1],arr[i]);
        }
        int[] arr_right = new int[l];
        arr_right[l-1] = arr[l-1]; 
        for(int i = l-2; i>=0; i--){
            arr_right[i] = Math.max(arr_right[i+1], arr[i]);
        }

        int sum = 0;
        for(int i=0; i<l; i++){
            int min = Math.min(arr_left[i],arr_right[i]);
            int x = min-arr[i];
            sum += x;
        }
        return sum;
    }
}