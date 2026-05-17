/*
 * 1071. Greatest Common Divisor of Strings
 * Difficulty: Easy
 * Pattern: Math & Geometry
 *
 * Problem:
 * For two strings `str1` and `str2`, we say `t` divides a string `s` if `s` is formed
 * by concatenating `t` one or more times.
 *
 * Return the largest string `x` such that `x` divides both `str1` and `str2`.
 *
 * Example 1:
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 *
 * Example 2:
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 *
 * Example 3:
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 *
 * Constraints:
 * - 1 <= str1.length, str2.length <= 1000
 * - str1 and str2 consist of uppercase English letters
 *
 * Notes:
 * - If `str1 + str2` is not equal to `str2 + str1`, then no common divisor string exists.
 * - Otherwise the answer length is `gcd(str1.length(), str2.length())`.
 */

public class GreatestCommonDivisorOfStrings {

    private static int gcd(int a, int b) {
    }

    public String gcdOfStrings(String str1, String str2) {
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

        // private static int gcd(int a, int b) {
        //     while (b != 0) {
        //         int temp = a % b;
        //         a = b;
        //         b = temp;
        //     }
        //     return a;
        // }
        //
        // public String gcdOfStrings(String str1, String str2) {
        //     if (!(str1 + str2).equals(str2 + str1)) {
        //         return "";
        //     }
        //     int length = gcd(str1.length(), str2.length());
        //     return str1.substring(0, length);
        // }
    }

    public static void main(String[] args) {
        GreatestCommonDivisorOfStrings s = new GreatestCommonDivisorOfStrings();
        assert s.gcdOfStrings("ABCABC", "ABC").equals("ABC");
        assert s.gcdOfStrings("ABABAB", "ABAB").equals("AB");
        assert s.gcdOfStrings("LEET", "CODE").equals("");
        System.out.println("All test cases passed!");
    }
}
