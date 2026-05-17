/*
 * Ported from: 09-heap/analogue-questions/Python/kth-largest-element-stream-similar1.py
 * --- Original description ---
Similar Problem 1: Kth Largest Element in Array (One-time Query)
Difficulty: Easy
Pattern: Heap

Problem:
Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.

Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4

Constraints:
- 1 <= k <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4
 */

import java.util.*;
import java.util.function.*;


public class KthLargestElementStreamSimilar1 {



    static class Solution {
        public int findKthLargest(List<Integer> nums, int k) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // heap = []
            // for num in nums:
            // heapq.heappush(heap, num)
            // if len(heap) > k:
            // heapq.heappop(heap)
            // return heap[0]

            throw new UnsupportedOperationException("Implement findKthLargest");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.findKthLargest(java.util.List.of(3, 2, 1, 5, 6, 4), 2) == 5);
        System.out.println("✓ Test case 1 passed");
        assert (sol.findKthLargest(java.util.List.of(3, 2, 3, 1, 2, 4, 5, 5, 6), 4) == 4);
        System.out.println("✓ Test case 2 passed");
        assert (sol.findKthLargest(java.util.List.of(1), 1) == 1);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
