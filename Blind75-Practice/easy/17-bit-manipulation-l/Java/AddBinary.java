/*
 * 67. Add Binary
 * Difficulty: Easy
 * Pattern: Bit Manipulation / Strings
 *
 * Problem:
 * Given two binary strings a and b, return their sum as a binary string.
 *
 * Example 1:
 * Input: a = "11", b = "1"
 * Output: "100"
 *
 * Example 2:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 * Constraints:
 * - 1 <= a.length, b.length <= 10^4
 * - a and b consist only of '0' or '1' characters
 * - Each string does not contain leading zeros except for the zero itself
 */
public class AddBinary {
    public String addBinary(String a, String b) {
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

        // Carry from right to left.

        // StringBuilder result = new StringBuilder();
        // int i = a.length() - 1;
        // int j = b.length() - 1;
        // int carry = 0;
        // while (i >= 0 || j >= 0 || carry > 0) {
        //     int total = carry;
        //     if (i >= 0) {
        //         total += a.charAt(i--) - "0".charAt(0);
        //     }
        //     if (j >= 0) {
        //         total += b.charAt(j--) - "0".charAt(0);
        //     }
        //     result.append(total % 2);
        //     carry = total / 2;
        // }
        // return result.reverse().toString();
        throw new UnsupportedOperationException("Implement addBinary");
    }
    public static void main(String[] args) {
        AddBinary s = new AddBinary();
        assert s.addBinary("11", "1").equals("100");
        System.out.println("All test cases passed!");
    }

}
