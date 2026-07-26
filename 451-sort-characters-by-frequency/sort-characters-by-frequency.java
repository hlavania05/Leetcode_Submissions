class Solution {
    public String frequencySort(String s) {
       HashMap<Character, Integer> map = new HashMap<>();
       for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
       }

       List<Map.Entry<Character, Integer>> lst = new ArrayList<>(map.entrySet());
       Collections.sort(lst, (a,b) -> b.getValue() - a.getValue());
        StringBuilder str = new StringBuilder();
       for(Map.Entry<Character, Integer> entry : lst){
          char ch = entry.getKey();
          int freq = entry.getValue();
          while(freq > 0){
            str.append(ch);
            freq--;
          }
       } 
       return str.toString();
   }
}