/*
 * 77. Combinations
 * Difficulty: Medium
 * Pattern: Backtracking
 *
 * Problem:
 * Given two integers `n` and `k`, return all possible combinations of `k` numbers chosen
 * from the range `[1, n]`.
 *
 * You may return the answer in any order.
 *
 * Example 1:
 * Input: n = 4, k = 2
 * Output: [[2,4],[3,4],[2,3],[1,2],[1,3],[1,4]]
 *
 * Example 2:
 * Input: n = 1, k = 1
 * Output: [[1]]
 *
 * Example 3:
 * Input: n = 5, k = 3
 * Output: All 3-element combinations from 1 through 5
 *
 * Constraints:
 * - 1 <= n <= 20
 * - 1 <= k <= n
 *
 * Notes:
 * - Build combinations in increasing order so each subset appears once.
 * - At each step choose the next number from `start` through `n`.
 * - Once the path size reaches `k`, record a copy and backtrack.
 */

import java.util.List;

public class CombinationsJava {
    static class Solution {
        public List<List<Integer>> combine(int n, int k) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            // List<List<Integer>> result = new ArrayList<>();
            // backtrack(n, k, 1, new ArrayList<>(), result);
            // return result;
            //
            // private void backtrack(
            //         int n,
            //         int k,
            //         int start,
            //         List<Integer> path,
            //         List<List<Integer>> result) {
            //     if (path.size() == k) {
            //         result.add(new ArrayList<>(path));
            //         return;
            //     }
            //
            //     for (int value = start; value <= n; value++) {
            //         path.add(value);
            //         backtrack(n, k, value + 1, path, result);
            //         path.remove(path.size() - 1);
            //     }
            // }
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready for 77. Combinations.");
    }
}
