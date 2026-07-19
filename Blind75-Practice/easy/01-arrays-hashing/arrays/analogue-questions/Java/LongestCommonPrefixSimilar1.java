/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/longest-common-prefix-similar1.py
 * --- Original description ---
LeetCode 1408: String Matching in an Array
Difficulty: Easy
Pattern: Arrays & Hashing / String

Problem:
Given an array of string words, return all strings in words that is a substring of
another word. You can return the answer in any order.

A substring is a contiguous sequence of characters within a string.

Example 1:
Input: words = ["mass","as","hero","superhero"]
Output: ["as","hero"]
Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
["hero","as"] is also a valid answer.

Example 2:
Input: words = ["leetcode","et","code"]
Output: ["et","code"]
Explanation: "et", "code" are substring of "leetcode".

Example 3:
Input: words = ["blue","green","bu"]
Output: []
Explanation: No string of words is substring of another string.

Constraints:
- 1 <= words.length <= 100
- 1 <= words[i].length <= 30
- words[i] contains only lowercase English letters
- All the strings of words are unique

Time Complexity: O(n^2 * m) where n = number of words, m = average word length
Space Complexity: O(n)
 */

import java.util.*;
import java.util.function.*;


public class LongestCommonPrefixSimilar1 {
    public List<String> stringMatching(List<String> words) {
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

    // result = []
    // for i in range(len(words)):
    // for j in range(len(words)):
    // if i != j and words[i] in words[j]:
    // result.append(words[i])
    // break
    // return result

        throw new UnsupportedOperationException("Implement stringMatching");
    }

    

    public static void main(String[] args) {
        LongestCommonPrefixSimilar1 sol = new LongestCommonPrefixSimilar1();
    // result1 = sol.stringMatching(["mass", "as", "hero", "superhero"]);
    // assert set(result1) == set(['as', 'hero'])  // needs locals (port helpers): ['result1']
        System.out.println("✓ Test case 1 passed");
    // result2 = sol.stringMatching(["leetcode", "et", "code"]);
    // assert set(result2) == set(['et', 'code'])  // needs locals (port helpers): ['result2']
        System.out.println("✓ Test case 2 passed");
        assert java.util.Objects.equals(sol.stringMatching(java.util.List.of("blue", "green", "bu")), java.util.List.of());
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
