class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return major(nums);
    }
    public int major(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int count = 1;
            while(i < n-1 && arr[i] == arr[i+1]){
                count++;
                i++;
            }
            if(count > n/2){
                return arr[i];
            }
        }
        return 0;
    }
}