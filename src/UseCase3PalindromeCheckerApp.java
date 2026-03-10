/**
 * ========================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ========================================================
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * This class checks palindrome by reversing the string
 * using StringBuilder.reverse() and comparing with original.
 *
 * @author akshat-sharma-001
 * @version 3.0
 */
public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "racecar";

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();

        // Compare original with reversed
        boolean isPalindrome = input.equals(reversed);

        System.out.println("Input          : " + input);
        System.out.println("Reversed       : " + reversed);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
