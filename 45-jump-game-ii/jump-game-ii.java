class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int l = 0;
        int r = 0;
        while(r < nums.length-1){
            int maxJump = 0;
            for(int i=l; i<=r; i++){
                maxJump = Math.max(maxJump, nums[i] + i);
            }
            l = r+1;
            r = maxJump;
            jump++;
        }
        return jump;

    }
}