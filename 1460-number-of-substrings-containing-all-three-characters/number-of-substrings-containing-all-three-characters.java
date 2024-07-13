class Solution {
    public int numberOfSubstrings(String s) {
        int l = 0;
        int r = 0;
        int cnt = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        while(r < n) {
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            while(map.size() == 3){
                cnt += (n-r);
                char leftch = s.charAt(l);
                map.put(leftch, map.get(leftch) - 1);
                if(map.get(leftch) == 0){
                    map.remove(leftch);
                }
                l++;
            }
            r++;
        }
        return cnt;
    }
}