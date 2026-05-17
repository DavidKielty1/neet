/*
 * 1489. Find Critical and Pseudo-Critical Edges in Minimum Spanning Tree
 * Difficulty: Hard
 * Pattern: Minimum spanning tree / Kruskal
 *
 * Problem:
 * Given a weighted undirected connected graph with n vertices numbered from 0
 * to n - 1, and an array edges where edges[i] = [ai, bi, weighti], find all the
 * critical and pseudo-critical edges in the graph's minimum spanning tree.
 *
 * A critical edge is an edge whose deletion increases the minimum spanning tree
 * weight. A pseudo-critical edge can appear in some minimum spanning tree but is
 * not critical.
 *
 * Return a list answer where answer[0] contains all critical edge indices and
 * answer[1] contains all pseudo-critical edge indices.
 *
 * Example 1:
 * Input: n = 5, edges = [[0,1,1],[1,2,1],[2,3,2],[0,3,2],[0,4,3],[3,4,3],[1,4,6]]
 * Output: [[0,1],[2,3,4,5]]
 *
 * Example 2:
 * Input: n = 4, edges = [[0,1,1],[1,2,1],[2,3,1],[0,3,1]]
 * Output: [[],[0,1,2,3]]
 *
 * Constraints:
 * - 2 <= n <= 100
 * - 1 <= edges.length <= min(200, n * (n - 1) / 2)
 * - edges[i].length == 3
 * - 0 <= ai < bi < n
 * - 1 <= weighti <= 1000
 * - All pairs (ai, bi) are distinct
 */
public class FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTree {
    static class Solution {
        public java.util.List<java.util.List<Integer>> findCriticalAndPseudoCriticalEdges(
                int n, int[][] edges) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // int m = edges.length;
            // int[][] indexed = new int[m][4];
            // for (int i = 0; i < m; i++) {
            //     indexed[i] = new int[] {edges[i][0], edges[i][1], edges[i][2], i};
            // }
            // Arrays.sort(indexed, Comparator.comparingInt(edge -> edge[2]));
            //
            // int baseWeight = kruskal(n, indexed, -1, -1);
            // List<Integer> critical = new ArrayList<>();
            // List<Integer> pseudoCritical = new ArrayList<>();
            //
            // for (int i = 0; i < m; i++) {
            //     if (kruskal(n, indexed, i, -1) > baseWeight) {
            //         critical.add(indexed[i][3]);
            //     } else if (kruskal(n, indexed, -1, i) == baseWeight) {
            //         pseudoCritical.add(indexed[i][3]);
            //     }
            // }
            //
            // return Arrays.asList(critical, pseudoCritical);
            throw new UnsupportedOperationException("Implement findCriticalAndPseudoCriticalEdges");
        }

        // private int kruskal(int n, int[][] edges, int skip, int force) {
        //     UnionFind uf = new UnionFind(n);
        //     int weight = 0;
        //     if (force != -1) {
        //         uf.union(edges[force][0], edges[force][1]);
        //         weight += edges[force][2];
        //     }
        //     for (int i = 0; i < edges.length; i++) {
        //         if (i == skip) {
        //             continue;
        //         }
        //         if (uf.union(edges[i][0], edges[i][1])) {
        //             weight += edges[i][2];
        //         }
        //     }
        //     return uf.components == 1 ? weight : Integer.MAX_VALUE;
        // }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement MST classification and add checks.");
    }
}
