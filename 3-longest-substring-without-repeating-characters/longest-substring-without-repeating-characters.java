class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last_idx = new int[127];
        Arrays.fill(last_idx, -1);
        int start = -1; int len = 0;
        for(int i=0; i<s.length(); i++){
            if(last_idx[s.charAt(i)] >= start){
                start = last_idx[s.charAt(i)];
            }
            last_idx[s.charAt(i)] = i;
            len = Math.max(len, i - start);
        }
        return len;
    }
}