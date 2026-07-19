/*
 * Ported from: 05-binary-search/analogue-questions/Python/search-insert-position-similar2.py
 * --- Original description ---
LeetCode 441: Arranging Coins
Difficulty: Easy
Pattern: Binary Search / Math

Problem:
You have n coins and you want to build a staircase with these coins. The staircase
consists of k rows where the ith row has exactly i coins. The last row of the staircase
may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.

Example 1:
Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.

Example 2:
Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.

Constraints:
- 1 <= n <= 2^31 - 1

Time Complexity: O(log n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class SearchInsertPositionSimilar2 {
    public int arrangeCoins(int n) {
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

    // left, right = (0, n)
    // while left <= right:
    // mid = left + (right - left) // 2
    // total = mid * (mid + 1) // 2
    // if total == n:
    // return mid
    // elif total < n:
    // left = mid + 1
    // else:
    // right = mid - 1
    // return right

        throw new UnsupportedOperationException("Implement arrangeCoins");
    }

    

    public static void main(String[] args) {
        SearchInsertPositionSimilar2 sol = new SearchInsertPositionSimilar2();
        assert (sol.arrangeCoins(5) == 2);
        System.out.println("✓ Test case 1 passed");
        assert (sol.arrangeCoins(8) == 3);
        System.out.println("✓ Test case 2 passed");
        assert (sol.arrangeCoins(1) == 1);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
