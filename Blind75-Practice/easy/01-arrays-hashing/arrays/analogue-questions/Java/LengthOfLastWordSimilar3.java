/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/length-of-last-word-similar3.py
 * --- Original description ---
LeetCode 2000: Reverse Prefix of Word
Difficulty: Easy
Pattern: String / Arrays

Problem:
Given a 0-indexed string word and a character ch, reverse the segment of word that
starts at index 0 and ends at the index of the first occurrence of ch (inclusive).
If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment
that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".

Return the resulting string.

Example 1:
Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"

Example 2:
Input: word = "xyxzxe", ch = "z"
Output: "zxyxxe"

Example 3:
Input: word = "abcd", ch = "z"
Output: "abcd"

Constraints:
- 1 <= word.length <= 250
- word consists of lowercase English letters
- ch is a lowercase English letter

Time Complexity: O(n)
Space Complexity: O(n)
 */

import java.util.*;
import java.util.function.*;


public class LengthOfLastWordSimilar3 {
    public String reversePrefix(String word, String ch) {
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

    // try:
    // idx = word.index(ch)
    // return word[:idx + 1][::-1] + word[idx + 1:]
    // except ValueError:
    // return word

        throw new UnsupportedOperationException("Implement reversePrefix");
    }

    

    public static void main(String[] args) {
        LengthOfLastWordSimilar3 sol = new LengthOfLastWordSimilar3();
        assert (sol.reversePrefix("abcdefd", "d") == "dcbaefd");
        System.out.println("✓ Test case 1 passed");
        assert (sol.reversePrefix("xyxzxe", "z") == "zxyxxe");
        System.out.println("✓ Test case 2 passed");
        assert (sol.reversePrefix("abcd", "z") == "abcd");
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
