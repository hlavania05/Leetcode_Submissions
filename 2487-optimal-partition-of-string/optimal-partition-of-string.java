class Solution {
    public int partitionString(String s) {
        int l = 0;
        int r = 0;
        int cnt = 1;
        HashMap<Character, Integer> map = new HashMap<>();
        while(r < s.length()){
            char ch = s.charAt(r);
            if(map.containsKey(ch)){
                int lastIdx = map.get(ch);
                if(lastIdx >= l){
                    l = r;
                    cnt++;
                    map.clear();
                }
            }
            map.put(ch, r);
            r++;
            
        }
        return cnt;
    }
}