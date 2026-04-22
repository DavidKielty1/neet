import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
LeetCode 1: Two Sum
Difficulty: Easy
Pattern: Hash Map

Problem:
Given an array of integers `nums` and an integer `target`, return the indices
of the two numbers such that they add up to `target`.

You may assume that each input has exactly one solution, and you may not use
the same element twice. You can return the answer in any order.

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
Explanation: Use the two different indices that each hold the value 3.

Time Complexity: O(n)
Space Complexity: O(n)
*/
public class TwoSumJava {

    public int[] twoSum(int[] nums, int target) {
        if ( nums == null || nums.length < 1) {
            return new int[0];
        }

        Map<Integer, Integer> count = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(count.containsKey(complement)) {
                return new int[] {count.get(complement), i};
            }

            count.put(nums[i], i);
        }

        return new int[0];

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

    // public static int[] twoSum(int[] nums, int target) {
    //     Map<Integer, Integer> seen = new HashMap<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         int val = nums[i];
    //         int complement = target - val;
    //         if (seen.containsKey(complement)) {
    //             return new int[] {seen.get(complement), i};
    //         }
    //         seen.put(val, i);
    //     }
    //     return new int[0];
    // }

    public static void main(String[] args) {
        TwoSumJava sol = new TwoSumJava();
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Two Sum: " + Arrays.toString(sol.twoSum(nums1, target1)));

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("Two Sum: " + Arrays.toString(sol.twoSum(nums2, target2)));

        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println("Two Sum: " + Arrays.toString(sol.twoSum(nums3, target3)));
    }
}
