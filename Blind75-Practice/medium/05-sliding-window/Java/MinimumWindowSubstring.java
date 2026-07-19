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
    // int required = 0;
    // for (char ch : p.toCharArray()) {
    //     if (need[ch - 'a']++ == 0) {
    //         required++;
    //     }
    // }

    // int[] window = new int[26];
    // int matched = 0;
    // int left = 0;

    // for (int right = 0; right < s.length(); right++) {
    //     int r = s.charAt(right) - 'a';
    //     window[r]++;
    //     if (need[r] > 0 && window[r] == need[r]) {
    //         matched++;
    //     }

    //     if (right - left + 1 > p.length()) {
    //         int l = s.charAt(left) - 'a';
    //         if (need[l] > 0 && window[l] == need[l]) {
    //             matched--;
    //         }
    //         window[l]--;
    //         left++;
    //     }

    //     if(matched == required) {
    //         result.add(left);
    //     }
    // }

    // return result;
    }
    

    public static void main(String[] args) {
        MinimumWindowSubstring sol = new MinimumWindowSubstring();
        assert sol.findAnagrams("cbaebabacd", "abc").size() == 2;
        assert sol.findAnagrams("abab", "ab").size() == 3;
        System.out.println("All test cases passed!");
    }
}
