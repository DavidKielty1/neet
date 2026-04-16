/*
 * Original Practice Problem 1: River Crossing
 * Difficulty: Easy
 * Pattern: Dynamic Programming
 *
 * Problem:
 * A hiker wants to cross a river using exactly n stepping stones.
 * From any position, the hiker may jump forward either 1 stone or 3 stones.
 * Return the number of distinct ways to reach the far bank exactly.
 *
 * Example 1:
 * Input: n = 2
 * Output: 1
 * Explanation: [1+1]
 *
 * Example 2:
 * Input: n = 4
 * Output: 3
 * Explanation: [1+1+1+1], [1+3], [3+1]
 *
 * Example 3:
 * Input: n = 5
 * Output: 4
 * Explanation: [1+1+1+1+1], [1+1+3], [1+3+1], [3+1+1]
 *
 * Constraints:
 * - 1 <= n <= 40
 */
public class RiverCrossingSimilar1Java {

    static class Solution {
        public int countCrossings(int n) {
            int dp1 = 1;
            int dp2 = 1;
            int dp3 = 2;
            for (int i = 4; i <= n; i++) {
                int current = dp3 + dp1;
                dp1 = dp2;
                dp2 = dp3;
                dp3 = current;
            }
            return dp1;
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
            // dp[i] = dp[i - 1] + dp[i - 3]
            //
            // if (n == 1 || n == 2) {
            //     return 1;
            // }
            // if (n == 3) {
            //     return 2;
            // }
            // int dp1 = 1; // dp[i - 3]
            // int dp2 = 1; // dp[i - 2]
            // int dp3 = 2; // dp[i - 1]
            // for (int i = 4; i <= n; i++) {
            //     int current = dp3 + dp1;
            //     dp1 = dp2;
            //     dp2 = dp3;
            //     dp3 = current;
            // }
            // return dp3;
            throw new UnsupportedOperationException("Implement countCrossings");
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.countCrossings(2) == 1;
        System.out.println("✓ Test case 1 passed");
        assert sol.countCrossings(4) == 3;
        System.out.println("✓ Test case 2 passed");
        assert sol.countCrossings(5) == 4;
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
