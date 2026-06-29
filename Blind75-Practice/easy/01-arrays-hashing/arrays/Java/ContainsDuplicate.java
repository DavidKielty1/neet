/*
217. Contains Duplicate
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
Given an integer array nums, return true if any value appears at least twice in the array,
and false if every element is distinct.

Notes:
- Order does not matter; only whether some value occurs more than once.
- Typical approaches: hash set (or sort and scan adjacent pairs).

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation: The value 1 appears at indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation: All four values are unique.

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
Explanation: Many duplicates (e.g. 1 appears more than once).

Time: O(n), Space: O(n) for a set (O(1) extra if sorting in place and allowed).
*/

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
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
