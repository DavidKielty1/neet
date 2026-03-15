
/**
 * Medium Version: Longest Substring with At Most K Distinct Characters
 * Difficulty: Medium
 * Pattern: Sliding Window
 *
 * Given a string s and an integer k, return the length of the longest substring
 * that contains at most k distinct characters.
 *
 * Example 1 (k=2):
 * Input: s = "eceba", k = 2
 * Output: 3
 * Explanation: The substring is "ece" with length 3.
 *
 * Example 2 (k=2):
 * Input: s = "ccaabbb", k = 2
 * Output: 5
 * Explanation: The substring is "aabbb" with length 5.
 *
 * Example 3 (k=3):
 * Input: s = "eceba", k = 3
 * Output: 4
 * Explanation: The substring is "eceb" or "ceba" with length 4.
 *
 * Time: O(n), Space: O(k) - at most k characters in map
 */
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharactersMedium {

    /**
     * Sliding window with hash map for character counts.
     * Time: O(n), Space: O(k) since at most k distinct characters are kept.
     */
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (s == null || s.isBlank() || k <= 0) {
            return 0;
        }
        if (s.length() <= k) {
            return s.length();
        }

        Map<Character, Integer> charCount = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);

            while (charCount.size() > k) {
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
        System.out.println("k=2: " + lengthOfLongestSubstringKDistinct(s1, 2)); // 3
        System.out.println("k=3: " + lengthOfLongestSubstringKDistinct(s1, 3)); // 4

        String s2 = "ccaabbb";
        System.out.println("k=2: " + lengthOfLongestSubstringKDistinct(s2, 2)); // 5
        System.out.println("k=3: " + lengthOfLongestSubstringKDistinct(s2, 3)); // 7
    }
}
