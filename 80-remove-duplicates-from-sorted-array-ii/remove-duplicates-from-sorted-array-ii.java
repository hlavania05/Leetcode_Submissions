class Solution {
    public int removeDuplicates(int[] nums) {
        return remove_duplicate(nums);
    }
    public static int remove_duplicate(int[] arr){
        int x = 0;
        for(int i=0; i<arr.length; i++){
            if(x<2 || arr[i] != arr[x-2]){
                arr[x++] = arr[i];
            }
        }
        return x;
    }
}