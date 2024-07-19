class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder newStr = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                newStr.append(ch);
            }
        } 
        System.out.println(newStr.toString());
        return(func(newStr.toString()));
    }
    public boolean func(String s){
        int i =0;
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