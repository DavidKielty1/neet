/*
 * Ported from: 14-math-geometry/analogue-questions/Python/happy-number-similar3.py
 * --- Original description ---
Similar Problem 3: Perfect Number
Difficulty: Easy
Pattern: Math

Problem:
A perfect number is a positive integer that is equal to the sum of its positive divisors,
excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.

Given an integer n, return true if n is a perfect number, otherwise return false.

Example 1:
Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14 (divisors excluding 28)

Example 2:
Input: num = 7
Output: false

Example 3:
Input: num = 1
Output: false

Constraints:
- 1 <= num <= 10^8
 */

import java.util.*;
import java.util.function.*;


public class HappyNumberSimilar3Java {



    static class Solution {
        public boolean checkPerfectNumber(int num) {
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

            // if num <= 1:
            // return False
            // divisor_sum = 1
            // i = 2
            // while i * i <= num:
            // if num % i == 0:
            // divisor_sum += i
            // if i * i != num:
            // divisor_sum += num // i
            // i += 1
            // return divisor_sum == num

            throw new UnsupportedOperationException("Implement checkPerfectNumber");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.checkPerfectNumber(28) == true);
        System.out.println("✓ Test case 1 passed");
        assert (sol.checkPerfectNumber(7) == false);
        System.out.println("✓ Test case 2 passed");
        assert (sol.checkPerfectNumber(1) == false);
        System.out.println("✓ Test case 3 passed");
        assert (sol.checkPerfectNumber(6) == true);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
