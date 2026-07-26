class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(char ch : p.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
        } 
        int n1 = s.length();
        int n2 = p.length();
        List<Integer> ans = new ArrayList<>();
        if(n1 < n2){
            return ans;
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        int i = 0;
        int j = 0; 
        while(j < n2){
            char ch = s.charAt(j);
            map2.put(ch, map2.getOrDefault(ch, 0)+1);
            j++;
        }
        if(map1.equals(map2)){
            ans.add(i);
        }

        while(j < n1){
            char left = s.charAt(i);
            map2.put(left, map2.get(left)-1);
            if(map2.get(left) == 0){
                map2.remove(left);
            }
            i++;
            
            char right = s.charAt(j);
            map2.put(right, map2.getOrDefault(right, 0)+1);
            j++;

            if(map1.equals(map2)){
                ans.add(i);
            }
        }
        return ans;

    }
}