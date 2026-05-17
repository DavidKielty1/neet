/*
 * 30. Substring with Concatenation of All Words
 * Difficulty: Hard
 * Pattern: Hash maps and sliding window
 *
 * Problem:
 * You are given a string s and an array of strings words. All strings in words
 * have the same length.
 *
 * A concatenated string is a string that exactly contains all the strings of any
 * permutation of words concatenated together.
 *
 * Return the starting indices of all concatenated substrings in s. You can return
 * the answer in any order.
 *
 * Example 1:
 * Input: s = "barfoothefoobarman", words = ["foo","bar"]
 * Output: [0,9]
 * Explanation: The substrings starting at 0 and 9 are "barfoo" and "foobar".
 *
 * Example 2:
 * Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
 * Output: []
 * Explanation: No substring contains each word exactly once.
 *
 * Example 3:
 * Input: s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
 * Output: [6,9,12]
 *
 * Constraints:
 * - 1 <= s.length <= 10^4
 * - 1 <= words.length <= 5000
 * - 1 <= words[i].length <= 30
 * - s and words[i] consist of lowercase English letters
 */
import java.util.List;

public class SubstringWithConcatenationOfAllWords {
    static class Solution {
        public List<Integer> findSubstring(String s, String[] words) {
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

            // Map<String, Integer> need = new HashMap<>();
            // for (String word : words) {
            //     need.put(word, need.getOrDefault(word, 0) + 1);
            // }
            //
            // List<Integer> result = new ArrayList<>();
            // int wordLength = words[0].length();
            // int wordCount = words.length;
            // int windowLength = wordLength * wordCount;
            //
            // for (int offset = 0; offset < wordLength; offset++) {
            //     int left = offset;
            //     int matched = 0;
            //     Map<String, Integer> seen = new HashMap<>();
            //
            //     for (int right = offset; right + wordLength <= s.length(); right += wordLength) {
            //         String word = s.substring(right, right + wordLength);
            //         if (!need.containsKey(word)) {
            //             seen.clear();
            //             matched = 0;
            //             left = right + wordLength;
            //             continue;
            //         }
            //
            //         seen.put(word, seen.getOrDefault(word, 0) + 1);
            //         matched++;
            //         while (seen.get(word) > need.get(word)) {
            //             String removed = s.substring(left, left + wordLength);
            //             seen.put(removed, seen.get(removed) - 1);
            //             matched--;
            //             left += wordLength;
            //         }
            //
            //         if (matched == wordCount) {
            //             result.add(left);
            //             String removed = s.substring(left, left + wordLength);
            //             seen.put(removed, seen.get(removed) - 1);
            //             matched--;
            //             left += wordLength;
            //         }
            //     }
            // }
            //
            // return result;
            throw new UnsupportedOperationException("Implement findSubstring");
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement findSubstring and add checks.");
    }
}
