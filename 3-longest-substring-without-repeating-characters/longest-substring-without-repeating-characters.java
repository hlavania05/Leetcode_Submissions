class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int maxLen = 0;
        while(r < s.length()){
            char ch = s.charAt(r);
            if(map.containsKey(ch)){
                int last_idx = map.get(ch);
                if(last_idx >= l){
                    l = last_idx + 1;
                }
            }
            maxLen = Math.max(maxLen, r-l+1);
            map.put(ch, r);
            r++;
        }
        return maxLen;

    }
}