class Solution {
    public void moveZeroes(int[] arr) {
        int i = 0;
        int j = 0;
        while(j < arr.length){
            if(arr[j] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
            j++;
        }
    }
}