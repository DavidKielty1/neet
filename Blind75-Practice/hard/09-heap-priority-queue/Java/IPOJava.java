/*
 * 502. IPO
 * Difficulty: Hard
 * Pattern: Heap / greedy
 *
 * Problem:
 * You are given n projects where the ith project has a pure profit profits[i]
 * and a minimum capital requirement capital[i].
 *
 * Initially, you have w capital. When you finish a project, you gain its pure
 * profit and add it to your capital.
 *
 * Pick at most k distinct projects to maximize your final capital. Return the
 * maximized capital after finishing at most k projects.
 *
 * Example 1:
 * Input: k = 2, w = 0, profits = [1,2,3], capital = [0,1,1]
 * Output: 4
 * Explanation: Pick project 0, then project 2.
 *
 * Example 2:
 * Input: k = 3, w = 0, profits = [1,2,3], capital = [0,1,2]
 * Output: 6
 *
 * Constraints:
 * - 1 <= k <= 10^5
 * - 0 <= w <= 10^9
 * - n == profits.length
 * - n == capital.length
 * - 1 <= n <= 10^5
 * - 0 <= profits[i] <= 10^4
 * - 0 <= capital[i] <= 10^9
 */
public class IPOJava {
    static class Solution {
        public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // int n = profits.length;
            // int[][] projects = new int[n][2];
            // for (int i = 0; i < n; i++) {
            //     projects[i][0] = capital[i];
            //     projects[i][1] = profits[i];
            // }
            // Arrays.sort(projects, Comparator.comparingInt(project -> project[0]));
            //
            // PriorityQueue<Integer> affordableProfits =
            //         new PriorityQueue<>(Collections.reverseOrder());
            // int index = 0;
            // for (int picked = 0; picked < k; picked++) {
            //     while (index < n && projects[index][0] <= w) {
            //         affordableProfits.offer(projects[index][1]);
            //         index++;
            //     }
            //     if (affordableProfits.isEmpty()) {
            //         break;
            //     }
            //     w += affordableProfits.poll();
            // }
            // return w;
            throw new UnsupportedOperationException("Implement findMaximizedCapital");
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement findMaximizedCapital and add checks.");
    }
}
