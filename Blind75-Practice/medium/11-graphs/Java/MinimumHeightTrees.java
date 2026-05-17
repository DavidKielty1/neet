/*
 * 310. Minimum Height Trees
 * Difficulty: Medium
 * Pattern: Graphs / Topological Trimming
 *
 * Problem:
 * A tree is an undirected graph in which any two vertices are connected by
 * exactly one path. You are given a tree of `n` nodes labeled from `0` to
 * `n - 1` and an array `edges` of length `n - 1`.
 *
 * You can choose any node as the root. The resulting tree height is the
 * number of edges on the longest path from the root to any leaf. Return all
 * possible roots that produce a minimum height tree.
 *
 * Example 1:
 * Input: n = 4, edges = [[1,0],[1,2],[1,3]]
 * Output: [1]
 *
 * Example 2:
 * Input: n = 6, edges = [[3,0],[3,1],[3,2],[3,4],[5,4]]
 * Output: [3,4]
 *
 * Constraints:
 * - 1 <= n <= 2 * 10^4
 * - edges.length == n - 1
 * - edges[i].length == 2
 * - 0 <= ai, bi < n
 * - ai != bi
 * - All pairs are distinct
 * - The given input is guaranteed to be a tree
 *
 * Notes:
 * - The centers of a tree are the answers.
 * - Repeatedly trim leaves layer by layer until at most two nodes remain.
 */

import java.util.List;

public class MinimumHeightTrees {

    static class Solution {
        public List<Integer> findMinHeightTrees(int n, int[][] edges) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            // if (n == 1) {
            //     return Collections.singletonList(0);
            // }
            //
            // List<Set<Integer>> graph = new ArrayList<>();
            // for (int i = 0; i < n; i++) {
            //     graph.add(new HashSet<>());
            // }
            // for (int[] edge : edges) {
            //     graph.get(edge[0]).add(edge[1]);
            //     graph.get(edge[1]).add(edge[0]);
            // }
            //
            // List<Integer> leaves = new ArrayList<>();
            // for (int node = 0; node < n; node++) {
            //     if (graph.get(node).size() == 1) {
            //         leaves.add(node);
            //     }
            // }
            //
            // int remaining = n;
            // while (remaining > 2) {
            //     remaining -= leaves.size();
            //     List<Integer> nextLeaves = new ArrayList<>();
            //     for (int leaf : leaves) {
            //         int neighbor = graph.get(leaf).iterator().next();
            //         graph.get(neighbor).remove(leaf);
            //         if (graph.get(neighbor).size() == 1) {
            //             nextLeaves.add(neighbor);
            //         }
            //     }
            //     leaves = nextLeaves;
            // }
            //
            // return leaves;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> roots = solution.findMinHeightTrees(4, new int[][] {{1, 0}, {1, 2}, {1, 3}});
        assert roots.size() == 1;
        assert roots.get(0) == 1;
        System.out.println("All test cases passed!");
    }
}
