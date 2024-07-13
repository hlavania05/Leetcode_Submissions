class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }

        int l = 0;
        int r = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        while(r < s1.length()){
            char ch = s2.charAt(r);
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
            r++;
        }
        if(map.equals(map1)){
            return true;
        }
        while(r < s2.length()){
            char left = s2.charAt(l);
            map1.put(left, map1.getOrDefault(left, 0)-1);
            if(map1.get(left) == 0){
                map1.remove(left);
            }
            l++;

            char right = s2.charAt(r);
            map1.put(right, map1.getOrDefault(right, 0)+1);
            r++;

            if(map.equals(map1)){
                return true;
            }
        }
        return false;


    }
}