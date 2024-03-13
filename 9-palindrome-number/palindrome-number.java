class Solution {
    public boolean isPalindrome(int x) {
        return Palindrome(x);
    }
    public static Boolean Palindrome(int n){
        int rev = reverse(n);
        if(rev == n){
            return true;
        }
        return false;
    }
    public static int reverse(int num){
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        return rev;

    }
}