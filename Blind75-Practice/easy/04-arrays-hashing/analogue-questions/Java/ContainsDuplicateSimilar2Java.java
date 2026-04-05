/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/contains-duplicate-similar2.py
 * --- Original description ---
Similar Problem 2: Contains Duplicate III (Easy Version)
Difficulty: Easy
Pattern: Hash Set with Sliding Window

Problem:
Given an integer array nums and two integers k and t, return true if there are
two distinct indices i and j such that abs(nums[i] - nums[j]) <= t and abs(i - j) <= k.

For this easy version, we'll assume t = 0 (exact duplicates).

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,5,9,1,5,9], k = 2
Output: false

Constraints:
- 1 <= nums.length <= 2 * 10^4
- -10^9 <= nums[i] <= 10^9
- 0 <= k <= 10^4
 */

import java.util.*;
import java.util.function.*;


public class ContainsDuplicateSimilar2Java {



    static class Solution {
        public boolean containsNearbyAlmostDuplicate(List<Integer> nums, int k) {
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

            // if k == 0:
            // return False
            // window = set()
            // for i, num in enumerate(nums):
            // if num in window:
            // return True
            // window.add(num)
            // if i >= k:
            // window.remove(nums[i - k])
            // return False

            throw new UnsupportedOperationException("Implement containsNearbyAlmostDuplicate");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert (sol.containsNearbyAlmostDuplicate(java.util.List.of(1, 2, 3, 1), 3) == true);
        System.out.println("✓ Test case 1 passed");
        assert (sol.containsNearbyAlmostDuplicate(java.util.List.of(1, 5, 9, 1, 5, 9), 2) == false);
        System.out.println("✓ Test case 2 passed");
        assert (sol.containsNearbyAlmostDuplicate(java.util.List.of(1, 2, 1), 1) == false);
        System.out.println("✓ Test case 3 passed");
        System.out.println("\nAll test cases passed!");
    }
}
