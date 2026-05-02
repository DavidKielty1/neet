/*
 * 1462. Course Schedule IV
 * Difficulty: Medium
 * Pattern: Graphs / Reachability
 *
 * Problem:
 * There are `numCourses` courses labeled from `0` to `numCourses - 1`. You
 * are given a list of direct prerequisite pairs `prerequisites` where
 * `[a, b]` means you must take course `a` before course `b`.
 *
 * You are also given queries where `queries[j] = [u, v]`. For each query,
 * determine whether course `u` is a prerequisite of course `v`, either
 * directly or indirectly, and return the answers as a list of booleans.
 *
 * Example 1:
 * Input: numCourses = 2, prerequisites = [[1,0]], queries = [[0,1],[1,0]]
 * Output: [false,true]
 *
 * Example 2:
 * Input: numCourses = 2, prerequisites = [], queries = [[1,0],[0,1]]
 * Output: [false,false]
 *
 * Example 3:
 * Input: numCourses = 3, prerequisites = [[1,2],[1,0],[2,0]],
 * queries = [[1,0],[1,2]]
 * Output: [true,true]
 *
 * Constraints:
 * - 2 <= numCourses <= 100
 * - 0 <= prerequisites.length <= numCourses * (numCourses - 1) / 2
 * - 0 <= queries.length <= 10^4
 * - prerequisites[i].length == 2
 * - queries[j].length == 2
 * - 0 <= ui, vi, ai, bi < numCourses
 * - ai != bi and ui != vi
 *
 * Notes:
 * - Because `numCourses` is small, Floyd-Warshall or repeated graph search works.
 * - Build transitive prerequisite knowledge, then answer queries in O(1).
 */

import java.util.Arrays;
import java.util.List;

public class CourseScheduleIVJava {

    static class Solution {
        public List<Boolean> checkIfPrerequisite(
                int numCourses, int[][] prerequisites, int[][] queries) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            // boolean[][] reachable = new boolean[numCourses][numCourses];
            // for (int[] edge : prerequisites) {
            //     reachable[edge[0]][edge[1]] = true;
            // }
            //
            // for (int mid = 0; mid < numCourses; mid++) {
            //     for (int from = 0; from < numCourses; from++) {
            //         for (int to = 0; to < numCourses; to++) {
            //             reachable[from][to] =
            //                     reachable[from][to]
            //                             || (reachable[from][mid] && reachable[mid][to]);
            //         }
            //     }
            // }
            //
            // List<Boolean> answer = new ArrayList<>();
            // for (int[] query : queries) {
            //     answer.add(reachable[query[0]][query[1]]);
            // }
            // return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Boolean> answer =
                solution.checkIfPrerequisite(
                        2,
                        new int[][] {{1, 0}},
                        new int[][] {{0, 1}, {1, 0}});
        assert answer.equals(Arrays.asList(false, true));
        System.out.println("All test cases passed!");
    }
}
