/*
 * Ported from: 14-math-geometry/analogue-questions/Python/plus-one-similar2.py
 * --- Original description ---
Similar Problem 2: Add Binary
Difficulty: Easy
Pattern: Math / String

Problem:
Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"

Example 3:
Input: a = "0", b = "0"
Output: "0"

Constraints:
- 1 <= a.length, b.length <= 10^4
- a and b consist only of '0' or '1' characters
- Each string does not contain leading zeros except for the zero itself
 */

import java.util.*;
import java.util.function.*;


public class PlusOneSimilar2 {
    public String addBinary(String a, String b) {
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

    // result = []
    // carry = 0
    // i, j = (len(a) - 1, len(b) - 1)
    // while i >= 0 or j >= 0 or carry:
    // bit_a = int(a[i]) if i >= 0 else 0
    // bit_b = int(b[j]) if j >= 0 else 0
    // total = bit_a + bit_b + carry
    // result.append(str(total % 2))
    // carry = total // 2
    // i -= 1
    // j -= 1
    // return ''.join(result[::-1])

        throw new UnsupportedOperationException("Implement addBinary");
    }

    

    public static void main(String[] args) {
        PlusOneSimilar2 sol = new PlusOneSimilar2();
        assert (sol.addBinary("11", "1") == "100");
        System.out.println("✓ Test case 1 passed");
        assert (sol.addBinary("1010", "1011") == "10101");
        System.out.println("✓ Test case 2 passed");
        assert (sol.addBinary("0", "0") == "0");
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
