/*
 * Ported from: 09-heap/analogue-questions/Python/kth-largest-element-stream-similar3.py
 * --- Original description ---
Similar Problem 3: Find Kth Smallest Element in Array
Difficulty: Easy
Pattern: Heap

Problem:
Given an integer array nums and an integer k, return the kth smallest element in the array.
Note that it is the kth smallest element in the sorted order, not the kth distinct element.

Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 2

Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 3

Constraints:
- 1 <= k <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4
 */

import java.util.*;
import java.util.function.*;


public class KthLargestElementStreamSimilar3 {
    public int findKthSmallest(List<Integer> nums, int k) {
    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

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
    // heapq.heappush(heap, -num)
    // if len(heap) > k:
    // heapq.heappop(heap)
    // return -heap[0]

        throw new UnsupportedOperationException("Implement findKthSmallest");
    }

    

    public static void main(String[] args) {
        KthLargestElementStreamSimilar3 sol = new KthLargestElementStreamSimilar3();
        assert (sol.findKthSmallest(java.util.List.of(3, 2, 1, 5, 6, 4), 2) == 2);
        System.out.println("✓ Test case 1 passed");
        assert (sol.findKthSmallest(java.util.List.of(3, 2, 3, 1, 2, 4, 5, 5, 6), 4) == 3);
        System.out.println("✓ Test case 2 passed");
        assert (sol.findKthSmallest(java.util.List.of(1), 1) == 1);
        System.out.println("✓ Test case 3 passed");
        assert (sol.findKthSmallest(java.util.List.of(7, 10, 4, 3, 20, 15), 3) == 7);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
