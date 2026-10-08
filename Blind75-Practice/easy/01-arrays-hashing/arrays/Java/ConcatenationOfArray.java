/*
 * 1929. Concatenation of Array
 * Difficulty: Easy
 * Pattern: Arrays & Hashing
 *
 * Problem:
 * Given an integer array nums of length n, return an array ans of length 2n
 * where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n. In other
 * words, ans is the concatenation of two copies of nums.
 *
 * Example 1:
 * Input: nums = [1,2,1]
 * Output: [1,2,1,1,2,1]
 *
 * Example 2:
 * Input: nums = [1,3,2,1]
 * Output: [1,3,2,1,1,3,2,1]
 *
 * Constraints:
 * - n == nums.length
 * - 1 <= n <= 1000
 * - 1 <= nums[i] <= 1000
 */

import java.util.Arrays;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {


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
        // int[] newArray = new int[n * 2];
        // for (int i = 0; i < n; i++) {
        //     newArray[i] = nums[i];
        //     newArray[i + n] = nums[i];
        // }
        // return newArray;
    }

    public static void main(String[] args) {
        ConcatenationOfArray s = new ConcatenationOfArray();
        assert Arrays.equals(s.getConcatenation(new int[] {1, 2, 1}), new int[] {1, 2, 1, 1, 2, 1});
        assert Arrays.equals(
                s.getConcatenation(new int[] {1, 3, 2, 1}), new int[] {1, 3, 2, 1, 1, 3, 2, 1});
        System.out.println("All test cases passed!");
    }
}
