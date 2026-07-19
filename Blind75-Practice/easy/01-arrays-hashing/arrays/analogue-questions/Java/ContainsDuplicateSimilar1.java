/*
 * Ported from: 04-arrays-hashing/analogue-questions/Python/contains-duplicate-similar1.py
 * --- Original description ---
Similar Problem 1: Contains Duplicate II
Difficulty: Easy
Pattern: Hash Map with Index Tracking

Problem:
Given an integer array nums and an integer k, return true if there are two distinct
indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false

Constraints:
- 1 <= nums.length <= 10^5
- -10^9 <= nums[i] <= 10^9
- 0 <= k <= 10^5
 */

import java.util.*;
import java.util.function.*;


public class ContainsDuplicateSimilar1 {
    public boolean containsNearbyDuplicate(List<Integer> nums, int k) {
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

    // seen = {}
    // for i, num in enumerate(nums):
    // if num in seen and i - seen[num] <= k:
    // return True
    // seen[num] = i
    // return False

        throw new UnsupportedOperationException("Implement containsNearbyDuplicate");
    }

    

    public static void main(String[] args) {
        ContainsDuplicateSimilar1 sol = new ContainsDuplicateSimilar1();
        assert (sol.containsNearbyDuplicate(java.util.List.of(1, 2, 3, 1), 3) == true);
        System.out.println("✓ Test case 1 passed");
        assert (sol.containsNearbyDuplicate(java.util.List.of(1, 0, 1, 1), 1) == true);
        System.out.println("✓ Test case 2 passed");
        assert (sol.containsNearbyDuplicate(java.util.List.of(1, 2, 3, 1, 2, 3), 2) == false);
        System.out.println("✓ Test case 3 passed");
        assert (sol.containsNearbyDuplicate(java.util.List.of(1), 1) == false);
        System.out.println("✓ Test case 4 passed");
        System.out.println("\nAll test cases passed!");
    }
}
