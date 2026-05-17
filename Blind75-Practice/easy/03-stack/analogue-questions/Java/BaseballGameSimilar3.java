/*
 * Similar Problem 3: Match Points Ledger
 * Difficulty: Easy
 * Pattern: Stack
 *
 * Problem:
 * You are tracking match points using special operations.
 * Each operation is one of:
 *
 * - An integer x: record a new score of x.
 * - "D": record a score equal to double the previous valid score.
 * - "+": record a score equal to the sum of the previous two valid scores.
 * - "C": invalidate and remove the previous two valid scores.
 *
 * Return the sum of all valid scores after processing every operation.
 *
 * Example 1:
 * Input: operations = ["5", "-2", "4", "C", "9", "+", "+"]
 * Output: 51
 * Explanation:
 * - "5" -> [5]
 * - "-2" -> [5, -2]
 * - "4" -> [5, -2, 4]
 * - "C" -> [5]
 * - "9" -> [5, 9]
 * - "+" -> [5, 9, 14]
 * - "+" -> [5, 9, 14, 23]
 * Total = 51
 *
 * Example 2:
 * Input: operations = ["3", "7", "D", "C"]
 * Output: 3
 *
 * Constraints:
 * - 1 <= operations.length <= 1000
 * - operations[i] is "C", "D", "+", or an integer in string form
 * - The input is valid, including every "C" removing two existing scores
 */
public class BaseballGameSimilar3 {

    static class Solution {
        public int tallyMatchPoints(String[] operations) {
            // Keep valid scores in stack order.
            // D uses the most recent score.
            // + uses the most recent two scores.
            // C removes the last two valid entries instead of one.
            throw new UnsupportedOperationException("Implement tallyMatchPoints");
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.tallyMatchPoints(new String[] {"5", "-2", "4", "C", "9", "+", "+"}) == 51);
        System.out.println("✓ Test case 1 passed");
        assert (sol.tallyMatchPoints(new String[] {"3", "7", "D", "C"}) == 3);
        System.out.println("✓ Test case 2 passed");
        assert (sol.tallyMatchPoints(new String[] {"2", "6", "+", "C", "5"}) == 7);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
