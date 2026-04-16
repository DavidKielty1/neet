/*
 * Original Practice Problem 2: Bench Row Layouts
 * Difficulty: Easy
 * Pattern: Dynamic Programming / Fibonacci
 *
 * Problem:
 * A park designer is filling a row of length n using either:
 * - a single-seat bench that covers 1 unit
 * - a double-seat bench that covers 2 units
 *
 * Return the number of distinct ways to fill the entire row exactly.
 *
 * Example 1:
 * Input: n = 1
 * Output: 1
 * Explanation: [1]
 *
 * Example 2:
 * Input: n = 4
 * Output: 5
 * Explanation:
 * [1+1+1+1], [1+1+2], [1+2+1], [2+1+1], [2+2]
 *
 * Example 3:
 * Input: n = 6
 * Output: 13
 *
 * Constraints:
 * - 1 <= n <= 40
 */
public class BenchRowLayoutsSimilar2Java {

    static class Solution {
        public int countLayouts(int n) {
            int prev2 = 1;
            int prev1 = 2;
            for (int i = 3; i < n; i++){
                int current = prev2 + prev1;
                prev2 = prev1;
                prev1 = current;
            }
            return prev1;
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
            // dp[i] = dp[i - 1] + dp[i - 2]
            //
            // if (n <= 2) {
            //     return n;
            // }
            // int prev2 = 1;
            // int prev1 = 2;
            // for (int i = 3; i <= n; i++) {
            //     int current = prev1 + prev2;
            //     prev2 = prev1;
            //     prev1 = current;
            // }
            // return prev1;
            throw new UnsupportedOperationException("Implement countLayouts");
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.countLayouts(1) == 1;
        System.out.println("✓ Test case 1 passed");
        assert sol.countLayouts(4) == 5;
        System.out.println("✓ Test case 2 passed");
        assert sol.countLayouts(6) == 13;
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
