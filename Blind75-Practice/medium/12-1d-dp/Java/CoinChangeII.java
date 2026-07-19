/*
 * 518. Coin Change II
 * Difficulty: Medium
 * Pattern: Dynamic Programming (unbounded knapsack)
 *
 * Problem:
 * You are given an integer array coins representing coins of different denominations and
 * an integer amount representing a total amount of money.
 *
 * Return the number of combinations that make up that amount. If that amount of money
 * cannot be made up by any combination of coins, return 0.
 *
 * You may assume that infinite numbers of coins of each kind are available and that
 * the answer fits in a signed 32-bit integer.
 *
 * Example 1:
 * Input: amount = 5, coins = [1,2,5]
 * Output: 4
 * Explanation: four ways: 5, 2+2+1, 2+1+1+1, 1+1+1+1+1
 *
 * Example 2:
 * Input: amount = 3, coins = [2]
 * Output: 0
 *
 * Example 3:
 * Input: amount = 10, coins = [10]
 * Output: 1
 *
 * Constraints:
 * - 1 <= coins.length <= 300
 * - 1 <= coins[i] <= 5000
 * - All coins are unique.
 * - 0 <= amount <= 5000
 *
 * Notes:
 * - dp[s] = number of ways to make sum s.
 * - Iterate coins outer loop to avoid counting permutations twice.
 */

public class CoinChangeII {
    public int change(int amount, int[] coins) {
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //

    // int[] dp = new int[amount + 1];
    // dp[0] = 1;
    // for (int coin : coins) {
    //     for (int s = coin; s <= amount; s++) {
    //         dp[s] += dp[s - coin];
    //     }
    // }
    // return dp[amount];
    }
    

    public static void main(String[] args) {
        CoinChangeII sol = new CoinChangeII();
        assert sol.change(5, new int[] {1, 2, 5}) == 4;
        assert sol.change(3, new int[] {2}) == 0;
        assert sol.change(10, new int[] {10}) == 1;
        System.out.println("All test cases passed!");
    }
}
