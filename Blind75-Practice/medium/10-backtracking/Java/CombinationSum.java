/*
 * 39. Combination Sum
 * Difficulty: Medium
 * Pattern: Backtracking
 *
 * Problem:
 * Given an array of distinct integers `candidates` and a target integer `target`,
 * return a list of all unique combinations of `candidates` where the chosen numbers
 * sum to `target`.
 *
 * You may return the combinations in any order.
 *
 * The same number may be chosen from `candidates` an unlimited number of times.
 * Two combinations are unique if the frequency of at least one chosen number differs.
 *
 * It is guaranteed that the number of unique combinations that sum to `target` is
 * less than 150 for the given input.
 *
 * Example 1:
 * Input: candidates = [2,3,6,7], target = 7
 * Output: [[2,2,3],[7]]
 *
 * Example 2:
 * Input: candidates = [2,3,5], target = 8
 * Output: [[2,2,2,2],[2,3,3],[3,5]]
 *
 * Example 3:
 * Input: candidates = [2], target = 1
 * Output: []
 *
 * Constraints:
 * - 1 <= candidates.length <= 30
 * - 2 <= candidates[i] <= 40
 * - All elements of `candidates` are distinct
 * - 1 <= target <= 40
 *
 * Notes:
 * - Sort is optional here because values are already distinct, but it can still make the
 *   recursion easier to reason about.
 * - From an index, either use that value again or move forward to larger indexes.
 * - Stop exploring as soon as the running sum exceeds the target.
 */

import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
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
        //     if (remain < 0) {
        //         return;
        //     }
        //
        //     for (int i = start; i < candidates.length; i++) {
        //         path.add(candidates[i]);
        //         backtrack(candidates, remain - candidates[i], i, path, result);
        //         path.remove(path.size() - 1);
        //     }
        // }
    

    public static void main(String[] args) {
        System.out.println("Practice stub ready for 39. Combination Sum.");
    }
}
