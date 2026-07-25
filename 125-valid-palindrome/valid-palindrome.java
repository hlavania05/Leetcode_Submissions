class Solution {
    // brute force
    public boolean isPalindrome(String s) {
        String str = "";
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                str += Character.toLowerCase(ch);
            }
        }
        return checkPalindrome(str);
    }
    public boolean checkPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    // optimized - two pointers
    // public boolean isPalindrome(String s) {
        
    // }
}