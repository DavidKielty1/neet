/*
 * Ported from: 10-dynamic-programming/analogue-questions/Python/min-cost-climbing-stairs-similar2.py
 * --- Original description ---
Similar Problem 2: Delete and Earn
Difficulty: Easy
Pattern: Dynamic Programming

Problem:
You are given an integer array nums. You want to maximize the number of points you get by performing operations.

In one operation, you can:
- Pick any nums[i] and delete it to earn nums[i] points
- Delete all elements equal to nums[i] - 1 and nums[i] + 1

Return the maximum number of points you can earn.

Example 1:
Input: nums = [3,4,2]
Output: 6
Explanation: Delete 4 (earn 4), delete 2 (earn 2), cannot delete 3, total = 6
Or: Delete 3 twice to earn 6 points

Example 2:
Input: nums = [2,2,3,3,3,4]
Output: 9
Explanation: Delete all 3's to earn 9 points

Constraints:
- 1 <= nums.length <= 2 * 10^4
- 1 <= nums[i] <= 10^4
 */

import java.util.*;
import java.util.function.*;


public class MinCostClimbingStairsSimilar2Java {



    static class Solution {
        public int deleteAndEarn(List<Integer> nums) {
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
            // points = Counter(nums)
            // max_num = max(nums)
            // total_points = [0] * (max_num + 1)
            // for num, freq in points.items():
            // total_points[num] = num * freq
            // if max_num == 0:
            // return 0
            // if max_num == 1:
            // return total_points[1]
            // prev2, prev1 = (total_points[0], max(total_points[0], total_points[1]))
            // for i in range(2, max_num + 1):
            // current = max(prev1, prev2 + total_points[i])
            // prev2 = prev1
            // prev1 = current
            // return prev1

            throw new UnsupportedOperationException("Implement deleteAndEarn");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.deleteAndEarn(java.util.List.of(3, 4, 2)) == 6);
        System.out.println("✓ Test case 1 passed");
        assert (sol.deleteAndEarn(java.util.List.of(2, 2, 3, 3, 3, 4)) == 9);
        System.out.println("✓ Test case 2 passed");
        assert (sol.deleteAndEarn(java.util.List.of(1, 1, 1)) == 3);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
