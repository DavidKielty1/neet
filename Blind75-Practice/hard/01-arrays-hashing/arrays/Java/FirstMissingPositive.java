/*
 * 41. First Missing Positive
 * Difficulty: Hard
 * Pattern: Arrays
 *
 * Problem:
 * Given an unsorted integer array nums, return the smallest missing positive
 * integer.
 *
 * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary
 * space.
 *
 * Example 1:
 * Input: nums = [1,2,0]
 * Output: 3
 * Explanation: The numbers 1 and 2 are present, so the first missing positive is 3.
 *
 * Example 2:
 * Input: nums = [3,4,-1,1]
 * Output: 2
 * Explanation: 1 is present, but 2 is missing.
 *
 * Example 3:
 * Input: nums = [7,8,9,11,12]
 * Output: 1
 * Explanation: No positive integer starting at 1 is present.
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -2^31 <= nums[i] <= 2^31 - 1
 */
public class FirstMissingPositive {
    static class Solution {
        public int firstMissingPositive(int[] nums) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // for (int i = 0; i < nums.length; i++) {
            //     while (nums[i] >= 1 && nums[i] <= nums.length
            //             && nums[nums[i] - 1] != nums[i]) {
            //         int targetIndex = nums[i] - 1;
            //         int temp = nums[i];
            //         nums[i] = nums[targetIndex];
            //         nums[targetIndex] = temp;
            //     }
            // }
            //
            // for (int i = 0; i < nums.length; i++) {
            //     if (nums[i] != i + 1) {
            //         return i + 1;
            //     }
            // }
            //
            // return nums.length + 1;
            throw new UnsupportedOperationException("Implement firstMissingPositive");
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement firstMissingPositive and add checks.");
    }
}
