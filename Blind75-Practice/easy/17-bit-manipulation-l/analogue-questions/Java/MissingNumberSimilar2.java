/*
 * Ported from: 12-bit-manipulation/analogue-questions/Python/missing-number-similar2.py
 * --- Original description ---
Similar Problem 2: First Missing Positive
Difficulty: Easy (Simplified)
Pattern: Array / Math

Problem:
Given an unsorted integer array nums, return the smallest missing positive integer.

Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: Numbers in range [1,2] are in array, so smallest missing is 3

Example 2:
Input: nums = [3,4,-1,1]
Output: 2

Example 3:
Input: nums = [7,8,9,11,12]
Output: 1

Constraints:
- 1 <= nums.length <= 10^5
- -2^31 <= nums[i] <= 2^31 - 1
 */

import java.util.*;
import java.util.function.*;


public class MissingNumberSimilar2 {
    public int firstMissingPositive(List<Integer> nums) {
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

    // num_set = set(nums)
    // i = 1
    // while True:
    // if i not in num_set:
    // return i
    // i += 1

        throw new UnsupportedOperationException("Implement firstMissingPositive");
    }

    

    public static void main(String[] args) {
        MissingNumberSimilar2 sol = new MissingNumberSimilar2();
        assert (sol.firstMissingPositive(java.util.List.of(1, 2, 0)) == 3);
        System.out.println("✓ Test case 1 passed");
        assert (sol.firstMissingPositive(java.util.List.of(3, 4, -1, 1)) == 2);
        System.out.println("✓ Test case 2 passed");
        assert (sol.firstMissingPositive(java.util.List.of(7, 8, 9, 11, 12)) == 1);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
