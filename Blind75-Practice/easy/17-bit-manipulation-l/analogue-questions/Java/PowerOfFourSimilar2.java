/*
 * Ported from: 12-bit-manipulation/analogue-questions/Python/power-of-four-similar2.py
 * --- Original description ---
LeetCode 461: Hamming Distance
Difficulty: Easy
Pattern: Bit Manipulation

Problem:
The Hamming distance between two integers is the number of positions at which the
corresponding bits are different.

Given two integers x and y, return the Hamming distance between them.

Example 1:
Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.

Example 2:
Input: x = 3, y = 1
Output: 1

Constraints:
- 0 <= x, y <= 2^31 - 1

Time Complexity: O(1)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class PowerOfFourSimilar2 {
    public int hammingDistance(int x, int y) {
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

    // xor = x ^ y
    // count = 0
    // while xor:
    // count += xor & 1
    // xor >>= 1
    // return count

        throw new UnsupportedOperationException("Implement hammingDistance");
    }

    

    public static void main(String[] args) {
        PowerOfFourSimilar2 sol = new PowerOfFourSimilar2();
        assert (sol.hammingDistance(1, 4) == 2);
        System.out.println("✓ Test case 1 passed");
        assert (sol.hammingDistance(3, 1) == 1);
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
