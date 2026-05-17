/*
 * 90. Subsets II
 * Difficulty: Medium
 * Pattern: Backtracking
 *
 * Problem:
 * Given an integer array `nums` that may contain duplicates, return all possible subsets
 * (the power set).
 *
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 *
 * Example 1:
 * Input: nums = [1,2,2]
 * Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
 *
 * Example 2:
 * Input: nums = [0]
 * Output: [[],[0]]
 *
 * Example 3:
 * Input: nums = [4,4,4,1,4]
 * Output: [[],[1],[1,4],[1,4,4],...,[4,4,4,4]]
 *
 * Constraints:
 * - 1 <= nums.length <= 10
 * - -10 <= nums[i] <= 10
 *
 * Notes:
 * - Sort first so duplicates are adjacent.
 * - At each depth, skip equal values if you already considered the earlier copy.
 * - This keeps the subset list unique without needing a set of lists.
 */

import java.util.List;

public class SubsetsII {
    static class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            // Arrays.sort(nums);
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
            //         if (i > start && nums[i] == nums[i - 1]) {
            //             continue;
            //         }
            //
            //         path.add(nums[i]);
            //         backtrack(nums, i + 1, path, result);
            //         path.remove(path.size() - 1);
            //     }
            // }
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready for 90. Subsets II.");
    }
}
