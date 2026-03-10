/**
 * ========================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ========================================================
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This class uses a Deque (double-ended queue) to compare
 * characters from both ends simultaneously.
 * Most efficient data-structure approach.
 *
 * @author akshat-sharma-001
 * @version 7.0
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase7PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "level";

        // Add all characters to Deque
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare first and last characters until meeting in middle
        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input          : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
