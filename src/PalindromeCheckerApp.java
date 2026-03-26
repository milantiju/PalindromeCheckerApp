import java.util.Deque;
import java.util.LinkedList;

/**
 * ---------------------------------------------------------------
 * MAIN CLASS – UseCase7PalindromeCheckerApp
 * ---------------------------------------------------------------
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a Deque data structure.
 *
 * Characters are inserted into the deque and compared
 * from the front and rear until the deque becomes empty.
 *
 * @author Developer
 * @version 7.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "refer";

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}