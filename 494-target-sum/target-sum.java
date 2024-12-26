class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return count(nums, target, 0);
    }
    public static int count(int[] arr, int target, int idx){
        if(idx == arr.length){
            if(target == 0){
                return 1;
            }
            return 0;
        }
        int c1 = count(arr, target - arr[idx], idx + 1);
        int c2 = count(arr, target + arr[idx], idx + 1);
        return c1 + c2;

    }
}