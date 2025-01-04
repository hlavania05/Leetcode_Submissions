class Solution {
    public int countPalindromicSubsequence(String s) {
        HashSet<Character> uniqueChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            uniqueChars.add(c);
        }
        int cnt = 0;
        for (char x : uniqueChars) {
            int left = s.indexOf(x);
            int right = s.lastIndexOf(x);
            HashSet<Character> middleChars = new HashSet<>();
            if (left != right) {
                for (int i = left + 1; i < right; i++) {
                    middleChars.add(s.charAt(i));
                }
            }   
            cnt += middleChars.size();
        }
        return cnt;
    }
}