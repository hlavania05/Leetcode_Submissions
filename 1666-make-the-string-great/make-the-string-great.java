class Solution {
    public String makeGood(String s) {
        if(s.length()==0 || s.length()==1){
            return s;
        }
        Stack<Character> st = new Stack();
        for(char ch : s.toCharArray()){
            if(!st.isEmpty() && (st.peek() == (char)(ch - 32) || st.peek() == (char)(ch + 32))){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char ch : st){
            ans.append(ch);
        }
        return ans.toString();
    }
}