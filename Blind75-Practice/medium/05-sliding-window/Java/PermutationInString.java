/*
 * 567. Permutation in String
 * Difficulty: Medium
 * Pattern: Sliding Window
 *
 * Problem:
 * Given two strings `s1` and `s2`, return `true` if `s2` contains a permutation of `s1`,
 * or `false` otherwise.
 *
 * In other words, return `true` if one of `s1`'s permutations is a substring of `s2`.
 *
 * Example 1:
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 *
 * Example 2:
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 *
 * Constraints:
 * - 1 <= s1.length, s2.length <= 10^4
 * - s1 and s2 consist of lowercase English letters
 *
 * Notes:
 * - Use a fixed-size window of length `s1.length()`.
 * - Compare character counts or maintain a running match condition.
 */

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int[] need = new int[26];
        int required = 0;
        for (char ch : s1.toCharArray()) {
            int idx = ch - 'a';
            if (need[idx]++ == 0) {
                required++;
            }
        }

        int[] window = new int[26];
        int matched = 0;
        int left = 0;

        for (int right = 0; right < s2.length(); right++) {
            int r = s2.charAt(right) - 'a';
            window[r]++;
            if (need[r] > 0 && window[r] == need[r]) {
                matched++;
            }

            if (right - left + 1 > s1.length()) {
                int l = s2.charAt(left) - 'a';
                if (need[l] > 0 && window[l] == need[l]) {
                    matched--;
                }
                window[l]--;
                left++;
            }

            if (required == matched) {
                return true;
            }
        }

        return false;
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //

    // if (s1.length() > s2.length()) {
    //     return false;
    // }
    // int[] need = new int[26];
    // int[] window = new int[26];
    // for (int i = 0; i < s1.length(); i++) {
    //     need[s1.charAt(i) - 'a']++;
    // }
    // int left = 0;
    // for (int right = 0; right < s2.length(); right++) {
    //     window[s2.charAt(right) - 'a']++;
    //     if (right - left + 1 > s1.length()) {
    //         window[s2.charAt(left) - 'a']--;
    //         left++;
    //     }
    //     if (right - left + 1 == s1.length() && Arrays.equals(window, need)) {
    //         return true;
    //     }
    // }
    // return false;
    }
    

    public static void main(String[] args) {
        PermutationInString sol = new PermutationInString();
        assert sol.checkInclusion("ab", "eidbaooo");
        assert !sol.checkInclusion("ab", "eidboaoo");
        System.out.println("All test cases passed!");
    }
}
