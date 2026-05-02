/*
 * 1405. Longest Happy String
 * Difficulty: Medium
 * Pattern: Greedy / Heap
 *
 * Problem:
 * A string `s` is called happy if it satisfies all of the following:
 * - `s` only contains the letters `'a'`, `'b'`, and `'c'`.
 * - `s` does not contain any of `"aaa"`, `"bbb"`, or `"ccc"` as a substring.
 * - `s` contains at most `a` occurrences of `'a'`, at most `b` occurrences of
 *   `'b'`, and at most `c` occurrences of `'c'`.
 *
 * Given three integers `a`, `b`, and `c`, return the longest possible happy
 * string. If there are multiple longest happy strings, return any of them. If
 * there is no such string, return the empty string.
 *
 * Example 1:
 * Input: a = 1, b = 1, c = 7
 * Output: "ccaccbcc"
 * Explanation:
 * The result uses at most one `'a'`, one `'b'`, and seven `'c'` characters, and
 * it never contains three equal letters in a row.
 *
 * Example 2:
 * Input: a = 7, b = 1, c = 0
 * Output: "aabaa"
 *
 * Example 3:
 * Input: a = 0, b = 0, c = 0
 * Output: ""
 *
 * Constraints:
 * - 0 <= a, b, c <= 100
 *
 * Notes:
 * - Greedily pick the character with the largest remaining count unless it would
 *   create three in a row.
 * - A max-heap makes the "pick the best remaining letter" logic straightforward.
 */
public class LongestHappyStringJava {
    static class Solution {
        public String longestDiverseString(int a, int b, int c) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // java.util.PriorityQueue<int[]> maxHeap = new java.util.PriorityQueue<>(
            //         (x, y) -> Integer.compare(y[1], x[1]));
            // if (a > 0) {
            //     maxHeap.offer(new int[] {'a', a});
            // }
            // if (b > 0) {
            //     maxHeap.offer(new int[] {'b', b});
            // }
            // if (c > 0) {
            //     maxHeap.offer(new int[] {'c', c});
            // }
            //
            // StringBuilder result = new StringBuilder();
            // while (!maxHeap.isEmpty()) {
            //     int[] first = maxHeap.poll();
            //     int length = result.length();
            //     if (length >= 2
            //             && result.charAt(length - 1) == first[0]
            //             && result.charAt(length - 2) == first[0]) {
            //         if (maxHeap.isEmpty()) {
            //             break;
            //         }
            //         int[] second = maxHeap.poll();
            //         result.append((char) second[0]);
            //         second[1]--;
            //         if (second[1] > 0) {
            //             maxHeap.offer(second);
            //         }
            //         maxHeap.offer(first);
            //     } else {
            //         result.append((char) first[0]);
            //         first[1]--;
            //         if (first[1] > 0) {
            //             maxHeap.offer(first);
            //         }
            //     }
            // }
            // return result.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println("LongestHappyStringJava practice stub ready.");
    }
}
