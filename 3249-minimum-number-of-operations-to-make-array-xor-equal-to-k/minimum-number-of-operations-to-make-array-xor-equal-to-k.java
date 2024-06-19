class Solution {
    public int minOperations(int[] nums, int k) {
        int xor = 0;
        for(int i=0; i<nums.length; i++){
            xor = xor ^ nums[i];
        }
        int diff = xor ^ k;
        return countOne(diff);
    }
    public static int countOne(int n){
        int cnt = 0;
        while(n != 0){
            n = n & (n-1);
            cnt++;
        }
        return cnt;
    }
}