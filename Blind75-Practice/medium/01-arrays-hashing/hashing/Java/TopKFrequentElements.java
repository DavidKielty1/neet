/*
 * 347. Top K Frequent Elements
 * Difficulty: Medium
 * Pattern: Arrays & Hashing / Bucket Sort
 *
 * Problem:
 * Given an integer array `nums` and an integer `k`, return the `k` most frequent
 * elements. You may return the answer in any order.
 *
 * Example 1:
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 *
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 * - k is in the range [1, number of unique elements in the array]
 * - It is guaranteed that the answer is unique
 *
 * Follow-up:
 * Your algorithm's time complexity must be better than O(n log n), where n is the
 * array size.
 */

import java.util.Arrays;

public class TopKFrequentElements {
    static class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // Map<Integer, Integer> counts = new HashMap<>();
            // for (int num : nums) {
            //     counts.put(num, counts.getOrDefault(num, 0) + 1);
            // }
            //
            // @SuppressWarnings("unchecked")
            // List<Integer>[] buckets = new List[nums.length + 1];
            // for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            //     int frequency = entry.getValue();
            //     if (buckets[frequency] == null) {
            //         buckets[frequency] = new ArrayList<>();
            //     }
            //     buckets[frequency].add(entry.getKey());
            // }
            //
            // int[] result = new int[k];
            // int index = 0;
            // for (int frequency = buckets.length - 1; frequency >= 0 && index < k; frequency--) {
            //     if (buckets[frequency] == null) {
            //         continue;
            //     }
            //     for (int num : buckets[frequency]) {
            //         result[index++] = num;
            //         if (index == k) {
            //             break;
            //         }
            //     }
            // }
            // return result;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] a = sol.topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2);
        Arrays.sort(a);
        assert Arrays.equals(a, new int[] {1, 2});
        assert Arrays.equals(sol.topKFrequent(new int[] {1}, 1), new int[] {1});
        System.out.println("All test cases passed!");
    }
}
