class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> st = new Stack<>();
        for(String str : arr){
            if(str.equals(".") || str.equals("")){
                continue;
            }
            else if(str.equals("..")){
                if(!st.isEmpty()) {
                    st.pop();
                }
            }
            else{
                st.push(str);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(String str : st){
            ans.append("/").append(str);
        }
        return ans.length() == 0 ? "/" : ans.toString();
        
    }
}