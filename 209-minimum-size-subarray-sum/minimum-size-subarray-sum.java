class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       return min_array(target, nums);
    }
    public int min_array(int target, int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = 0;
        int sum = 0;
        int min_len = 10000000;
        while(i<n){
            while(j<n && sum<target){
                sum+=arr[j];
                j++;
            }
            if(sum>=target){
                min_len = Math.min(min_len, j-i);
            }
            sum -=arr[i];
            i++;
        }
        return min_len==10000000?0:min_len;
    }
    
}