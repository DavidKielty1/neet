/*
 * LeetCode 238. Product of Array Except Self
 *
 * Given an integer array nums, return an array answer such that answer[i] is
 * equal to the product of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a
 * 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the
 * division operation.
 *
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 *
 * Example 2:
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 *
 * Constraints:
 * - 2 <= nums.length <= 100000
 * - -30 <= nums[i] <= 30
 * - The input is generated so that answer[i] is guaranteed to fit in a
 *   32-bit integer.
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
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
        // First store prefix products, then multiply in suffix products.
        //
        // int n = nums.length;
        // int[] result = new int[n];
        // result[0] = 1;
        // for (int i = 1; i < n; i++) {
        //     result[i] = result[i - 1] * nums[i - 1];
        // }
        // int suffix = 1;
        // for (int i = n - 1; i >= 0; i--) {
        //     result[i] *= suffix;
        //     suffix *= nums[i];
        // }
        // return result;
    }

    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }
}
