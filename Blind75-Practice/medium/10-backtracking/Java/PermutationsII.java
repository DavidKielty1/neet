/*
 * 47. Permutations II
 * Difficulty: Medium
 * Pattern: Backtracking
 *
 * Problem:
 * Given a collection of numbers `nums` that might contain duplicates, return all possible
 * unique permutations in any order.
 *
 * Example 1:
 * Input: nums = [1,1,2]
 * Output: [[1,1,2],[1,2,1],[2,1,1]]
 *
 * Example 2:
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 *
 * Example 3:
 * Input: nums = [0,1,0,0,9]
 * Output: Unique permutations of the multiset
 *
 * Constraints:
 * - 1 <= nums.length <= 8
 * - -10 <= nums[i] <= 10
 *
 * Notes:
 * - Sort first so equal values are adjacent.
 * - Use a `used` array and skip a duplicate if the previous equal value has not been used
 *   in the current branch.
 * - That rule prevents generating the same ordering more than once.
 */

import java.util.List;

public class PermutationsII {
    static class Solution {
        public List<List<Integer>> permuteUnique(int[] nums) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
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
            //         if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
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
        System.out.println("Practice stub ready for 47. Permutations II.");
    }
}
