/*
 * 33. Search in Rotated Sorted Array
 * Difficulty: Medium
 * Pattern: Binary Search
 *
 * Problem:
 * There is an integer array `nums` sorted in ascending order with distinct values.
 *
 * Before being passed to your function, `nums` is possibly rotated at an unknown pivot
 * index, so it might become something like `[4,5,6,7,0,1,2]`.
 *
 * Given the array `nums` after rotation and an integer `target`, return the index of
 * `target` if it is in `nums`, or `-1` if it is not.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 *
 * Example 2:
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 *
 * Example 3:
 * Input: nums = [1], target = 0
 * Output: -1
 *
 * Constraints:
 * - 1 <= nums.length <= 5000
 * - -10^4 <= nums[i], target <= 10^4
 * - All values of nums are unique
 * - nums is sorted and possibly rotated
 *
 * Notes:
 * - At any step, one half is guaranteed to be sorted.
 * - Use that sorted half to decide whether to keep left or right.
 */

public class SearchInRotatedSortedArrayJava {
    static class Solution {
        public int search(int[] nums, int target) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
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
            // while (left <= right) {
            //     int mid = left + (right - left) / 2;
            //     if (nums[mid] == target) {
            //         return mid;
            //     }
            //     if (nums[left] <= nums[mid]) {
            //         if (nums[left] <= target && target < nums[mid]) {
            //             right = mid - 1;
            //         } else {
            //             left = mid + 1;
            //         }
            //     } else {
            //         if (nums[mid] < target && target <= nums[right]) {
            //             left = mid + 1;
            //         } else {
            //             right = mid - 1;
            //         }
            //     }
            // }
            // return -1;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0) == 4;
        assert sol.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 3) == -1;
        assert sol.search(new int[] {1}, 0) == -1;
        System.out.println("All test cases passed!");
    }
}
