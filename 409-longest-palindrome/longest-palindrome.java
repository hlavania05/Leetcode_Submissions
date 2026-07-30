class Solution {
    public int longestPalindrome(String s) {
        int flag = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int len = 0;
        for(char ch : map.keySet()){
            int value = map.get(ch);
            int cnt = (value/2)*2;
            if(value % 2 == 1 && flag != 1){
                flag = 1;
            }
            len += cnt;
        }
        return len + flag;
    }
}