

import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheckerApp {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();


        long startTime1 = System.nanoTime();
        boolean result1 = checkUsingTwoPointer(input);
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;


        long startTime2 = System.nanoTime();
        boolean result2 = checkUsingStack(input);
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;

        System.out.println("Is Palindrome? : " + result1);
        System.out.println("Two Pointer Execution Time : " + duration1 + " ns");
        System.out.println("Stack Execution Time : " + duration2 + " ns");

        scanner.close();
    }

    private static boolean checkUsingTwoPointer(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static boolean checkUsingStack(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}