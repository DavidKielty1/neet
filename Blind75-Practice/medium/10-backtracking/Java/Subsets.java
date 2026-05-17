/*
 * 78. Subsets
 * Difficulty: Medium
 * Pattern: Backtracking
 *
 * Problem:
 * Given an integer array `nums` of unique elements, return all possible subsets
 * (the power set).
 *
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 *
 * Example 1:
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 *
 * Example 2:
 * Input: nums = [0]
 * Output: [[],[0]]
 *
 * Example 3:
 * Input: nums = [4,5]
 * Output: [[],[4],[5],[4,5]]
 *
 * Constraints:
 * - 1 <= nums.length <= 10
 * - -10 <= nums[i] <= 10
 * - All the numbers of `nums` are unique
 *
 * Notes:
 * - Every position gives you a choice: include the current value or skip it.
 * - A common backtracking pattern is to add the current path to the answer at every call.
 * - Then iterate forward, choose a value, recurse, and undo the choice.
 */

import java.util.List;

public class Subsets {
    static class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
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
            // backtrack(nums, 0, new ArrayList<>(), result);
            // return result;
            //
            // private void backtrack(
            //         int[] nums,
            //         int start,
            //         List<Integer> path,
            //         List<List<Integer>> result) {
            //     result.add(new ArrayList<>(path));
            //
            //     for (int i = start; i < nums.length; i++) {
            //         path.add(nums[i]);
            //         backtrack(nums, i + 1, path, result);
            //         path.remove(path.size() - 1);
            //     }
            // }
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready for 78. Subsets.");
    }
}
