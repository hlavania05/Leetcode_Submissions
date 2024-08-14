class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        // Sort the Array
        Arrays.sort(nums);

        // range for binary search
        int left = 0;
        int right = nums[nums.length-1] - nums[0];

        // applying binary search
        while(left < right){
            int mid = left + (right - left) / 2;
            int count = 0;
            int j = 0;
            for(int i=0; i<nums.length; i++){
                while(j<nums.length && nums[j] - nums[i] <= mid){
                    j++;
                }
                count += j - i - 1;
            }
            if(count >= k){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;

    }
}