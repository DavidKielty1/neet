/*
 * Ported from: 14-math-geometry/analogue-questions/Python/palindrome-number-similar2.py
 * --- Original description ---
LeetCode 268: Missing Number
Difficulty: Easy
Pattern: Math / Bit Manipulation

Problem:
Given an array nums containing n distinct numbers in the range [0, n], return the only
number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2
is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2

Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8

Constraints:
- n == nums.length
- 1 <= n <= 10^4
- 0 <= nums[i] <= n
- All the numbers of nums are unique

Follow up: Could you implement a solution using only O(1) extra space complexity and O(n)
runtime complexity?

Time Complexity: O(n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class PalindromeNumberSimilar2Java {



    static class Solution {
        public int missingNumber(List<Integer> nums) {
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

            // n = len(nums)
            // expected_sum = n * (n + 1) // 2
            // actual_sum = sum(nums)
            // return expected_sum - actual_sum

            throw new UnsupportedOperationException("Implement missingNumber");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.missingNumber(java.util.List.of(3, 0, 1)) == 2);
        System.out.println("✓ Test case 1 passed");
        assert (sol.missingNumber(java.util.List.of(0, 1)) == 2);
        System.out.println("✓ Test case 2 passed");
        assert (sol.missingNumber(java.util.List.of(9, 6, 4, 2, 3, 5, 7, 0, 1)) == 8);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
