class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        return count(n);
    }
    public static int count(int n){
        if(n == 0) { return 1; }
        if(n == 1) { return 10; }
        if(n == 2) { return 91; }
        return permutation(n) + count(n-1);
    }
    public static int permutation(int n){
        int ans = 9;
        int x = 9;
        while(n-1 > 0){
            ans *= x;
            x--;
            n--;
        }
        return ans;
    }
}