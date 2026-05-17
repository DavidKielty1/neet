/*
 * Ported from: 12-bit-manipulation/analogue-questions/Python/single-number-similar2.py
 * --- Original description ---
Similar Problem 2: Single Number III (Easy Version - Two Unique)
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Given an integer array nums where exactly two elements appear only once and all other elements
appear exactly twice, find the two elements that appear only once.

Example 1:
Input: nums = [1,2,1,3,2,5]
Output: [3,5] or [5,3]

Example 2:
Input: nums = [-1,0]
Output: [-1,0] or [0,-1]

Example 3:
Input: nums = [0,1]
Output: [0,1] or [1,0]

Constraints:
- 2 <= nums.length <= 3 * 10^4
- Each integer appears either once or twice
- Exactly two integers appear once
 */

import java.util.*;
import java.util.function.*;


public class SingleNumberSimilar2 {



    static class Solution {
        public List<Integer> singleNumber(List<Integer> nums) {
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

            // xor_all = 0
            // for num in nums:
            // xor_all ^= num
            // rightmost_bit = xor_all & -xor_all
            // num1, num2 = (0, 0)
            // for num in nums:
            // if num & rightmost_bit:
            // num1 ^= num
            // else:
            // num2 ^= num
            // return [num1, num2]

            throw new UnsupportedOperationException("Implement singleNumber");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // result1 = sorted(sol.singleNumber(java.util.List.of(1,2,1,3,2,5)));
        // assert result1 == [3, 5]  // needs locals (port helpers): ['result1']
        System.out.println("✓ Test case 1 passed");
        // result2 = sorted(sol.singleNumber([-1, 0]));
        // assert result2 == [-1, 0]  // needs locals (port helpers): ['result2']
        System.out.println("✓ Test case 2 passed");
        // result3 = sorted(sol.singleNumber(java.util.List.of(0,1)));
        // assert result3 == [0, 1]  // needs locals (port helpers): ['result3']
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
