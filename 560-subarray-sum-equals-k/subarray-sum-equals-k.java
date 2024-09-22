class Solution {
    public int subarraySum(int[] nums, int k) {
        // storing sum and its occurence
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int ans = 0;
        int sum = 0;
        for(int item : nums){
            sum += item;
            if(map.containsKey(sum - k)){
                ans += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return ans;
    }
}