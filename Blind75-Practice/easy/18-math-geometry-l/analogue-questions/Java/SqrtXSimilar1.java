/*
 * Ported from: 14-math-geometry/analogue-questions/Python/sqrt-x-similar1.py
 * --- Original description ---
LeetCode 50: Pow(x, n) (simplified to Easy)
Difficulty: Medium (simplified to Easy)
Pattern: Math / Binary Search

Problem:
Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).

Example 1:
Input: x = 2.00000, n = 10
Output: 1024.00000

Example 2:
Input: x = 2.10000, n = 3
Output: 9.26100

Example 3:
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2^-2 = 1/2^2 = 1/4 = 0.25

Constraints:
- -100.0 < x < 100.0
- -2^31 <= n <= 2^31-1
- n is an integer
- -10^4 <= x^n <= 10^4

Time Complexity: O(log n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class SqrtXSimilar1 {
    public double myPow(double x, int n) {
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

    // def helper(x, n):
    // if n == 0:
    // return 1
    // half = helper(x, n // 2)
    // if n % 2 == 0:
    // return half * half
    // else:
    // return half * half * x
    // if n < 0:
    // return 1 / helper(x, -n)
    // return helper(x, n)

        throw new UnsupportedOperationException("Implement myPow");
    }

    

    public static void main(String[] args) {
        SqrtXSimilar1 sol = new SqrtXSimilar1();
        assert (Math.abs((sol.myPow(2.0, 10) - 1024.0)) < 0.0001);
        System.out.println("✓ Test case 1 passed");
        assert (Math.abs((sol.myPow(2.1, 3) - 9.261)) < 0.0001);
        System.out.println("✓ Test case 2 passed");
        assert (Math.abs((sol.myPow(2.0, -2) - 0.25)) < 0.0001);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
