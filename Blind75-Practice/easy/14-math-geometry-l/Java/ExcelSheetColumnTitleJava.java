/*
168. Excel Sheet Column Title
Difficulty: Easy
Pattern: Math & Geometry

1 -> "A", 26 -> "Z", 27 -> "AA". Bijective base-26 with 1-indexing (subtract 1 before mod).

Time: O(log n), Space: O(log n) for StringBuilder
*/

public class ExcelSheetColumnTitleJava {

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

        throw new UnsupportedOperationException("Implement convertToTitle");
    }

    public static void main(String[] args) {
        ExcelSheetColumnTitleJava s = new ExcelSheetColumnTitleJava();
        assert s.convertToTitle(1).equals("A");
        assert s.convertToTitle(28).equals("AB");
        assert s.convertToTitle(701).equals("ZY");
        System.out.println("All test cases passed!");
    }
}
