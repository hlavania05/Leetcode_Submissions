package Array.Longest_Valid_Parenthesis;
import java.util.Scanner;
import java.util.Stack;

public class OptimizedStackSolution {

    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {

                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        System.out.print("Enter the parentheses string: ");
        String input = scanner.nextLine();

        // calling function
        int result = longestValidParentheses(input);

        // result
        System.out.println("Longest Valid Parentheses Length: " + result);
        scanner.close();
    }
}