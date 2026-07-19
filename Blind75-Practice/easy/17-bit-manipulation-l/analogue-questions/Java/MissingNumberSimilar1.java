/*
 * Ported from: 12-bit-manipulation/analogue-questions/Python/missing-number-similar1.py
 * --- Original description ---
Similar Problem 1: Find Missing and Duplicate
Difficulty: Easy
Pattern: Bit Manipulation / Math

Problem:
You are given an integer array nums of length n which contains numbers from 1 to n,
but one number appears twice and one number is missing.

Return an array of [duplicate, missing].

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

Example 2:
Input: nums = [1,1]
Output: [1,2]

Example 3:
Input: nums = [3,1,3]
Output: [3,2]

Constraints:
- 2 <= n <= 10^4
- 1 <= nums[i] <= n
 */

import java.util.*;
import java.util.function.*;


public class MissingNumberSimilar1 {
    public List<Integer> findErrorNums(List<Integer> nums) {
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

    // n = len(nums)
    // xor_all = 0
    // for i in range(1, n + 1):
    // xor_all ^= i
    // for num in nums:
    // xor_all ^= num
    // rightmost_bit = xor_all & -xor_all
    // num1, num2 = (0, 0)
    // for i in range(1, n + 1):
    // if i & rightmost_bit:
    // num1 ^= i
    // else:
    // num2 ^= i
    // for num in nums:
    // if num & rightmost_bit:
    // num1 ^= num
    // else:
    // num2 ^= num
    // for num in nums:
    // if num == num1:
    // return [num1, num2]
    // return [num2, num1]

        throw new UnsupportedOperationException("Implement findErrorNums");
    }

    

    public static void main(String[] args) {
        MissingNumberSimilar1 sol = new MissingNumberSimilar1();
        assert java.util.Objects.equals(sol.findErrorNums(java.util.List.of(1, 2, 2, 4)), java.util.List.of(2, 3));
        System.out.println("✓ Test case 1 passed");
        assert java.util.Objects.equals(sol.findErrorNums(java.util.List.of(1, 1)), java.util.List.of(1, 2));
        System.out.println("✓ Test case 2 passed");
        assert java.util.Objects.equals(sol.findErrorNums(java.util.List.of(3, 1, 3)), java.util.List.of(3, 2));
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
