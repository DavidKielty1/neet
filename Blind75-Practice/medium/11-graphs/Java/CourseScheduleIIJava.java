/*
 * 210. Course Schedule II
 * Difficulty: Medium
 * Pattern: Graphs / Topological Sort
 *
 * Problem:
 * There are a total of `numCourses` courses you have to take, labeled from
 * `0` to `numCourses - 1`. You are given an array `prerequisites` where
 * `prerequisites[i] = [a, b]` indicates that you must first take course `b`
 * if you want to take course `a`.
 *
 * Return the ordering of courses you should take to finish all courses. If
 * there are many valid answers, return any of them. If it is impossible to
 * finish all courses, return an empty array.
 *
 * Example 1:
 * Input: numCourses = 2, prerequisites = [[1,0]]
 * Output: [0,1]
 *
 * Example 2:
 * Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
 * Output: [0,1,2,3] or [0,2,1,3]
 *
 * Example 3:
 * Input: numCourses = 1, prerequisites = []
 * Output: [0]
 *
 * Constraints:
 * - 1 <= numCourses <= 2000
 * - 0 <= prerequisites.length <= numCourses * (numCourses - 1)
 * - prerequisites[i].length == 2
 * - 0 <= ai, bi < numCourses
 * - ai != bi
 * - All pairs [ai, bi] are distinct
 *
 * Notes:
 * - This is the constructive version of cycle detection in a DAG.
 * - Kahn's algorithm builds one valid topological ordering.
 */

public class CourseScheduleIIJava {

    static class Solution {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            // List<List<Integer>> graph = new ArrayList<>();
            // int[] indegree = new int[numCourses];
            // for (int i = 0; i < numCourses; i++) {
            //     graph.add(new ArrayList<>());
            // }
            //
            // for (int[] edge : prerequisites) {
            //     graph.get(edge[1]).add(edge[0]);
            //     indegree[edge[0]]++;
            // }
            //
            // Queue<Integer> queue = new ArrayDeque<>();
            // for (int course = 0; course < numCourses; course++) {
            //     if (indegree[course] == 0) {
            //         queue.offer(course);
            //     }
            // }
            //
            // int[] order = new int[numCourses];
            // int idx = 0;
            // while (!queue.isEmpty()) {
            //     int course = queue.poll();
            //     order[idx++] = course;
            //     for (int next : graph.get(course)) {
            //         indegree[next]--;
            //         if (indegree[next] == 0) {
            //             queue.offer(next);
            //         }
            //     }
            // }
            //
            // return idx == numCourses ? order : new int[0];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] order = solution.findOrder(4, new int[][] {{1, 0}, {2, 0}, {3, 1}, {3, 2}});
        assert order.length == 4;
        System.out.println("All test cases passed!");
    }
}
