/*
 * Ported from: 10-dynamic-programming/analogue-questions/Python/tribonacci-number-similar1.py
 * --- Original description ---
LeetCode 509: Fibonacci Number
Difficulty: Easy
Pattern: Dynamic Programming

Problem:
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.

Given n, calculate F(n).

Example 1:
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

Example 2:
Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

Example 3:
Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

Constraints:
- 0 <= n <= 30

Time Complexity: O(n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class TribonacciNumberSimilar1 {



    static class Solution {
        public int fib(int n) {
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

            // if n <= 1:
            // return n
            // a, b = (0, 1)
            // for _ in range(2, n + 1):
            // a, b = (b, a + b)
            // return b

            throw new UnsupportedOperationException("Implement fib");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.fib(2) == 1);
        System.out.println("✓ Test case 1 passed");
        assert (sol.fib(3) == 2);
        System.out.println("✓ Test case 2 passed");
        assert (sol.fib(4) == 3);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
