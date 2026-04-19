/*
 * Ported from: 09-heap/analogue-questions/Python/last-stone-weight-similar3.py
 * --- Original description ---
Similar Problem 3: Minimum Cost to Connect Sticks
Difficulty: Easy
Pattern: Heap

Problem:
You have some number of sticks with positive integer lengths. These lengths are given as an array sticks.

You can connect any two sticks of lengths x and y into one stick by paying a cost of x + y.
You must connect all the sticks until there is only one stick remaining.

Return the minimum cost of connecting all the given sticks into one stick in this way.

Example 1:
Input: sticks = [2,4,3]
Output: 14
Explanation: Connect 2+3=5 (cost 5), then 5+4=9 (cost 9), total = 14

Example 2:
Input: sticks = [1,8,3,5]
Output: 30
Explanation: Connect 1+3=4 (cost 4), 4+5=9 (cost 9), 9+8=17 (cost 17), total = 30

Constraints:
- 1 <= sticks.length <= 10^4
- 1 <= sticks[i] <= 10^4
 */

import java.util.*;
import java.util.function.*;


public class LastStoneWeightSimilar3Java {



    static class Solution {
        public int connectSticks(List<Integer> sticks) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // heapq.heapify(sticks)
            // total_cost = 0
            // while len(sticks) > 1:
            // first = heapq.heappop(sticks)
            // second = heapq.heappop(sticks)
            // cost = first + second
            // total_cost += cost
            // heapq.heappush(sticks, cost)
            // return total_cost

            throw new UnsupportedOperationException("Implement connectSticks");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.connectSticks(java.util.List.of(2, 4, 3)) == 14);
        System.out.println("✓ Test case 1 passed");
        assert (sol.connectSticks(java.util.List.of(1, 8, 3, 5)) == 30);
        System.out.println("✓ Test case 2 passed");
        assert (sol.connectSticks(java.util.List.of(1)) == 0);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
