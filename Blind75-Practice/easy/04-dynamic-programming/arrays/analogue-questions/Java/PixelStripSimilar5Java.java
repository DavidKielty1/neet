/*
 * Original Practice Problem 5: Pixel Strip
 * Difficulty: Easy
 * Pattern: Dynamic Programming
 *
 * Problem:
 * A graphic designer fills a strip of exactly n pixels using only:
 * - a 2-pixel segment
 * - a 4-pixel segment
 * Return the number of distinct ordered ways to fill the strip exactly.
 * Return 0 if it is impossible.
 *
 * Example 1:
 * Input: n = 1
 * Output: 0
 * Explanation: Neither segment fits — impossible.
 *
 * Example 2:
 * Input: n = 4
 * Output: 2
 * Explanation: [2+2], [4]
 *
 * Example 3:
 * Input: n = 6
 * Output: 3
 * Explanation: [2+2+2], [2+4], [4+2]
 *
 * Idea:
 * To fill exactly i pixels, the last segment was either 2 (came from i-2) or 4 (came from i-4).
 * So: dp[i] = dp[i-2] + dp[i-4]
 * Base cases: dp[0]=1, dp[1]=0, dp[2]=1, dp[3]=0
 * Note: dp[i] is always 0 for odd i — a strip of odd length can never be filled.
 * Largest lookback is 4 → keep four rolling variables, loop from i=4.
 *
 * Constraints:
 * - 1 <= n <= 40
 */
public class PixelStripSimilar5Java {

    static class Solution {
        public int countFills(int n) {
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
            // dp[i] = dp[i-2] + dp[i-4]
            //
            // if (n == 1 || n == 3) return 0;
            // if (n == 2) return 1;
            // // Seed rolling vars with dp[0]=1, dp[1]=0, dp[2]=1, dp[3]=0
            // int d0 = 1; // dp[i-4]  → starts as dp[0]
            // int d1 = 0; // dp[i-3]  → starts as dp[1]
            // int d2 = 1; // dp[i-2]  → starts as dp[2]
            // int d3 = 0; // dp[i-1]  → starts as dp[3]
            // // Loop computes dp[4], dp[5], ..., dp[n]
            // for (int i = 4; i <= n; i++) {
            //     int current = d2 + d0;  // dp[i] = dp[i-2] + dp[i-4]
            //     d0 = d1;
            //     d1 = d2;
            //     d2 = d3;
            //     d3 = current;
            // }
            // return d3;
            throw new UnsupportedOperationException("Implement countFills");
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.countFills(1) == 0 : "n=1 should be 0";
        System.out.println("✓ Test case 1 passed");
        assert sol.countFills(4) == 2 : "n=4 should be 2";
        System.out.println("✓ Test case 2 passed");
        assert sol.countFills(6) == 3 : "n=6 should be 3";
        System.out.println("✓ Test case 3 passed");
        assert sol.countFills(8) == 5 : "n=8 should be 5";
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
