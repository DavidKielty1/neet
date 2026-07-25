/*
 * 81. Search in Rotated Sorted Array II
 * Difficulty: Medium
 * Pattern: Binary Search
 *
 * Problem:
 * There is an integer array `nums` sorted in non-decreasing order, possibly with
 * duplicates, and then rotated at some pivot.
 *
 * Given the rotated array `nums` and an integer `target`, return `true` if target is in
 * `nums`, or `false` otherwise.
 *
 * Example 1:
 * Input: nums = [2,5,6,0,0,1,2], target = 0
 * Output: true
 *
 * Example 2:
 * Input: nums = [2,5,6,0,0,1,2], target = 3
 * Output: false
 *
 * Constraints:
 * - 1 <= nums.length <= 5000
 * - -10^4 <= nums[i], target <= 10^4
 * - nums is sorted and rotated
 *
 * Notes:
 * - Duplicates can hide which side is sorted.
 * - When `nums[left] == nums[mid] == nums[right]`, shrink both sides.
 */

public class SearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return true;
            }

            if(nums[left] == nums[mid] &&  nums[right] == mid) {
                left++;
                right--;
            }

            if(nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    right = mid + 1;
                } else {
                    left = mid - 1;
                }
            }
        }

        return false;
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
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
    //         return true;
    //     }
    //     if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
    //         left++;
    //         right--;
    //     } else if (nums[left] <= nums[mid]) {
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
    // return false;
    }
    

    public static void main(String[] args) {
        SearchInRotatedSortedArrayII sol = new SearchInRotatedSortedArrayII();
        assert sol.search(new int[] {2, 5, 6, 0, 0, 1, 2}, 0);
        assert !sol.search(new int[] {2, 5, 6, 0, 0, 1, 2}, 3);
        System.out.println("All test cases passed!");
    }
}
