/*
560. Subarray Sum Equals K
Difficulty: Medium
Pattern: Arrays & Hashing

Problem:
Given an integer array nums and an integer k, return the total number of subarrays
whose sum equals k. A subarray is a contiguous non-empty sequence of elements within the array.

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2
Explanation: Subarrays with sum 2 are [1,1] (indices 0–1) and [1,1] (indices 1–2).

Example 2:
Input: nums = [1,2,3], k = 3
Output: 2
Explanation: [3] and [1,2] each sum to 3.

Example 3:
Input: nums = [3,4,7,2,-3,1,4,2], k = 7
Output: 4

Constraints:
- 1 <= nums.length <= 2 * 10^4
- -1000 <= nums[i] <= 1000
- -10^7 <= k <= 10^7
*/

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsKJava {

    static class Solution {
        public int subarraySum(int[] nums, int k) {
            int res = 0;
            int curSum = 0;
            Map<Integer, Integer> prefixSums = new HashMap<>();
            prefixSums.put(0, 1);

            for (int num : nums) {
                curSum += num;
                int diff = curSum - k;

                res += prefixSums.getOrDefault(diff, 0);
                prefixSums.put(curSum, 1 + prefixSums.getOrDefault(curSum, 0));
            }

            return res;

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // from collections import defaultdict
            // count = defaultdict(int)
            // count[0] = 1
            // total = 0
            // ans = 0
            // for x in nums:
            //     total += x
            //     ans += count[total - k]
            //     count[total] += 1
            // return ans

            int ans = 0;
            int prefix = 0;
            Map<Integer, Integer> count = new HashMap<>();
            count.put(0, 1);
            for (int x : nums) {
                prefix += x;
                ans += count.getOrDefault(prefix - k, 0);
                count.merge(prefix, 1, Integer::sum);
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.subarraySum(new int[] {1, 1, 1}, 2) == 2);
        System.out.println("✓ Test case 1 passed");
        assert (sol.subarraySum(new int[] {1, 2, 3}, 3) == 2);
        System.out.println("✓ Test case 2 passed");
        assert (sol.subarraySum(new int[] {3, 4, 7, 2, -3, 1, 4, 2}, 7) == 4);
        System.out.println("✓ Test case 3 passed");
        assert (sol.subarraySum(new int[] {1}, 0) == 0);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
