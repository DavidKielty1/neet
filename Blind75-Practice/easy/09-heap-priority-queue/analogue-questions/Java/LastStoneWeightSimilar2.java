/*
 * Ported from: 09-heap/analogue-questions/Python/last-stone-weight-similar2.py
 * --- Original description ---
Similar Problem 2: Maximum Product After K Increments
Difficulty: Easy
Pattern: Heap

Problem:
You are given an array of non-negative integers nums and an integer k.
In one operation, you may choose any element from nums and increment it by 1.

Return the maximum product of nums after at most k operations.

Example 1:
Input: nums = [0,4], k = 5
Output: 20
Explanation: Increment first element 5 times: [5,4], product = 20

Example 2:
Input: nums = [6,3,3,2], k = 2
Output: 216
Explanation: Increment 2 to get [6,3,3,4], product = 216

Constraints:
- 1 <= nums.length <= 10^5
- 0 <= nums[i] <= 10^6
- 0 <= k <= 10^5
 */

import java.util.*;
import java.util.function.*;


public class LastStoneWeightSimilar2 {



    static class Solution {
        public int maximumProduct(List<Integer> nums, int k) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // heapq.heapify(nums)
            // for _ in range(k):
            // smallest = heapq.heappop(nums)
            // heapq.heappush(nums, smallest + 1)
            // product = 1
            // for num in nums:
            // product *= num
            // return product

            throw new UnsupportedOperationException("Implement maximumProduct");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.maximumProduct(java.util.List.of(0, 4), 5) == 20);
        System.out.println("✓ Test case 1 passed");
        assert (sol.maximumProduct(java.util.List.of(6, 3, 3, 2), 2) == 216);
        System.out.println("✓ Test case 2 passed");
        assert (sol.maximumProduct(java.util.List.of(1, 1, 1), 3) == 8);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
