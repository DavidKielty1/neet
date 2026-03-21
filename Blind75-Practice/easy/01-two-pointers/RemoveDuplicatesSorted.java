/*
26. Remove Duplicates from Sorted Array
Difficulty: Easy
Pattern: Two Pointers

Given an integer array nums sorted in non-decreasing order, remove the
duplicates in-place such that each unique element appears only once. The
relative order of the elements should be kept the same.

Contract (LeetCode 26):
- Modify nums in-place so that the first k elements of nums contain the
  unique elements in order.
- Return k (the number of unique elements). The values beyond index k-1
  are ignored by the caller and may be any value.

Example:
Input: nums = [1,1,1,2]
Output: 2, nums = [1,2,_,_]

Time: O(n), Space: O(1)
*/

import java.util.Arrays;

public class RemoveDuplicatesSorted {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int left = 1;

        for (int right = 1; right < nums.length; right++) {
            if (nums[right] > nums[left - 1]) {
                nums[left] = nums[right];
                left++;
            }
        }

        return left;
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

    // public class RemoveDuplicatesSorted {

    /*
     * Two pointers approach: read and write indices
     *
     * [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
     * [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
     */
    // public static int removeDuplicates(int[] nums) {
    //     if (nums.length == 0) {
    //         return 0;
    //     }

    //     int left = 1;

    //     for (int right = 1; right < nums.length; right++) {
    //         if (nums[right] > nums[left - 1]) {
    //             nums[left] = nums[right];
    //             left++;
    //         }
    //     }

    //     return left;
    // }

    // Test cases
    public static void main(String[] args) {
        // Test 1
        int[] nums1 = { 1, 1, 2 };
        int result1 = removeDuplicates(nums1);
        System.out.println("Remove Duplicates: " + result1 + ", nums = " + Arrays.toString(nums1));
        // 2, [1, 2, ...]

        // Test 2
        int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int result2 = removeDuplicates(nums2);
        System.out.println("Remove Duplicates: " + result2 + ", nums = " + Arrays.toString(nums2));
        // 5, [0,1,2,3,4,...]

        // Test 3
        int[] nums3 = { 1, 2, 3 };
        int result3 = removeDuplicates(nums3);
        System.out.println("Remove Duplicates: " + result3 + ", nums = " + Arrays.toString(nums3));
        // 3, [1,2,3]

        // Test 4: Unsorted array (violates problem precondition, but shows behavior)
        int[] nums4 = { 0, 1, 2, 3, 4, 2, 2, 3, 3, 4 };
        int result4 = removeDuplicates(nums4);
        System.out.println("Remove Duplicates: " + result4 + ", nums = " +
                Arrays.toString(Arrays.copyOf(nums4, result4)));
        // 5, [0,1,2,3,4]
    }
}
