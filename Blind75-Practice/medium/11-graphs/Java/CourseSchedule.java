/*
 * 207. Course Schedule
 * Difficulty: Medium
 * Pattern: Graphs / Topological Sort
 *
 * Problem:
 * There are a total of `numCourses` courses you have to take, labeled from
 * `0` to `numCourses - 1`. You are given an array `prerequisites` where
 * `prerequisites[i] = [a, b]` indicates that you must take course `b` before
 * course `a`.
 *
 * Return `true` if you can finish all courses. Otherwise, return `false`.
 *
 * Example 1:
 * Input: numCourses = 2, prerequisites = [[1,0]]
 * Output: true
 *
 * Example 2:
 * Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
 * Output: false
 *
 * Example 3:
 * Input: numCourses = 4, prerequisites = [[1,0],[2,1],[3,2]]
 * Output: true
 * 
 * Example 4:
 * Input: numCourses = 7, prerequisites = [[1,0],[2,0],[3,1],[3,2],[4,3],[5,3],[6,4]]
 * Output: 
 *
 * Constraints:
 * - 1 <= numCourses <= 2000
 * - 0 <= prerequisites.length <= 5000
 * - prerequisites[i].length == 2
 * - 0 <= a, b < numCourses
 * - All prerequisite pairs are unique
 *
 * Notes:
 * - This reduces to checking whether the directed graph has a cycle.
 * - Kahn's BFS topological sort or DFS cycle detection both work well.
 */

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
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
    // int taken = 0;
    // while (!queue.isEmpty()) {
    //     int course = queue.poll();
    //     taken++;
    //     for (int next : graph.get(course)) {
    //         indegree[next]--;
    //         if (indegree[next] == 0) {
    //             queue.offer(next);
    //         }
    //     }
    // }
    // return taken == numCourses;
    }
    

    public static void main(String[] args) {
        CourseSchedule solution = new CourseSchedule();
        assert solution.canFinish(2, new int[][] {{1, 0}});
        assert !solution.canFinish(2, new int[][] {{1, 0}, {0, 1}});
        System.out.println("All test cases passed!");
    }
}
