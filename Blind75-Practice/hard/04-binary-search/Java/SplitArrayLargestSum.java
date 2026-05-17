/*
 * 410. Split Array Largest Sum
 * Difficulty: Hard
 * Pattern: Binary search on answer
 *
 * Problem:
 * Given an integer array nums and an integer k, split nums into k non-empty
 * subarrays such that the largest sum of any subarray is minimized.
 *
 * Return the minimized largest sum of the split.
 *
 * A subarray is a contiguous part of the array.
 *
 * Example 1:
 * Input: nums = [7,2,5,10,8], k = 2
 * Output: 18
 * Explanation: The best split is [7,2,5] and [10,8], where the largest sum is 18.
 *
 * Example 2:
 * Input: nums = [1,2,3,4,5], k = 2
 * Output: 9
 *
 * Constraints:
 * - 1 <= nums.length <= 1000
 * - 0 <= nums[i] <= 10^6
 * - 1 <= k <= min(50, nums.length)
 */
public class SplitArrayLargestSum {
    static class Solution {
        public int splitArray(int[] nums, int k) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
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
            // int right = 0;
            // for (int num : nums) {
            //     left = Math.max(left, num);
            //     right += num;
            // }
            //
            // while (left < right) {
            //     int mid = left + (right - left) / 2;
            //     if (canSplit(nums, k, mid)) {
            //         right = mid;
            //     } else {
            //         left = mid + 1;
            //     }
            // }
            //
            // return left;
            throw new UnsupportedOperationException("Implement splitArray");
        }

        @SuppressWarnings("unused")
        private boolean canSplit(int[] nums, int k, int maxAllowedSum) {
            // int groups = 1;
            // int currentSum = 0;
            // for (int num : nums) {
            //     if (currentSum + num > maxAllowedSum) {
            //         groups++;
            //         currentSum = 0;
            //     }
            //     currentSum += num;
            // }
            // return groups <= k;
            throw new UnsupportedOperationException("Implement canSplit");
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement splitArray and add checks.");
    }
}
