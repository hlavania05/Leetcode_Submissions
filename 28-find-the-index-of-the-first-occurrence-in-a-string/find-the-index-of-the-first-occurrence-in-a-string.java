class Solution {
    public int strStr(String haystack, String needle) {
        return first_index(haystack, needle);
    }
    public static int first_index(String str, String substr){
        str = str.toLowerCase();
        int len1 = str.length();
        int len2 = substr.length();
        for(int i=0; i<=len1-len2; i++){
            String str_new = str.substring(i,i+len2);
            if(str_new.compareTo(substr) == 0){
                return i;
            }
        }
        return -1;
    }
}