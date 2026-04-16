/*
 * Original Practice Problem 4: Frog Pond
 * Difficulty: Easy
 * Pattern: Dynamic Programming / Tribonacci
 *
 * Problem:
 * A frog sits at the near bank of a pond divided into n lily pads, numbered 1..n.
 * From any pad (or from the bank at position 0), the frog may jump forward
 * exactly 1, 2, or 3 pads at a time.
 * Return the number of distinct ways the frog can reach pad n.
 *
 * Example 1:
 * Input: n = 1
 * Output: 1
 * Explanation: [1]
 *
 * Example 2:
 * Input: n = 3
 * Output: 4
 * Explanation: [1+1+1], [1+2], [2+1], [3]
 *
 * Example 3:
 * Input: n = 5
 * Output: 13
 * Explanation: [1+1+1+1+1], [1+1+1+2], [1+1+2+1], [1+2+1+1], [2+1+1+1],
 *              [1+2+2], [2+1+2], [2+2+1], [1+1+3], [1+3+1], [3+1+1], [2+3], [3+2]
 *
 * Idea:
 * To land on pad i the frog must have come from pad i-1, i-2, or i-3.
 * So: dp[i] = dp[i-1] + dp[i-2] + dp[i-3]
 * Base cases: dp[0]=1 (already there), dp[1]=1, dp[2]=2
 * Largest lookback is 3 → keep three rolling variables, loop from i=3.
 *
 * Constraints:
 * - 1 <= n <= 40
 */
public class FrogPondSimilar4Java {

    static class Solution {
        public int countHops(int n) {
            if (n == 1) {
                return 1;
            }

            if (n == 2) {
                return 2;
            }

            int hop1 = 1;
            int hop2 = 2;

            for (int i = 2; i < n; i++) {
                int current = hop2 + hop1;
                hop1 = hop2;
                hop2 = current;
            }

            return hop2;
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
            // dp[i] = dp[i-1] + dp[i-2] + dp[i-3]
            //
            // if (n == 1) return 1;
            // if (n == 2) return 2;
            // // Seed rolling vars with dp[0]=1, dp[1]=1, dp[2]=2
            // int d0 = 1; // dp[i-3]  → starts as dp[0]
            // int d1 = 1; // dp[i-2]  → starts as dp[1]
            // int d2 = 2; // dp[i-1]  → starts as dp[2]
            // // Loop computes dp[3], dp[4], ..., dp[n]
            // for (int i = 3; i <= n; i++) {
            //     int current = d2 + d1 + d0;  // dp[i] = dp[i-1] + dp[i-2] + dp[i-3]
            //     d0 = d1;
            //     d1 = d2;
            //     d2 = current;
            // }
            // return d2;
            throw new UnsupportedOperationException("Implement countHops");
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.countHops(1) == 1  : "n=1 should be 1";
        System.out.println("✓ Test case 1 passed");
        assert sol.countHops(3) == 4  : "n=3 should be 4";
        System.out.println("✓ Test case 2 passed");
        assert sol.countHops(5) == 13 : "n=5 should be 13";
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
