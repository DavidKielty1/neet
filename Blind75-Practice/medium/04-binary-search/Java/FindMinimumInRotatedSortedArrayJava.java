/*
 * 153. Find Minimum in Rotated Sorted Array
 * Difficulty: Medium
 * Pattern: Binary Search
 *
 * Problem:
 * Suppose an array of length `n` sorted in ascending order is rotated between 1 and `n`
 * times. For example, `[0,1,2,4,5,6,7]` might become `[4,5,6,7,0,1,2]`.
 *
 * Given the rotated sorted array `nums` of unique elements, return the minimum element.
 *
 * You must write an algorithm that runs in O(log n) time.
 *
 * Example 1:
 * Input: nums = [3,4,5,1,2]
 * Output: 1
 *
 * Example 2:
 * Input: nums = [4,5,6,7,0,1,2]
 * Output: 0
 *
 * Example 3:
 * Input: nums = [11,13,15,17]
 * Output: 11
 *
 * Constraints:
 * - n == nums.length
 * - 1 <= n <= 5000
 * - -5000 <= nums[i] <= 5000
 * - All integers of nums are unique
 * - nums is sorted and rotated between 1 and n times
 *
 * Notes:
 * - Compare `nums[mid]` with `nums[right]` to decide which half contains the minimum.
 */

public class FindMinimumInRotatedSortedArrayJava {
    static class Solution {
        public int findMin(int[] nums) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
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
            // int right = nums.length - 1;
            // while (left < right) {
            //     int mid = left + (right - left) / 2;
            //     if (nums[mid] > nums[right]) {
            //         left = mid + 1;
            //     } else {
            //         right = mid;
            //     }
            // }
            // return nums[left];
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.findMin(new int[] {3, 4, 5, 1, 2}) == 1;
        assert sol.findMin(new int[] {4, 5, 6, 7, 0, 1, 2}) == 0;
        assert sol.findMin(new int[] {11, 13, 15, 17}) == 11;
        System.out.println("All test cases passed!");
    }
}
