class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n2 < n1){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(char ch : s1.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        int i=0;
        int j=0;
        while(j < n1){
            char ch = s2.charAt(j);
            map2.put(ch, map2.getOrDefault(ch, 0)+1);
            j++;
        }
        if(map1.equals(map2)){
            return true;
        }
        while(j < n2){
            char left = s2.charAt(i);
            map2.put(left, map2.getOrDefault(left, 0)-1);
            if(map2.get(left) == 0) {
                map2.remove(left);
            } 
            i++;

            char right = s2.charAt(j);
            map2.put(right, map2.getOrDefault(right, 0)+1);
            j++;

            if(map1.equals(map2)){
                return true;
            }
        }
        return false;
    }
}