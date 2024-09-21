class Solution {
    public int mySqrt(int x) {
        if(x <= 1){
            return x;
        }
        int low = 1;
        int high = x/2;
        int ans = 0;
        long temp;
        while(low <= high){
            int mid = low + (high - low)/2;
            temp = (long)mid * (long)mid;
            if(temp == x){
                return mid;
            }
            if(temp < x){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
}