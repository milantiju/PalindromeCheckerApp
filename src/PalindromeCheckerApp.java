/**
 * ---------------------------------------------------------------
 * MAIN CLASS – UseCase11PalindromeCheckerApp
 * ---------------------------------------------------------------
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Demonstrates encapsulation by separating the palindrome
 * logic into a dedicated PalindromeChecker class.
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}