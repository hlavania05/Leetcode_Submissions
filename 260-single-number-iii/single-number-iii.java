class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            xor = xor ^ nums[i];
        }
        int rightBit = (xor & (xor-1)) ^ xor;
        int same = 0;
        int notSame = 0;
        for(int i=0; i<n; i++){
            if((int)(rightBit & nums[i]) != 0){
                same = same ^ nums[i];
            }
            else{
                notSame = notSame ^ nums[i];
            }
        } 
        return new int[]{same, notSame};
    }
}