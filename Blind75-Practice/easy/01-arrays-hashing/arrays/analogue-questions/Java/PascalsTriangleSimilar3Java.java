/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/pascals-triangle-similar3.py
 * --- Original description ---
LeetCode 2022: Convert 1D Array Into 2D Array
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
You are given a 0-indexed 1-dimensional (1D) integer array original, and two integers,
m and n. You are tasked with creating a 2-dimensional (2D) array with m rows and n
columns using all the elements from original.

The elements from indices 0 to n - 1 (inclusive) of original should form the first row
of the constructed 2D array, the elements from indices n to 2 * n - 1 (inclusive) should
form the second row of the constructed 2D array, and so on.

Return an m x n 2D array constructed according to the above procedure, or an empty 2D
array if it is impossible.

Example 1:
Input: original = [1,2,3,4], m = 2, n = 2
Output: [[1,2],[3,4]]

Example 2:
Input: original = [1,2,3], m = 1, n = 3
Output: [[1,2,3]]

Example 3:
Input: original = [1,2], m = 1, n = 1
Output: []

Constraints:
- 1 <= original.length <= 5 * 10^4
- 1 <= original[i] <= 10^5
- 1 <= m, n <= 4 * 10^4

Time Complexity: O(m * n)
Space Complexity: O(m * n)
 */

import java.util.*;
import java.util.function.*;


public class PascalsTriangleSimilar3Java {



    static class Solution {
        public List<List<Integer>> construct2DArray(List<Integer> original, int m, int n) {
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

            // if len(original) != m * n:
            // return []
            // result = []
            // for i in range(m):
            // row = original[i * n:(i + 1) * n]
            // result.append(row)
            // return result

            throw new UnsupportedOperationException("Implement construct2DArray");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert java.util.Objects.equals(sol.construct2DArray(java.util.List.of(1, 2, 3, 4), 2, 2), java.util.List.of(java.util.List.of(1, 2), java.util.List.of(3, 4)));
        System.out.println("✓ Test case 1 passed");
        assert java.util.Objects.equals(sol.construct2DArray(java.util.List.of(1, 2, 3), 1, 3), java.util.List.of(java.util.List.of(1, 2, 3)));
        System.out.println("✓ Test case 2 passed");
        assert java.util.Objects.equals(sol.construct2DArray(java.util.List.of(1, 2), 1, 1), java.util.List.of());
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
