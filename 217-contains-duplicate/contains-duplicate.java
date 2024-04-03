import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 1){
            return false;
        }
        if(nums.length == 2 && nums[0] == nums[1]){
            return true;
        }
        Arrays.sort(nums);
        return duplicate(nums);
    }
    public static boolean duplicate(int[] nums){
        int n = nums.length;
        for (int i=0; i<n-1; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}