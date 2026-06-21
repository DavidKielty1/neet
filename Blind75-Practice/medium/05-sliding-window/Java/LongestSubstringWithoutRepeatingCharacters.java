/*
 * 3. Longest Substring Without Repeating Characters
 * Difficulty: Medium
 * Pattern: Sliding Window
 *
 * Problem:
 * Given a string `s`, find the length of the longest substring without repeating
 * characters.
 *
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 *
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 *
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 *
 * Constraints:
 * - 0 <= s.length <= 5 * 10^4
 * - s consists of English letters, digits, symbols, and spaces
 *
 * Notes:
 * - Expand the right edge of the window.
 * - When a duplicate appears, shrink from the left until the window is valid again.
 */

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            Set<Character> seen = new HashSet<>();
            int longest = 0;
            int left = 0;
            
            for (int right = 0; right < s.length(); right++) {
                while(seen.contains(s.charAt(right))) {
                    seen.remove(s.charAt(left++));
                }
                seen.add(s.charAt(right));
                longest = Math.max(longest, seen.size());
            }
            return longest;

            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // Set<Character> window = new HashSet<>();
            // int left = 0;
            // int best = 0;
            // for (int right = 0; right < s.length(); right++) {
            //     while (window.contains(s.charAt(right))) {
            //         window.remove(s.charAt(left++));
            //     }
            //     window.add(s.charAt(right));
            //     best = Math.max(best, right - left + 1);
            // }
            // return best;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.lengthOfLongestSubstring("abcabcbb") == 3;
        assert sol.lengthOfLongestSubstring("bbbbb") == 1;
        assert sol.lengthOfLongestSubstring("pwwkew") == 3;
        System.out.println("All test cases passed!");
    }
}
