/*
 * Ported from: 10-dynamic-programming/analogue-questions/Python/climbing-stairs-similar2.py
 * --- Original description ---
Similar Problem 2: N-th Tribonacci Number
Difficulty: Easy
Pattern: Dynamic Programming

Problem:
The Tribonacci sequence Tn is defined as follows:
T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.

Example 1:
Input: n = 4
Output: 4
Explanation: T(4) = T(3) + T(2) + T(1) = 2 + 1 + 1 = 4

Example 2:
Input: n = 25
Output: 1389537

Constraints:
- 0 <= n <= 37
 */

import java.util.*;
import java.util.function.*;


public class ClimbingStairsSimilar2 {
    public int tribonacci(int n) {
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
    // return 0
    // if n <= 2:
    // return 1
    // prev3, prev2, prev1 = (0, 1, 1)
    // for i in range(3, n + 1):
    // current = prev1 + prev2 + prev3
    // prev3 = prev2
    // prev2 = prev1
    // prev1 = current
    // return prev1

        throw new UnsupportedOperationException("Implement tribonacci");
    }

    

    public static void main(String[] args) {
        ClimbingStairsSimilar2 sol = new ClimbingStairsSimilar2();
        assert (sol.tribonacci(4) == 4);
        System.out.println("✓ Test case 1 passed");
        assert (sol.tribonacci(25) == 1389537);
        System.out.println("✓ Test case 2 passed");
        assert (sol.tribonacci(0) == 0);
        System.out.println("✓ Test case 3 passed");
        assert (sol.tribonacci(1) == 1);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
