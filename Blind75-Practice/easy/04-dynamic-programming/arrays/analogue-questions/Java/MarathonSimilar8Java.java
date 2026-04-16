/*
 * Original Practice Problem 8: Marathon Segments
 * Difficulty: Easy
 * Pattern: Dynamic Programming
 *
 * Problem:
 * A runner trains for a marathon by completing exactly n km in a session.
 * Every individual run must be either exactly 2 km or exactly 5 km.
 * Return the number of distinct ordered run plans that total exactly n km.
 * Return 0 if it is impossible.
 *
 * Example 1:
 * Input: n = 2
 * Output: 1
 * Explanation: [2]
 *
 * Example 2:
 * Input: n = 7
 * Output: 2
 * Explanation: [2+5], [5+2]
 *
 * Example 3:
 * Input: n = 9
 * Output: 3
 * Explanation: [2+2+5], [2+5+2], [5+2+2]
 *
 * Idea:
 * To reach exactly i km the last run was either 2 km (came from i-2) or 5 km (came from i-5).
 * So: dp[i] = dp[i-2] + dp[i-5]
 * Base cases: dp[0]=1, dp[1]=0, dp[2]=1, dp[3]=0, dp[4]=1
 * (For i<5 only the 2 km run can contribute; 5 km would look back past index 0.)
 * Largest lookback is 5 → keep five rolling variables, loop from i=5.
 *
 * Constraints:
 * - 1 <= n <= 40
 */
public class MarathonSimilar8Java {

    static class Solution {
        public int countSegments(int n) {
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
            // dp[i] = dp[i-2] + dp[i-5]
            //
            // if (n == 1 || n == 3) return 0;
            // if (n == 2 || n == 4) return 1;
            // // Seed rolling vars with dp[0]=1, dp[1]=0, dp[2]=1, dp[3]=0, dp[4]=1
            // int d0 = 1; // dp[i-5]  → starts as dp[0]
            // int d1 = 0; // dp[i-4]  → starts as dp[1]
            // int d2 = 1; // dp[i-3]  → starts as dp[2]
            // int d3 = 0; // dp[i-2]  → starts as dp[3]
            // int d4 = 1; // dp[i-1]  → starts as dp[4]
            // // Loop computes dp[5], dp[6], ..., dp[n]
            // for (int i = 5; i <= n; i++) {
            //     int current = d3 + d0;  // dp[i] = dp[i-2] + dp[i-5]
            //     d0 = d1;
            //     d1 = d2;
            //     d2 = d3;
            //     d3 = d4;
            //     d4 = current;
            // }
            // return d4;
            throw new UnsupportedOperationException("Implement countSegments");
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.countSegments(1) == 0 : "n=1 should be 0";
        System.out.println("✓ Test case 1 passed");
        assert sol.countSegments(2) == 1 : "n=2 should be 1";
        System.out.println("✓ Test case 2 passed");
        assert sol.countSegments(5) == 1 : "n=5 should be 1";
        System.out.println("✓ Test case 3 passed");
        assert sol.countSegments(7) == 2 : "n=7 should be 2";
        System.out.println("✓ Test case 4 passed");
        assert sol.countSegments(9) == 3 : "n=9 should be 3";
        System.out.println("✓ Test case 5 passed");
        System.out.println("\nAll test cases passed!");
    }
}
