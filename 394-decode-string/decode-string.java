import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch != ']') {
                stack.push(String.valueOf(ch));
            } else {
                // Collect the substring to be repeated
                StringBuilder substr = new StringBuilder();
                while (!stack.isEmpty() && !stack.peek().equals("[")) {
                    substr.insert(0, stack.pop());
                }
                
                // Remove the '[' from the stack
                stack.pop();

                // Collect the number k to repeat the substring
                StringBuilder k = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    k.insert(0, stack.pop());
                }
                
                // Repeat the substring k times
                int repeatCount = Integer.parseInt(k.toString());
                String repeatedSubstring = substr.toString().repeat(repeatCount);
                
                // Push the repeated substring back to the stack
                stack.push(repeatedSubstring);
            }
        }

        // Collect the final decoded string from the stack
        StringBuilder result = new StringBuilder();
        for (String str : stack) {
            result.append(str);
        }

        return result.toString();
    }
}
