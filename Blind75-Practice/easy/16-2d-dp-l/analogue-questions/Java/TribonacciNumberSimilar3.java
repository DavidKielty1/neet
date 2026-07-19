/*
 * Ported from: 10-dynamic-programming/analogue-questions/Python/tribonacci-number-similar3.py
 * --- Original description ---
LeetCode 746: Min Cost Climbing Stairs
Difficulty: Easy
Pattern: Dynamic Programming

Problem:
You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.

Example 1:
Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1.
- Pay 15 and climb two steps to reach the top.
The total cost is 15.

Example 2:
Input: cost = [1,100,1,1,1,100,1,1,1,1]
Output: 6
Explanation: You will start at index 0.
- Pay 1 and climb two steps to reach index 2.
- Pay 1 and climb two steps to reach index 4.
- Pay 1 and climb two steps to reach index 6.
- Pay 1 and climb one step to reach index 7.
- Pay 1 and climb two steps to reach index 9.
- Pay 1 and climb one step to reach the top.
The total cost is 6.

Constraints:
- 2 <= cost.length <= 1000
- 0 <= cost[i] <= 999

Time Complexity: O(n)
Space Complexity: O(1)
 */

import java.util.*;
import java.util.function.*;


public class TribonacciNumberSimilar3 {
    public int minCostClimbingStairs(List<Integer> cost) {
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

    // prev2 = cost[0]
    // prev1 = cost[1]
    // for i in range(2, len(cost)):
    // current = cost[i] + min(prev1, prev2)
    // prev2 = prev1
    // prev1 = current
    // return min(prev1, prev2)

        throw new UnsupportedOperationException("Implement minCostClimbingStairs");
    }

    

    public static void main(String[] args) {
        TribonacciNumberSimilar3 sol = new TribonacciNumberSimilar3();
        assert (sol.minCostClimbingStairs(java.util.List.of(10, 15, 20)) == 15);
        System.out.println("✓ Test case 1 passed");
        assert (sol.minCostClimbingStairs(java.util.List.of(1, 100, 1, 1, 1, 100, 1, 1, 1, 1)) == 6);
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
