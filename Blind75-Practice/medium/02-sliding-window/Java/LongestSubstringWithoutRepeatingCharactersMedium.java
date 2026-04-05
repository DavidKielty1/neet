/**
 * Medium Version: Longest Substring with At Most K Distinct Characters
 * Difficulty: Medium
 * Pattern: Sliding Window
 *
 * Example 1:
 * Input: s = "eceba", k = 2
 * Output: 3
 * Hint: Longest substring with at most 2 distinct chars is "ece" — expand right, shrink when >k keys.
 *
 * Example 2:
 * Input: s = "ccaabbb", k = 2
 * Output: 5
 * Hint: "aabbb" uses only a and b; window size vs distinct count drives the shrink.
 *
 * Time: O(n), Space: O(k)
 */
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharactersMedium {

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

    

        // if (s == null || s.isBlank() || k <= 0) {
        //     return 0;
        // }
        // if (s.length() <= k) {
        //     return s.length();
        // }
        // Map<Character, Integer> charCount = new HashMap<>();
        // int left = 0;
        // int maxLength = 0;
        // for (int right = 0; right < s.length(); right++) {
        //     char c = s.charAt(right);
        //     charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        //     while (charCount.size() > k) {
        //         char leftChar = s.charAt(left);
        //         charCount.put(leftChar, charCount.get(leftChar) - 1);
        //         if (charCount.get(leftChar) == 0) {
        //             charCount.remove(leftChar);
        //         }
        //         left++;
        //     }
        //     maxLength = Math.max(maxLength, right - left + 1);
        // }
        // return maxLength;

        throw new UnsupportedOperationException("Implement lengthOfLongestSubstringKDistinct");
    }

    public static void main(String[] args) {
        String s1 = "eceba";
        System.out.println("k=2: " + lengthOfLongestSubstringKDistinct(s1, 2));
        System.out.println("k=3: " + lengthOfLongestSubstringKDistinct(s1, 3));

        String s2 = "ccaabbb";
        System.out.println("k=2: " + lengthOfLongestSubstringKDistinct(s2, 2));
        System.out.println("k=3: " + lengthOfLongestSubstringKDistinct(s2, 3));
    }
}
