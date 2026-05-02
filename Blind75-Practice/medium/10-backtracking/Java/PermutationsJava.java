/*
 * 46. Permutations
 * Difficulty: Medium
 * Pattern: Backtracking
 *
 * Problem:
 * Given an array `nums` of distinct integers, return all the possible permutations.
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 *
 * Example 2:
 * Input: nums = [0,1]
 * Output: [[0,1],[1,0]]
 *
 * Example 3:
 * Input: nums = [1]
 * Output: [[1]]
 *
 * Constraints:
 * - 1 <= nums.length <= 6
 * - -10 <= nums[i] <= 10
 * - All the integers of `nums` are unique
 *
 * Notes:
 * - Build one permutation one position at a time.
 * - Choose an unused number, recurse, then undo the choice.
 * - When the current path has length `nums.length`, record a copy.
 */

import java.util.List;

public class PermutationsJava {
    static class Solution {
        public List<List<Integer>> permute(int[] nums) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
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
            // boolean[] used = new boolean[nums.length];
            // backtrack(nums, used, new ArrayList<>(), result);
            // return result;
            //
            // private void backtrack(
            //         int[] nums,
            //         boolean[] used,
            //         List<Integer> path,
            //         List<List<Integer>> result) {
            //     if (path.size() == nums.length) {
            //         result.add(new ArrayList<>(path));
            //         return;
            //     }
            //
            //     for (int i = 0; i < nums.length; i++) {
            //         if (used[i]) {
            //             continue;
            //         }
            //
            //         used[i] = true;
            //         path.add(nums[i]);
            //         backtrack(nums, used, path, result);
            //         path.remove(path.size() - 1);
            //         used[i] = false;
            //     }
            // }
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready for 46. Permutations.");
    }
}
