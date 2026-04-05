/*
 * Ported from: 14-math-geometry/analogue-questions/Python/power-of-three-similar3.py
 * --- Original description ---
LeetCode 507: Perfect Number
Difficulty: Easy
Pattern: Math

Problem:
A perfect number is a positive integer that is equal to the sum of its positive divisors,
excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.

Given an integer n, return true if n is a perfect number, otherwise return false.

Example 1:
Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14
1, 2, 4, 7, and 14 are all divisors of 28.

Example 2:
Input: num = 7
Output: false

Constraints:
- 1 <= num <= 10^8

Time Complexity: O(sqrt(n))
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class PowerOfThreeSimilar3Java {



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
            // if i != num // i:
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
        System.out.println("\nAll test cases passed!");
    }
}
