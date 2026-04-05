/*
682. Baseball Game
Difficulty: Easy
Pattern: Stack

Interpret ops: number, "+", "D", "C". Return total score.

Time: O(n), Space: O(n)
*/

import java.util.ArrayDeque;
import java.util.Deque;

public class BaseballGameJava {

    public int calPoints(String[] operations) {
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
