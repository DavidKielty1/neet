/*
 * Ported from: 12-bit-manipulation/analogue-questions/Python/counting-bits-similar3.py
 * --- Original description ---
Similar Problem 3: Prime Number of Set Bits in Binary Representation
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Given two integers left and right, return the count of numbers in the inclusive range [left, right]
having a prime number of set bits in their binary representation.

Example 1:
Input: left = 6, right = 10
Output: 4
Explanation:
6 -> 110 (2 set bits, prime)
7 -> 111 (3 set bits, prime)
8 -> 1000 (1 set bit, not prime)
9 -> 1001 (2 set bits, prime)
10 -> 1010 (2 set bits, prime)

Example 2:
Input: left = 10, right = 15
Output: 5
Explanation: All numbers from 10-15 have prime number of set bits

Constraints:
- 1 <= left <= right <= 10^6
- 0 <= right - left <= 10^4
 */

import java.util.*;
import java.util.function.*;


public class CountingBitsSimilar3Java {



    static class Solution {
        public int countPrimeSetBits(int left, int right) {
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

            // primes = {2, 3, 5, 7, 11, 13, 17, 19}
            // def count_bits(n):
            // count = 0
            // while n:
            // count += n & 1
            // n >>= 1
            // return count
            // result = 0
            // for num in range(left, right + 1):
            // if count_bits(num) in primes:
            // result += 1
            // return result

            throw new UnsupportedOperationException("Implement countPrimeSetBits");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.countPrimeSetBits(6, 10) == 4);
        System.out.println("✓ Test case 1 passed");
        assert (sol.countPrimeSetBits(10, 15) == 5);
        System.out.println("✓ Test case 2 passed");
        assert (sol.countPrimeSetBits(1, 1) == 0);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
