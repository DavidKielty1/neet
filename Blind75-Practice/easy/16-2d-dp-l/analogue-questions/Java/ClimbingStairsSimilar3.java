/*
 * Ported from: 10-dynamic-programming/analogue-questions/Python/climbing-stairs-similar3.py
 * --- Original description ---
Similar Problem 3: Min Cost to Reach Top (Simplified)
Difficulty: Easy
Pattern: Dynamic Programming

Problem:
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. Each step has a cost associated with it.

Given an array cost where cost[i] is the cost of step i, find the minimum cost to reach the top.
You can start from step 0 or step 1.

Example 1:
Input: n = 3, cost = [10, 15, 20]
Output: 15
Explanation: Start at step 1, pay 15, climb to top

Example 2:
Input: n = 5, cost = [1, 100, 1, 1, 1, 100]
Output: 3
Explanation: Start at 0, pay 1, step to 2, pay 1, step to 4, pay 1, step to top

Constraints:
- 2 <= n <= 1000
- 0 <= cost[i] <= 999
 */

import java.util.*;
import java.util.function.*;


public class ClimbingStairsSimilar3 {
    public int minCostToReachTop(int n, List<Integer> cost) {
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

    // if n <= 1:
    // return 0
    // cost = cost + [0]
    // prev2, prev1 = (cost[0], cost[1])
    // for i in range(2, len(cost)):
    // current = cost[i] + min(prev1, prev2)
    // prev2 = prev1
    // prev1 = current
    // return prev1

        throw new UnsupportedOperationException("Implement minCostToReachTop");
    }

    

    public static void main(String[] args) {
        ClimbingStairsSimilar3 sol = new ClimbingStairsSimilar3();
        assert (sol.minCostToReachTop(3, java.util.List.of(10, 15, 20)) == 15);
        System.out.println("✓ Test case 1 passed");
        assert (sol.minCostToReachTop(5, java.util.List.of(1, 100, 1, 1, 1, 100)) == 3);
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
