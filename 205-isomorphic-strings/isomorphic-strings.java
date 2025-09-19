class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> st = new HashMap<>();
        HashMap<Character, Character> ts = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            char charT = s.charAt(i);
            char charS = t.charAt(i);
            if(st.containsKey(charS) && st.get(charS) != charT){
                return false;
            }  
            else{
                st.put(charS, charT);
            }

            if(ts.containsKey(charT) && ts.get(charT) != charS){
                return false;
            }  
            else{
                ts.put(charT, charS);
            }
        }
        return true;
        
    }
}