/*
 * 767. Reorganize String
 * Difficulty: Medium
 * Pattern: Heap / Greedy
 *
 * Problem:
 * Given a string `s`, rearrange the characters of `s` so that any two adjacent
 * characters are not the same.
 *
 * Return any possible rearrangement of `s` or return the empty string if such a
 * rearrangement is not possible.
 *
 * Example 1:
 * Input: s = "aab"
 * Output: "aba"
 *
 * Example 2:
 * Input: s = "aaab"
 * Output: ""
 * Explanation:
 * No arrangement can separate all three `'a'` characters.
 *
 * Example 3:
 * Input: s = "vvvlo"
 * Output: "vlvov"
 *
 * Constraints:
 * - 1 <= s.length <= 500
 * - `s` consists of lowercase English letters.
 *
 * Notes:
 * - The greedy heap approach repeatedly uses the two most frequent remaining
 *   letters.
 * - A quick impossibility check is whether the maximum count exceeds
 *   `(n + 1) / 2`.
 */
public class ReorganizeStringJava {
    static class Solution {
        public String reorganizeString(String s) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // int[] counts = new int[26];
            // int maxCount = 0;
            // for (char ch : s.toCharArray()) {
            //     counts[ch - 'a']++;
            //     maxCount = Math.max(maxCount, counts[ch - 'a']);
            // }
            // if (maxCount > (s.length() + 1) / 2) {
            //     return "";
            // }
            //
            // java.util.PriorityQueue<int[]> maxHeap = new java.util.PriorityQueue<>(
            //         (a, b) -> Integer.compare(b[1], a[1]));
            // for (int i = 0; i < 26; i++) {
            //     if (counts[i] > 0) {
            //         maxHeap.offer(new int[] {'a' + i, counts[i]});
            //     }
            // }
            //
            // StringBuilder result = new StringBuilder();
            // while (maxHeap.size() >= 2) {
            //     int[] first = maxHeap.poll();
            //     int[] second = maxHeap.poll();
            //     result.append((char) first[0]);
            //     result.append((char) second[0]);
            //     if (--first[1] > 0) {
            //         maxHeap.offer(first);
            //     }
            //     if (--second[1] > 0) {
            //         maxHeap.offer(second);
            //     }
            // }
            // if (!maxHeap.isEmpty()) {
            //     result.append((char) maxHeap.poll()[0]);
            // }
            // return result.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println("ReorganizeStringJava practice stub ready.");
    }
}
