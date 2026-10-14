/*
 * 18. 4Sum
 * Difficulty: Medium
 * Pattern: Two Pointers / Sorting
 *
 * Problem:
 * Given an integer array `nums` and an integer `target`, return all unique
 * quadruplets `[nums[a], nums[b], nums[c], nums[d]]` such that
 * `a`, `b`, `c`, and `d` are distinct indices and
 * `nums[a] + nums[b] + nums[c] + nums[d] == target`.
 *
 * The solution set must not contain duplicate quadruplets. The order of the
 * quadruplets and the order of the values inside each one do not matter.
 *
 * Example 1:
 * Input: nums = [1,0,-1,0,-2,2], target = 0
 * Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 *
 * Example 2:
 * Input: nums = [2,2,2,2,2], target = 8
 * Output: [[2,2,2,2]]
 *
 * Constraints:
 * - 1 <= nums.length <= 200
 * - -10^9 <= nums[i] <= 10^9
 * - -10^9 <= target <= 10^9
 *
 * How to think about it
 * Sort, then search with one recursive loop starting at k = 4. Each call fixes
 * one value and recurses with k - 1 on the suffix to its right. That inner call
 * returns before the outer index advances, so B finishes before A moves. When k
 * is 2, two pointers find the remaining pair. Skip a value when it repeats the
 * previous choice at the same depth. Keep the running target in a `long` so
 * sums near ±10^9 do not overflow an `int`.
 *
 * Time: O(n^3), Space: O(1) extra, not counting the output list
 */

import java.util.List;

class FourSumJava {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
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
        // kSum(nums, 4, (long) target, 0, new ArrayList<>(), result);
        // return result;
        //
        // private void kSum(int[] nums, int k, long target, int start,
        //         List<Integer> path, List<List<Integer>> result) {
        //     if (k == 2) {
        //         twoSum(nums, target, start, path, result);
        //         return;
        //     }
        //     for (int i = start; i <= nums.length - k; i++) {
        //         if (i > start && nums[i] == nums[i - 1]) {
        //             continue;
        //         }
        //         path.add(nums[i]);
        //         kSum(nums, k - 1, target - nums[i], i + 1, path, result);
        //         path.remove(path.size() - 1);
        //     }
        // }
        //
        // private void twoSum(int[] nums, long target, int start,
        //         List<Integer> path, List<List<Integer>> result) {
        //     int left = start;
        //     int right = nums.length - 1;
        //     while (left < right) {
        //         long sum = (long) nums[left] + nums[right];
        //         if (sum == target) {
        //             List<Integer> entry = new ArrayList<>(path);
        //             entry.add(nums[left]);
        //             entry.add(nums[right]);
        //             result.add(entry);
        //             left++;
        //             right--;
        //             while (left < right && nums[left] == nums[left - 1]) {
        //                 left++;
        //             }
        //             while (left < right && nums[right] == nums[right + 1]) {
        //                 right--;
        //             }
        //         } else if (sum < target) {
        //             left++;
        //         } else {
        //             right--;
        //         }
        //     }
        // }
    }

    public static void main(String[] args) {
        FourSumJava sol = new FourSumJava();
        List<List<Integer>> result = sol.fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0);
        assert result.size() == 3;
        assert sol.fourSum(new int[] {2, 2, 2, 2, 2}, 8).size() == 1;
        System.out.println("All test cases passed!");
    }
}
