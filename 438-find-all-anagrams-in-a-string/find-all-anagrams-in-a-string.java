class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // mapping the frequency of character in p string
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(char ch : p.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
        }

        // hashmap that will store the current substring character's frequency
        HashMap<Character, Integer> map2 = new HashMap<>();
        int l = 0;
        int r = 0;
        List<Integer> ans = new ArrayList<>();

        if(s.length() < p.length()){
            return ans;
        }

        // Initialize first window
        while(r< p.length()){
            char ch = s.charAt(r);
            map2.put(ch, map2.getOrDefault(ch, 0)+1);
            r++;
        }
        
        while(r < s.length()){
            if(map1.equals(map2)){
                ans.add(l);
            }
            // Remove the leftmost character of the current window
            char leftChar = s.charAt(l);
            if (map2.get(leftChar) == 1) {
                map2.remove(leftChar);
            } else {
                map2.put(leftChar, map2.get(leftChar) - 1);
            }
            l++;

            // Add the next character to the window
            char rightChar = s.charAt(r);
            map2.put(rightChar, map2.getOrDefault(rightChar, 0) + 1);
            r++;
        }  
        // Check the last window
        if (map1.equals(map2)) {
            ans.add(l);
        }
        return ans;  
    }
}