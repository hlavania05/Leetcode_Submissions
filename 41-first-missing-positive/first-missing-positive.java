class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] flag = new boolean[n+1];
        for(int i : nums){
            if(i>0 && i<= n){
                flag[i] = true;
            }
        }
        for(int i=1; i<=n; i++){
            if(!flag[i]){
                return i;
            }
        }
        return n+1;
    }
}