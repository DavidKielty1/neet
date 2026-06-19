/*
 * 189. Rotate Array
 * Difficulty: Medium
 * Pattern: Two Pointers / Array Reversal
 *
 * Problem:
 * Given an integer array `nums`, rotate the array to the right by `k` steps, where `k`
 * is non-negative.
 *
 * Example 1:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 step to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 *
 * Example 2:
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -2^31 <= nums[i] <= 2^31 - 1
 * - 0 <= k <= 10^5
 *
 */

import java.util.Arrays;

public class RotateArray {
    static class Solution {
        public void rotate(int[] nums, int k) {
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

            // int n = nums.length;
            // k %= n;
            
            // reverse(nums, 0, n - 1);
            // reverse(nums, 0, k - 1);
            // reverse(nums, k, n - 1);
        }

        // private void reverse(int[] nums, int left, int right) {
        //     while (left < right) {
        //         int temp = nums[left];
        //         nums[left] = nums[right];
        //         nums[right] = temp;
        //         left++;
        //         right--;
        //     }
        // }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        sol.rotate(nums1, 3);
        assert Arrays.equals(nums1, new int[] {5, 6, 7, 1, 2, 3, 4});

        int[] nums2 = {-1, -100, 3, 99};
        sol.rotate(nums2, 2);
        assert Arrays.equals(nums2, new int[] {3, 99, -1, -100});
        System.out.println("All test cases passed!");
    }
}
