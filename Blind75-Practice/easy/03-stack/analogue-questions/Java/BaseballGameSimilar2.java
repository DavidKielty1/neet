/*
 * Similar Problem 2: Quiz Correction Log
 * Difficulty: Easy
 * Pattern: Stack
 *
 * Problem:
 * You are tracking quiz scores with a few special operations.
 * Each operation is one of:
 *
 * - An integer x: record a new score of x.
 * - "C": invalidate and remove the previous valid score.
 * - "D": record a score equal to double the previous valid score.
 * - "+": record a score equal to the sum of the previous two valid scores.
 * - "H": record a score equal to half of the previous valid score, rounded
 *   toward zero.
 *
 * Return the sum of all valid scores after processing every operation.
 *
 * Example 1:
 * Input: operations = ["8", "H", "D", "+", "C", "3"]
 * Output: 23
 * Explanation:
 * - "8" -> [8]
 * - "H" -> [8, 4]
 * - "D" -> [8, 4, 8]
 * - "+" -> [8, 4, 8, 12]
 * - "C" -> [8, 4, 8]
 * - "3" -> [8, 4, 8, 3]
 * Total = 23
 *
 * Example 2:
 * Input: operations = ["7", "H", "H"]
 * Output: 12
 *
 * Constraints:
 * - 1 <= operations.length <= 1000
 * - operations[i] is "C", "D", "+", "H", or an integer in string form
 * - The input is valid
 */

import java.util.ArrayDeque;

public class BaseballGameSimilar2 {

    static class Solution {
        public int calculateQuizScore(String[] operations) {
            ArrayDeque<Integer> stack = new ArrayDeque<>();
            for ( String op : operations) {
                switch (op) {
                    case "H":
                        // plus last /2
                        stack.addLast(Math.floorDiv(stack.peekLast(), 2));
                        break;
                    case "C":
                        // remove last

                        break;
                    case "D":
                        // double 

                        break;
                    case "+":
                        // add last 2

                        break;
                    default: Integer.parseInt(op);

                }
            }
            // out of for loop
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.calculateQuizScore(
                new String[] {"8", "H", "D", "+", "C", "3"}) == 23);
        System.out.println("✓ Test case 1 passed");
        assert (sol.calculateQuizScore(new String[] {"7", "H", "H"}) == 12);
        System.out.println("✓ Test case 2 passed");
        assert (sol.calculateQuizScore(new String[] {"10", "-3", "H", "+"}) == 2);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
