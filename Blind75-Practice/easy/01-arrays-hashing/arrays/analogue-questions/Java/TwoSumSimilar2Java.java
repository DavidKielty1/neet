/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/two-sum-similar2.py
 * --- Original description ---
Similar Problem 2: Two Sum - Count Pairs
Difficulty: Easy
Pattern: Hash Map

Problem:
Given an array of integers nums and an integer target, return the number of
pairs of indices (i, j) where i < j and nums[i] + nums[j] == target.

Example 1:
Input: nums = [1,2,3,2,1], target = 3
Output: 2
Explanation: Pairs are (0,1) and (2,4): nums[0]+nums[1]=1+2=3, nums[2]+nums[4]=3+0=3

Example 2:
Input: nums = [1,1,1,1], target = 2
Output: 6
Explanation: All pairs sum to 2

Example 3:
Input: nums = [1,2,3], target = 7
Output: 0

Constraints:
- 2 <= nums.length <= 1000
- -10^9 <= nums[i] <= 10^9
- -10^9 <= target <= 10^9
 */

import java.util.*;
import java.util.function.*;


public class TwoSumSimilar2Java {



    static class Solution {
        public int twoSumCount(List<Integer> nums, int target) {
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

            // count = 0
            // seen = defaultdict(int)
            // for num in nums:
            // complement = target - num
            // count += seen[complement]
            // seen[num] += 1
            // return count

            throw new UnsupportedOperationException("Implement twoSumCount");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.twoSumCount(java.util.List.of(1, 2, 3, 2, 1), 3) == 2);
        System.out.println("✓ Test case 1 passed");
        assert (sol.twoSumCount(java.util.List.of(1, 1, 1, 1), 2) == 6);
        System.out.println("✓ Test case 2 passed");
        assert (sol.twoSumCount(java.util.List.of(1, 2, 3), 7) == 0);
        System.out.println("✓ Test case 3 passed");
        assert (sol.twoSumCount(java.util.List.of(3, 3, 3), 6) == 3);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
