/*
 * LeetCode 198. House Robber
 * Difficulty: Easy
 * Pattern: 1D dynamic programming
 *
 * Problem
 * -------
 * You are a professional robber planning to rob houses along a street. Each
 * house has a certain amount of money stashed. Adjacent houses have security
 * systems connected, and the police are alerted if two adjacent houses are
 * robbed on the same night.
 *
 * Given an integer array nums representing the amount of money of each house,
 * return the maximum amount of money you can rob tonight without alerting the
 * police.
 *
 * Example 1
 * ---------
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then house 3 (money = 3).
 *
 * Example 2
 * ---------
 * Input: nums = [2,7,9,3,1]
 * Output: 12
 * Explanation: Rob house 1 (money = 2), house 3 (money = 9), and house 5 (money = 1).
 *
 * Constraints
 * -----------
 * - 1 <= nums.length <= 100
 * - 0 <= nums[i] <= 400
 *
 * How to think about it
 * ---------------------
 * At each house, the best total is the larger of skipping it, or robbing it
 * and adding the best total from two houses back.
 *
 * Time: O(n), Space: O(1)
 */

public class HouseRobber {
    public int rob(int[] nums) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // Best at this house: max(skip it, rob it plus the best from two houses ago).

        // int prev2 = 0;
        // int prev1 = 0;
        // for (int money : nums) {
        //     int current = Math.max(prev1, prev2 + money);
        //     prev2 = prev1;
        //     prev1 = current;
        // }
        // return prev1;
        return 0;
    }

    public static void main(String[] args) {
        HouseRobber s = new HouseRobber();
        assert s.rob(new int[] {1, 2, 3, 1}) == 4;
        assert s.rob(new int[] {2, 7, 9, 3, 1}) == 12;
        System.out.println("All test cases passed!");
    }
}
