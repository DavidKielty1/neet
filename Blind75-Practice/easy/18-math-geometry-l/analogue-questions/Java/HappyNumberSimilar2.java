/*
 * Ported from: 14-math-geometry/analogue-questions/Python/happy-number-similar2.py
 * --- Original description ---
Similar Problem 2: Add Digits
Difficulty: Easy
Pattern: Math

Problem:
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:
Input: num = 38
Output: 2
Explanation: 38 -> 3 + 8 = 11 -> 1 + 1 = 2

Example 2:
Input: num = 0
Output: 0

Example 3:
Input: num = 9
Output: 9

Constraints:
- 0 <= num <= 2^31 - 1

Follow up: Could you do it without any loop/recursion in O(1) runtime?
 */

import java.util.*;
import java.util.function.*;


public class HappyNumberSimilar2 {
    public int addDigits(int num) {
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

    // while num >= 10:
    // digit_sum = 0
    // while num > 0:
    // digit_sum += num % 10
    // num //= 10
    // num = digit_sum
    // return num

        throw new UnsupportedOperationException("Implement addDigits");
    }

    

    public static void main(String[] args) {
        HappyNumberSimilar2 sol = new HappyNumberSimilar2();
        assert (sol.addDigits(38) == 2);
        System.out.println("✓ Test case 1 passed");
        assert (sol.addDigits(0) == 0);
        System.out.println("✓ Test case 2 passed");
        assert (sol.addDigits(9) == 9);
        System.out.println("✓ Test case 3 passed");
        assert (sol.addDigits(100) == 1);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
