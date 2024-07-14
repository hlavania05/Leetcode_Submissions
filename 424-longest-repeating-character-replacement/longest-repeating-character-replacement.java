class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        for(int i=0; i<s.length(); i++){
            int[] freq = new int[26];
            int maxFreq = 0;
            for(int j=i; j<s.length(); j++){
                char ch = s.charAt(j);
                freq[ch - 'A']++;
                maxFreq = Math.max(maxFreq, freq[ch - 'A']);
                int changes = (j-i+1) - maxFreq;
                if(changes <= k){
                    maxLen = Math.max(maxLen, j-i+1);
                }
                else{
                    break;
                }
            }
        }
        return maxLen;
    }
}