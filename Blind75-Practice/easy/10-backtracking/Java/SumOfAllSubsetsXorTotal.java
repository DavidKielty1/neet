/*
 * 1863. Sum of All Subsets XOR Total
 * Difficulty: Easy
 * Pattern: Backtracking
 *
 * Problem:
 * The XOR total of an array is the bitwise XOR of all its elements, or 0 if the
 * array is empty.
 *
 * Given an integer array `nums`, consider every possible subset of `nums`.
 * Return the sum of the XOR totals of all those subsets.
 *
 * Example 1:
 * Input: nums = [1, 3]
 * Output: 6
 * Explanation:
 * Subsets are:
 * - [] -> 0
 * - [1] -> 1
 * - [3] -> 3
 * - [1, 3] -> 1 ^ 3 = 2
 * Total = 0 + 1 + 3 + 2 = 6
 *
 * Example 2:
 * Input: nums = [5, 1, 6]
 * Output: 28
 * Explanation:
 * There are 8 subsets, and the sum of all their XOR totals is 28.
 *
 * Example 3:
 * Input: nums = [3]
 * Output: 3
 * Explanation:
 * The subsets are [] and [3], so the answer is 0 + 3 = 3.
 *
 * Constraints:
 * - 1 <= nums.length <= 12
 * - 1 <= nums[i] <= 20
 *
 * Why backtracking works:
 * At each index, you have two choices: include `nums[i]` in the running XOR or skip
 * it. Recursing over those two choices explores every subset exactly once.
 *
 * Time: O(n * 2^n)
 * Space: O(n) recursion stack
 */

public class SumOfAllSubsetsXorTotal {
    public int subsetXORSum(int[] nums) {
            return dfs(nums, 0, 0);
        }
        
        private int dfs(int[] nums, int i, int curXor) {
            if (i == nums.length) {
                return curXor;
            }
            return dfs(nums, i + 1, curXor ^ nums[i])
                    + dfs(nums, i + 1, curXor);
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

    public static void main(String[] args) {
        SumOfAllSubsetsXorTotal sol = new SumOfAllSubsetsXorTotal();
        assert sol.subsetXORSum(new int[] {1, 3}) == 6;
        assert sol.subsetXORSum(new int[] {5, 1, 6}) == 28;
        assert sol.subsetXORSum(new int[] {3}) == 3;
        System.out.println("All tests passed.");
    }
}
