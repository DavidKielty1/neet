/*
 * Ported from: 12-bit-manipulation/analogue-questions/Python/add-binary-similar3.py
 * --- Original description ---
LeetCode 989: Add to Array-Form of Integer
Difficulty: Easy
Pattern: Array / Math

Problem:
The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].

Given num, the array-form of an integer, and an integer k, return the array-form of the
integer num + k.

Example 1:
Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234

Example 2:
Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455

Example 3:
Input: num = [2,1,5], k = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021

Constraints:
- 1 <= num.length <= 10^4
- 0 <= num[i] <= 9
- num does not contain any leading zeros except for the zero itself
- 1 <= k <= 10^4

Time Complexity: O(max(n, log k))
Space Complexity: O(max(n, log k))
 */

import java.util.*;
import java.util.function.*;


public class AddBinarySimilar3 {
    public List<Integer> addToArrayForm(List<Integer> num, int k) {
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
    // i = len(num) - 1
    // while i >= 0 or k > 0:
    // if i >= 0:
    // k += num[i]
    // i -= 1
    // result.append(k % 10)
    // k //= 10
    // return result[::-1]

        throw new UnsupportedOperationException("Implement addToArrayForm");
    }

    

    public static void main(String[] args) {
        AddBinarySimilar3 sol = new AddBinarySimilar3();
        assert java.util.Objects.equals(sol.addToArrayForm(java.util.List.of(1, 2, 0, 0), 34), java.util.List.of(1, 2, 3, 4));
        System.out.println("✓ Test case 1 passed");
        assert java.util.Objects.equals(sol.addToArrayForm(java.util.List.of(2, 7, 4), 181), java.util.List.of(4, 5, 5));
        System.out.println("✓ Test case 2 passed");
        assert java.util.Objects.equals(sol.addToArrayForm(java.util.List.of(2, 1, 5), 806), java.util.List.of(1, 0, 2, 1));
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
