/*
 * Ported from: 14-math-geometry/analogue-questions/Python/palindrome-number-similar3.py
 * --- Original description ---
LeetCode 263: Ugly Number
Difficulty: Easy
Pattern: Math

Problem:
An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return true if n is an ugly number.

Example 1:
Input: n = 6
Output: true
Explanation: 6 = 2 × 3

Example 2:
Input: n = 1
Output: true
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.

Example 3:
Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.

Constraints:
- -2^31 <= n <= 2^31 - 1

Time Complexity: O(log n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class PalindromeNumberSimilar3Java {



    static class Solution {
        public boolean isUgly(int n) {
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
            // for factor in [2, 3, 5]:
            // while n % factor == 0:
            // n //= factor
            // return n == 1

            throw new UnsupportedOperationException("Implement isUgly");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.isUgly(6) == true);
        System.out.println("✓ Test case 1 passed");
        assert (sol.isUgly(1) == true);
        System.out.println("✓ Test case 2 passed");
        assert (sol.isUgly(14) == false);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
