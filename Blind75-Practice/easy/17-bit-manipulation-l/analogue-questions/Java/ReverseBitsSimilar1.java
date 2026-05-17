/*
 * Ported from: 12-bit-manipulation/analogue-questions/Python/reverse-bits-similar1.py
 * --- Original description ---
Similar Problem 1: Reverse Integer
Difficulty: Easy
Pattern: Bit Manipulation / Math

Problem:
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21

Constraints:
- -2^31 <= x <= 2^31 - 1
 */

import java.util.*;
import java.util.function.*;


public class ReverseBitsSimilar1 {



    static class Solution {
        public int reverse(int x) {
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

            // INT_MIN, INT_MAX = (-2 ** 31, 2 ** 31 - 1)
            // sign = -1 if x < 0 else 1
            // x = abs(x)
            // result = 0
            // while x:
            // digit = x % 10
            // x //= 10
            // if result > INT_MAX // 10:
            // return 0
            // result = result * 10 + digit
            // result *= sign
            // if result < INT_MIN or result > INT_MAX:
            // return 0
            // return result

            throw new UnsupportedOperationException("Implement reverse");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.reverse(123) == 321);
        System.out.println("✓ Test case 1 passed");
        assert (sol.reverse(-123) == -321);
        System.out.println("✓ Test case 2 passed");
        assert (sol.reverse(120) == 21);
        System.out.println("✓ Test case 3 passed");
        assert (sol.reverse(0) == 0);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
