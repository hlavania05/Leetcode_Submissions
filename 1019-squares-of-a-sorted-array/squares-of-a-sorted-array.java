class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int idx = n-1;
        
        int[] ans = new int[n];

        while(i <= j){
            int iSqr = nums[i] * nums[i];
            int jSqr = nums[j] * nums[j];
            if(iSqr < jSqr){
                ans[idx] = jSqr;
                idx--;
                j--;
            }
            else{
                ans[idx] = iSqr;
                i++;
                idx--;
            }
        }
        return ans;

    }
}