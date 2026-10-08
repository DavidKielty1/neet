/*
 * 704. Binary Search
 * Difficulty: Easy
 * Pattern: Binary Search
 *
 * Problem:
 * Given an array of integers nums which is sorted in ascending order, and an
 * integer target, write a function to search target in nums. If target exists,
 * return its index. Otherwise, return -1. You must write an algorithm with
 * O(log n) runtime complexity.
 *
 * Example 1:
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 *
 * Example 2:
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 *
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - -10^4 < nums[i], target < 10^4
 * - All the integers in nums are unique
 * - nums is sorted in ascending order
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
    }
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // int lo = 0;
        // int hi = nums.length - 1;
        // while (lo <= hi) {
        //     int mid = lo + (hi - lo) / 2;
        //     if (nums[mid] == target) {
        //         return mid;
        //     }
        //     if (nums[mid] < target) {
        //         lo = mid + 1;
        //     } else {
        //         hi = mid - 1;
        //     }
        // }
        // return -1;
    }
    public static void main(String[] args) {
        BinarySearch s = new BinarySearch();
        assert s.search(new int[] {-1, 0, 3, 5, 9, 12}, 9) == 4;
        assert s.search(new int[] {-1, 0, 3, 5, 9, 12}, 2) == -1;
        System.out.println("All test cases passed!");
    }

}
