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
        if (s == null || t == null || t.length() != s.length()) {



        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // Map<Character, Character> sToT = new HashMap<>();
        // Map<Character, Character> tToS = new HashMap<>();

        // for(int i = 0; i < s.length(); i++) {
        //     char cs = s.charAt(i);
        //     char ct = t.charAt(i);

        //     if (sToT.containsKey(cs)) {
        //         if (!sToT.get(cs).equals(ct)) return false;
        //     } else {
        //         sToT.put(cs, ct);
        //     }
            
        //     if (tToS.containsKey(ct)) {
        //         if (!tToS.get(ct).equals(cs)) return false;
        //     } else {
        //         tToS.put(ct, cs);
        //     }
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
