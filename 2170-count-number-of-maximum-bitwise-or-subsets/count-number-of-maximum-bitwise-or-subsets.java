class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int max_or = 0;
        for(int item : nums){
            max_or = max_or | item;
        }
        int n = nums.length;
        int subsets = (1 << n);
        int ans = 0;
        for(int i=0; i<subsets; i++){
            int or = 0;
            for(int j=0; j<n; j++){
                if((int)(i & (1<<j)) == 0){
                    or = or | nums[j];
                }
            }
            if(max_or == or){ ans++; }
        }
        return ans;
    }
    
}