/*
 * Ported from: 12-bit-manipulation/analogue-questions/Python/missing-number-similar3.py
 * --- Original description ---
Similar Problem 3: Missing Ranges
Difficulty: Easy
Pattern: Array

Problem:
You are given an inclusive range [lower, upper] and a sorted unique integer array nums,
where all elements are in the inclusive range.

A number x is considered missing if x is in the range [lower, upper] and x is not in nums.

Return the smallest sorted list of ranges that cover every missing number exactly.

Example 1:
Input: nums = [0,1,3,50,75], lower = 0, upper = 99
Output: [[2,2],[4,49],[51,74],[76,99]]

Example 2:
Input: nums = [-1], lower = -1, upper = -1
Output: []

Example 3:
Input: nums = [], lower = 1, upper = 1
Output: [[1,1]]

Constraints:
- -10^9 <= lower <= upper <= 10^9
- 0 <= nums.length <= 100
- lower <= nums[i] <= upper
- All values are distinct
 */

import java.util.*;
import java.util.function.*;


public class MissingNumberSimilar3 {



    static class Solution {
        public List<List<Integer>> findMissingRanges(List<Integer> nums, int lower, int upper) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // result = []
            // def add_range(start, end):
            // if start <= end:
            // result.append([start, end])
            // if not nums:
            // add_range(lower, upper)
            // return result
            // if nums[0] > lower:
            // add_range(lower, nums[0] - 1)
            // for i in range(len(nums) - 1):
            // if nums[i + 1] - nums[i] > 1:
            // add_range(nums[i] + 1, nums[i + 1] - 1)
            // if nums[-1] < upper:
            // add_range(nums[-1] + 1, upper)
            // return result

            throw new UnsupportedOperationException("Implement findMissingRanges");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // result1 = sol.findMissingRanges(java.util.List.of(0,1,3,50,75), 0, 99);
        // assert result1 == [[2, 2], [4, 49], [51, 74], [76, 99]]  // needs locals (port helpers): ['result1']
        System.out.println("✓ Test case 1 passed");
        assert java.util.Objects.equals(sol.findMissingRanges(java.util.List.of(-1), -1, -1), java.util.List.of());
        System.out.println("✓ Test case 2 passed");
        assert java.util.Objects.equals(sol.findMissingRanges(java.util.List.of(), 1, 1), java.util.List.of(java.util.List.of(1, 1)));
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
