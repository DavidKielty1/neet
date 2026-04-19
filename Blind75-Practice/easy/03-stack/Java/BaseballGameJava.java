/*
 * 682. Baseball Game
 * Difficulty: Easy
 * Pattern: Stack
 *
 * Problem
 * -------
 * You are keeping score for a baseball game with strange rules. You are given a list
 * of operations, where each operation is one of:
 *
 * - An integer `x`: record a new score of `x`.
 * - `"+"`: record a score equal to the sum of the previous two valid scores.
 * - `"D"`: record a score equal to double the previous valid score.
 * - `"C"`: invalidate and remove the previous valid score.
 *
 * Return the sum of all valid scores after processing every operation.
 *
 * Example 1
 * ---------
 * Input: operations = ["5", "2", "C", "D", "+"]
 * Output: 30
 * Explanation:
 * - "5" -> [5]
 * - "2" -> [5, 2]
 * - "C" -> [5]
 * - "D" -> [5, 10]
 * - "+" -> [5, 10, 15]
 * Total = 30
 *
 * Example 2
 * ---------
 * Input: operations = ["5", "-2", "4", "C", "D", "9", "+", "+"]
 * Output: 27
 *
 * Example 3
 * ---------
 * Input: operations = ["1", "C"]
 * Output: 0
 *
 * Constraints
 * -----------
 * - 1 <= operations.length <= 1000
 * - `operations[i]` is `"+"`, `"D"`, `"C"`, or an integer in string form
 * - The input is valid, so every operation that needs previous scores can use them
 *
 * How to think about it
 * ---------------------
 * This is a history-tracking problem. The most recent valid score is the one affected
 * by `"C"` and `"D"`, and the most recent two valid scores are the ones used by `"+"`.
 * A stack fits perfectly because it lets you access, remove, and extend the score history
 * from the end as the operations are processed.
 *
 * Time: O(n), Space: O(n)
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class BaseballGameJava {

    public int calPoints(String[] operations) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (String op : operations) {
            switch (op) {
                case "D":
                    stack.addLast(2 * stack.peekLast());
                    break;
                case "C":
                    stack.removeLast();
                    break;
                case "+":
                    int a = stack.removeLast();
                    int b = stack.peekLast();
                    stack.addLast(a);
                    stack.addLast(a + b);
                    break;
                default: stack.addLast(Integer.parseInt(op));
            }
        }

        int totalSum = 0;
        for (int score : stack) {
            totalSum += score;
        }

        return totalSum;

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // Deque<Integer> stack = new ArrayDeque<>();
        // for (String op : operations) {
            // switch (op) {
                // case "+":
                // int a = stack.removeLast();
                // int b = stack.peekLast();
                // stack.addLast(a);
                // stack.addLast(a + b);
                // break;
                // case "D":
                // stack.addLast(2 * stack.peekLast());
                // break;
                // case "C":
                // stack.removeLast();
                // break;
                // default:
                // stack.addLast(Integer.parseInt(op));
            // }
        // }
        // int sum = 0;
        // for (int v : stack) {
            // sum += v;
        // }
        // return sum;

        // java.util.Deque<Integer> stack = new java.util.ArrayDeque<>();
        // for (String op : operations) {
        //     if (op.equals("+")) {
        //         int top = stack.pop();
        //         int next = stack.peek();
        //         stack.push(top);
        //         stack.push(top + next);
        //     } else if (op.equals("D")) {
        //         stack.push(stack.peek() * 2);
        //     } else if (op.equals("C")) {
        //         stack.pop();
        //     } else {
        //         stack.push(Integer.parseInt(op));
        //     }
        // }
        // int total = 0;
        // for (int score : stack) {
        //     total += score;
        // }
        // return total;
        throw new UnsupportedOperationException("Implement calPoints");
    }

    public static void main(String[] args) {
        BaseballGameJava s = new BaseballGameJava();
        assert s.calPoints(new String[] {"5", "2", "C", "D", "+"}) == 30;
        assert s.calPoints(new String[] {"5", "-2", "4", "C", "D", "9", "+"}) == 27;
        assert s.calPoints(new String[] {"1", "C"}) == 0;
        System.out.println("All test cases passed!");
    }
}
