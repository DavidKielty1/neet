/*
 * Ported from: 11-greedy/analogue-questions/Python/maximum-subarray-similar2.py
 * --- Original description ---
Similar Problem 2: Maximum Product Subarray (Easy Version)
Difficulty: Easy
Pattern: Greedy / Dynamic Programming

Problem:
Given an integer array nums, find a contiguous non-empty subarray within the array
that has the largest product, and return the product.

Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6

Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray

Example 3:
Input: nums = [-2,3,-4]
Output: 24
Explanation: [-2,3,-4] has the largest product 24

Constraints:
- 1 <= nums.length <= 2 * 10^4
- -10 <= nums[i] <= 10
 */

import java.util.*;
import java.util.function.*;


public class MaximumSubarraySimilar2Java {



    static class Solution {
        public int maxProduct(List<Integer> nums) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // if not nums:
            // return 0
            // max_product = nums[0]
            // max_ending = nums[0]
            // min_ending = nums[0]
            // for i in range(1, len(nums)):
            // num = nums[i]
            // if num < 0:
            // max_ending, min_ending = (min_ending, max_ending)
            // max_ending = max(num, max_ending * num)
            // min_ending = min(num, min_ending * num)
            // max_product = max(max_product, max_ending)
            // return max_product

            throw new UnsupportedOperationException("Implement maxProduct");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.maxProduct(java.util.List.of(2, 3, -2, 4)) == 6);
        System.out.println("✓ Test case 1 passed");
        assert (sol.maxProduct(java.util.List.of(-2, 0, -1)) == 0);
        System.out.println("✓ Test case 2 passed");
        assert (sol.maxProduct(java.util.List.of(-2, 3, -4)) == 24);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
