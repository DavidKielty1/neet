/*
 * Ported from: 05-binary-search/analogue-questions/Python/binary-search-similar3.py
 * --- Original description ---
Similar Problem 3: Sqrt(x)
Difficulty: Easy
Pattern: Binary Search

Problem:
Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

Example 1:
Input: x = 4
Output: 2

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round down, 2 is returned.

Example 3:
Input: x = 0
Output: 0

Constraints:
- 0 <= x <= 2^31 - 1
 */

import java.util.*;
import java.util.function.*;


public class BinarySearchSimilar3 {
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
    // left, right = (1, x)
    // result = 0
    // while left <= right:
    // mid = left + (right - left) // 2
    // if mid * mid == x:
    // return mid
    // elif mid * mid < x:
    // result = mid
    // left = mid + 1
    // else:
    // right = mid - 1
    // return result

        throw new UnsupportedOperationException("Implement mySqrt");
    }

    

    public static void main(String[] args) {
        BinarySearchSimilar3 sol = new BinarySearchSimilar3();
        assert (sol.mySqrt(4) == 2);
        System.out.println("✓ Test case 1 passed");
        assert (sol.mySqrt(8) == 2);
        System.out.println("✓ Test case 2 passed");
        assert (sol.mySqrt(0) == 0);
        System.out.println("✓ Test case 3 passed");
        assert (sol.mySqrt(1) == 1);
        System.out.println("✓ Test case 4 passed");
        assert (sol.mySqrt(16) == 4);
        System.out.println("✓ Test case 5 passed");
        System.out.println("\nAll test cases passed!");
    }
}
