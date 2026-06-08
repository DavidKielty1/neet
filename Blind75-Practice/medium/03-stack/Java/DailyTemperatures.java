/*
 * 739. Daily Temperatures
 * Difficulty: Medium
 * Pattern: Monotonic Stack
 *
 * Problem:
 * Given an array of integers `temperatures` representing the daily temperatures,
 * return an array `answer` such that `answer[i]` is the number of days you have to
 * wait after the `i`th day to get a warmer temperature.
 *
 * If there is no future day for which this is possible, keep `answer[i] = 0`.
 *
 * Example 1:
 * Input: temperatures = [73,74,75,71,69,72,76,73]
 * Output: [1,1,4,2,1,1,0,0]
 *
 * Example 2:
 * Input: temperatures = [30,40,50,60]
 * Output: [1,1,1,0]
 *
 * Example 3:
 * Input: temperatures = [30,60,90]
 * Output: [1,1,0]
 *
 * Constraints:
 * - 1 <= temperatures.length <= 10^5
 * - 30 <= temperatures[i] <= 100
 *
 * Notes:
 * - Keep indices of days in a decreasing stack of temperatures.
 * - When a warmer temperature arrives, pop colder days and fill their answers.
 */

import java.util.Arrays;

public class DailyTemperatures {
    static class Solution {
        public int[] dailyTemperatures(int[] temperatures) {

            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // int n = temperatures.length;
            // int[] answer = new int[n];
            // Deque<Integer> stack = new ArrayDeque<>();
            // for (int i = 0; i < n; i++) {
            //     while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
            //         int prev = stack.pop();
            //         answer[prev] = i - prev;
            //     }
            //     stack.push(i);
            // }
            // return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert Arrays.equals(
                sol.dailyTemperatures(new int[] {73, 74, 75, 71, 69, 72, 76, 73}),
                new int[] {1, 1, 4, 2, 1, 1, 0, 0});
        assert Arrays.equals(sol.dailyTemperatures(new int[] {30, 40, 50, 60}), new int[] {1, 1, 1, 0});
        assert Arrays.equals(sol.dailyTemperatures(new int[] {30, 60, 90}), new int[] {1, 1, 0});
        System.out.println("All test cases passed!");
    }
}
