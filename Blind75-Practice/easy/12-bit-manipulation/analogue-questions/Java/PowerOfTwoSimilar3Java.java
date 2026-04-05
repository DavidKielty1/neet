/*
 * Ported from: 12-bit-manipulation/analogue-questions/Python/power-of-two-similar3.py
 * --- Original description ---
LeetCode 191: Number of 1 Bits (Hamming Weight)
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Write a function that takes the binary representation of an unsigned integer and returns
the number of '1' bits it has (also known as the Hamming weight).

Example 1:
Input: n = 00000000000000000000000000001011
Output: 3
Explanation: The input binary string has a total of three '1' bits.

Example 2:
Input: n = 00000000000000000000000010000000
Output: 1

Example 3:
Input: n = 11111111111111111111111111111101
Output: 31

Constraints:
- The input must be a binary string of length 32

Follow up: If this function is called many times, how would you optimize it?

Time Complexity: O(1) or O(k) where k is number of set bits
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class PowerOfTwoSimilar3Java {



    static class Solution {
        public int hammingWeight(int n) {
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

            // count = 0
            // while n:
            // n &= n - 1
            // count += 1
            // return count

            throw new UnsupportedOperationException("Implement hammingWeight");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.hammingWeight(11) == 3);
        System.out.println("✓ Test case 1 passed");
        assert (sol.hammingWeight(128) == 1);
        System.out.println("✓ Test case 2 passed");
        assert (sol.hammingWeight((int) (4294967293L)) == 31);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
