class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans = 0;
        for (int item : nums){
            ans ^= item;
        }
        return ans;
    }
}