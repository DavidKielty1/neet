/*
 * 323. Number of Connected Components in an Undirected Graph
 * Difficulty: Medium
 * Pattern: Graphs / DFS-BFS or Union-Find
 *
 * Problem:
 * You are given an integer `n` and an array `edges` where `edges[i] = [ai, bi]`
 * indicates an undirected edge between nodes `ai` and `bi`.
 *
 * Return the number of connected components in the graph.
 *
 * Example 1:
 * Input: n = 5, edges = [[0,1],[1,2],[3,4]]
 * Output: 2
 *
 * Example 2:
 * Input: n = 5, edges = [[0,1],[1,2],[2,3],[3,4]]
 * Output: 1
 *
 * Constraints:
 * - 1 <= n <= 2000
 * - 0 <= edges.length <= 5000
 * - edges[i].length == 2
 * - 0 <= ai <= bi < n
 * - ai != bi
 * - There are no repeated edges
 *
 * Notes:
 * - Count how many times you have to start a fresh traversal.
 * - Union-Find also solves this cleanly with near-constant merges.
 */

public class NumberOfConnectedComponentsInAnUndirectedGraph {

    static class Solution {
        public int countComponents(int n, int[][] edges) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
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
            // for (int i = 0; i < n; i++) {
            //     graph.add(new ArrayList<>());
            // }
            // for (int[] edge : edges) {
            //     graph.get(edge[0]).add(edge[1]);
            //     graph.get(edge[1]).add(edge[0]);
            // }
            //
            // boolean[] visited = new boolean[n];
            // int components = 0;
            // for (int node = 0; node < n; node++) {
            //     if (!visited[node]) {
            //         components++;
            //         dfs(graph, visited, node);
            //     }
            // }
            //
            // return components;
            //
            // private void dfs(List<List<Integer>> graph, boolean[] visited, int node) {
            //     if (visited[node]) {
            //         return;
            //     }
            //     visited[node] = true;
            //     for (int next : graph.get(node)) {
            //         dfs(graph, visited, next);
            //     }
            // }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        assert solution.countComponents(5, new int[][] {{0, 1}, {1, 2}, {3, 4}}) == 2;
        assert solution.countComponents(5, new int[][] {{0, 1}, {1, 2}, {2, 3}, {3, 4}}) == 1;
        System.out.println("All test cases passed!");
    }
}
