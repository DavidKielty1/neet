/*
 * Ported from: 10-dynamic-programming/analogue-questions/Python/tribonacci-number-similar2.py
 * --- Original description ---
LeetCode 1646: Get Maximum in Generated Array
Difficulty: Easy
Pattern: Dynamic Programming

Problem:
You are given an integer n. A 0-indexed integer array nums of length n + 1 is generated
in the following way:

- nums[0] = 0
- nums[1] = 1
- nums[2 * i] = nums[i] when 2 <= 2 * i <= n
- nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n

Return the maximum integer in the array nums​​​.

Example 1:
Input: n = 7
Output: 3
Explanation: According to the given rules:
  nums[0] = 0
  nums[1] = 1
  nums[(1 * 2) = 2] = nums[1] = 1
  nums[(1 * 2) + 1 = 3] = nums[1] + nums[2] = 1 + 1 = 2
  nums[(2 * 2) = 4] = nums[2] = 1
  nums[(2 * 2) + 1 = 5] = nums[2] + nums[3] = 1 + 2 = 3
  nums[(3 * 2) = 6] = nums[3] = 2
  nums[(3 * 2) + 1 = 7] = nums[3] + nums[4] = 2 + 1 = 3
Hence, nums = [0,1,1,2,1,3,2,3], and the maximum is max(nums) = 3.

Example 2:
Input: n = 2
Output: 1

Example 3:
Input: n = 3
Output: 2

Constraints:
- 0 <= n <= 100

Time Complexity: O(n)
Space Complexity: O(n)
 */

import java.util.*;
import java.util.function.*;


public class TribonacciNumberSimilar2Java {



    static class Solution {
        public int getMaximumGenerated(int n) {
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

            // if n == 0:
            // return 0
            // if n == 1:
            // return 1
            // nums = [0] * (n + 1)
            // nums[1] = 1
            // for i in range(2, n + 1):
            // if i % 2 == 0:
            // nums[i] = nums[i // 2]
            // else:
            // nums[i] = nums[i // 2] + nums[i // 2 + 1]
            // return max(nums)

            throw new UnsupportedOperationException("Implement getMaximumGenerated");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.getMaximumGenerated(7) == 3);
        System.out.println("✓ Test case 1 passed");
        assert (sol.getMaximumGenerated(2) == 1);
        System.out.println("✓ Test case 2 passed");
        assert (sol.getMaximumGenerated(3) == 2);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
