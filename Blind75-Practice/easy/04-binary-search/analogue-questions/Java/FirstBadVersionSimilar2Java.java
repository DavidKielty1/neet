/*
 * Ported from: 05-binary-search/analogue-questions/Python/first-bad-version-similar2.py
 * --- Original description ---
LeetCode 69: Sqrt(x)
Difficulty: Easy
Pattern: Binary Search

Problem:
Given a non-negative integer x, return the square root of x rounded down to the nearest
integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the
nearest integer, 2 is returned.

Constraints:
- 0 <= x <= 2^31 - 1

Time Complexity: O(log x)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class FirstBadVersionSimilar2Java {



    static class Solution {
        public int mySqrt(int x) {
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

            // if x < 2:
            // return x
            // left, right = (1, x // 2)
            // while left <= right:
            // mid = left + (right - left) // 2
            // square = mid * mid
            // if square == x:
            // return mid
            // elif square < x:
            // left = mid + 1
            // else:
            // right = mid - 1
            // return right

            throw new UnsupportedOperationException("Implement mySqrt");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.mySqrt(4) == 2);
        System.out.println("✓ Test case 1 passed");
        assert (sol.mySqrt(8) == 2);
        System.out.println("✓ Test case 2 passed");
        assert (sol.mySqrt(0) == 0);
        System.out.println("✓ Test case 3 passed");
        assert (sol.mySqrt(1) == 1);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
