/**
 * ========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ========================================================
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * @author akshat-sharma-001
 * @version 13.0
 */
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "level";

        System.out.println("Input : " + input);
        System.out.println("==========================================");

        // --- Algorithm 1: String Reverse ---
        long start1 = System.nanoTime();
        boolean result1 = checkUsingStringReverse(input);
        long end1 = System.nanoTime();
        System.out.println("String Reverse | Is Palindrome? : " + result1
                + " | Execution Time : " + (end1 - start1) + " ns");

        // --- Algorithm 2: Stack ---
        long start2 = System.nanoTime();
        boolean result2 = checkUsingStack(input);
        long end2 = System.nanoTime();
        System.out.println("Stack          | Is Palindrome? : " + result2
                + " | Execution Time : " + (end2 - start2) + " ns");

        // --- Algorithm 3: Deque ---
        long start3 = System.nanoTime();
        boolean result3 = checkUsingDeque(input);
        long end3 = System.nanoTime();
        System.out.println("Deque          | Is Palindrome? : " + result3
                + " | Execution Time : " + (end3 - start3) + " ns");

        // --- Algorithm 4: Two Pointer ---
        long start4 = System.nanoTime();
        boolean result4 = checkUsingTwoPointer(input);
        long end4 = System.nanoTime();
        System.out.println("Two Pointer    | Is Palindrome? : " + result4
                + " | Execution Time : " + (end4 - start4) + " ns");

        System.out.println("==========================================");
    }

    // Algorithm 1: String Reverse
    private static boolean checkUsingStringReverse(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // Algorithm 2: Stack
    private static boolean checkUsingStack(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) stack.push(c);
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    // Algorithm 3: Deque
    private static boolean checkUsingDeque(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) return false;
        }
        return true;
    }

    // Algorithm 4: Two Pointer
    private static boolean checkUsingTwoPointer(String input) {
        int start = 0, end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }
}
