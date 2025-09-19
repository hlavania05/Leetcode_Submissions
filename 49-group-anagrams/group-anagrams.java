class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String newStr = new String(arr);
            if(map.containsKey(newStr)){
                map.get(newStr).add(str);
            }
            else{
                List<String> s = new ArrayList<>();
                s.add(str);
                map.put(newStr, s);
            }
        }
        return new ArrayList<>(map.values());
    }
}