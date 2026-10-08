/*
 * 1863. Sum of All Subset XOR Totals
 * Difficulty: Easy
 * Pattern: Backtracking
 *
 * Problem:
 * The XOR total of an array is the bitwise XOR of all its elements, or 0 if the
 * array is empty. Given an integer array nums, consider every possible subset
 * of nums (including the empty subset). Return the sum of the XOR totals of
 * all those subsets. Note that subsets with the same elements should be counted
 * multiple times if they come from different indices.
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
