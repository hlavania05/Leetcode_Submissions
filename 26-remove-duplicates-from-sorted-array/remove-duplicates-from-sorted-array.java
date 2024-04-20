class Solution {
    public int removeDuplicates(int[] nums) {
        return remove_duplicate(nums);
    }
    public static int remove_duplicate(int[] arr){
        int pointer = 1;
        int num = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] != num){
                num = arr[i];
                arr[pointer] = arr[i];
                pointer++;
            }
        }
        return pointer;
    }
}