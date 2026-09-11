/*
 * 684. Redundant Connection
 * Difficulty: Medium
 * Pattern: Graphs / Union-Find
 *
 * Problem:
 * In this problem, a tree is an undirected graph that is connected and has no
 * cycles. You are given a graph that started as a tree with `n` nodes labeled
 * from `1` to `n`, and then one additional edge was added.
 *
 * The added edge connects two different vertices that were not already
 * connected by an edge. Return the edge that can be removed so the resulting
 * graph is a tree again. If there are multiple answers, return the one that
 * appears last in the input.
 *
 * Example 1:
 * Input: edges = [[1,2],[1,3],[2,3]]
 * Output: [2,3]
 *
 * Example 2:
 * Input: edges = [[1,2],[2,3],[3,4],[1,4],[1,5]]
 * Output: [1,4]
 *
 * Constraints:
 * - n == edges.length
 * - 3 <= n <= 1000
 * - edges[i].length == 2
 * - 1 <= ai < bi <= edges.length
 * - ai != bi
 * - There are no repeated edges
 * - The given graph is connected
 *
 * Notes:
 * - Union-Find is the cleanest approach here.
 * - The first edge whose endpoints already share a parent is the answer.
 */

public class RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
    
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
    //
    // int n = edges.length;
    // int[] parent = new int[n + 1];
    // int[] rank = new int[n + 1];
    // for (int i = 1; i <= n; i++) {
    //     parent[i] = i;
    // }
    //
    // for (int[] edge : edges) {
    //     int a = edge[0];
    //     int b = edge[1];
    //     if (!union(parent, rank, a, b)) {
    //         return edge;
    //     }
    // }
    //
    // return new int[0];
    //
    // private int find(int[] parent, int node) {
    //     if (parent[node] != node) {
    //         parent[node] = find(parent, parent[node]);
    //     }
    //     return parent[node];
    // }
    //
    // private boolean union(int[] parent, int[] rank, int a, int b) {
    //     int rootA = find(parent, a);   
    //     int rootB = find(parent, b);   
    //     if (rootA == rootB) {
    //         return false;
    //     }
    //     if (rank[rootA] < rank[rootB]) {
    //         parent[rootA] = rootB;
    //     } else if (rank[rootA] > rank[rootB]) {
    //         parent[rootB] = rootA;
    //     } else {
    //         parent[rootB] = rootA;
    //         rank[rootA]++;
    //     }
    //     return true;
    // }
    }
    

    public static void main(String[] args) {
        RedundantConnection solution = new RedundantConnection();
        int[] answer = solution.findRedundantConnection(new int[][] {{1, 2}, {1, 3}, {2, 3}});
        assert answer[0] == 2;
        assert answer[1] == 3;
        System.out.println("All test cases passed!");
    }
}
