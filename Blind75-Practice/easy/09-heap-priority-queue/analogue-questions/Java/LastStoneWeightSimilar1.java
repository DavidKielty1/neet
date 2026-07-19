/*
 * Ported from: 09-heap/analogue-questions/Python/last-stone-weight-similar1.py
 * --- Original description ---
Similar Problem 1: Last Stone Weight II (Simplified)
Difficulty: Easy
Pattern: Heap

Problem:
You are given an array of integers stones where stones[i] is the weight of the ith stone.
We are playing a game with the stones. On each turn, we choose any two stones and smash them together.
If the stones have different weights x and y with x <= y, the result is a stone of weight y - x.

Return the smallest possible weight of the left stone. If there are no stones left, return 0.

Example 1:
Input: stones = [2,7,4,1,8,1]
Output: 1
Explanation: Combine stones repeatedly until one remains

Example 2:
Input: stones = [31,26,33,21,40]
Output: 5

Constraints:
- 1 <= stones.length <= 30
- 1 <= stones[i] <= 100
 */

import java.util.*;
import java.util.function.*;


public class LastStoneWeightSimilar1 {
    public int lastStoneWeightII(List<Integer> stones) {
    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //

    // heap = [-stone for stone in stones]
    // heapq.heapify(heap)
    // while len(heap) > 1:
    // first = -heapq.heappop(heap)
    // second = -heapq.heappop(heap)
    // if first != second:
    // heapq.heappush(heap, -(first - second))
    // return -heap[0] if heap else 0

        throw new UnsupportedOperationException("Implement lastStoneWeightII");
    }

    

    public static void main(String[] args) {
        LastStoneWeightSimilar1 sol = new LastStoneWeightSimilar1();
        assert (sol.lastStoneWeightII(java.util.List.of(2, 7, 4, 1, 8, 1)) == 1);
        System.out.println("✓ Test case 1 passed");
        assert (sol.lastStoneWeightII(java.util.List.of(31, 26, 33, 21, 40)) == 5);
        System.out.println("✓ Test case 2 passed");
        assert (sol.lastStoneWeightII(java.util.List.of(1, 1)) == 0);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
