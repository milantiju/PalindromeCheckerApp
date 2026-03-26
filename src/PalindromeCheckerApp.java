/**
 * ---------------------------------------------------------------
 * MAIN CLASS – UseCase4PalindromeCheckerApp
 * ---------------------------------------------------------------
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by converting it into a character array and comparing
 * characters using the two-pointer technique.
 *
 * @author Developer
 * @version 4.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "radar";

        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }

    }
}