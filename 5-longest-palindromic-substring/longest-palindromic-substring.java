class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1){
            return s;
        }
        String ans = "";
        for(int i=1; i<s.length(); i++){
            // odd palindromic substring
            int low = i;
            int high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if(low < 0 || high >= s.length()){
                    break;
                }
            }
            String palindrom1 = s.substring(low+1, high);
            if(ans.length() < palindrom1.length()){
                ans = palindrom1;
            }

            // even palindromic substring 
            low = i-1;
            high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if(low < 0 || high >= s.length()){
                    break;
                }
            }
            String palindrom2 = s.substring(low+1, high);
            if(ans.length() < palindrom2.length()){
                ans = palindrom2;
            }
        }
        return ans;
    }
}