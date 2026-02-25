/**
 * MAIN CLASS - PalindromeCheckerApp
 * Use Case 4: Character Array Based Validation
 *
 * @author Devansh
 * @version 4.0
 */

public class PalindromeCheckerApp {
        // Declare and initialize input string
        String input = "radar";

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Initialize two pointers
        int start = 0;
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare characters using two-pointer technique
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
=======
    public static void main(String[] args) {

        // UC1 - Welcome Message
        System.out.println("=================================");
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Version: 1.0");
        System.out.println("=================================");

        // UC2 - Hardcoded Palindrome Check
        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");

        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}