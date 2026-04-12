/*
1071. Greatest Common Divisor of Strings
Difficulty: Easy
Pattern: Math & Geometry

Largest x such that both strings are repetitions of x iff str1+str2 equals str2+str1;
then take prefix of length gcd(|str1|, |str2|).

Time: O(|str1| + |str2|), Space: O(|str1| + |str2|) for concatenation strings
*/

public class GreatestCommonDivisorOfStringsJava {

    private static int gcd(int a, int b) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // while (b != 0) {
            // int t = a % b;
            // a = b;
            // b = t;
        // }
        // return a;

        throw new UnsupportedOperationException("Implement gcd");
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

        // if (!(str1 + str2).equals(str2 + str1)) {
            // return "";
        // }
        // int g = gcd(str1.length(), str2.length());
        // return str1.substring(0, g);

        throw new UnsupportedOperationException("Implement gcdOfStrings");
    }

    public static void main(String[] args) {
        GreatestCommonDivisorOfStringsJava s = new GreatestCommonDivisorOfStringsJava();
        assert s.gcdOfStrings("ABCABC", "ABC").equals("ABC");
        assert s.gcdOfStrings("ABABAB", "ABAB").equals("AB");
        assert s.gcdOfStrings("LEET", "CODE").equals("");
        System.out.println("All test cases passed!");
    }
}
