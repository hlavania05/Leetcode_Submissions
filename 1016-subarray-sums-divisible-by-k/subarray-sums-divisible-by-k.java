class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int count = 0;
        hm.put(0, 1);
        for(int i : nums) {
            sum = (i+sum)%k;
            if(sum < 0) sum += k;
            if(hm.containsKey(sum)) count += hm.get(sum);
            hm.put(sum, hm.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}