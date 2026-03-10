/**
 * ========================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ========================================================
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 *
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 * - removeFirst()
 * - removeLast()
 *
 * @author akshat-sharma-001
 * @version 8.0
 */
import java.util.LinkedList;

public class UseCase8PalindromeCheckerApp {

    /**
     * Application entry point for UC8.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "level";

        // Create a LinkedList and add each character
        LinkedList<Character> list = new LinkedList<>();
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input          : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
