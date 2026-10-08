/*
 * 205. Isomorphic Strings
 * Difficulty: Easy
 * Pattern: Arrays & Hashing
 *
 * Problem:
 * Given two strings s and t, determine whether they are isomorphic. Two
 * strings are isomorphic if the characters in s can be replaced to get t.
 * Every occurrence of a character must be replaced with the same character
 * while preserving order. No two characters may map to the same character, but
 * a character may map to itself. Return true if such a one-to-one mapping
 * exists, otherwise false.
 *
 * Example 1:
 * Input: s = "egg", t = "add"
 * Output: true
 *
 * Example 2:
 * Input: s = "foo", t = "bar"
 * Output: false
 *
 * Example 3:
 * Input: s = "paper", t = "title"
 * Output: true
 *
 * Constraints:
 * - 1 <= s.length <= 5 * 10^4
 * - t.length == s.length
 * - s and t consist of any valid ascii character
 */

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (!addMapping(sToT, sc, tc) || !addMapping(tToS, tc, sc)) {
                return false;
            }
        }
        return true;
    }

    private boolean addMapping(Map<Character, Character> map, char key, char value) {
        char prev = map.putIfAbsent(key, value);
        return prev == null || prev == value;
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

        //


        //     if (s == null || t == null || t.length() != s.length()) {
        //         return false;
        //     }

        //     Map<Character, Character> tToS = new HashMap<>();
        //     Map<Character, Character> sToT = new HashMap<>();  

        //     for (int i = 0; i < s.length(); i++){
        //         char cs = s.charAt(i);
        //         char ct = t.charAt(i);
                        
        //         if (!addMapping(sToT, cs, ct) || !addMapping(tToS, ct, cs)) {
        //             return false;
        //         }
        //     }
        //     return true;
        // }

        // private boolean addMapping (Map<Character, Character> map, char key, char value) {
        //     Character prev = map.putIfAbsent(key, value);
        //     return prev == null || prev == value;
        // }
    }

    public static void main(String[] args) {
        IsomorphicStrings s = new IsomorphicStrings();
        assert s.isIsomorphic("egg", "add");
        assert !s.isIsomorphic("foo", "bar");
        assert s.isIsomorphic("paper", "title");
        assert !s.isIsomorphic("badc", "baba");
        System.out.println("All test cases passed!");
    }
}
