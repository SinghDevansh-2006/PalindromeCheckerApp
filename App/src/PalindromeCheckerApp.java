/**
 * MAIN CLASS - PalindromeCheckerApp
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * @author Devansh
 * @version 4.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     */
    public static void main(String[] args) {

        // Declare and initialize input string
        String input = "radar";

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Initialize two pointers
        int start = 0;
        int end = chars.length - 1;

        // Assume it is palindrome initially
        boolean isPalindrome = true;

        // Compare characters using two-pointer technique
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}