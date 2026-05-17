/*
 * Ported from: 14-math-geometry/analogue-questions/Python/sqrt-x-similar2.py
 * --- Original description ---
LeetCode 633: Sum of Square Numbers
Difficulty: Medium (simplified to Easy)
Pattern: Math / Two Pointers

Problem:
Given a non-negative integer c, decide whether there're two integers a and b such that
a^2 + b^2 = c.

Example 1:
Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5

Example 2:
Input: c = 3
Output: false

Constraints:
- 0 <= c <= 2^31 - 1

Time Complexity: O(sqrt(c))
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class SqrtXSimilar2 {



    static class Solution {
        public boolean judgeSquareSum(int c) {
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

            // left = 0
            // right = int(c ** 0.5)
            // while left <= right:
            // current_sum = left * left + right * right
            // if current_sum == c:
            // return True
            // elif current_sum < c:
            // left += 1
            // else:
            // right -= 1
            // return False

            throw new UnsupportedOperationException("Implement judgeSquareSum");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.judgeSquareSum(5) == true);
        System.out.println("✓ Test case 1 passed");
        assert (sol.judgeSquareSum(3) == false);
        System.out.println("✓ Test case 2 passed");
        assert (sol.judgeSquareSum(0) == true);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
