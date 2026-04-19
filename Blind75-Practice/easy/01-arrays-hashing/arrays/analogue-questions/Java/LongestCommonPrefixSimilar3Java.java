/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/longest-common-prefix-similar3.py
 * --- Original description ---
LeetCode 1556: Thousand Separator
Difficulty: Easy
Pattern: String

Problem:
Given an integer n, add a dot (".") as the thousands separator and return it in string format.

Example 1:
Input: n = 987
Output: "987"

Example 2:
Input: n = 1234
Output: "1.234"

Example 3:
Input: n = 123456789
Output: "123.456.789"

Constraints:
- 0 <= n <= 2^31 - 1

Time Complexity: O(log n) - number of digits
Space Complexity: O(log n)
 */

import java.util.*;
import java.util.function.*;


public class LongestCommonPrefixSimilar3Java {



    static class Solution {
        public String thousandSeparator(int n) {
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

            // s = str(n)
            // result = []
            // for i, digit in enumerate(reversed(s)):
            // if i > 0 and i % 3 == 0:
            // result.append('.')
            // result.append(digit)
            // return ''.join(reversed(result))

            throw new UnsupportedOperationException("Implement thousandSeparator");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.thousandSeparator(987) == "987");
        System.out.println("✓ Test case 1 passed");
        assert (sol.thousandSeparator(1234) == "1.234");
        System.out.println("✓ Test case 2 passed");
        assert (sol.thousandSeparator(123456789) == "123.456.789");
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
