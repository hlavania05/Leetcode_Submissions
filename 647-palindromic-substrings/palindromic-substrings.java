class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        if(n < 1){
            return 0;
        }
        int cnt = 0;
        for(int i=1; i<n; i++){
            //checking odd palindromic substring 
            int left = i;
            int right = i;
            while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)){
                cnt++;
                left--;
                right++;
            }

            //checking even palindromic substring
            int low = i-1;
            int high = i;
            while(low >= 0 && high < n && s.charAt(low) == s.charAt(high)){
                cnt++;
                low--;
                high++;
            }
        }
        return cnt+1;
    }
}