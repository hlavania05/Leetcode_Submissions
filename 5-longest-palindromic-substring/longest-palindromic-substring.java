class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n <= 1){
            return s;
        }
        String ans = "";
        for(int i=1; i<n; i++){
            //checking odd palindromic substring 
            int left = i;
            int right = i;
            while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }
            String palindrome1 = s.substring(left+1, right);

            if(ans.length() < palindrome1.length()){
                ans = palindrome1;
            }

            //checking even palindromic substring
            int low = i-1;
            int high = i;
            while(low >= 0 && high < n && s.charAt(low) == s.charAt(high)){
                low--;
                high++;
            }
            String palindrome2 = s.substring(low+1, high);

            if(ans.length() < palindrome2.length()){
                ans = palindrome2;
            }

        }
        return ans;
    }
}