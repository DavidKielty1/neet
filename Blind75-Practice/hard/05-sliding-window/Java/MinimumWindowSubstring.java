/*
 * 76. Minimum Window Substring
 * Difficulty: Hard
 * Pattern: Sliding window
 *
 * Problem:
 * Given two strings s and t of lengths m and n respectively, return the minimum
 * window substring of s such that every character in t, including duplicates,
 * is included in the window. If there is no such substring, return the empty
 * string "".
 *
 * The test cases are generated so that the answer is unique.
 *
 * Example 1:
 * Input: s = "ADOBECODEBANC", t = "ABC"
 * Output: "BANC"
 * Explanation: The minimum window substring "BANC" includes A, B, and C.
 *
 * Example 2:
 * Input: s = "a", t = "a"
 * Output: "a"
 *
 * Example 3:
 * Input: s = "a", t = "aa"
 * Output: ""
 *
 * Constraints:
 * - m == s.length
 * - n == t.length
 * - 1 <= m, n <= 10^5
 * - s and t consist of uppercase and lowercase English letters
 */
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //

    // int[] need = new int[128];
    // for (char c : t.toCharArray()) {
    //     need[c]++;
    // }
    //
    // int missing = t.length();
    // int left = 0;
    // int bestStart = 0;
    // int bestLength = Integer.MAX_VALUE;
    //
    // for (int right = 0; right < s.length(); right++) {
    //     char added = s.charAt(right);
    //     if (need[added] > 0) {
    //         missing--;
    //     }
    //     need[added]--;
    //
    //     while (missing == 0) {
    //         int currentLength = right - left + 1;
    //         if (currentLength < bestLength) {
    //             bestLength = currentLength;
    //             bestStart = left;
    //         }
    //
    //         char removed = s.charAt(left++);
    //         need[removed]++;
    //         if (need[removed] > 0) {
    //             missing++;
    //         }
    //     }
    // }
    //
    // return bestLength == Integer.MAX_VALUE
    //         ? ""
    //         : s.substring(bestStart, bestStart + bestLength);
        throw new UnsupportedOperationException("Implement minWindow");
    }
    

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement minWindow and add checks.");
    }
}
