/*
 * Ported from: 12-bit-manipulation/analogue-questions/Python/reverse-bits-similar3.py
 * --- Original description ---
Similar Problem 3: Number of Steps to Reduce to Zero
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
Given an integer num, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by 2,
otherwise, you have to subtract 1 from it.

Example 1:
Input: num = 14
Output: 6

Example 2:
Input: num = 8
Output: 4

Example 3:
Input: num = 123
Output: 12

Constraints:
- 0 <= num <= 10^6
 */

import java.util.*;
import java.util.function.*;


public class ReverseBitsSimilar3 {
    public int numberOfSteps(int num) {
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

    // if num == 0:
    // return 0
    // steps = 0
    // while num > 0:
    // if num & 1:
    // num -= 1
    // else:
    // num >>= 1
    // steps += 1
    // return steps

        throw new UnsupportedOperationException("Implement numberOfSteps");
    }

    

    public static void main(String[] args) {
        ReverseBitsSimilar3 sol = new ReverseBitsSimilar3();
        assert (sol.numberOfSteps(14) == 6);
        System.out.println("✓ Test case 1 passed");
        assert (sol.numberOfSteps(8) == 4);
        System.out.println("✓ Test case 2 passed");
        assert (sol.numberOfSteps(123) == 12);
        System.out.println("✓ Test case 3 passed");
        assert (sol.numberOfSteps(0) == 0);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
