class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int xor1 = xor(arr1);
        int xor2 = xor(arr2);
        return xor1 & xor2;
    }
    public static int xor(int[] arr){
        int x = 0;
        for(int v : arr){
            x ^= v;
        }
        return x;
    }
}