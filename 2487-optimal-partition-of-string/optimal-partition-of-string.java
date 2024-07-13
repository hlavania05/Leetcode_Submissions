class Solution {
    public int partitionString(String s) {
        int l = 0;
        int cnt = 0;
        HashSet<Character> set = new HashSet<>();
        for(int r = 0; r < s.length(); r++){
            char ch = s.charAt(r);
            if(set.contains(ch)){
                cnt++;
                set.clear();
            }
            set.add(ch);
        }
        if(!set.isEmpty()){
            cnt++;
        }
        return cnt;
    }
}