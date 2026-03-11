/**
 * ---------------------------------------------------------------
 * MAIN CLASS – UseCase12PalindromeCheckerApp
 * ---------------------------------------------------------------
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Demonstrates runtime selection of palindrome algorithms
 * using the Strategy design pattern.
 */

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        PalindromeStrategy strategy;

        strategy = new StackStrategy();

        boolean result = strategy.checkPalindrome(input);

        if (result) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}