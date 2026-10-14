/*
 * 70. Climbing Stairs
 * Difficulty: Easy
 * Pattern: Dynamic Programming / Fibonacci
 *
 * Problem:
 * You are climbing a staircase. It takes n steps to reach the top. Each time
 * you can either climb 1 or 2 steps. Return the number of distinct ways you
 * can climb to the top.
 *
 * Example 1:
 * Input: n = 2
 * Output: 2
 *
 * Example 2:
 * Input: n = 3
 * Output: 3
 *
 * Constraints:
 * - 1 <= n <= 45
 */
public class HouseRobberEasy {
    public int climbStairs(int n) {

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

        // Fibonacci-style DP: ways[i] = ways[i-1] + ways[i-2]

        // if (n <= 2) {
        //     return n;
        // }
        // int prev2 = 1;
        // int prev1 = 2;
        // for (int i = 3; i <= n; i++) {
        //     int current = prev1 + prev2;
        //     prev2 = prev1;
        //     prev1 = current;
        // }
        // return prev1;
        throw new UnsupportedOperationException("Implement climbStairs");
    }
    public static void main(String[] args) {
        HouseRobberEasy s = new HouseRobberEasy();
        assert s.climbStairs(2) == 2;
        assert s.climbStairs(3) == 3;
        System.out.println("All test cases passed!");
    }

}
