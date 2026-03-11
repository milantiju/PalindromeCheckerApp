import java.util.Stack;

/**
 * ---------------------------------------------------------------
 * MAIN CLASS – UseCase5PalindromeCheckerApp
 * ---------------------------------------------------------------
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a Stack data structure.
 *
 * Characters are pushed into the stack and popped
 * to compare with the original string.
 *
 * @author Developer
 * @version 5.0
 */

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "noon";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        for (int i = 0; i < input.length(); i++) {

            char popped = stack.pop();

            if (input.charAt(i) != popped) {
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