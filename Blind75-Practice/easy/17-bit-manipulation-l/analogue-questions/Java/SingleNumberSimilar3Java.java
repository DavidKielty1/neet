/*
 * Ported from: 12-bit-manipulation/analogue-questions/Python/single-number-similar3.py
 * --- Original description ---
Similar Problem 3: Missing Number (Using XOR)
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3, numbers in range [0,3] are 0,1,2,3. Missing is 2.

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
- All numbers are unique
 */

import java.util.*;
import java.util.function.*;


public class SingleNumberSimilar3Java {



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
            // result = n
            // for i in range(n):
            // result ^= i ^ nums[i]
            // return result

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
