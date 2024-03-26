class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }
            else{
                if(!stack.empty() && stack.peek() == '('){
                    stack.pop();
                }
                else{ count++; }
            }
        }
        return count + stack.size();
    }
}