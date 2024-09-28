class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        return maxSum(nums, k);
    }
    public static long maxSum(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        long maxSum = 0;
        long sum = 0;
        while(r < k){
            int item = arr[r];
            sum += item;
            map.put(item, map.getOrDefault(item, 0)+1);
            r++;
        }
        if(map.size() == k){
            maxSum = Math.max(maxSum, sum);
        }
        while(r < arr.length){
            int left = arr[l];
            map.put(left, map.getOrDefault(left, 0)-1);
            if(map.get(left) == 0){
                map.remove(left);
            }
            sum = sum - left;
            l++;
            int right = arr[r];
            map.put(right, map.getOrDefault(right, 0)+1);
            sum = sum + right;
            r++;

            if(map.size() == k){
                maxSum = Math.max(maxSum, sum);
            }

        }
        return maxSum;
    }
}
