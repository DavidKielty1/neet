/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/length-of-last-word-similar1.py
 * --- Original description ---
LeetCode 819: Most Common Word
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
Given a string paragraph and a string array of the banned words banned, return the
most frequent word that is not banned. It is guaranteed there is at least one word
that is not banned, and that the answer is unique.

The words in paragraph are case-insensitive and the answer should be returned in lowercase.

Example 1:
Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"
Explanation:
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word.

Example 2:
Input: paragraph = "a.", banned = []
Output: "a"

Constraints:
- 1 <= paragraph.length <= 1000
- paragraph consists of English letters, space ' ', or one of the symbols: "!?',;."
- 0 <= banned.length <= 100
- 1 <= banned[i].length <= 10
- banned[i] consists of only lowercase English letters

Time Complexity: O(n)
Space Complexity: O(n)
 */

import java.util.*;
import java.util.function.*;


public class LengthOfLastWordSimilar1 {



    static class Solution {
        public String mostCommonWord(String paragraph, List<String> banned) {
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

            // words = re.findall('\\w+', paragraph.lower())
            // banned_set = set(banned)
            // word_count = Counter(words)
            // for word, count in word_count.most_common():
            // if word not in banned_set:
            // return word
            // return ''

            throw new UnsupportedOperationException("Implement mostCommonWord");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", java.util.List.of("hit")) == "ball");
        System.out.println("✓ Test case 1 passed");
        assert (sol.mostCommonWord("a.", java.util.List.of()) == "a");
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
