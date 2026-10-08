/*
 * 168. Excel Sheet Column Title
 * Difficulty: Easy
 * Pattern: Math & Geometry
 *
 * Problem:
 * Given an integer columnNumber, return its corresponding column title as it
 * appears in an Excel sheet. For example, 1 maps to "A", 2 maps to "B", 26
 * maps to "Z", 27 maps to "AA", and 28 maps to "AB".
 *
 * Example 1:
 * Input: columnNumber = 1
 * Output: "A"
 *
 * Example 2:
 * Input: columnNumber = 28
 * Output: "AB"
 *
 * Example 3:
 * Input: columnNumber = 701
 * Output: "ZY"
 *
 * Constraints:
 * - 1 <= columnNumber <= 2^31 - 1
 */

public class ExcelSheetColumnTitle {

    public String convertToTitle(int columnNumber) {
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

        // StringBuilder sb = new StringBuilder();
        // int n = columnNumber;
        // while (n > 0) {
            // n--;
            // sb.append((char) ('A' + (n % 26)));
            // n /= 26;
        // }
        // return sb.reverse().toString();

        // StringBuilder sb = new StringBuilder();
        // int n = columnNumber;
        // while (n > 0) {
        //     n--;
        //     sb.append((char) ("A".charAt(0) + (n % 26)));
        //     n /= 26;
        // }
        // return sb.reverse().toString();
        throw new UnsupportedOperationException("Implement convertToTitle");
    }

    public static void main(String[] args) {
        ExcelSheetColumnTitle s = new ExcelSheetColumnTitle();
        assert s.convertToTitle(1).equals("A");
        assert s.convertToTitle(28).equals("AB");
        assert s.convertToTitle(701).equals("ZY");
        System.out.println("All test cases passed!");
    }
}
