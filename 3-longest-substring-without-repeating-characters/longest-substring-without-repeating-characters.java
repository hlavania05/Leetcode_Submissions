class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int maxLen = 0;
        int n = s.length();
        while(i < n && j < n){
            char right = s.charAt(j);
            map.put(right, map.getOrDefault(right, 0)+1);
            while(map.get(right) > 1){
                char left = s.charAt(i);
                map.put(left, map.get(left)-1);
                i++;
            }
            maxLen = Math.max(maxLen, j-i+1);
            j++;
        }
        return maxLen;
    }
}