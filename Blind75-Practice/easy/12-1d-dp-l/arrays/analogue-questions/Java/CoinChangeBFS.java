/*
 * LeetCode 322 — Coin Change (BFS approach)
 * Difficulty: Medium
 * Pattern: BFS / Dynamic Programming
 *
 * Problem:
 * Given an array of coin denominations and a target amount, return the
 * minimum number of coins needed to make up that amount.
 * If it is impossible, return -1.
 *
 * Example 1:
 * coins = [1, 5, 6, 9], amount = 11
 * Output: 2
 * Explanation: 5 + 6 = 11
 *
 * Example 2:
 * coins = [2], amount = 3
 * Output: -1
 * Explanation: impossible — 3 is odd, coin is even
 *
 * Example 3:
 * coins = [1, 2, 5], amount = 11
 * Output: 3
 * Explanation: 5 + 5 + 1 = 11
 *
 * BFS Idea:
 * Treat each reachable amount as a node. Start at 0 and expand by adding
 * each coin. The first time we reach `amount`, the number of BFS levels
 * traversed equals the minimum number of coins.
 * We stop as soon as the target is found — no need to fill the whole table.
 *
 * Time:  O(amount × coins.length)
 * Space: O(amount)  — visited array + queue
 */

import java.util.LinkedList;
import java.util.Queue;

public class CoinChangeBFS {

    static class Solution {
        public int coinChange(int[] coins, int amount) {
            if (amount == 0) return 0;

            boolean[] visited = new boolean[amount + 1];
            Queue<Integer> queue = new LinkedList<>();

            queue.add(0);
            visited[0] = true;
            int steps = 0;

            while (!queue.isEmpty()) {
                int size = queue.size();
                steps++;
                for (int i = 0; i < size; i++) {
                    int curr = queue.poll();
                    for (int coin : coins) {
                        int next = curr + coin;
                        if (next == amount) return steps;
                        if (next < amount && !visited[next]) {
                            visited[next] = true;
                            queue.add(next);
                        }
                    }
                }
            }

            return -1;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        assert sol.coinChange(new int[]{1, 5, 6, 9}, 11) == 2 : "expected 2";
        System.out.println("✓ Test 1 passed — [1,5,6,9], amount=11 → 2  (5+6)");

        assert sol.coinChange(new int[]{1, 2, 5}, 11) == 3 : "expected 3";
        System.out.println("✓ Test 2 passed — [1,2,5], amount=11 → 3  (5+5+1)");

        assert sol.coinChange(new int[]{2}, 3) == -1 : "expected -1";
        System.out.println("✓ Test 3 passed — [2], amount=3 → -1  (impossible)");

        assert sol.coinChange(new int[]{1, 5, 6, 9}, 0) == 0 : "expected 0";
        System.out.println("✓ Test 4 passed — any coins, amount=0 → 0  (nothing needed)");

        assert sol.coinChange(new int[]{9}, 9) == 1 : "expected 1";
        System.out.println("✓ Test 5 passed — [9], amount=9 → 1  (one coin exact)");

        System.out.println("\nAll test cases passed!");
    }
}
