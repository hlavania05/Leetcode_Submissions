class Solution {
    public int maxProfit(int[] arr) {
        int maxPro = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > arr[i-1]){
                maxPro += (arr[i] - arr[i-1]);
            }
        }
        return maxPro;
    }
}