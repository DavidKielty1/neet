/*
 * Ported from: 11-greedy/analogue-questions/Python/maximum-subarray-similar3.py
 * --- Original description ---
Similar Problem 3: Maximum Sum Circular Subarray (Easy Version)
Difficulty: Easy
Pattern: Greedy / Kadane's Algorithm

Problem:
Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray.

A circular array means the end connects to the beginning.

Example 1:
Input: nums = [1,-2,3,-2]
Output: 3
Explanation: Subarray [3] has maximum sum 3

Example 2:
Input: nums = [5,-3,5]
Output: 10
Explanation: Subarray [5,5] (circular) has maximum sum 10

Example 3:
Input: nums = [-3,-2,-3]
Output: -2
Explanation: Subarray [-2] has maximum sum -2

Constraints:
- n == nums.length
- 1 <= n <= 3 * 10^4
- -3 * 10^4 <= nums[i] <= 3 * 10^4
 */

import java.util.*;
import java.util.function.*;


public class MaximumSubarraySimilar3 {



    static class Solution {
        public int maxSubarraySumCircular(List<Integer> nums) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // def kadane_max(arr):
            // max_sum = arr[0]
            // current_max = arr[0]
            // for num in arr[1:]:
            // current_max = max(num, current_max + num)
            // max_sum = max(max_sum, current_max)
            // return max_sum
            // def kadane_min(arr):
            // min_sum = arr[0]
            // current_min = arr[0]
            // for num in arr[1:]:
            // current_min = min(num, current_min + num)
            // min_sum = min(min_sum, current_min)
            // return min_sum
            // max_kadane = kadane_max(nums)
            // min_kadane = kadane_min(nums)
            // total_sum = sum(nums)
            // if total_sum == min_kadane:
            // return max_kadane
            // max_circular = total_sum - min_kadane
            // return max(max_kadane, max_circular)

            throw new UnsupportedOperationException("Implement maxSubarraySumCircular");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.maxSubarraySumCircular(java.util.List.of(1, -2, 3, -2)) == 3);
        System.out.println("✓ Test case 1 passed");
        assert (sol.maxSubarraySumCircular(java.util.List.of(5, -3, 5)) == 10);
        System.out.println("✓ Test case 2 passed");
        assert (sol.maxSubarraySumCircular(java.util.List.of(-3, -2, -3)) == -2);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
