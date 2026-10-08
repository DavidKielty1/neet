/*
 * 217. Contains Duplicate
 * Difficulty: Easy
 * Pattern: Arrays & Hashing
 *
 * Problem:
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and false if every element is distinct.
 *
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 *
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 *
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 */

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                return true;
            }
        }
        return false;
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

        // Set<Integer> seen = new HashSet<>();
        // for (int num : nums) {
            // if (!seen.add(num)) {
                // return true;
            // }
        // }
        // return false;

        throw new UnsupportedOperationException("Implement containsDuplicate");
    }

    public static void main(String[] args) {
        ContainsDuplicate s = new ContainsDuplicate();
        assert s.containsDuplicate(new int[] {1, 2, 3, 1});
        assert !s.containsDuplicate(new int[] {1, 2, 3, 4});
        assert s.containsDuplicate(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2});
        System.out.println("All test cases passed!");
    }
}
