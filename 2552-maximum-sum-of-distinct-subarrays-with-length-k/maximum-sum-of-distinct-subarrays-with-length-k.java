class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left = 0, right = 0;
        long sum = 0, maxSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        while(right < k){
            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0)+1);
            right++;
        }
        if(map.size() == k){
            maxSum = Math.max(sum, maxSum);
        }

        while(right < nums.length){
            int leftItem = nums[left];
            sum = sum - leftItem;
            map.put(leftItem, map.get(leftItem)-1);
            if(map.get(leftItem) == 0){
                map.remove(leftItem);
            }
            left++;

            int rightItem = nums[right];
            sum = sum + rightItem;
            map.put(rightItem, map.getOrDefault(rightItem, 0)+1);
            right++;

            if(map.size() == k){
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;

    }
}