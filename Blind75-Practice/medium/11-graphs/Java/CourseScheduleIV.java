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
 * - Build adj: course -> direct prerequisites, then DFS with memo for all prereqs.
 * - Answer each query with a set lookup on the memo map.
 */

import java.util.Arrays;
import java.util.List;

public class CourseScheduleIV {
    public List<Boolean> checkIfPrerequisite(
    int numCourses, int[][] prerequisites, int[][] queries) {
        
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
    //
    //
    //
    //
    //
    //
    //
    //
    // Map<Integer, List<Integer>> adj = new HashMap<>();
    // for (int i = 0; i < numCourses; i++) {
    //     adj.put(i, new ArrayList<>());
    // }
    // for (int[] edge : prerequisites) {
    //     adj.get(edge[1]).add(edge[0]);
    // }
    //
    // Map<Integer, Set<Integer>> prereqMap = new HashMap<>();
    // for (int course = 0; course < numCourses; course++) {
    //     dfs(course, adj, prereqMap);
    // }
    //
    // List<Boolean> answer = new ArrayList<>();
    // for (int[] query : queries) {
    //     answer.add(prereqMap.get(query[1]).contains(query[0]));
    // }
    // return answer;
    //
    // private Set<Integer> dfs(
    //         int course,
    //         Map<Integer, List<Integer>> adj,
    //         Map<Integer, Set<Integer>> prereqMap) {
    //     if (prereqMap.containsKey(course)) {
    //         return prereqMap.get(course);
    //     }
    //     Set<Integer> prereqs = new HashSet<>();
    //     for (int pre : adj.get(course)) {
    //         prereqs.add(pre);
    //         prereqs.addAll(dfs(pre, adj, prereqMap));
    //     }
    //     prereqMap.put(course, prereqs);
    //     return prereqs;
    // }
    }
    

    public static void main(String[] args) {
        CourseScheduleIV solution = new CourseScheduleIV();
        List<Boolean> answer =
                solution.checkIfPrerequisite(
                        2,
                        new int[][] {{1, 0}},
                        new int[][] {{0, 1}, {1, 0}});
        assert answer.equals(Arrays.asList(false, true));
        System.out.println("All test cases passed!");
    }
}
