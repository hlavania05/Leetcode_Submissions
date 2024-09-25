class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int len = 0;
        int i = 0;
        int j = 0;
        while(j < s.length()){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            while(map.get(ch) > 1){
                char leftCh = s.charAt(i);
                map.put(leftCh, map.get(leftCh)-1);
                i++;
            }
            len = Math.max(len, j-i+1);
            j++;
        }
        return len;

    }
}