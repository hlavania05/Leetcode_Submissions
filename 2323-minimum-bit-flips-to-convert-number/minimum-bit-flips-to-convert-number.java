class Solution {
    public int minBitFlips(int start, int goal) {
        return countOne(start ^ goal);
    }
    public static int countOne(int n){
        int cnt = 0;
        while(n != 0){
            n = n & (n-1);
            cnt++;
        }
        return cnt;
    }
}