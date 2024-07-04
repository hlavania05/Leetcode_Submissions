class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        // Count character frequencies for both words
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            char ch = word1.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < word2.length(); i++) {
            char ch = word2.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        // Check if both words have the same set of unique characters
        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }

        // Collect frequencies of both words
        List<Integer> frequencies1 = new ArrayList<>(map1.values());
        List<Integer> frequencies2 = new ArrayList<>(map2.values());

        // Sort frequencies
        Collections.sort(frequencies1);
        Collections.sort(frequencies2);

        // Compare frequencies
        return frequencies1.equals(frequencies2);
    }
}