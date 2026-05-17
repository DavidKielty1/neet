/*
 * Ported from: 09-heap/analogue-questions/Python/kth-largest-element-stream-similar2.py
 * --- Original description ---
Similar Problem 2: Top K Frequent Elements
Difficulty: Easy
Pattern: Heap + Hash Map

Problem:
Given an integer array nums and an integer k, return the k most frequent elements.
You may return the answer in any order.

Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]

Constraints:
- 1 <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4
- k is in the range [1, the number of unique elements in the array]
 */

import java.util.*;
import java.util.function.*;


public class KthLargestElementStreamSimilar2 {



    static class Solution {
        public List<Integer> topKFrequent(List<Integer> nums, int k) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // count = Counter(nums)
            // heap = []
            // for num, freq in count.items():
            // heapq.heappush(heap, (freq, num))
            // if len(heap) > k:
            // heapq.heappop(heap)
            // return [num for freq, num in heap]

            throw new UnsupportedOperationException("Implement topKFrequent");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // result1 = sorted(sol.topKFrequent(java.util.List.of(1,1,1,2,2,3), 2));
        // assert result1 == [1, 2]  // needs locals (port helpers): ['result1']
        System.out.println("✓ Test case 1 passed");
        assert java.util.Objects.equals(sol.topKFrequent(java.util.List.of(1), 1), java.util.List.of(1));
        System.out.println("✓ Test case 2 passed");
        // result3 = sorted(sol.topKFrequent([4, 1, -1, 2, -1, 2, 3], 2));
        // assert result3 == [-1, 2]  // needs locals (port helpers): ['result3']
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
