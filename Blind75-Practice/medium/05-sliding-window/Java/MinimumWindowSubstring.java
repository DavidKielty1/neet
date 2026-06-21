/*
 * 438. Find All Anagrams in a String
 * Difficulty: Medium
 * Pattern: Sliding Window
 *
 * Problem:
 * Given two strings `s` and `p`, return an array of all the start indices of `p`'s
 * anagrams in `s`. You may return the answer in any order.
 *
 * Example 1:
 * Input: s = "cbaebabacd", p = "abc"
 * Output: [0,6]
 *
 * Example 2:
 * Input: s = "abab", p = "ab"
 * Output: [0,1,2]
 *
 * Constraints:
 * - 1 <= s.length, p.length <= 3 * 10^4
 * - s and p consist of lowercase English letters
 *
 */

import java.util.List;

public class MinimumWindowSubstring {
    static class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // List<Integer> result = new ArrayList<>();
            // if (p.length() > s.length()) {
            //     return result;
            // }
            // int[] need = new int[26];
            // int[] window = new int[26];
            // for (int i = 0; i < p.length(); i++) {
            //     need[p.charAt(i) - 'a']++;
            // }
            // int left = 0;
            // for (int right = 0; right < s.length(); right++) {
            //     window[s.charAt(right) - 'a']++;
            //     if (right - left + 1 > p.length()) {
            //         window[s.charAt(left) - 'a']--;
            //         left++;
            //     }
            //     if (right - left + 1 == p.length() && Arrays.equals(window, need)) {
            //         result.add(left);
            //     }
            // }
            // return result;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.findAnagrams("cbaebabacd", "abc").size() == 2;
        assert sol.findAnagrams("abab", "ab").size() == 3;
        System.out.println("All test cases passed!");
    }
}
