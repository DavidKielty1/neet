/*
 * Ported from: 09-heap/analogue-questions/Python/relative-ranks-similar1.py
 * --- Original description ---
LeetCode 1636: Sort Array by Increasing Frequency
Difficulty: Easy
Pattern: Heap / Sorting

Problem:
Given an array of integers nums, sort the array in increasing order based on the frequency
of the values. If multiple values have the same frequency, sort them in decreasing order.

Return the sorted array.

Example 1:
Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.

Example 2:
Input: nums = [2,3,1,3,2]
Output: [1,3,3,2,2]
Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.

Example 3:
Input: nums = [-1,1,-6,4,5,-6,1,4,1]
Output: [5,-1,4,4,-6,-6,1,1,1]

Constraints:
- 1 <= nums.length <= 100
- -100 <= nums[i] <= 100

Time Complexity: O(n log n)
Space Complexity: O(n)
 */

import java.util.*;
import java.util.function.*;


public class RelativeRanksSimilar1 {



    static class Solution {
        public List<Integer> frequencySort(List<Integer> nums) {
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

            // count = Counter(nums)
            // return sorted(nums, key=lambda x: (count[x], -x))

            throw new UnsupportedOperationException("Implement frequencySort");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert java.util.Objects.equals(sol.frequencySort(java.util.List.of(1, 1, 2, 2, 2, 3)), java.util.List.of(3, 1, 1, 2, 2, 2));
        System.out.println("✓ Test case 1 passed");
        assert java.util.Objects.equals(sol.frequencySort(java.util.List.of(2, 3, 1, 3, 2)), java.util.List.of(1, 3, 3, 2, 2));
        System.out.println("✓ Test case 2 passed");
        assert java.util.Objects.equals(sol.frequencySort(java.util.List.of(-1, 1, -6, 4, 5, -6, 1, 4, 1)), java.util.List.of(5, -1, 4, 4, -6, -6, 1, 1, 1));
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
