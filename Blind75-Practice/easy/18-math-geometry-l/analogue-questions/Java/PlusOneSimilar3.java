/*
 * Ported from: 14-math-geometry/analogue-questions/Python/plus-one-similar3.py
 * --- Original description ---
Similar Problem 3: Multiply Strings
Difficulty: Easy (Simplified)
Pattern: Math / String

Problem:
Given two non-negative integers num1 and num2 represented as strings,
return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

Example 1:
Input: num1 = "2", num2 = "3"
Output: "6"

Example 2:
Input: num1 = "123", num2 = "456"
Output: "56088"

Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"

Constraints:
- 1 <= num1.length, num2.length <= 200
- num1 and num2 consist of digits only
- Both num1 and num2 do not contain any leading zero, except the number 0 itself
 */

import java.util.*;
import java.util.function.*;


public class PlusOneSimilar3 {
    public String multiply(String num1, String num2) {
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

    // if num1 == '0' or num2 == '0':
    // return '0'
    // m, n = (len(num1), len(num2))
    // result = [0] * (m + n)
    // for i in range(m - 1, -1, -1):
    // for j in range(n - 1, -1, -1):
    // product = int(num1[i]) * int(num2[j])
    // p1, p2 = (i + j, i + j + 1)
    // total = product + result[p2]
    // result[p2] = total % 10
    // result[p1] += total // 10
    // result_str = ''.join(map(str, result))
    // return result_str.lstrip('0') or '0'

        throw new UnsupportedOperationException("Implement multiply");
    }

    

    public static void main(String[] args) {
        PlusOneSimilar3 sol = new PlusOneSimilar3();
        assert (sol.multiply("2", "3") == "6");
        System.out.println("✓ Test case 1 passed");
        assert (sol.multiply("123", "456") == "56088");
        System.out.println("✓ Test case 2 passed");
        assert (sol.multiply("0", "0") == "0");
        System.out.println("✓ Test case 3 passed");
        assert (sol.multiply("9", "9") == "81");
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
