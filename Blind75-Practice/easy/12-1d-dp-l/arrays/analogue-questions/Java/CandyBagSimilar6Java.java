/*
 * Original Practice Problem 6: Candy Bag
 * Difficulty: Easy
 * Pattern: Dynamic Programming
 *
 * Problem:
 * A sweet shop packs exactly n sweets using only:
 * - small bags that hold exactly 3 sweets
 * - large bags that hold exactly 5 sweets
 * Return the number of distinct ordered packing plans.
 * Return 0 if it is impossible to reach exactly n sweets.
 *
 * Example 1:
 * Input: n = 3
 * Output: 1
 * Explanation: [3]
 *
 * Example 2:
 * Input: n = 8
 * Output: 2
 * Explanation: [3+5], [5+3]
 *
 * Example 3:
 * Input: n = 11
 * Output: 3
 * Explanation: [3+3+5], [3+5+3], [5+3+3]
 *
 * Idea:
 * To reach exactly i sweets the last bag was either 3 (came from i-3) or 5 (came from i-5).
 * So: dp[i] = dp[i-3] + dp[i-5]
 * Base cases: dp[0]=1, dp[1]=0, dp[2]=0, dp[3]=1, dp[4]=0
 * Largest lookback is 5 → keep five rolling variables, loop from i=5.
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
public class CandyBagSimilar6Java {

    static class Solution {
        public int countPackings(int n) {
            if ( n == 1 || n == 2 || n == 4 ) {
                return 0;
            }
        
            if (n == 3 ) {
                return 1;
            }
            int dp0 = 1; // dp[i- 5]
            int dp1 = 0; // dp[i- 4]
            int dp2 = 0; // dp[i- 3]
            int dp3 = 1; // dp[i- 2]
            int dp4 = 0; // dp[i- 1]
            for (int i = 5; i <= n; i++) {
                int curr = dp0 + dp2;
                dp0 = dp1;
                dp1 = dp2;
                dp2 = dp3;
                dp3 = dp4;
                dp4 = curr;
            }
            return dp4;
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
            // dp[i] = dp[i-3] + dp[i-5]
            //
            // if (n == 1 || n == 2 || n == 4) return 0;
            // if (n == 3) return 1;
            // // Seed rolling vars with dp[0]=1, dp[1]=0, dp[2]=0, dp[3]=1, dp[4]=0
            // int d0 = 1; // dp[i-5]  → starts as dp[0]
            // int d1 = 0; // dp[i-4]  → starts as dp[1]
            // int d2 = 0; // dp[i-3]  → starts as dp[2]
            // int d3 = 1; // dp[i-2]  → starts as dp[3]
            // int d4 = 0; // dp[i-1]  → starts as dp[4]
            // // Loop computes dp[5], dp[6], ..., dp[n]
            // for (int i = 5; i <= n; i++) {
            //     int current = d2 + d0;  // dp[i] = dp[i-3] + dp[i-5]
            //     d0 = d1;
            //     d1 = d2;
            //     d2 = d3;
            //     d3 = d4;
            //     d4 = current;
            // }
            // return d4;
            throw new UnsupportedOperationException("Implement countPackings");
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.countPackings(3)  == 1 : "n=3 should be 1";
        System.out.println("✓ Test case 1 passed");
        assert sol.countPackings(4)  == 0 : "n=4 should be 0";
        System.out.println("✓ Test case 2 passed");
        assert sol.countPackings(8)  == 2 : "n=8 should be 2";
        System.out.println("✓ Test case 3 passed");
        assert sol.countPackings(11) == 3 : "n=11 should be 3";
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
