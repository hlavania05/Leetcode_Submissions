class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int cnt = 0;
        int n = s.length();
        while(j < n){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            while(map.size() == 3){
                cnt += (n-j);
                char left = s.charAt(i);
                map.put(left, map.get(left)-1);
                if(map.get(left) == 0){
                    map.remove(left);
                }
                i++;
            }
            j++;
        }
        return cnt;
    }
}