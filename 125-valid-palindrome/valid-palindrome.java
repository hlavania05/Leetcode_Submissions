class Solution {
    // brute force
    // public boolean isPalindrome(String s) {
    //     String str = "";
    //     for(char ch : s.toCharArray()){
    //         if(Character.isLetterOrDigit(ch)){
    //             str += Character.toLowerCase(ch);
    //         }
    //     }
    //     return checkPalindrome(str);
    // }

    // optimized - two pointers
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            int left = s.charAt(i);
            int right = s.charAt(j);
            if(Character.isLetterOrDigit(left)){
                if(Character.isLetterOrDigit(right)){
                    if(Character.toLowerCase(left) != Character.toLowerCase(right)){
                        return false;
                    }
                    i++;
                    j--;
                }
                else{
                    j--;
                }
            }
            else{
                i++;
            }
        }
        return true;
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

    
}