/*
 * 1140. Stone Game II
 * Difficulty: Medium
 * Pattern: Dynamic Programming (game theory + prefix sums)
 *
 * Problem:
 * Alice and Bob continue their games with piles of stones. There are piles arranged in
 * a row, and each pile has a positive integer number of stones piles[i]. Alice and Bob
 * take turns, with Alice starting first.
 *
 * On each turn, the player takes the first X remaining piles where 1 <= X <= 2M. Then we
 * set M = max(M, X). The game continues until all stones are taken.
 *
 * Assuming Alice and Bob play optimally, return the maximum number of stones Alice can
 * get.
 *
 * Example 1:
 * Input: piles = [2,7,9,4,4]
 * Output: 10
 *
 * Example 2:
 * Input: piles = [1,2,3,4,5,100]
 * Output: 104
 *
 * Constraints:
 * - 1 <= piles.length <= 100
 * - 1 <= piles[i] <= 10^4
 *
 * Notes:
 * - Prefix sums let you get stones taken in O(1).
 * - memo(i, m) = max stones current player can get from index i with limit m.
 */

public class StoneGameII {
    static class Solution {
        public int stoneGameII(int[] piles) {
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

            // int n = piles.length;
            // int[] suffix = new int[n + 1];
            // for (int i = n - 1; i >= 0; i--) {
            //     suffix[i] = suffix[i + 1] + piles[i];
            // }
            // int[][] memo = new int[n][n + 1];
            // return dfs(0, 1, piles, suffix, memo);
        }

        // private int dfs(int i, int m, int[] piles, int[] suffix, int[][] memo) {
        //     if (i >= piles.length) {
        //         return 0;
        //     }
        //     if (memo[i][m] != 0) {
        //         return memo[i][m];
        //     }
        //     int best = 0;
        //     int takeLimit = Math.min(2 * m, piles.length - i);
        //     for (int x = 1; x <= takeLimit; x++) {
        //         int stones = suffix[i] - suffix[i + x];
        //         int opponent = dfs(i + x, Math.max(m, x), piles, suffix, memo);
        //         best = Math.max(best, stones - opponent);
        //     }
        //     memo[i][m] = best;
        //     return best;
        // }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.stoneGameII(new int[] {2, 7, 9, 4, 4}) == 10;
        assert sol.stoneGameII(new int[] {1, 2, 3, 4, 5, 100}) == 104;
        System.out.println("All test cases passed!");
    }
}
