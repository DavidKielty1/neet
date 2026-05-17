/*
LeetCode 70. Climbing Stairs
Difficulty: Easy
Pattern: Dynamic Programming / Fibonacci

You are climbing a staircase with n steps.
Each time, you can climb either 1 step or 2 steps.
Return the number of distinct ways to reach the top.

Examples:
n = 2 -> 2
Ways: [1+1], [2]

n = 3 -> 3
Ways: [1+1+1], [1+2], [2+1]

Idea:
The number of ways to reach step i is the sum of the ways to reach
step i - 1 and step i - 2.

Time: O(n), Space: O(1)
*/
public class HouseRobberEasy {
    public int climbStairs(int n) {
        int dp0 = 1;
        int dp1 = 1;
        for (int i = 2; i <= n; i++) {
            int curr = dp0 + dp1;
            dp0 = dp1;
            dp1 = curr;
        }

        return dp1;

        //  

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

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
