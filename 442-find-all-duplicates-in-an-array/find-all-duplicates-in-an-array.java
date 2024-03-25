class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        boolean[] istaken = new boolean[nums.length+1];
        List<Integer> ans = new ArrayList<>();
        for(int num : nums){
            if(istaken[num]){
                ans.add(num);                
            }
            istaken[num] = true;
        }
        return ans;
    }
}