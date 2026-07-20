package Array.longest_valid_parentheses;

import java.util.Scanner;

public class BruteForceSolution {
    public static int longestValidParentheses(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                if (isValid(s, i, j)) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }
    public static boolean isValid(String s, int start, int end) {

        int count = 0;

        for (int k = start; k <= end; k++) {

            if (s.charAt(k) == '(') {
                count++;
            } else {
                count--;
            }

            if (count < 0) {
                return false;
            }
        }

        return count == 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the parentheses string: ");
        String input = scanner.nextLine();

        int result = longestValidParentheses(input);

        System.out.println("Longest Valid Parentheses Length: " + result);

        scanner.close();
    }
}