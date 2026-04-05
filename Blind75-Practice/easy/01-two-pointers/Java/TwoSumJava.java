import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
1. Two Sum
Difficulty: Easy
Pattern: Two Pointers (with Hash Map)

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Hint: Complement 9-2=7 seen later at index 1 — hash map of value→index.

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Hint: 2+4=6; avoid reusing the same index when scanning.

Time: O(n), Space: O(n)
*/
public class TwoSumJava {

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
