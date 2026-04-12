/*
 * Ported from: 12-bit-manipulation/analogue-questions/Python/number-of-1-bits-similar1.py
 * --- Original description ---
Similar Problem 1: Power of Two
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2^x.

Example 1:
Input: n = 1
Output: true
Explanation: 2^0 = 1

Example 2:
Input: n = 16
Output: true
Explanation: 2^4 = 16

Example 3:
Input: n = 3
Output: false

Constraints:
- -2^31 <= n <= 2^31 - 1
 */

import java.util.*;
import java.util.function.*;


public class NumberOf1BitsSimilar1Java {



    static class Solution {
        public boolean isPowerOfTwo(int n) {
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
            // return n & n - 1 == 0

            throw new UnsupportedOperationException("Implement isPowerOfTwo");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.isPowerOfTwo(1) == true);
        System.out.println("✓ Test case 1 passed");
        assert (sol.isPowerOfTwo(16) == true);
        System.out.println("✓ Test case 2 passed");
        assert (sol.isPowerOfTwo(3) == false);
        System.out.println("✓ Test case 3 passed");
        assert (sol.isPowerOfTwo(0) == false);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
