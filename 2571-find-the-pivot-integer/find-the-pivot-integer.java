class Solution {
    public int pivotInteger(int n) {
        int sum = n*(n + 1)/2; 
        int left_sum = 0;
        for(int i=1; i<=n; i++) {
            left_sum += i;
            if(sum - left_sum  + i == left_sum){
                return i;
            }
        }
        return -1;
    }
}