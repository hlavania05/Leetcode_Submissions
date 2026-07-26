class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] arr = pattern.toCharArray();
        String[] arr2 = s.split(" ");
        if(arr.length != arr2.length){
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            char ch = arr[i];
            String str = arr2[i];

            if(map.containsKey(ch) && !map.get(ch).equals(str)){
                return false;
            }
            else if (map2.containsKey(str) && map2.get(str) != ch)
                return false;
            

            map.put(ch, str);
            map2.put(str, ch);
        }
        return true;
    }
}