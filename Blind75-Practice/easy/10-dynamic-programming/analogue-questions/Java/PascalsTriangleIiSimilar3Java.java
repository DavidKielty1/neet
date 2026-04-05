/*
 * Ported from: 10-dynamic-programming/analogue-questions/Python/pascals-triangle-ii-similar3.py
 * --- Original description ---
LeetCode 896: Monotonic Array
Difficulty: Easy
Pattern: Arrays

Problem:
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums
is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

Example 1:
Input: nums = [1,2,2,3]
Output: true

Example 2:
Input: nums = [6,5,4,4]
Output: true

Example 3:
Input: nums = [1,3,2]
Output: false

Constraints:
- 1 <= nums.length <= 10^5
- -10^5 <= nums[i] <= 10^5

Time Complexity: O(n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class PascalsTriangleIiSimilar3Java {



    static class Solution {
        public boolean isMonotonic(List<Integer> nums) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // increasing = decreasing = True
            // for i in range(len(nums) - 1):
            // if nums[i] > nums[i + 1]:
            // increasing = False
            // if nums[i] < nums[i + 1]:
            // decreasing = False
            // return increasing or decreasing

            throw new UnsupportedOperationException("Implement isMonotonic");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.isMonotonic(java.util.List.of(1, 2, 2, 3)) == true);
        System.out.println("✓ Test case 1 passed");
        assert (sol.isMonotonic(java.util.List.of(6, 5, 4, 4)) == true);
        System.out.println("✓ Test case 2 passed");
        assert (sol.isMonotonic(java.util.List.of(1, 3, 2)) == false);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
