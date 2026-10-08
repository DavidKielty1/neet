/*
 * 1. Two Sum
 * Difficulty: Easy
 * Pattern: Arrays & Hashing
 *
 * Problem:
 * Given an array of integers nums and an integer target, return the indices of
 * the two numbers such that they add up to target. You may assume that each
 * input has exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 * Constraints:
 * - 2 <= nums.length <= 10^4
 * - -10^9 <= nums[i] <= 10^9
 * - -10^9 <= target <= 10^9
 * - Only one valid answer exists
 */

public class TwoSumHashing {
    public int[] twoSum(int[] nums, int k) {
        
    }
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
    

    public static void main(String[] args) {
        TwoSumHashing s = new TwoSumHashing();
        assertOrderAgnostic(s.twoSum(new int[] {2, 7, 11, 15}, 9), 0, 1);
        assertOrderAgnostic(s.twoSum(new int[] {3, 2, 4}, 6), 1, 2);
        assertOrderAgnostic(s.twoSum(new int[] {3, 3}, 6), 0, 1);
        System.out.println("All test cases passed!");
    }
}
