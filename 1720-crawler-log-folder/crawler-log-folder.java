class Solution {
    public int minOperations(String[] logs) {
        Stack<Integer> st = new Stack<>();
        for(String item : logs){
            if(item.equals("../")){
                if(!st.empty()){
                    st.pop();
                }
            }
            else if(item.equals("./")){
                continue;
            }
            else{
                st.push(1);
            }
        }
        return st.size();
    }
}