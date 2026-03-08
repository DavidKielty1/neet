/**
 * Medium Version: Longest Substring with At Most Two Distinct Characters
 * Difficulty: Medium
 * Pattern: Sliding Window
 *
 * Given a string s, return the length of the longest substring
 * that contains at most two distinct characters.
 *
 * Example 1:
 * Input: s = "eceba"
 * Output: 3
 * Explanation: The substring is "ece" with length 3.
 *
 * Example 2:
 * Input: s = "ccaabbb"
 * Output: 5
 * Explanation: The substring is "aabbb" with length 5.
 *
 * Time: O(n), Space: O(1) - at most 2 characters in map
 */
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharactersMedium {

    /**
     * Sliding window with hash map for character counts.
     * Time: O(n), Space: O(1) since at most 2 distinct characters are kept.
     */
    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s == null || s.isBlank()) {
            return 0;
        }
        if (s.length() < 2) {
            return s.length();
        }

        Map<Character, Integer> charCount = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);

            while (charCount.size() > 2) {
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "eceba";
        System.out.println("Longest Two Distinct: " + lengthOfLongestSubstringTwoDistinct(s1)); // 3

        String s2 = "ccaabbb";
        System.out.println("Longest Two Distinct: " + lengthOfLongestSubstringTwoDistinct(s2)); // 5
    }
}

