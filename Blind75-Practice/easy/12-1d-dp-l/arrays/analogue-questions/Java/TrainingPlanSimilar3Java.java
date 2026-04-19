/*
 * Original Practice Problem 3: Training Plan
 * Difficulty: Easy
 * Pattern: Dynamic Programming
 *
 * Problem:
 * A runner wants to complete exactly n km of training.
 * Every run must be either 2 km or 3 km — no other distances are allowed.
 * Return the number of distinct ordered ways to reach exactly n km.
 * Return 0 if it is impossible.
 *
 * Example 1:
 * Input: n = 2
 * Output: 1
 * Explanation: [2]
 *
 * Example 2:
 * Input: n = 5
 * Output: 2
 * Explanation: [2+3], [3+2]
 *
 * Example 3:
 * Input: n = 6
 * Output: 2
 * Explanation: [2+2+2], [3+3]
 *
 * Example 4:
 * Input: n = 7
 * Output: 3
 * Explanation: [2+2+3], [2+3+2], [3+2+2]
 *
 * Idea:
 * To land exactly on n you must have come from n-2 (a 2 km run) or n-3 (a 3 km run).
 * So: dp[i] = dp[i - 2] + dp[i - 3]
 * Base cases: dp[0] = 1 (empty plan), dp[1] = 0 (impossible), dp[2] = 1 ([2]), dp[3] = 1 ([3])
 * Keep only three rolling variables — no array needed.
 *
 * Constraints:
 * - 1 <= n <= 40
 */

// int dp0 = xxx; // dp[i- xxx]
// int dp1 = xxx; // dp[i- xxx]
// int dp2 = xxx; // dp[i- xxx]
// int dp3 = xxx; // dp[i- xxx]
// int dp4 = xxx; // dp[i- xxx]
// int dp5 = xxx; // dp[i- xxx]
// for (int i = xxxx; i <= n; i++) {
//     int curr = xxxx;
//     dp0 = dp1;
//     dp1 = dp2;
//     dp2 = dp3;
//     dp3 = dp4;
//     dp4 = dp5;
//     dp5 = curr;
// }
// return dp;
public class TrainingPlanSimilar3Java {

    static class Solution {
        public int countPlans(int n) {
            if ( n == 1) {
                return 0;
            }

            if( n == 2) {
                return 1;
            }

            int dp0 = 1; // dp[i- 3]
            int dp1 = 0; // dp[i- 2]
            int dp2 = 1; // dp[i- 1]
            for (int i = 3; i <= n; i++) {
                int curr = dp1 + dp0;
                dp0 = dp1;
                dp1 = dp2;
                dp2 = curr;
            }
            return dp2;

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
            // Largest lookback is 3, so define base cases for dp[0], dp[1], dp[2].
            // dp[0] = 1 (empty plan), dp[1] = 0 (impossible), dp[2] = 1 ([2])
            // dp[i] = dp[i - 2] + dp[i - 3]  for i >= 3
            //
            // if (n == 1) {
            //     return 0;
            // }
            // if (n == 2) {
            //     return 1;
            // }
            // int d0 = 1; // dp[i - 3]  → starts as dp[0]
            // int d1 = 0; // dp[i - 2]  → starts as dp[1]
            // int d2 = 1; // dp[i - 1]  → starts as dp[2]

            // for (int i = 3; i <= n; i++) {
            //     int current = d1 + d0;  // dp[i] = dp[i-2] + dp[i-3]
            //     d0 = d1;
            //     d1 = d2;
            //     d2 = current;
            // }
            // return d2;
            throw new UnsupportedOperationException("Implement countPlans");
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.countPlans(1) == 0;
        System.out.println("✓ Test case 1 passed");
        assert sol.countPlans(2) == 1;
        System.out.println("✓ Test case 2 passed");
        assert sol.countPlans(5) == 2;
        System.out.println("✓ Test case 3 passed");
        assert sol.countPlans(7) == 3;
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
