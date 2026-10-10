/*
 * 643. Maximum Average Subarray I
 * Difficulty: Easy
 * Pattern: Sliding Window
 *
 * Problem:
 * You are given an integer array nums consisting of n elements, and an integer
 * k. Find a contiguous subarray whose length is equal to k that has the
 * maximum average value and return this value. Any answer with a calculation
 * error less than 10^-5 will be accepted.
 *
 * Example 1:
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75
 *
 * Example 2:
 * Input: nums = [5], k = 1
 * Output: 5.0
 *
 * Constraints:
 * - n == nums.length
 * - 1 <= k <= n <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 */
public class MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] nums, int k) {
        
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

        // if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            // throw new IllegalArgumentException("Invalid input");
        // }
        // int currentSum = 0;
        // for (int i = 0; i < k; i++) {
            // currentSum += nums[i];
        // }
        // int maxSum = currentSum;
        // for (int i = k; i < nums.length; i++) {
            // currentSum = currentSum + nums[i] - nums[i - k];
            // if (currentSum > maxSum) {
                // maxSum = currentSum;
            // }
        // }
        // return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        System.out.println("Max Average: " + findMaxAverage(nums1, 4));

        int[] nums2 = {5};
        System.out.println("Max Average: " + findMaxAverage(nums2, 1));
    }
}
