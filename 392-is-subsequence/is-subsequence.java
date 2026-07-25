class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while(i < s.length() && j < t.length()){
            char left = s.charAt(i);
            char right = t.charAt(j);
            if(left == right){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i == s.length();
    }
}