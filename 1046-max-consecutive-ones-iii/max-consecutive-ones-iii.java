class Solution {
    // max subarray length with at most k 0's
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxLen  = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(right < nums.length){
            int item = nums[right];
            map.put(item, map.getOrDefault(item, 0)+1);
            if(map.containsKey(0)){
                while(map.get(0) > k){
                    int leftItem = nums[left];
                    map.put(leftItem, map.get(leftItem)-1);
                    left++;
                }
            }
            maxLen = Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }
}