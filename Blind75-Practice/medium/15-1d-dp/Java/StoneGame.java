/*
 * 877. Stone Game
 * Difficulty: Medium
 * Pattern: Dynamic Programming (game theory)
 *
 * Problem:
 * Alice and Bob play a game with piles of stones. There are an even number of piles
 * arranged in a row, and each pile has a positive integer number of stones piles[i].
 *
 * On each turn, a player takes the entire pile from the start or end of the row. The
 * game continues until there are no more piles. The player with the most stones wins.
 *
 * Given an integer array piles, return true if Alice can win if both players play
 * optimally. Alice plays first.
 *
 * Example 1:
 * Input: piles = [5,3,4,5]
 * Output: true
 *
 * Example 2:
 * Input: piles = [3,7,2,3]
 * Output: true
 *
 * Constraints:
 * - 2 <= piles.length <= 500
 * - piles.length is even.
 * - 1 <= piles[i] <= 500
 *
 * Notes:
 * - With even pile count, Alice always wins (math argument).
 * - DP approach: score difference on interval [i, j] with memo.
 */

public class StoneGame {
    public boolean stoneGame(int[] piles) {
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

    // return true;
    //
    // // DP version (interval score difference):
    // // int n = piles.length;
    // // int[][] memo = new int[n][n];
    // // return scoreDiff(piles, 0, n - 1, memo) > 0;
    }

    // private int scoreDiff(int[] piles, int left, int right, int[][] memo) {
    //     if (left > right) {
    //         return 0;
    //     }
    //     if (memo[left][right] != 0) {
    //         return memo[left][right];
    //     }
    //     int takeLeft = piles[left] - scoreDiff(piles, left + 1, right, memo);
    //     int takeRight = piles[right] - scoreDiff(piles, left, right - 1, memo);
    //     memo[left][right] = Math.max(takeLeft, takeRight);
    //     return memo[left][right];
    // }
    

    public static void main(String[] args) {
        StoneGame sol = new StoneGame();
        assert sol.stoneGame(new int[] {5, 3, 4, 5});
        assert sol.stoneGame(new int[] {3, 7, 2, 3});
        System.out.println("All test cases passed!");
    }
}
