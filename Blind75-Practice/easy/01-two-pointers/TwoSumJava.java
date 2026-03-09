import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
1. Two Sum
Difficulty: Easy
Pattern: Two Pointers (with Hash Map)

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Time: O(n), Space: O(n)
*/
public class TwoSumJava {

    public static int[] twoSum(int[] nums, int target) {
        // Create an empty dictionary (hashmap)
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            int complement = target - val;

            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }

            seen.put(val, i);
        }

        return new int[0];
    }

    /*
    # hashmap: dict[int, int] = {}
    #
    # for i, num in enumerate(nums):
    #     complement = target - num
    #
    #     if complement in hashmap:
    #         return [hashmap[complement], i]
    #
    #     hashmap[num] = i
    #
    # return []
    */

    // Test cases
    public static void main(String[] args) {
        // Test 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Two Sum: " + Arrays.toString(twoSum(nums1, target1)));  // [0, 1]

        // Test 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("Two Sum: " + Arrays.toString(twoSum(nums2, target2)));  // [1, 2]

        // Test 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println("Two Sum: " + Arrays.toString(twoSum(nums3, target3)));  // [0, 1]
    }
}

