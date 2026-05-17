/*
1. Two Sum
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
Given an integer array nums and an integer target, return the indices of the two distinct
elements whose values sum to target. Exactly one valid pair exists. You may not use the same
element twice; return the two indices in any order unless the platform specifies otherwise.

Notes:
- Complement approach: for each index i, check whether (target - nums[i]) was seen earlier.
- Hash map: value -> index for elements already visited.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: nums[0] + nums[1] = 2 + 7 = 9.

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Explanation: nums[1] + nums[2] = 2 + 4 = 6.

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
Explanation: Two different indices with the same value are allowed.

Time: O(n), Space: O(n)
*/

public class TwoSumHashing {
    public int[] twoSum(int[] nums, int target) {
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

        // Map<Integer, Integer> seen = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
            // int complement = target - nums[i];
            // if (seen.containsKey(complement)) {
                // return new int[] {seen.get(complement), i};
            // }
            // seen.put(nums[i], i);
        // }
        // return new int[0];

        throw new UnsupportedOperationException("Implement twoSum");
    }

    private static void assertOrderAgnostic(int[] got, int a, int b) {
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

        // boolean ok =
        // (got[0] == a && got[1] == b) || (got[0] == b && got[1] == a);
        // if (!ok) {
            // throw new AssertionError(
            // "expected indices {" + a + "," + b + "}, got {" + got[0] + "," + got[1] + "}");
        // }

        throw new UnsupportedOperationException("Implement assertOrderAgnostic");
    }

    public static void main(String[] args) {
        TwoSumHashing s = new TwoSumHashing();
        assertOrderAgnostic(s.twoSum(new int[] {2, 7, 11, 15}, 9), 0, 1);
        assertOrderAgnostic(s.twoSum(new int[] {3, 2, 4}, 6), 1, 2);
        assertOrderAgnostic(s.twoSum(new int[] {3, 3}, 6), 0, 1);
        System.out.println("All test cases passed!");
    }
}
