class Solution {
    public int tribonacci(int n) {
        if(n < 2){
            return n;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i=3; i<=n; i++){
            final int next = a + b + c;
            a = b;
            b = c;
            c = next;
        }
        return c;
    }
}