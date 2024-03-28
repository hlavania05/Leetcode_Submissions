class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else if(!stack.empty() && ((ch == '}' && stack.peek() == '{') || (ch == ']' && stack.peek() == '[') || (ch == ')' && stack.peek() == '('))){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.empty();

    }
}