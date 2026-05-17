/*
 * LeetCode 347. Top K Frequent Elements
 *
 * Given an integer array nums and an integer k, return the k most frequent
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
 * Example 3:
 * Input: nums = [4,4,4,6,6,7], k = 2
 * Output: [4,6]
 *
 * Constraints:
 * - 1 <= nums.length <= 100000
 * - -10000 <= nums[i] <= 10000
 * - k is in the range [1, the number of unique elements in the array]
 * - It is guaranteed that the answer is unique
 */

public class TopKFrequentElements {
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
        // Count frequencies, bucket values by frequency, then collect from
        // highest frequency down.
        //
        // Map<Integer, Integer> counts = new HashMap<>();
        // for (int num : nums) {
        //     counts.put(num, counts.getOrDefault(num, 0) + 1);
        // }
        // List<List<Integer>> buckets = new ArrayList<>();
        // for (int i = 0; i <= nums.length; i++) {
        //     buckets.add(new ArrayList<>());
        // }
        // for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
        //     buckets.get(entry.getValue()).add(entry.getKey());
        // }
        // int[] result = new int[k];
        // int index = 0;
        // for (int freq = buckets.size() - 1; freq >= 0 && index < k; freq--) {
        //     for (int value : buckets.get(freq)) {
        //         result[index++] = value;
        //         if (index == k) {
        //             break;
        //         }
        //     }
        // }
        // return result;
    }

    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }
}
