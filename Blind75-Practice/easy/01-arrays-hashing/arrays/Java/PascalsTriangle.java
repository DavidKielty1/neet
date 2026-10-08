import java.util.Arrays;
import java.util.List;

/*
 * 118. Pascal's Triangle
 * Difficulty: Easy
 * Pattern: Arrays & Hashing / DP
 *
 * Problem:
 * Given an integer numRows, return the first numRows of Pascal's triangle. In
 * Pascal's triangle, each number is the sum of the two numbers directly above
 * it. Each row starts and ends with 1. Return the triangle as a list of rows.
 *
 * Example 1:
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 *
 * Example 2:
 * Input: numRows = 1
 * Output: [[1]]
 *
 * Constraints:
 * - 1 <= numRows <= 30
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
    }

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
    }

    public static void main(String[] args) {
        PascalsTriangle s = new PascalsTriangle();
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
