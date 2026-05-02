/*
 * 340. Longest Substring with At Most K Distinct Characters
 * Difficulty: Medium
 * Pattern: Sliding Window
 *
 * Problem:
 * Given a string `s` and an integer `k`, return the length of the longest substring of
 * `s` that contains at most `k` distinct characters.
 *
 * Example 1:
 * Input: s = "eceba", k = 2
 * Output: 3
 *
 * Example 2:
 * Input: s = "ccaabbb", k = 2
 * Output: 5
 *
 * Constraints:
 * - 1 <= s.length <= 5 * 10^4
 * - 0 <= k <= 50
 *
 * Notes:
 * - Grow the window to the right while counting characters.
 * - Shrink from the left whenever the number of distinct characters exceeds `k`.
 */

public class LongestSubstringWithoutRepeatingCharactersMedium {
    static class Solution {
        public int lengthOfLongestSubstringKDistinct(String s, int k) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // if (k == 0) {
            //     return 0;
            // }
            // Map<Character, Integer> counts = new HashMap<>();
            // int left = 0;
            // int best = 0;
            // for (int right = 0; right < s.length(); right++) {
            //     char ch = s.charAt(right);
            //     counts.put(ch, counts.getOrDefault(ch, 0) + 1);
            //     while (counts.size() > k) {
            //         char leftChar = s.charAt(left++);
            //         counts.put(leftChar, counts.get(leftChar) - 1);
            //         if (counts.get(leftChar) == 0) {
            //             counts.remove(leftChar);
            //         }
            //     }
            //     best = Math.max(best, right - left + 1);
            // }
            // return best;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.lengthOfLongestSubstringKDistinct("eceba", 2) == 3;
        assert sol.lengthOfLongestSubstringKDistinct("ccaabbb", 2) == 5;
        System.out.println("All test cases passed!");
    }
}
