class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[127];
        Arrays.fill(freq, -1);
        int start = -1, len=0;
        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i)] >= start){
                start = freq[s.charAt(i)];
            } 
            freq[s.charAt(i)] = i;
            len = Math.max(len, i - start);
        } 
        return len;
    }
}