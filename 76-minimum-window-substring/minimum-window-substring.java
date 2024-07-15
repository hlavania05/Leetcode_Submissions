class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()){
            return "";
        }
        int[] hash = new int[256];
        for(char ch : t.toCharArray()){
            hash[ch]++;
        }
        int l = 0;
        int r = 0;
        int minLen = Integer.MAX_VALUE;
        int cnt = 0;
        int idx = -1;

        while(r < s.length()){
            char ch = s.charAt(r);
            if(hash[ch] > 0){ cnt++; }
            hash[ch]--;

            while(cnt == t.length()){
                if(r-l+1 < minLen){
                    minLen = r-l+1;
                    idx = l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)] > 0){
                    cnt--;
                }
                l++;
            }
            r++;
        }
        return (idx == -1)? "": s.substring(idx, idx + minLen);
    }
}