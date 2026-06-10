/*
 * k-Sum (generalized; LeetCode 18. 4Sum is k = 4)
 * Difficulty: Medium
 * Pattern: Two Pointers / Sorting
 *
 * Problem:
 * Given an array `nums`, integers `target` and `k`, return all unique k-tuples
 * (distinct indices) whose values sum to `target`.
 *
 * LeetCode 4Sum example (k = 4):
 * Input: nums = [1,0,-1,0,-2,2], target = 0
 * Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 *
 * Constraints:
 * - 1 <= nums.length <= 200
 * - 2 <= k <= nums.length
 * - -10^9 <= nums[i] <= 10^9
 * - -10^9 <= target <= 10^9
 *
 * Notes:
 * - Sort first, then recursive k-Sum; base case is two-pointer 2Sum.
 * - Use `long` for the running sum to avoid integer overflow.
 */

import java.util.List;

class KSumJava {
    static class Solution {
        public List<List<Integer>> kSum(int[] nums, int target, int k) {

            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

        //     Arrays.sort(nums);
        //     List<List<Integer>> result = new ArrayList<>();
        //     kSum(nums, k, (long) target, 0, new ArrayList<>(), result);
        //     return result;
        // }

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
        Solution sol = new Solution();
        List<List<Integer>> result = sol.kSum(new int[] {1, 0, -1, 0, -2, 2}, 0, 4);
        assert result.size() == 3;
        assert sol.kSum(new int[] {2, 2, 2, 2, 2}, 8, 4).size() == 1;
        System.out.println("All test cases passed!");
    }
}
