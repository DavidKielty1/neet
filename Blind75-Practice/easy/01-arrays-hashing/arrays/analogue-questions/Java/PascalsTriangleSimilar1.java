/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/pascals-triangle-similar1.py
 * --- Original description ---
LeetCode 119: Pascal's Triangle II
Difficulty: Easy
Pattern: Arrays & Hashing / Dynamic Programming

Problem:
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example 1:
Input: rowIndex = 3
Output: [1,3,3,1]

Example 2:
Input: rowIndex = 0
Output: [1]

Example 3:
Input: rowIndex = 1
Output: [1,1]

Constraints:
- 0 <= rowIndex <= 33

Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?

Time Complexity: O(rowIndex^2)
Space Complexity: O(rowIndex)
 */

import java.util.*;
import java.util.function.*;


public class PascalsTriangleSimilar1 {



    static class Solution {
        public List<Integer> getRow(int rowIndex) {
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

            // row = [1]
            // for i in range(rowIndex):
            // new_row = [1]
            // for j in range(len(row) - 1):
            // new_row.append(row[j] + row[j + 1])
            // new_row.append(1)
            // row = new_row
            // return row

            throw new UnsupportedOperationException("Implement getRow");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert java.util.Objects.equals(sol.getRow(3), java.util.List.of(1, 3, 3, 1));
        System.out.println("✓ Test case 1 passed");
        assert java.util.Objects.equals(sol.getRow(0), java.util.List.of(1));
        System.out.println("✓ Test case 2 passed");
        assert java.util.Objects.equals(sol.getRow(1), java.util.List.of(1, 1));
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
