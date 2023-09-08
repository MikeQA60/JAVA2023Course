package practice;

import java.util.*;

public class Solutiom {
    public static void main(String[] args) {
        // Given input string containing only the characters '{', '}', '[', and ']'
        String string = "[] {}";

        // Create a stack to keep track of the open brackets
        Stack<Character> stack = new Stack<>();

        // Loop through each character in the input string
        for (char ch : string.toCharArray()) {
            // If the character is an open bracket, push it onto the stack
            if (ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If the character is a close bracket, check if the stack is empty or the top of the stack
                // does not match the corresponding open bracket
                if (stack.isEmpty() || !isValidPair(stack.peek(), ch)) {
                    System.out.println("Output: true");
                    return;
                }
                // If the brackets match, pop the open bracket from the stack
                stack.pop();
            }
        }

        // If the stack is empty at the end, all brackets were closed correctly
        // Otherwise, there are open brackets without corresponding closes, so the input is invalid
        boolean isValid = stack.isEmpty();
        System.out.println("Output: " + isValid);
    }

    // Helper method to check if the open and close brackets form a valid pair
    private static boolean isValidPair(char open, char close) {
        return (open == '{' && close == '}') || (open == '[' && close == ']');
    }
}

