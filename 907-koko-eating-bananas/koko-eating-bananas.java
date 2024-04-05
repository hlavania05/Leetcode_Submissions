class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        return min_int_k(piles, h);
    }
    public static int min_int_k(int[] arr, int h){
        int start = 1;
        int end = max(arr);
        while(start <= end){
            int mid = start + (end - start)/2;
            if(ispossible(arr, mid) <= h){
                end = mid-1;
            }
            else{
                start = mid + 1; 
            }
        }
        return start;
    }
    public static int ispossible(int[] arr, int mid){
        int total_h = 0;
        for(int i=0; i<arr.length; i++){
            total_h += Math.ceil((double)arr[i]/(double)mid);
        }
        return total_h;
    }
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}