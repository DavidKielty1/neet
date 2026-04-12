/*
 * Ported from: 10-dynamic-programming/analogue-questions/Python/min-cost-climbing-stairs-similar1.py
 * --- Original description ---
Similar Problem 1: House Robber (Simplified)
Difficulty: Easy
Pattern: Dynamic Programming

Problem:
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money.
Adjacent houses have security systems connected, so you cannot rob two adjacent houses.

Given an integer array nums representing the amount of money at each house,
return the maximum amount of money you can rob without alerting the police.

Example 1:
Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and house 3 (money = 3), total = 4

Example 2:
Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1, 3, and 5: 2 + 9 + 1 = 12

Constraints:
- 1 <= nums.length <= 100
- 0 <= nums[i] <= 400
 */

import java.util.*;
import java.util.function.*;


public class MinCostClimbingStairsSimilar1Java {



    static class Solution {
        public int rob(List<Integer> nums) {
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

            // if not nums:
            // return 0
            // if len(nums) == 1:
            // return nums[0]
            // prev2, prev1 = (0, nums[0])
            // for i in range(1, len(nums)):
            // rob_current = nums[i] + prev2
            // skip_current = prev1
            // current = max(rob_current, skip_current)
            // prev2 = prev1
            // prev1 = current
            // return prev1

            throw new UnsupportedOperationException("Implement rob");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.rob(java.util.List.of(1, 2, 3, 1)) == 4);
        System.out.println("✓ Test case 1 passed");
        assert (sol.rob(java.util.List.of(2, 7, 9, 3, 1)) == 12);
        System.out.println("✓ Test case 2 passed");
        assert (sol.rob(java.util.List.of(5)) == 5);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
