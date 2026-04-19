/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/two-sum-similar1.py
 * --- Original description ---
Similar Problem 1: Two Sum II - Input Array is Sorted
Difficulty: Easy
Pattern: Two Pointers (can also use hash map)

Problem:
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
find two numbers such that they add up to a specific target number.

Return the indices of the two numbers (1-indexed).

Example 1:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2.

Example 2:
Input: numbers = [2,3,4], target = 6
Output: [1,3]

Example 3:
Input: numbers = [-1,0], target = -1
Output: [1,2]

Constraints:
- 2 <= numbers.length <= 3 * 10^4
- -1000 <= numbers[i] <= 1000
- numbers is sorted in non-decreasing order
- -1000 <= target <= 1000
 */

import java.util.*;
import java.util.function.*;


public class TwoSumSimilar1Java {



    static class Solution {
        public List<Integer> twoSum(List<Integer> numbers, int target) {
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

            // left, right = (0, len(numbers) - 1)
            // while left < right:
            // current_sum = numbers[left] + numbers[right]
            // if current_sum == target:
            // return [left + 1, right + 1]
            // elif current_sum < target:
            // left += 1
            // else:
            // right -= 1
            // return []

            throw new UnsupportedOperationException("Implement twoSum");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert java.util.Objects.equals(sol.twoSum(java.util.List.of(2, 7, 11, 15), 9), java.util.List.of(1, 2));
        System.out.println("✓ Test case 1 passed");
        assert java.util.Objects.equals(sol.twoSum(java.util.List.of(2, 3, 4), 6), java.util.List.of(1, 3));
        System.out.println("✓ Test case 2 passed");
        assert java.util.Objects.equals(sol.twoSum(java.util.List.of(-1, 0), -1), java.util.List.of(1, 2));
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
