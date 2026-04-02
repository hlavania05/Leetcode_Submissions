import java.util.*;

class Solution {
    public String generateString(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int len = n + m - 1;

        char[] word = new char[len];
        Arrays.fill(word, '?');

        // Step 1: Apply 'T'
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'T') {
                for (int j = 0; j < m; j++) {
                    if (word[i + j] == '?' || word[i + j] == str2.charAt(j)) {
                        word[i + j] = str2.charAt(j);
                    } else {
                        return "";
                    }
                }
            }
        }

        // Step 2: Fill remaining positions carefully
        for (int i = 0; i < len; i++) {
            if (word[i] == '?') {
                for (char c = 'a'; c <= 'z'; c++) {
                    word[i] = c;

                    if (isValid(word, str1, str2, i)) {
                        break;
                    }
                }
            }
        }

        // Final validation
        if (!isFullyValid(word, str1, str2)) return "";

        return new String(word);
    }

    // Check only affected windows around index i
    private boolean isValid(char[] word, String str1, String str2, int idx) {
        int n = str1.length();
        int m = str2.length();

        for (int i = Math.max(0, idx - m + 1); i <= Math.min(idx, n - 1); i++) {
            boolean match = true;

            for (int j = 0; j < m; j++) {
                if (word[i + j] == '?' || word[i + j] != str2.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (str1.charAt(i) == 'F' && match) return false;
        }

        return true;
    }

    // Final check
    private boolean isFullyValid(char[] word, String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        for (int i = 0; i < n; i++) {
            boolean match = true;

            for (int j = 0; j < m; j++) {
                if (word[i + j] != str2.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (str1.charAt(i) == 'T' && !match) return false;
            if (str1.charAt(i) == 'F' && match) return false;
        }

        return true;
    }
}