class Solution {
    public boolean isNStraightHand(int[] nums, int k) {
        if(nums.length % k != 0){
            return false;
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int item : nums){
            map.put(item, map.getOrDefault(item, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();

            if(freq > 0){
            for(int i=0; i<k; i++){
                int v = num + i;
                if(map.getOrDefault(v, 0) < freq){
                    return false;
                }
                map.put(v, map.get(v)-freq);
            }
            }
        }
        return true;
    }
}