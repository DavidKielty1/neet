/*
 * 40. Combination Sum II
 * Difficulty: Medium
 * Pattern: Backtracking
 *
 * Problem:
 * Given a collection of candidate numbers `candidates` and a target number `target`,
 * find all unique combinations in `candidates` where the candidate numbers sum to
 * `target`.
 *
 * Each number in `candidates` may only be used once in the combination.
 *
 * Note: The solution set must not contain duplicate combinations.
 *
 * Example 1:
 * Input: candidates = [10,1,2,7,6,1,5], target = 8
 * Output: [[1,1,6],[1,2,5],[1,7],[2,6]]
 *
 * Example 2:
 * Input: candidates = [2,5,2,1,2], target = 5
 * Output: [[1,2,2],[5]]
 *
 * Example 3:
 * Input: candidates = [1,1], target = 1
 * Output: [[1]]
 *
 * Constraints:
 * - 1 <= candidates.length <= 100
 * - 1 <= candidates[i] <= 50
 * - 1 <= target <= 30
 *
 * Notes:
 * - Sort the array so duplicates sit together.
 * - Move to `i + 1` after picking a value because each element can be used once.
 * - Skip repeated values at the same recursion depth to avoid duplicate combinations.
 */

import java.util.List;

public class CombinationSumII {
    static class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            // Arrays.sort(candidates);
            // List<List<Integer>> result = new ArrayList<>();
            // backtrack(candidates, target, 0, new ArrayList<>(), result);
            // return result;
            //
            // private void backtrack(
            //         int[] candidates,
            //         int remain,
            //         int start,
            //         List<Integer> path,
            //         List<List<Integer>> result) {
            //     if (remain == 0) {
            //         result.add(new ArrayList<>(path));
            //         return;
            //     }
            //
            //     for (int i = start; i < candidates.length; i++) {
            //         if (i > start && candidates[i] == candidates[i - 1]) {
            //             continue;
            //         }
            //         if (candidates[i] > remain) {
            //             break;
            //         }
            //
            //         path.add(candidates[i]);
            //         backtrack(candidates, remain - candidates[i], i + 1, path, result);
            //         path.remove(path.size() - 1);
            //     }
            // }
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready for 40. Combination Sum II.");
    }
}
