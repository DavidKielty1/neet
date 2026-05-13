/*
 * 35. Search Insert Position
 * Difficulty: Easy
 * Pattern: Binary Search
 *
 * Problem
 * -------
 * Given a sorted array of distinct integers and a target value, return the index if
 * the target is found.
 *
 * If the target is not found, return the index where it would be inserted in order.
 *
 * You must write an algorithm with O(log n) runtime, which is the clue that binary
 * search is the intended approach.
 *
 * Example 1
 * ---------
 * Input: nums = [1, 3, 5, 6], target = 5
 * Output: 2
 * Explanation: `5` is already in the array at index `2`.
 *
 * Example 2
 * ---------
 * Input: nums = [1, 3, 5, 6], target = 2
 * Output: 1
 * Explanation: `2` is not present, but it belongs between `1` and `3`, so its insert
 * position is index `1`.
 *
 * Example 3
 * ---------
 * Input: nums = [1, 3, 5, 6], target = 7
 * Output: 4
 * Explanation: `7` is larger than every element, so it would be inserted at the end.
 *
 * Example 4
 * ---------
 * Input: nums = [1, 3, 5, 6], target = 0
 * Output: 0
 * Explanation: `0` is smaller than every element, so it would be inserted at the front.
 *
 * Constraints
 * -----------
 * - `1 <= nums.length <= 10^4`
 * - `-10^4 <= nums[i] <= 10^4`
 * - `nums` contains distinct values sorted in ascending order
 * - `-10^4 <= target <= 10^4`
 *
 * How to think about it
 * ---------------------
 * This is a "lower bound" binary search:
 *
 * - If `target` exists, return its index
 * - Otherwise, return the first index where `nums[index] >= target`
 *
 * During the search:
 *
 * - If `nums[mid] < target`, the answer must be to the right
 * - Otherwise, the answer is at `mid` or to the left
 *
 * When the loop finishes, `lo` ends up at the correct insert position.
 *
 * Time: O(log n), Space: O(1)
 */
public class SearchInsertPositionJava {
    public int searchInsert(int[] nums, int target) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

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
        SearchInsertPositionJava s = new SearchInsertPositionJava();
        assert s.searchInsert(new int[] {1, 3, 5, 6}, 5) == 2;
        assert s.searchInsert(new int[] {1, 3, 5, 6}, 2) == 1;
        System.out.println("All test cases passed!");
    }

}
