/*
 * 35. Search Insert Position
 * Difficulty: Easy
 * Pattern: Binary Search
 *
 * Problem:
 * Given a sorted array of distinct integers and a target value, return the
 * index if the target is found. If not, return the index where it would be if
 * it were inserted in order. You must write an algorithm with O(log n) runtime
 * complexity.
 *
 * Example 1:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 *
 * Example 2:
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 *
 * Example 3:
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 *
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - -10^4 <= nums[i] <= 10^4
 * - nums contains distinct values sorted in ascending order
 * - -10^4 <= target <= 10^4
 */

// [1 2 4 5 6 7 8 9 10] target = 5 output = 4
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        
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

        // Lower bound binary search.

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
        // return lo;
    }
    public static void main(String[] args) {
        SearchInsertPosition s = new SearchInsertPosition();
        assert s.searchInsert(new int[] {1, 3, 5, 6}, 5) == 2;
        assert s.searchInsert(new int[] {1, 3, 5, 6}, 2) == 1;
        System.out.println("All test cases passed!");
    }

}
