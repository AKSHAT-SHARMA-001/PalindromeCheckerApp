/**
 * ========================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * ========================================================
 * Use Case 6: Queue & Stack Based Palindrome Check
 *
 * Description:
 * This class uses both Queue (FIFO) and Stack (LIFO).
 * Queue preserves original order, Stack reverses it.
 * Comparing both reveals whether string is palindrome.
 *
 * @author akshat-sharma-001
 * @version 6.0
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam";

        // Queue stores characters in original order (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Stack stores characters in reverse order (LIFO)
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Compare front of queue with top of stack
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input          : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
