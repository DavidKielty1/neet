/*
 * LeetCode 560. Subarray Sum Equals K
 * Difficulty: Medium
 * Pattern: Prefix sum + hash map
 *
 * Problem
 * -------
 * Given an integer array nums and an integer k, return how many contiguous,
 * non-empty subarrays have sum exactly k.
 *
 * Elements may be negative, so a sliding window on positive-only sums does not
 * apply; count every valid subarray, including overlapping ones.
 *
 * Example 1
 * ---------
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 * Explanation: The two length-2 windows [1,1] at indices 0–1 and 1–2 each sum to 2.
 *
 * Example 2
 * ---------
 * Input: nums = [1,2,3], k = 3
 * Output: 2
 * Explanation: [1,2] and the single element [3] are the only subarrays that sum to 3.
 *
 * Example 3
 * ---------
 * Input: nums = [1,-1,0], k = 0
 * Output: 3
 * Explanation: [1,-1], [0], and [1,-1,0] sum to 0
 *
 * Constraints
 * -----------
 * - 1 <= nums.length <= 20000
 * - -1000 <= nums[i] <= 1000
 * - -10000000 <= k <= 10000000
 *
 * How to think about it
 * ---------------------
 * If prefix[j] - prefix[i] = k, then nums[i+1..j] sums to k. While scanning, track how
 * many earlier prefix sums equal (current prefix - k); a hash map gives O(1) lookups.
 *
 * Time: O(n), Space: O(n)
 */

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // int ans = 0;
        // int prefix = 0;
        // Map<Integer, Integer> count = new HashMap<>();

        // count.put(0, 1);
        // for (int x : nums) {
        //     prefix += x;
        //     ans += count.getOrDefault(prefix - k, 0);
        //     count.merge(prefix, 1, Integer::sum);
        // }
        // return ans;
        
    }
}
