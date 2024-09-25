class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = 0;
        int i = 0;
        int j = 0;
        while(j < nums.length){
            int num = nums[j];
            map.put(num, map.getOrDefault(num, 0)+1);
            while(map.get(num) > k){
                map.put(nums[i], map.get(nums[i])-1);
                if(map.get(nums[i]) == 0){
                    map.remove(nums[i]);
                }
                i++;
            }
            len = Math.max(len, j-i+1);
            j++;
        }
        return len;
    }
}