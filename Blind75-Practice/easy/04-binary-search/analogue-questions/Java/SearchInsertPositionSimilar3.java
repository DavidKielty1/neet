/*
 * Ported from: 05-binary-search/analogue-questions/Python/search-insert-position-similar3.py
 * --- Original description ---
LeetCode 367: Valid Perfect Square
Difficulty: Easy
Pattern: Binary Search

Problem:
Given a positive integer num, return true if num is a perfect square or false otherwise.

A perfect square is an integer that is the square of an integer. In other words, it is
the product of some integer with itself.

You must not use any built-in library function, such as sqrt.

Example 1:
Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

Example 2:
Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.

Constraints:
- 1 <= num <= 2^31 - 1

Time Complexity: O(log n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class SearchInsertPositionSimilar3 {
    public boolean isPerfectSquare(int num) {
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

    // if num < 2:
    // return True
    // left, right = (2, num // 2)
    // while left <= right:
    // mid = left + (right - left) // 2
    // square = mid * mid
    // if square == num:
    // return True
    // elif square < num:
    // left = mid + 1
    // else:
    // right = mid - 1
    // return False

        throw new UnsupportedOperationException("Implement isPerfectSquare");
    }

    

    public static void main(String[] args) {
        SearchInsertPositionSimilar3 sol = new SearchInsertPositionSimilar3();
        assert (sol.isPerfectSquare(16) == true);
        System.out.println("✓ Test case 1 passed");
        assert (sol.isPerfectSquare(14) == false);
        System.out.println("✓ Test case 2 passed");
        assert (sol.isPerfectSquare(1) == true);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
