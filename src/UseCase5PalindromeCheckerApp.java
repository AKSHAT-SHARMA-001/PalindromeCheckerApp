/**
 * ========================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ========================================================
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This class uses a Stack (LIFO) to reverse characters
 * and check palindrome by comparing with original.
 *
 * @author akshat-sharma-001
 * @version 5.0
 */
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "radar";

        // Push all characters onto the stack
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Pop characters to form reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        boolean isPalindrome = input.equals(reversed.toString());

        System.out.println("Input          : " + input);
        System.out.println("Reversed       : " + reversed);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
