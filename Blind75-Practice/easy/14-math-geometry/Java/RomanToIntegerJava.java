/*
13. Roman to Integer
Difficulty: Easy
Pattern: Math & Geometry

If a symbol is less than the next, subtract it; otherwise add.

Time: O(n), Space: O(1)
*/

import java.util.Map;

public class RomanToIntegerJava {

    private static final Map<Character, Integer> VALS =
            Map.of(
                    'I', 1,
                    'V', 5,
                    'X', 10,
                    'L', 50,
                    'C', 100,
                    'D', 500,
                    'M', 1000);

    public int romanToInt(String s) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // int total = 0;
        // for (int i = 0; i < s.length(); i++) {
        // int v = VALS.get(s.charAt(i));
        // if (i + 1 < s.length() && v < VALS.get(s.charAt(i + 1))) {
        // total -= v;
        // } else {
        // total += v;
        // }
        // }
        // return total;

        throw new UnsupportedOperationException("Implement romanToInt");
    }

    public static void main(String[] args) {
        RomanToIntegerJava s = new RomanToIntegerJava();
        assert s.romanToInt("III") == 3;
        assert s.romanToInt("LVIII") == 58;
        assert s.romanToInt("MCMXCIV") == 1994;
        System.out.println("All test cases passed!");
    }
}
