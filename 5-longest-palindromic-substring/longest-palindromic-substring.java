class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n <= 1){ return s; }

        int max_len = 1;
        int st = 0;
        int end = 0;

        // for odd substrings
        for(int i=0; i<n-1; i++){
            int l = i ,r = i;
            while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)){
                l--; r++;
            }
            int len = r  - l - 1;
            if(len > max_len){
                max_len = len;
                st = l+1;
                end = r-1;
            }
        }
        // for even substrings
        for(int i=0; i<n-1; i++){
            int l = i, r = i+1;
            while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)){
                l--; r++;
            }
            int len = r  - l - 1;
            if(len > max_len){
                max_len = len;
                st = l+1;
                end = r-1;
            }
        }
        return s.substring(st, end+1);
    }
}