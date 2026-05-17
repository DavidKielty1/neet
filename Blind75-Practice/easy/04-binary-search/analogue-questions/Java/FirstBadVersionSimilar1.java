/*
 * Ported from: 05-binary-search/analogue-questions/Python/first-bad-version-similar1.py
 * --- Original description ---
LeetCode 374: Guess Number Higher or Lower
Difficulty: Easy
Pattern: Binary Search

Problem:
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower
than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).

Return the number that I picked.

Example 1:
Input: n = 10, pick = 6
Output: 6

Example 2:
Input: n = 1, pick = 1
Output: 1

Example 3:
Input: n = 2, pick = 1
Output: 1

Constraints:
- 1 <= n <= 2^31 - 1
- 1 <= pick <= n

Time Complexity: O(log n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class FirstBadVersionSimilar1 {



    static class Solution {
        public int guessNumber(int n) {
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

            // left, right = (1, n)
            // while left <= right:
            // mid = left + (right - left) // 2
            // result = guess(mid)
            // if result == 0:
            // return mid
            // elif result == -1:
            // right = mid - 1
            // else:
            // left = mid + 1
            // return -1

            throw new UnsupportedOperationException("Implement guessNumber");
        }

    }

    public static void main(String[] args) {
        // test_api = TestAPI(6);
        // nested def guess — see Python file
        Solution sol = new Solution();
        assert (sol.guessNumber(10) == 6);
        System.out.println("✓ Test case 1 passed");
        // test_api = TestAPI(1);
        assert (sol.guessNumber(1) == 1);
        System.out.println("✓ Test case 2 passed");
        // test_api = TestAPI(1);
        assert (sol.guessNumber(2) == 1);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
