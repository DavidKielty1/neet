/*
 * Ported from: 12-bit-manipulation/analogue-questions/Python/number-of-1-bits-similar2.py
 * --- Original description ---
Similar Problem 2: Power of Four
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four, if there exists an integer x such that n == 4^x.

Example 1:
Input: n = 16
Output: true
Explanation: 4^2 = 16

Example 2:
Input: n = 5
Output: false

Example 3:
Input: n = 1
Output: true
Explanation: 4^0 = 1

Constraints:
- -2^31 <= n <= 2^31 - 1
 */

import java.util.*;
import java.util.function.*;


public class NumberOf1BitsSimilar2 {



    static class Solution {
        public boolean isPowerOfFour(int n) {
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
            // if n & n - 1 != 0:
            // return False
            // return n & 1431655765 != 0

            throw new UnsupportedOperationException("Implement isPowerOfFour");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.isPowerOfFour(16) == true);
        System.out.println("✓ Test case 1 passed");
        assert (sol.isPowerOfFour(5) == false);
        System.out.println("✓ Test case 2 passed");
        assert (sol.isPowerOfFour(1) == true);
        System.out.println("✓ Test case 3 passed");
        assert (sol.isPowerOfFour(2) == false);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
