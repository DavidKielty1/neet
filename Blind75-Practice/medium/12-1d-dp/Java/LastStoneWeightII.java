/*
 * 1049. Last Stone Weight II
 * Difficulty: Medium
 * Pattern: Dynamic Programming (0/1 knapsack / partition)
 *
 * Problem:
 * You are given an array of integers stones where stones[i] is the weight of the ith
 * stone. On each turn, choose any two stones and smash them together.
 *
 * If x == y, both are destroyed. If x != y, the stone of weight x is destroyed and
 * the stone of weight y becomes weight y - x.
 *
 * Return the smallest possible weight of the left stone. If there are no stones left,
 * return 0.
 *
 * Example 1:
 * Input: stones = [2,7,4,1,8,1]
 * Output: 1
 *
 * Example 2:
 * Input: stones = [31,26,33,21,40]
 * Output: 5
 *
 * Constraints:
 * - 1 <= stones.length <= 30
 * - 1 <= stones[i] <= 100
 *
 * Notes:
 * - Minimize |sum(P) - sum(N)| by partitioning stones into two groups.
 * - Find the largest subset sum <= total/2 using 0/1 knapsack DP.
 */

public class LastStoneWeightII {
    public int lastStoneWeightII(int[] stones) {
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //

    // int total = 0;
    // for (int s : stones) {
    //     total += s;
    // }
    // int capacity = total / 2;
    // boolean[] dp = new boolean[capacity + 1];
    // dp[0] = true;
    // for (int s : stones) {
    //     for (int w = capacity; w >= s; w--) {
    //         dp[w] = dp[w] || dp[w - s];
    //     }
    // }
    // for (int w = capacity; w >= 0; w--) {
    //     if (dp[w]) {
    //         return total - 2 * w;
    //     }
    // }
    // return 0;
    }
    

    public static void main(String[] args) {
        LastStoneWeightII sol = new LastStoneWeightII();
        assert sol.lastStoneWeightII(new int[] {2, 7, 4, 1, 8, 1}) == 1;
        assert sol.lastStoneWeightII(new int[] {31, 26, 33, 21, 40}) == 5;
        System.out.println("All test cases passed!");
    }
}
