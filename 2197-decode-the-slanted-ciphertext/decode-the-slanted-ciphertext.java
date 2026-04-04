class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int n = encodedText.length();
        int cols = n / rows;
        
        StringBuilder result = new StringBuilder();
        
        for (int startCol = 0; startCol < cols; startCol++) {
            int i = 0, j = startCol;
            
            while (i < rows && j < cols) {
                result.append(encodedText.charAt(i * cols + j));
                i++;
                j++;
            }
        }
        
        // Trim trailing spaces
        while (result.length() > 0 && result.charAt(result.length() - 1) == ' ') {
            result.deleteCharAt(result.length() - 1);
        }
        
        return result.toString();
    }
}