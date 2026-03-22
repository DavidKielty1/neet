/**
 * LeetCode 643: Maximum Average Subarray I
 * Difficulty: Easy
 * Pattern: Sliding Window
 *
 * Find a contiguous subarray of length k with maximum average; return that average.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MaximumAverageSubarrayI {

    public static double findMaxAverage(int[] nums, int k) {
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
        //     throw new IllegalArgumentException("Invalid input");
        // }
        // int currentSum = 0;
        // for (int i = 0; i < k; i++) {
        //     currentSum += nums[i];
        // }
        // int maxSum = currentSum;
        // for (int i = k; i < nums.length; i++) {
        //     currentSum = currentSum + nums[i] - nums[i - k];
        //     if (currentSum > maxSum) {
        //         maxSum = currentSum;
        //     }
        // }
        // return (double) maxSum / k;

        throw new UnsupportedOperationException("Implement findMaxAverage");
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        System.out.println("Max Average: " + findMaxAverage(nums1, 4));

        int[] nums2 = {5};
        System.out.println("Max Average: " + findMaxAverage(nums2, 1));
    }
}
