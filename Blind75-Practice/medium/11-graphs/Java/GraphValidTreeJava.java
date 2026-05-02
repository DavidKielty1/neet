/*
 * 261. Graph Valid Tree
 * Difficulty: Medium
 * Pattern: Graphs / Union-Find or DFS
 *
 * Problem:
 * You have a graph of `n` nodes labeled from `0` to `n - 1`. You are given an
 * integer `n` and a list of undirected edges where `edges[i] = [ai, bi]`.
 *
 * Return `true` if these edges make up a valid tree, and `false` otherwise.
 *
 * A valid tree must be connected and must not contain a cycle.
 *
 * Example 1:
 * Input: n = 5, edges = [[0,1],[0,2],[0,3],[1,4]]
 * Output: true
 *
 * Example 2:
 * Input: n = 5, edges = [[0,1],[1,2],[2,3],[1,3],[1,4]]
 * Output: false
 *
 * Constraints:
 * - 1 <= n <= 2000
 * - 0 <= edges.length <= 5000
 * - edges[i].length == 2
 * - 0 <= ai, bi < n
 * - ai != bi
 * - There are no self-loops or repeated edges
 *
 * Notes:
 * - A tree with `n` nodes must have exactly `n - 1` edges.
 * - After that quick check, use DFS/BFS connectivity or union-find.
 */

public class GraphValidTreeJava {

    static class Solution {
        public boolean validTree(int n, int[][] edges) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            // if (edges.length != n - 1) {
            //     return false;
            // }
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
            // Set<Integer> visited = new HashSet<>();
            // Deque<Integer> stack = new ArrayDeque<>();
            // stack.push(0);
            // visited.add(0);
            //
            // while (!stack.isEmpty()) {
            //     int node = stack.pop();
            //     for (int next : graph.get(node)) {
            //         if (visited.add(next)) {
            //             stack.push(next);
            //         }
            //     }
            // }
            //
            // return visited.size() == n;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        assert solution.validTree(5, new int[][] {{0, 1}, {0, 2}, {0, 3}, {1, 4}});
        assert !solution.validTree(5, new int[][] {{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}});
        System.out.println("All test cases passed!");
    }
}
