/**
 * ========================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * ========================================================
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 *
 * @author akshat-sharma-001
 * @version 9.0
 */
public class UseCase9PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam";

        boolean isPalindrome = check(input, 0, input.length() - 1);

        System.out.println("Input          : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Recursively checks whether a string is a palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base condition: if start meets or passes end
        if (start >= end) {
            return true;
        }

        // If characters don't match, not a palindrome
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}
