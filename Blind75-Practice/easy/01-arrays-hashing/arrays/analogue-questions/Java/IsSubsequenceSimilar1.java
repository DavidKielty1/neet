/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/is-subsequence-similar1.py
 * --- Original description ---
LeetCode 792: Number of Matching Subsequences
Difficulty: Medium (simplified to Easy)
Pattern: Arrays & Hashing

Problem:
Given a string s and an array of strings words, return the number of words[i] that
is a subsequence of s.

A subsequence of a string is a new string generated from the original string with
some characters (can be none) deleted without changing the relative order of the
remaining characters.

Example 1:
Input: s = "abcde", words = ["a","bb","acd","ace"]
Output: 3
Explanation: There are three strings in words that are a subsequence of s: "a", "acd", "ace".

Example 2:
Input: s = "dsahjpjauf", words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]
Output: 2

Constraints:
- 1 <= s.length <= 5 * 10^4
- 1 <= words.length <= 5000
- 1 <= words[i].length <= 50
- s and words[i] consist of only lowercase English letters

Time Complexity: O(n * m) where n = words length, m = s length
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class IsSubsequenceSimilar1 {
    public int numMatchingSubseq(String s, List<String> words) {
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

    // def is_subsequence(word: str) -> bool:
    // w_idx = 0
    // for char in s:
    // if w_idx < len(word) and char == word[w_idx]:
    // w_idx += 1
    // return w_idx == len(word)
    // return sum((is_subsequence(word) for word in words))

        throw new UnsupportedOperationException("Implement numMatchingSubseq");
    }

    

    public static void main(String[] args) {
        IsSubsequenceSimilar1 sol = new IsSubsequenceSimilar1();
        assert (sol.numMatchingSubseq("abcde", java.util.List.of("a", "bb", "acd", "ace")) == 3);
        System.out.println("✓ Test case 1 passed");
        assert (sol.numMatchingSubseq("dsahjpjauf", java.util.List.of("ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax")) == 2);
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
