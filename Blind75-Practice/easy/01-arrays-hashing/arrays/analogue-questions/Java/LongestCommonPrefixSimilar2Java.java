/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/longest-common-prefix-similar2.py
 * --- Original description ---
LeetCode 1540: Can Convert String in K Moves
Difficulty: Medium (simplified to Easy)
Pattern: Arrays & Hashing

Problem:
Given two strings s and t, your goal is to convert s into t in k moves or less.

During the ith (1 <= i <= k) move you can:
- Choose any index j (1-indexed) from s, such that 1 <= j <= s.length and s[j] != t[j] (1-indexed).
- Shift s[j] by one of the operations: shift forward or shift backward.
  Forward: s[j] = (s[j] + 1) % 26, backward: s[j] = (s[j] - 1) % 26.

Here shift forward means 'a' -> 'b', 'b' -> 'c', ..., 'z' -> 'a'.
And shift backward means 'a' -> 'z', 'b' -> 'a', ..., 'z' -> 'y'.

Return true if it's possible to convert s to t in k moves, otherwise return false.

Example 1:
Input: s = "input", t = "ouput", k = 9
Output: true
Explanation: In the 6th move, we shift 'i' 6 times to get 'o'. And in the 7th move we shift 'n' to get 'u'.

Example 2:
Input: s = "abc", t = "bcd", k = 10
Output: false
Explanation: We need to shift each character in s one time to convert it into t.
We can shift 'a' to 'b' during the 1st move. However, there is no way to shift the other
characters in the remaining moves to get t from s.

Example 3:
Input: s = "aab", t = "bbb", k = 27
Output: true

Constraints:
- 1 <= s.length, t.length <= 10^5
- 0 <= k <= 10^9
- s, t contain only lowercase English letters

Time Complexity: O(n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class LongestCommonPrefixSimilar2Java {



    static class Solution {
        public boolean canConvertString(String s, String t, int k) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // if len(s) != len(t):
            // return False
            // shift_count = Counter()
            // for i in range(len(s)):
            // if s[i] != t[i]:
            // shift = (ord(t[i]) - ord(s[i])) % 26
            // shift_count[shift] += 1
            // for shift, count in shift_count.items():
            // if shift + (count - 1) * 26 > k:
            // return False
            // return True

            throw new UnsupportedOperationException("Implement canConvertString");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.canConvertString("input", "ouput", 9) == true);
        System.out.println("✓ Test case 1 passed");
        assert (sol.canConvertString("abc", "bcd", 10) == false);
        System.out.println("✓ Test case 2 passed");
        assert (sol.canConvertString("aab", "bbb", 27) == true);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
