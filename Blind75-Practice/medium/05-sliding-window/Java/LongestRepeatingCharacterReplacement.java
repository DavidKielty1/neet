/*
 * 424. Longest Repeating Character Replacement
 * Difficulty: Medium
 * Pattern: Sliding Window
 *
 * Problem:
 * You are given a string `s` and an integer `k`. You can choose any character of the
 * string and change it to any other uppercase English character. You can perform this
 * operation at most `k` times.
 *
 * Return the length of the longest substring containing the same letter you can get
 * after performing at most `k` replacements.
 *
 * Example 1:
 * Input: s = "ABAB", k = 2
 * Output: 4
 *
 * Example 2:
 * Input: s = "AABABBA", k = 1
 * Output: 4
 *
 * Constraints:
 * - 1 <= s.length <= 10^5
 * - s consists of only uppercase English letters
 * - 0 <= k <= s.length
 *
 * Notes:
 * - Track the count of the most frequent letter in the current window.
 * - The window is valid while `window size - max frequency <= k`.
 */

public class LongestRepeatingCharacterReplacement {
    static class Solution {
        public int characterReplacement(String s, int k) {
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

            // int[] counts = new int[26];
            // int left = 0;
            // int maxFreq = 0;
            // int best = 0;
            // for (int right = 0; right < s.length(); right++) {
            //     int index = s.charAt(right) - 'A';
            //     counts[index]++;
            //     maxFreq = Math.max(maxFreq, counts[index]);
            //     while (right - left + 1 - maxFreq > k) {
            //         counts[s.charAt(left) - 'A']--;
            //         left++;
            //     }
            //     best = Math.max(best, right - left + 1);
            // }
            // return best;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.characterReplacement("ABAB", 2) == 4;
        assert sol.characterReplacement("AABABBA", 1) == 4;
        System.out.println("All test cases passed!");
    }
}
