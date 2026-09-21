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
 * - Kahn BFS: edge a -> b (a unlocks b). Seed indegree 0.
 * - When peeling a course, add it and its whole prereq set onto each successor.
 * - Answer each query with a set lookup.
 */

import java.util.Arrays;
import java.util.List;

public class CourseScheduleIVBFS {
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
    //
    // List<List<Integer>> adj = new ArrayList<>();
    // List<Set<Integer>> prereqs = new ArrayList<>();
    // int[] indegree = new int[numCourses];
    // for (int i = 0; i < numCourses; i++) {
    //     adj.add(new ArrayList<>());
    //     prereqs.add(new HashSet<>());
    // }
    // for (int[] edge : prerequisites) {
    //     adj.get(edge[0]).add(edge[1]);
    //     indegree[edge[1]]++;
    // }
    //
    // Queue<Integer> queue = new ArrayDeque<>();
    // for (int course = 0; course < numCourses; course++) {
    //     if (indegree[course] == 0) {
    //         queue.offer(course);
    //     }
    // }
    //
    // while (!queue.isEmpty()) {
    //     int course = queue.poll();
    //     for (int next : adj.get(course)) {
    //         prereqs.get(next).add(course);
    //         prereqs.get(next).addAll(prereqs.get(course));
    //         indegree[next]--;
    //         if (indegree[next] == 0) {
    //             queue.offer(next);
    //         }
    //     }
    // }
    //
    // List<Boolean> answer = new ArrayList<>();
    // for (int[] query : queries) {
    //     answer.add(prereqs.get(query[1]).contains(query[0]));
    // }
    // return answer;
    }

    public static void main(String[] args) {
        CourseScheduleIVBFS solution = new CourseScheduleIVBFS();
        List<Boolean> answer =
                solution.checkIfPrerequisite(
                        2,
                        new int[][] {{1, 0}},
                        new int[][] {{0, 1}, {1, 0}});
        assert answer.equals(Arrays.asList(false, true));
        System.out.println("All test cases passed!");
    }
}
