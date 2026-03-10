/**
 * ========================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ========================================================
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * This class uses a character array and two-pointer technique
 * to check if a string is a palindrome.
 *
 * @author akshat-sharma-001
 * @version 4.0
 */
public class UseCase4PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "level";

        // Convert string to character array
        char[] chars = input.toCharArray();

        boolean isPalindrome = true;
        int left = 0;
        int right = chars.length - 1;

        // Two-pointer: compare from both ends moving inward
        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Input          : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
