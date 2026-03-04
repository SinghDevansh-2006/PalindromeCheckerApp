

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;




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


    public static void main(String[] args) {

        // Define the input string to validate
        String input = "civic";
        for (char c : input.toCharArray()) {
            queue.add(c);     // Enqueue
            stack.push(c);    // Push
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare dequeue (FIFO) vs pop (LIFO)
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }

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