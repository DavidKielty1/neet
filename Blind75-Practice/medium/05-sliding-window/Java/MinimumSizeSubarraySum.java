/*
 * 209. Minimum Size Subarray Sum
 * Difficulty: Medium
 * Pattern: Sliding Window
 *
 * Problem:
 * Given an array of positive integers `nums` and a positive integer `target`, return the
 * minimal length of a subarray whose sum is greater than or equal to `target`.
 *
 * If there is no such subarray, return 0 instead.
 *
 * Example 1:
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 *
 * Example 2:
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 *
 * Example 3:
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 *
 * Constraints:
 * - 1 <= target <= 10^9
 * - 1 <= nums.length <= 10^5
 * - 1 <= nums[i] <= 10^4
 *
 */

public class MinimumSizeSubarraySum {
    static class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // int left = 0;
            // int sum = 0;
            // int best = Integer.MAX_VALUE;
            // for (int right = 0; right < nums.length; right++) {
            //     sum += nums[right];
            //     while (sum >= target) {
            //         best = Math.min(best, right - left + 1);
            //         sum -= nums[left++];
            //     }
            // }
            // return best == Integer.MAX_VALUE ? 0 : best;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.minSubArrayLen(7, new int[] {2, 3, 1, 2, 4, 3}) == 2;
        assert sol.minSubArrayLen(4, new int[] {1, 4, 4}) == 1;
        assert sol.minSubArrayLen(11, new int[] {1, 1, 1, 1, 1, 1, 1, 1}) == 0;
        System.out.println("All test cases passed!");
    }
}
