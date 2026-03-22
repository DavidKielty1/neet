/*
15. 3Sum
Difficulty: Medium
Pattern: Two Pointers

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that
i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Time: O(n²), Space: O(1)
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    /**
     * Fix one number (i), then use two pointers for the other two (while left < right).
     * target = -nums[i]
     * We sort, so if the current_sum is smaller than target, we increment left.
     * If current_sum is larger than target, we decrement right.
     */

    public static List<List<Integer>> threeSum (int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            // while check to clear duplicates of initial e.g. array of: 
            // [-4, -4, -1, -1, 0, 1, 2]
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;
            
            // [-4, -1, -1, 0, 1, 2]
            while (right > left) {
                int currentTotal = nums[i] + nums[left] + nums[right];

                if (currentTotal == 0) {
                    output.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    
                    while (right > left && nums[left] == nums[left + 1]) left++;
                    
                    while (right > left && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }

                else if (currentTotal > 0) right--;
                else left++;
            }
        }

        return output;
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

    
    // public static List<List<Integer>> threeSum(int[] nums) {
    //     Arrays.sort(nums);
    //     List<List<Integer>> result = new ArrayList<>();

    //     // [-4, -1, -1, 0, 0, 0, 1, 2, 4, 4]
    //     for (int i = 0; i < nums.length - 2; i++) {
    //         // Skip duplicate values for i
    //         if (i > 0 && nums[i] == nums[i - 1]) {
    //             continue;
    //         }

    //         int left = i + 1;
    //         int right = nums.length - 1;
    //         int target = -nums[i];

    //         while (left < right) {
    //             int currSum = nums[left] + nums[right];

    //             if (currSum == target) {
    //                 result.add(Arrays.asList(nums[i], nums[left], nums[right]));

    //                 // Skip duplicates for left
    //                 while (left < right && nums[left] == nums[left + 1]) {
    //                     left++;
    //                 }
    //                 // Skip duplicates for right
    //                 while (left < right && nums[right] == nums[right - 1]) {
    //                     right--;
    //                 }

    //                 left++;
    //                 right--;
    //             } else if (currSum < target) {
    //                 left++;
    //             } else {
    //                 right--;
    //             }
    //         }
    //     }

    //     return result;
    // }

    /*
    # nums.sort()
    # result = []
    #
    # for i in range(len(nums) - 2):
    #     if i > 0 and nums[i] == nums[i - 1]:
    #         continue
    #
    #     left, right = i + 1, len(nums) - 1
    #     target = -nums[i]
    #
    #     while left < right:
    #         curr_sum = nums[left] + nums[right]
    #         if curr_sum == target:
    #             result.append([nums[i], nums[left], nums[right]])
    #
    #             while left < right and nums[left] == nums[left + 1]:
    #                 left += 1
    #
    #             while left < right and nums[right] == nums[right - 1]:
    #                 right -= 1
    #
    #             left += 1
    #             right -= 1
    #
    #         elif curr_sum < target:
    #             left += 1
    #
    #         else:
    #             right -= 1
    #
    # return result
    */

    // Test cases
    public static void main(String[] args) {
        // Test 1
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("3Sum: " + threeSum(nums1)); // [[-1,-1,2],[-1,0,1]]

        // Test 2
        int[] nums2 = {0, 1, 1};
        System.out.println("3Sum: " + threeSum(nums2)); // []

        // Test 3
        int[] nums3 = {0, 0, 0};
        System.out.println("3Sum: " + threeSum(nums3)); // [[0,0,0]]
    }
}

