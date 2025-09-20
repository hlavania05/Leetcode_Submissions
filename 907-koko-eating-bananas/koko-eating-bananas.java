class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = max(piles);
        int ans = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(ispossible(piles, mid, h)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;

    }
    public boolean ispossible(int[] arr, int k, int hr){
        int total_hr = 0;
        for(int item : arr){
            total_hr += Math.ceil((double)item/(double)k);
        }
        return total_hr <= hr;
    }
    public int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int item : arr){
            max = Math.max(max, item);
        }
        return max;
    }

}