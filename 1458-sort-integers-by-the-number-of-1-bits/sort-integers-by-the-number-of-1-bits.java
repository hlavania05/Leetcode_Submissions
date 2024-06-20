class Solution {
    public int[] sortByBits(int[] arr) {
        for(int i=0; i<arr.length; i++){
            arr[i] += countBit(arr[i])*100001;
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] % 100001;
        }
        return arr;
    }
    public int countBit(int n){
        int cnt = 0;
        while(n != 0){
            n = n & (n-1);
            cnt++;
        }
        return cnt;
    }
}