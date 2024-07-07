class Solution {
    public int minFlips(int a, int b, int c) {
        int cnt = 0;
        while(a != 0 || b != 0 || c != 0){
            int r1 = a & 1;
            int r2 = b & 1;
            int r3 = c & 1;
            if(r3 == 1){
                if(r1 == 0 && r2 == 0){
                    cnt++;
                }
            }
            else{
                cnt += r1 + r2;
            }
            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }
        return cnt;
    }
}