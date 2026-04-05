/*
 * Ported from: 12-bit-manipulation/analogue-questions/Python/power-of-two-similar1.py
 * --- Original description ---
LeetCode 326: Power of Three
Difficulty: Easy
Pattern: Math / Bit Manipulation

Problem:
Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3^x.

Example 1:
Input: n = 27
Output: true
Explanation: 27 = 3^3

Example 2:
Input: n = 0
Output: false
Explanation: There is no x where 3^x = 0.

Example 3:
Input: n = -1
Output: false
Explanation: There is no x where 3^x = (-1).

Constraints:
- -2^31 <= n <= 2^31 - 1

Follow up: Could you solve it without loops/recursion?

Time Complexity: O(log n) with loop, O(1) with math
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class PowerOfTwoSimilar1Java {



    static class Solution {
        public boolean isPowerOfThree(int n) {
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

            // if n <= 0:
            // return False
            // while n % 3 == 0:
            // n //= 3
            // return n == 1

            throw new UnsupportedOperationException("Implement isPowerOfThree");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.isPowerOfThree(27) == true);
        System.out.println("✓ Test case 1 passed");
        assert (sol.isPowerOfThree(0) == false);
        System.out.println("✓ Test case 2 passed");
        assert (sol.isPowerOfThree(-1) == false);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
