/*
 * Ported from: 12-bit-manipulation/analogue-questions/Python/reverse-bits-similar2.py
 * --- Original description ---
Similar Problem 2: Complement of Base 10 Integer
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
The complement of an integer is the integer you get when you flip all the 0's to 1's
and all the 1's to 0's in its binary representation.

For example, the integer 5 is "101" in binary and its complement is "010" which is the integer 2.

Given an integer n, return its complement.

Example 1:
Input: n = 5
Output: 2
Explanation: 5 is "101" in binary, complement is "010" which is 2

Example 2:
Input: n = 7
Output: 0
Explanation: 7 is "111" in binary, complement is "000" which is 0

Example 3:
Input: n = 10
Output: 5
Explanation: 10 is "1010" in binary, complement is "0101" which is 5

Constraints:
- 0 <= n < 10^9
 */

import java.util.*;
import java.util.function.*;


public class ReverseBitsSimilar2Java {



    static class Solution {
        public int bitwiseComplement(int n) {
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

            // if n == 0:
            // return 1
            // bits = n.bit_length()
            // mask = (1 << bits) - 1
            // return n ^ mask

            throw new UnsupportedOperationException("Implement bitwiseComplement");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.bitwiseComplement(5) == 2);
        System.out.println("✓ Test case 1 passed");
        assert (sol.bitwiseComplement(7) == 0);
        System.out.println("✓ Test case 2 passed");
        assert (sol.bitwiseComplement(10) == 5);
        System.out.println("✓ Test case 3 passed");
        assert (sol.bitwiseComplement(0) == 1);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
