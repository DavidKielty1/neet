/*
 * Original Practice Problem 7: Book Shelf
 * Difficulty: Easy
 * Pattern: Dynamic Programming
 *
 * Problem:
 * A librarian fills a shelf of exactly n book-slots using only:
 * - a slim volume that takes up 1 slot
 * - a box set that takes up 4 slots
 * Return the number of distinct ordered arrangements.
 *
 * Example 1:
 * Input: n = 1
 * Output: 1
 * Explanation: [1]
 *
 * Example 2:
 * Input: n = 5
 * Output: 3
 * Explanation: [1+1+1+1+1], [1+4], [4+1]
 *
 * Example 3:
 * Input: n = 8
 * Output: 7
 * Explanation: [1x8], [1x4+4], [1x3+4+1], [1x2+4+1x2], [1+4+1x3], [4+1x4], [4+4]
 *
 * Idea:
 * To fill exactly i slots the last item was either 1 (came from i-1) or 4 (came from i-4).
 * So: dp[i] = dp[i-1] + dp[i-4]
 * Base cases: dp[0]=1, dp[1]=1, dp[2]=1, dp[3]=1  (only slim volumes possible for 1-3 slots)
 * Largest lookback is 4 → keep four rolling variables, loop from i=4.
 *
 * Constraints:
 * - 1 <= n <= 40
 */
public class BookShelfSimilar7Java {

    static class Solution {
        public int countArrangements(int n) {
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
            // dp[i] = dp[i-1] + dp[i-4]
            //
            // if (n <= 3) return 1;
            // // Seed rolling vars with dp[0]=1, dp[1]=1, dp[2]=1, dp[3]=1
            // int d0 = 1; // dp[i-4]  → starts as dp[0]
            // int d1 = 1; // dp[i-3]  → starts as dp[1]
            // int d2 = 1; // dp[i-2]  → starts as dp[2]
            // int d3 = 1; // dp[i-1]  → starts as dp[3]
            // // Loop computes dp[4], dp[5], ..., dp[n]
            // for (int i = 4; i <= n; i++) {
            //     int current = d3 + d0;  // dp[i] = dp[i-1] + dp[i-4]
            //     d0 = d1;
            //     d1 = d2;
            //     d2 = d3;
            //     d3 = current;
            // }
            // return d3;
            throw new UnsupportedOperationException("Implement countArrangements");
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.countArrangements(1) == 1 : "n=1 should be 1";
        System.out.println("✓ Test case 1 passed");
        assert sol.countArrangements(4) == 2 : "n=4 should be 2";
        System.out.println("✓ Test case 2 passed");
        assert sol.countArrangements(5) == 3 : "n=5 should be 3";
        System.out.println("✓ Test case 3 passed");
        assert sol.countArrangements(8) == 7 : "n=8 should be 7";
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
