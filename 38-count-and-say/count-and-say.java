import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String s = "1";
        for (int i = 2; i <= n; i++) { // Loop from 2 to n
            s = say(s); // Generate the next term based on the current term
        }
        return s;
    }

    public String say(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1; // To count occurrences of each character
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++; // Increment count if the same character repeats
            } else {
                result.append(count).append(s.charAt(i - 1)); // Append count and character
                count = 1; // Reset count for the new character
            }
        }
        // Append the last counted character
        result.append(count).append(s.charAt(s.length() - 1));
        return result.toString();
    }
}
