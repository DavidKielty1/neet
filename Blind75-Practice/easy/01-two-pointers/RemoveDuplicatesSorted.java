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

    

        // if (nums.length == 0) {
        //     return 0;
        // }
        // int left = 1;
        // for (int right = 1; right < nums.length; right++) {
        //     if (nums[right] != nums[left - 1]) {
        //         nums[left] = nums[right];
        //         left++;
        //     }
        // }
        // return left;

        throw new UnsupportedOperationException("Implement removeDuplicates");
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int k1 = removeDuplicates(nums1);
        System.out.println("k=" + k1 + ", nums=" + Arrays.toString(nums1));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = removeDuplicates(nums2);
        System.out.println("k=" + k2 + ", nums=" + Arrays.toString(nums2));

        int[] nums3 = {1};
        int k3 = removeDuplicates(nums3);
        System.out.println("k=" + k3 + ", nums=" + Arrays.toString(nums3));
    }
}
