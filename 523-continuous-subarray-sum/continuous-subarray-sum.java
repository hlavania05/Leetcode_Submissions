class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefixSum = 0;
        for(int i=0; i<nums.length; i++){
            prefixSum += nums[i];
            int modulo = prefixSum % k;
            if(map.containsKey(modulo)){
                if(i-map.get(modulo) >= 2){
                    return true;
                }    
            }
            else{
                map.put(modulo, i);
            }

        }
        return false;
    }
}