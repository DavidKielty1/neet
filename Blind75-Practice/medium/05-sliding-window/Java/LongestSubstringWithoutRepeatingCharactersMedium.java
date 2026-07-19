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
 */

public class LongestSubstringWithoutRepeatingCharactersMedium {
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

    // Map<Character, Integer> map = new HashMap<>();
    // int left = 0;
    // int longestSubstring = 0;

    // for (int right = 0; right < s.length(); right++) {
    //     char rChar = s.charAt(right);

    //     map.merge(rChar, 1, Integer::sum);

    //     while (map.size() > k) {
    //         char lChar = s.charAt(left);
    //         map.merge(lChar, -1, Integer::sum);
    //         map.remove(lChar, 0);
    //         left++;
    //     }

    //     longestSubstring = Math.max(longestSubstring, right - left + 1);
    // }

    // return longestSubstring;
    }
    

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharactersMedium sol = new LongestSubstringWithoutRepeatingCharactersMedium();
        assert sol.lengthOfLongestSubstringKDistinct("eceba", 2) == 3;
        assert sol.lengthOfLongestSubstringKDistinct("ccaabbb", 2) == 5;
        System.out.println("All test cases passed!");
    }
}
