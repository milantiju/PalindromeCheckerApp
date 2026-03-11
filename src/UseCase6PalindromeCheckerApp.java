import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

/**
 * ---------------------------------------------------------------
 * MAIN CLASS – UseCase6PalindromeCheckerApp
 * ---------------------------------------------------------------
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * both Queue (FIFO) and Stack (LIFO).
 *
 * Characters are inserted into both structures and
 * compared using dequeue and pop operations.
 *
 * @author Developer
 * @version 6.0
 */

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "civic";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            stack.push(ch);
            queue.add(ch);
        }

        boolean isPalindrome = true;

        while (!stack.isEmpty()) {

            char fromStack = stack.pop();
            char fromQueue = queue.remove();

            if (fromStack != fromQueue) {
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