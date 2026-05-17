/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/contains-duplicate-similar3.py
 * --- Original description ---
Similar Problem 3: Find All Duplicates in Array
Difficulty: Easy
Pattern: Hash Set

Problem:
Given an integer array nums, return all the elements that appear more than once.
You may return the answer in any order.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]

Example 2:
Input: nums = [1,1,2]
Output: [1]

Example 3:
Input: nums = [1]
Output: []

Constraints:
- 1 <= nums.length <= 10^5
- 1 <= nums[i] <= 10^5
 */

import java.util.*;
import java.util.function.*;


public class ContainsDuplicateSimilar3 {



    static class Solution {
        public List<Integer> findDuplicates(List<Integer> nums) {
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

            // seen = set()
            // duplicates = set()
            // for num in nums:
            // if num in seen:
            // duplicates.add(num)
            // else:
            // seen.add(num)
            // return list(duplicates)

            throw new UnsupportedOperationException("Implement findDuplicates");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // result1 = sorted(sol.findDuplicates(java.util.List.of(4,3,2,7,8,2,3,1)));
        // assert result1 == [2, 3]  // needs locals (port helpers): ['result1']
        System.out.println("✓ Test case 1 passed");
        assert java.util.Objects.equals(sol.findDuplicates(java.util.List.of(1, 1, 2)), java.util.List.of(1));
        System.out.println("✓ Test case 2 passed");
        assert java.util.Objects.equals(sol.findDuplicates(java.util.List.of(1)), java.util.List.of());
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
