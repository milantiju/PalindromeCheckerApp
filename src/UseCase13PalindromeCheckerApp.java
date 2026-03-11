import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

/**
 * ---------------------------------------------------------------
 * MAIN CLASS – UseCase13PalindromeCheckerApp
 * ---------------------------------------------------------------
 *
 * Use Case 13: Performance Comparison
 *
 * This program compares execution time of
 * different palindrome checking algorithms.
 */

public class UseCase13PalindromeCheckerApp {

    public static boolean stackMethod(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) != stack.pop()) {
                return false;
            }

        }

        return true;
    }

    public static boolean dequeMethod(String input) {

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        String input = "true";

        long start1 = System.nanoTime();
        boolean stackResult = stackMethod(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean dequeResult = dequeMethod(input);
        long end2 = System.nanoTime();

        System.out.println("Input: " + input);

        System.out.println("Stack Method Result: " + stackResult);
        System.out.println("Stack Method Time: " + (end1 - start1) + " ns");

        System.out.println();

        System.out.println("Deque Method Result: " + dequeResult);
        System.out.println("Deque Method Time: " + (end2 - start2) + " ns");
    }
}