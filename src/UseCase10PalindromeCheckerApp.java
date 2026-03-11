/**
 * ---------------------------------------------------------------
 * MAIN CLASS – UseCase10PalindromeCheckerApp
 * ---------------------------------------------------------------
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * This program normalizes a string by removing spaces
 * and converting it to lowercase before checking if
 * it is a palindrome.
 */

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "a man a plan a canal panama";

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("\"" + input + "\"" + " is a Palindrome");
        } else {
            System.out.println("\"" + input + "\"" + " is NOT a Palindrome");
        }
    }
}