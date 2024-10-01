class Solution {
    public int longestSubstring(String s, int k) {
        return helper(s, k, 0, s.length()-1);
    }
    public int helper(String s, int k, int start, int end){
        if(end - start + 1 < k){
            return 0;
        }

        int[] freq = new int[26];
        for(int i=start; i <= end; i++){
            freq[s.charAt(i) - 'a']++;
        }

        for(int i=start; i <= end; i++){
            if(freq[s.charAt(i) - 'a'] < k){
                int left = helper(s, k, start, i-1);
                int right = helper(s, k, i+1, end);
                return Math.max(left, right);
            }
        }

        return end - start+1;
    }

}