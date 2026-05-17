/*
 * Ported from: 05-binary-search/analogue-questions/Python/binary-search-similar2.py
 * --- Original description ---
Similar Problem 2: Search Insert Position
Difficulty: Easy
Pattern: Binary Search

Problem:
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4

Constraints:
- 1 <= nums.length <= 10^4
- -10^4 <= nums[i] <= 10^4
- nums contains distinct values sorted in ascending order
- -10^4 <= target <= 10^4
 */

import java.util.*;
import java.util.function.*;


public class BinarySearchSimilar2 {



    static class Solution {
        public int searchInsert(List<Integer> nums, int target) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // left, right = (0, len(nums) - 1)
            // while left <= right:
            // mid = left + (right - left) // 2
            // if nums[mid] == target:
            // return mid
            // elif nums[mid] < target:
            // left = mid + 1
            // else:
            // right = mid - 1
            // return left

            throw new UnsupportedOperationException("Implement searchInsert");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.searchInsert(java.util.List.of(1, 3, 5, 6), 5) == 2);
        System.out.println("✓ Test case 1 passed");
        assert (sol.searchInsert(java.util.List.of(1, 3, 5, 6), 2) == 1);
        System.out.println("✓ Test case 2 passed");
        assert (sol.searchInsert(java.util.List.of(1, 3, 5, 6), 7) == 4);
        System.out.println("✓ Test case 3 passed");
        assert (sol.searchInsert(java.util.List.of(1, 3, 5, 6), 0) == 0);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
