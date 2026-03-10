/**
 * ========================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ========================================================
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 *
 * At this stage, the application:
 * - Defines a common PalindromeStrategy interface
 * - Implements a concrete Stack based strategy
 * - Injects the strategy at runtime
 * - Executes the selected algorithm
 *
 * @author akshat-sharma-001
 * @version 12.0
 */
public class UseCase12PalindromeCheckerApp {

    /**
     * Application entry point for UC12.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "level";

        // Inject StackStrategy at runtime
        PalindromeStrategy strategy = new StackStrategy();
        boolean result = strategy.check(input);

        System.out.println("Input          : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

/**
 * ========================================================
 * INTERFACE - PalindromeStrategy
 * ========================================================
 * This interface defines a contract for all
 * palindrome checking algorithms.
 *
 * Any new algorithm must implement this interface
 * and provide its own validation logic.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * ========================================================
 * CLASS - StackStrategy
 * ========================================================
 * This class provides a Stack based implementation
 * of the PalindromeStrategy interface.
 *
 * It uses LIFO behavior to reverse characters
 * and compare them with the original sequence.
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    public boolean check(String input) {
        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

/**
 * ========================================================
 * CLASS - DequeStrategy
 * ========================================================
 * This class provides a Deque based implementation
 * of the PalindromeStrategy interface.
 */
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                return false;
            }
        }
        return true;
    }
}
