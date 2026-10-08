/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/isomorphic-strings-similar1.py
 * --- Original description ---
LeetCode 205 Variant: Check if Two Strings Can Be Made Equal
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
You are given two strings s1 and s2, both of the same length. You can swap two
characters in s1 at most once. Return true if you can make s1 equal to s2, otherwise
return false.

Example 1:
Input: s1 = "bank", s2 = "kanb"
Output: true

Example 2:
Input: s1 = "attack", s2 = "defend"
Output: false

Example 3:
Input: s1 = "kelb", s2 = "kelb"
Output: true

Constraints:
- 1 <= s1.length, s2.length <= 100
- s1.length == s2.length
- s1 and s2 consist of only lowercase English letters

Time Complexity: O(n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class IsomorphicStringsSimilar1 {
    public boolean areSimilar(String s1, String s2) {
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

    // diff = []
    // for i in range(len(s1)):
    // if s1[i] != s2[i]:
    // diff.append(i)
    // if len(diff) == 0:
    // return True
    // if len(diff) == 2:
    // i, j = diff
    // return s1[i] == s2[j] and s1[j] == s2[i]
    // return False

        throw new UnsupportedOperationException("Implement areSimilar");
    }

    

    public static void main(String[] args) {
        IsomorphicStringsSimilar1 sol = new IsomorphicStringsSimilar1();
        assert (sol.areSimilar("bank", "kanb") == true);
        System.out.println("✓ Test case 1 passed");
        assert (sol.areSimilar("attack", "defend") == false);
        System.out.println("✓ Test case 2 passed");
        assert (sol.areSimilar("kelb", "kelb") == true);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
