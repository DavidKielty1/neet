/*
 * 74. Search a 2D Matrix
 * Difficulty: Medium
 * Pattern: Binary Search
 *
 * Problem:
 * You are given an `m x n` integer matrix `matrix` with the following properties:
 * - Each row is sorted in non-decreasing order.
 * - The first integer of each row is greater than the last integer of the previous row.
 *
 * Given an integer `target`, return `true` if target is in the matrix, or `false`
 * otherwise.
 *
 * You must write a solution in O(log(m * n)) time complexity.
 *
 * Example 1:
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * Output: true
 *
 * Example 2:
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * Output: false
 *
 * Constraints:
 * - m == matrix.length
 * - n == matrix[i].length
 * - 1 <= m, n <= 100
 * - -10^4 <= matrix[i][j], target <= 10^4
 *
 * Notes:
 * - Treat the matrix as one sorted array of length `m * n`.
 * - Convert a one-dimensional index back to row and column with division and modulo.
 */

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
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

    // int rows = matrix.length;
    // int cols = matrix[0].length;
    // int left = 0;
    // int right = rows * cols - 1;
    // while (left <= right) {
    //     int mid = left + (right - left) / 2;
    //     int value = matrix[mid / cols][mid % cols];
    //     if (value == target) {
    //         return true;
    //     }
    //     if (value < target) {
    //         left = mid + 1;
    //     } else {
    //         right = mid - 1;
    //     }
    // }
    // return false;
    }
    

    public static void main(String[] args) {
        SearchA2DMatrix sol = new SearchA2DMatrix();
        assert sol.searchMatrix(new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 3);
        assert !sol.searchMatrix(new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 13);
        System.out.println("All test cases passed!");
    }
}
