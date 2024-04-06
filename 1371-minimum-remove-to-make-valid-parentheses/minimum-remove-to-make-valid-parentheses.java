class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack(); 
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                continue;
            }
            if(ch == '('){
                st.push(i);
            }
            else{
                if(!st.isEmpty() && s.charAt(st.peek()) == '('){
                    st.pop();
                }
                else{
                    st.push(i);
                }
            }
        }
        System.out.println(st);
        StringBuilder ans = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            if(!st.empty()){
                int idx = st.peek();
                if(idx != i){
                    ans.append(s.charAt(i));
                }
                else{
                    st.pop();
                }
            }
            else{
                ans.append(s.charAt(i));
            }
        }
        ans.reverse();
        return ans.toString();
    }
}