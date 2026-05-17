/*
 * Ported from: 14-math-geometry/analogue-questions/Python/power-of-three-similar1.py
 * --- Original description ---
LeetCode 400: Nth Digit
Difficulty: Medium (simplified to Easy)
Pattern: Math

Problem:
Given an integer n, return the nth digit of the infinite integer sequence [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...].

Example 1:
Input: n = 3
Output: 3

Example 2:
Input: n = 11
Output: 0
Explanation: The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0,
which is part of the number 10.

Constraints:
- 1 <= n <= 2^31 - 1

Time Complexity: O(log n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class PowerOfThreeSimilar1 {



    static class Solution {
        public int findNthDigit(int n) {
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

            // length = 1
            // count = 9
            // start = 1
            // while n > length * count:
            // n -= length * count
            // length += 1
            // count *= 10
            // start *= 10
            // num = start + (n - 1) // length
            // digit_index = (n - 1) % length
            // return int(str(num)[digit_index])

            throw new UnsupportedOperationException("Implement findNthDigit");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.findNthDigit(3) == 3);
        System.out.println("✓ Test case 1 passed");
        assert (sol.findNthDigit(11) == 0);
        System.out.println("✓ Test case 2 passed");
        assert (sol.findNthDigit(1) == 1);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
