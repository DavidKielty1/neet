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
    public int characterReplacement(String s, int k) {
        
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

    //     int[] count = new int[26];
    //     int maxFreq = 0;
    //     int longest = 0;
    //     int left = 0;
    //     for (int right = 0; right < s.length(); right++) {
    //         int index = s.charAt(right) - 'A';
    //         count[index]++;
    //         maxFreq = Math.max(maxFreq, count[index]);

    //         while (right - left + 1 - k > maxFreq) {
    //             count[s.charAt(left++) - 'A']--;
    //         } 
    //         longest = Math.max(longest, right - left + 1);
    //     }
    //     return longest;

    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement sol = new LongestRepeatingCharacterReplacement();
        assert sol.characterReplacement("ABAB", 2) == 4;
        assert sol.characterReplacement("AABABBA", 1) == 4;
        System.out.println("All test cases passed!");
    }
}
