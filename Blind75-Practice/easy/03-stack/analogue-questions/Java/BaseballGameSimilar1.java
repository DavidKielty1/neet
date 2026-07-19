/*
 * Similar Problem 1: Training Score Tracker
 * Difficulty: Easy
 * Pattern: Stack
 *
 * Problem:
 * You are recording scores for a training session using special rules.
 * Each operation is one of:
 *
 * - An integer x: record a new score of x.
 * - "C": invalidate and remove the previous valid score.
 * - "D": record a score equal to double the previous valid score.
 * - "+": record a score equal to the sum of the previous three valid scores.
 *   If fewer than three valid scores exist, sum all available valid scores.
 *
 * Return the sum of all valid scores after processing every operation.
 *
 * Example 1:
 * Input: operations = ["5", "2", "+", "D", "C", "10"]
 * Output: 24
 * Explanation:
 * - "5" -> [5]
 * - "2" -> [5, 2]
 * - "+" -> [5, 2, 7]
 * - "D" -> [5, 2, 7, 14]
 * - "C" -> [5, 2, 7]
 * - "10" -> [5, 2, 7, 10]
 * Total = 24
 *
 * Example 2:
 * Input: operations = ["4", "-1", "+"]
 * Output: 6
 * Explanation:
 * - "4" -> [4]
 * - "-1" -> [4, -1]
 * - "+" -> [4, -1, 3]
 * Total = 6
 *
 * Constraints:
 * - 1 <= operations.length <= 1000
 * - operations[i] is "C", "D", "+", or an integer in string form
 * - The input is valid
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class BaseballGameSimilar1 {
    public int calculateTrainingScore(String[] operations) {
        if (operations == null || operations.length == 0) {
            return 0;
        }

        Deque<Integer> stack = new ArrayDeque<>();
        for (String op : operations) {
            switch (op) {
                case "+":
                    int sum = 0;
                    int count = 0;
                    for (Iterator<Integer> it = stack.descendingIterator(); it.hasNext() && count < 3; count++) {
                        sum += it.next();
                    }
                    stack.addLast(sum);
                    break;

                case "D":
                    stack.addLast(2 * stack.peekLast());
                    break;

                case "C":
                    stack.removeLast();
                    break;

                default: stack.addLast(Integer.parseInt(op));
            }
        }
            
        int totalScore = 0;
        for ( int score : stack) {
            totalScore += score;
        }
        return totalScore;
    }
    

    public static void main(String[] args) {
        BaseballGameSimilar1 sol = new BaseballGameSimilar1();
        assert (sol.calculateTrainingScore(
                new String[] {"5", "2", "+", "D", "C", "10"}) == 24);
        System.out.println("✓ Test case 1 passed");
        assert (sol.calculateTrainingScore(new String[] {"4", "-1", "+"}) == 6);
        System.out.println("✓ Test case 2 passed");
        assert (sol.calculateTrainingScore(new String[] {"3", "6", "1", "+"}) == 20);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
