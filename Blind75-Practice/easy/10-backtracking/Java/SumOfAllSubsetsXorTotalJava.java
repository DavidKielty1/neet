/*
 * 1863. Sum of All Subsets XOR Total
 * Difficulty: Easy
 * Pattern: Backtracking
 *
 * Problem:
 * The XOR total of an array is defined as the bitwise XOR of all its elements, or 0 if
 * the array is empty.
 *
 * Given an array `nums`, return the sum of all XOR totals for every subset of `nums`.
 *
 * Example 1:
 * Input: nums = [1,3]
 * Output: 6
 *
 * Example 2:
 * Input: nums = [5,1,6]
 * Output: 28
 *
 * Example 3:
 * Input: nums = [3]
 * Output: 3
 *
 * Constraints:
 * - 1 <= nums.length <= 12
 * - 1 <= nums[i] <= 20
 *
 * Notes:
 * - At each index, you either include the number in the running XOR or skip it.
 * - This creates a binary recursion tree over all subsets.
 */

public class SumOfAllSubsetsXorTotalJava {

    public int subsetXORSum(int[] nums) {
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

        // public int subsetXORSum(int[] nums) {
        //     return dfs(nums, 0, 0);
        // }
        //
        // private int dfs(int[] nums, int i, int curXor) {
        //     if (i == nums.length) {
        //         return curXor;
        //     }
        //     return dfs(nums, i + 1, curXor ^ nums[i])
        //             + dfs(nums, i + 1, curXor);
        // }
    }

    private int dfs(int[] nums, int i, int curXor) {
    }

    public static void main(String[] args) {
        SumOfAllSubsetsXorTotalJava sol = new SumOfAllSubsetsXorTotalJava();
        assert sol.subsetXORSum(new int[] {1, 3}) == 6;
        assert sol.subsetXORSum(new int[] {5, 1, 6}) == 28;
        assert sol.subsetXORSum(new int[] {3}) == 3;
        System.out.println("All tests passed.");
    }
}
