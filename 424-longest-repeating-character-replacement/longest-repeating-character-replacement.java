class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0;
        int j = 0;
        int[] freq = new int[26];
        int maxFreq = 0;
        int maxLen = 0;
        while(j < s.length()){
            int right = s.charAt(j);
            freq[right-'A']++;
            maxFreq = Math.max(maxFreq, freq[right-'A']);
            int changes = (j-i+1) - maxFreq;
            while(changes > k){
                freq[s.charAt(i)-'A']--;
                i++;
                changes = (j-i+1) - maxFreq;
            }
            maxLen = Math.max(j-i+1, maxLen);
            j++;
        }
        return maxLen;

    }
}