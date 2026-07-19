/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/two-sum-similar3.py
 * --- Original description ---
Similar Problem 3: Two Sum Less Than K
Difficulty: Easy
Pattern: Two Pointers / Sorting

Problem:
Given an array nums of integers and integer k, return the maximum sum such that
there exists i < j with nums[i] + nums[j] = sum and sum < k.
If no i, j exist satisfying this equation, return -1.

Example 1:
Input: nums = [34,23,1,24,75,33,54,8], k = 60
Output: 58
Explanation: We can use 34 and 24 to sum 58 which is less than 60.

Example 2:
Input: nums = [10,20,30], k = 15
Output: -1
Explanation: No pair sum is less than 15.

Constraints:
- 1 <= nums.length <= 100
- 1 <= nums[i] <= 1000
- 1 <= k <= 2000
 */

import java.util.*;
import java.util.function.*;


public class TwoSumSimilar3 {
    public int twoSumLessThanK(List<Integer> nums, int k) {
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

    // if len(nums) < 2:
    // return -1
    // nums.sort()
    // left, right = (0, len(nums) - 1)
    // max_sum = -1
    // while left < right:
    // current_sum = nums[left] + nums[right]
    // if current_sum < k:
    // max_sum = max(max_sum, current_sum)
    // left += 1
    // else:
    // right -= 1
    // return max_sum

        throw new UnsupportedOperationException("Implement twoSumLessThanK");
    }

    

    public static void main(String[] args) {
        TwoSumSimilar3 sol = new TwoSumSimilar3();
        assert (sol.twoSumLessThanK(java.util.List.of(34, 23, 1, 24, 75, 33, 54, 8), 60) == 58);
        System.out.println("✓ Test case 1 passed");
        assert (sol.twoSumLessThanK(java.util.List.of(10, 20, 30), 15) == -1);
        System.out.println("✓ Test case 2 passed");
        assert (sol.twoSumLessThanK(java.util.List.of(1, 2, 3, 4), 6) == 5);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
