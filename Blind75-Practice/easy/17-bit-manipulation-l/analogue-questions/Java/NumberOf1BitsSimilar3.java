/*
 * Ported from: 12-bit-manipulation/analogue-questions/Python/number-of-1-bits-similar3.py
 * --- Original description ---
Similar Problem 3: Binary Number with Alternating Bits
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Given a positive integer, check whether it has alternating bits: namely,
if two adjacent bits will always have different values.

Example 1:
Input: n = 5
Output: true
Explanation: Binary of 5 is 101

Example 2:
Input: n = 7
Output: false
Explanation: Binary of 7 is 111

Example 3:
Input: n = 11
Output: false
Explanation: Binary of 11 is 1011

Example 4:
Input: n = 10
Output: true
Explanation: Binary of 10 is 1010

Constraints:
- 1 <= n <= 2^31 - 1
 */

import java.util.*;
import java.util.function.*;


public class NumberOf1BitsSimilar3 {



    static class Solution {
        public boolean hasAlternatingBits(int n) {
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

            // xor_result = n ^ n >> 1
            // return xor_result & xor_result + 1 == 0

            throw new UnsupportedOperationException("Implement hasAlternatingBits");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.hasAlternatingBits(5) == true);
        System.out.println("✓ Test case 1 passed");
        assert (sol.hasAlternatingBits(7) == false);
        System.out.println("✓ Test case 2 passed");
        assert (sol.hasAlternatingBits(11) == false);
        System.out.println("✓ Test case 3 passed");
        assert (sol.hasAlternatingBits(10) == true);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
