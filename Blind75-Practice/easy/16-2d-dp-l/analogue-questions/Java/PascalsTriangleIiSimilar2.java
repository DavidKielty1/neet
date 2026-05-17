/*
 * Ported from: 10-dynamic-programming/analogue-questions/Python/pascals-triangle-ii-similar2.py
 * --- Original description ---
LeetCode 228: Summary Ranges
Difficulty: Easy
Pattern: Arrays

Problem:
You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
That is, each element of nums is covered by exactly one of the ranges, and there is no
integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:
- "a->b" if a != b
- "a" if a == b

Example 1:
Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"

Example 2:
Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]

Constraints:
- 0 <= nums.length <= 20
- -2^31 <= nums[i] <= 2^31 - 1
- All the values of nums are unique
- nums is sorted in ascending order

Time Complexity: O(n)
Space Complexity: O(n)
 */

import java.util.*;
import java.util.function.*;


public class PascalsTriangleIiSimilar2 {



    static class Solution {
        public List<String> summaryRanges(List<Integer> nums) {
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
            // return []
            // result = []
            // start = 0
            // for i in range(len(nums)):
            // if i == len(nums) - 1 or nums[i] + 1 != nums[i + 1]:
            // if start == i:
            // result.append(str(nums[start]))
            // else:
            // result.append(f'{nums[start]}->{nums[i]}')
            // start = i + 1
            // return result

            throw new UnsupportedOperationException("Implement summaryRanges");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert java.util.Objects.equals(sol.summaryRanges(java.util.List.of(0, 1, 2, 4, 5, 7)), java.util.List.of("0->2", "4->5", "7"));
        System.out.println("✓ Test case 1 passed");
        assert java.util.Objects.equals(sol.summaryRanges(java.util.List.of(0, 2, 3, 4, 6, 8, 9)), java.util.List.of("0", "2->4", "6", "8->9"));
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
