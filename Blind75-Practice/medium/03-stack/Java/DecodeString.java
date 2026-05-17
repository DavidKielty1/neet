/*
 * 394. Decode String
 * Difficulty: Medium
 * Pattern: Stack
 *
 * Problem:
 * Given an encoded string, return its decoded version.
 *
 * The encoding rule is: `k[encoded_string]`, where the `encoded_string` inside the square
 * brackets is repeated exactly `k` times. `k` is guaranteed to be a positive integer.
 *
 * You may assume that the input is always valid:
 * - no extra white spaces
 * - square brackets are well-formed
 * - digits are only used for repeat counts
 *
 * Example 1:
 * Input: s = "3[a]2[bc]"
 * Output: "aaabcbc"
 *
 * Example 2:
 * Input: s = "3[a2[c]]"
 * Output: "accaccacc"
 *
 * Example 3:
 * Input: s = "2[abc]3[cd]ef"
 * Output: "abcabccdcdcdef"
 *
 * Constraints:
 * - 1 <= s.length <= 30
 * - s consists of lowercase English letters, digits, and square brackets
 * - 1 <= repeat count <= 300
 *
 * Notes:
 * - Push the current string and repeat count when you see `[`.
 * - When you see `]`, pop the previous context and expand the current chunk.
 */

public class DecodeString {
    static class Solution {
        public String decodeString(String s) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // Deque<Integer> countStack = new ArrayDeque<>();
            // Deque<StringBuilder> stringStack = new ArrayDeque<>();
            // StringBuilder current = new StringBuilder();
            // int count = 0;
            //
            // for (char ch : s.toCharArray()) {
            //     if (Character.isDigit(ch)) {
            //         count = count * 10 + (ch - '0');
            //     } else if (ch == '[') {
            //         countStack.push(count);
            //         stringStack.push(current);
            //         count = 0;
            //         current = new StringBuilder();
            //     } else if (ch == ']') {
            //         int repeat = countStack.pop();
            //         StringBuilder previous = stringStack.pop();
            //         for (int i = 0; i < repeat; i++) {
            //             previous.append(current);
            //         }
            //         current = previous;
            //     } else {
            //         current.append(ch);
            //     }
            // }
            // return current.toString();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.decodeString("3[a]2[bc]").equals("aaabcbc");
        assert sol.decodeString("3[a2[c]]").equals("accaccacc");
        assert sol.decodeString("2[abc]3[cd]ef").equals("abcabccdcdcdef");
        System.out.println("All test cases passed!");
    }
}
