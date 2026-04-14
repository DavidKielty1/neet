import java.util.Arrays;
import java.util.List;

/*
118. Pascal's Triangle
Difficulty: Easy
Pattern: Arrays & Hashing / DP

Problem:
Given an integer numRows, return the first numRows rows of Pascal's triangle.
Row i (0-based) has i + 1 entries. Each row starts and ends with 1; each interior value is
the sum of the two values above it from the previous row.

Notes:
- Row 0 is [1]. Row 1 is [1,1]. Build row k from row k-1 in O(k) time.
- Binomial coefficients: C(n,k) appears in row n at index k.

Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Explanation: Standard first five rows of Pascal's triangle.

Example 2:
Input: numRows = 1
Output: [[1]]
Explanation: Only the top row.

Example 3:
Input: numRows = 3
Output: [[1],[1,1],[1,2,1]]
Explanation: First three rows.

Time: O(numRows^2), Space: O(numRows^2) for the returned list
*/
public class PascalsTriangleJava {

    public List<List<Integer>> generate(int numRows) {

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

        // List<List<Integer>> result = new ArrayList<>();
        // result.add(List.of(1));
        // for (int i = 1; i < numRows; i++) {
            // List<Integer> prev = result.get(i - 1);
            // List<Integer> row = new ArrayList<>();
            // row.add(1);
            // for (int j = 0; j < prev.size() - 1; j++) {
                // row.add(prev.get(j) + prev.get(j + 1));
            // }
            // row.add(1);
            // result.add(row);
        // }
        // return result;

        throw new UnsupportedOperationException("Implement generate");
    }

    private static boolean deepEquals(List<List<Integer>> a, List<List<Integer>> b) {
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

        // if (a.size() != b.size()) {
            // return false;
        // }
        // for (int i = 0; i < a.size(); i++) {
            // if (!a.get(i).equals(b.get(i))) {
                // return false;
            // }
        // }
        // return true;

        throw new UnsupportedOperationException("Implement deepEquals");
    }

    public static void main(String[] args) {
        PascalsTriangleJava s = new PascalsTriangleJava();
        List<List<Integer>> e5 =
                Arrays.asList(
                        List.of(1),
                        List.of(1, 1),
                        List.of(1, 2, 1),
                        List.of(1, 3, 3, 1),
                        List.of(1, 4, 6, 4, 1));
        assert deepEquals(s.generate(5), e5);
        assert deepEquals(s.generate(1), List.of(List.of(1)));
        assert deepEquals(
                s.generate(3), Arrays.asList(List.of(1), List.of(1, 1), List.of(1, 2, 1)));
        System.out.println("All test cases passed!");
    }
}
