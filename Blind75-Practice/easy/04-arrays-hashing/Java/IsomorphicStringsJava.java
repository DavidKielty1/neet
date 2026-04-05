/*
205. Isomorphic Strings
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
Given two strings s and t, determine whether they are isomorphic: characters in s can be
replaced to get t such that the replacement is one-to-one (a bijection). Each character in s
maps to exactly one character in t, and no two different characters in s map to the same
character in t. Strings have the same length (as given by the problem).

Notes:
- Mappings must stay consistent at every position (e.g. if s[i] maps to x, every future
  occurrence of s[i] must also map to x).
- Validate both directions (s→t and t→s) or use a single structure that enforces bijection.

Example 1:
Input: s = "egg", t = "add"
Output: true
Explanation: e→a, g→d for all positions; mapping is consistent.

Example 2:
Input: s = "foo", t = "bar"
Output: false
Explanation: First 'o' would map to 'a', but the second 'o' must map to 'r' — conflict.

Time: O(n), Space: O(1) — alphabet size is bounded
*/

public class IsomorphicStringsJava {

    public boolean isIsomorphic(String s, String t) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // if (s.length() != t.length()) {
            // return false;
        // }
        // Example trace: s = "agagt", t = "gagaa"
        // sToT ends {a:g, g:a}; at last index a must map to t but already maps to g → false.
        // tToS has g→a, a→g; a new t would need t→a, i.e. two different t letters (g and t)
        // both mapping to the same s letter — not a bijection; s→t fails first anyway.
        // if (s.length() != t.length()) {
            // return false;
        // }
        // Map<Character, Character> charStoT = new HashMap<>();
        // Map<Character, Character> charTtoS = new HashMap<>();
        // for (int index = 0; index < s.length(); index++) {
            // char charS = s.charAt(index);
            // char charT = t.charAt(index);
            // if (charStoT.containsKey(charS)) {
                // if (charStoT.get(charS) != charT) {
                    // return false;
                // }
            // } else {
                // charStoT.put(charS, charT);
            // }
            // if (charTtoS.containsKey(charT)) {
                // if (charTtoS.get(charT) != charS) {
                    // return false;
                // }
            // } else {
                // charTtoS.put(charT, charS);
            // }
        // }
        // return true;

        throw new UnsupportedOperationException("Implement isIsomorphic");
    }

    public static void main(String[] args) {
        IsomorphicStringsJava s = new IsomorphicStringsJava();
        assert s.isIsomorphic("egg", "add");
        assert !s.isIsomorphic("foo", "bar");
        assert s.isIsomorphic("paper", "title");
        assert !s.isIsomorphic("badc", "baba");
        System.out.println("All test cases passed!");
    }
}
