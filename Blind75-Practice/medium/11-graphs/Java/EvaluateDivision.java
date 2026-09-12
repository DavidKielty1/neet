/*
 * 399. Evaluate Division
 * Difficulty: Medium
 * Pattern: Graphs / Weighted DFS-BFS
 *
 * Problem:
 * You are given variable pairs `equations` and real-number values `values`,
 * where `equations[i] = [Ai, Bi]` and `values[i]` represents the equation
 * `Ai / Bi = values[i]`.
 *
 * Each `Ai` or `Bi` is a string representing a variable. You are also given
 * queries where `queries[j] = [Cj, Dj]`. Return the answers to all queries.
 * If a variable does not exist in the graph or there is no valid path between
 * the variables, return -1.0 for that query.
 *
 * Example 1:
 * Input:
 * equations = [["a","b"],["b","c"]], values = [2.0,3.0],
 * queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]
 * Output: [6.0,0.5,-1.0,1.0,-1.0]
 *
 * Example 2:
 * Input:
 * equations = [["a","b"],["b","c"],["bc","cd"]],
 * values = [1.5,2.5,5.0],
 * queries = [["a","c"],["c","b"],["bc","cd"],["cd","bc"]]
 * Output: [3.75,0.4,5.0,0.2]
 *
 * Constraints:
 * - 1 <= equations.length <= 20
 * - equations[i].length == 2
 * - 1 <= Ai.length, Bi.length, Cj.length, Dj.length <= 5
 * - values.length == equations.length
 * - 0.0 < values[i] <= 20.0
 * - 1 <= queries.length <= 20
 * - queries[i].length == 2
 * - Ai, Bi, Cj, Dj consist of lowercase English letters and digits
 *
 * Notes:
 * - Build a weighted graph in both directions.
 * - A path product from source to target gives the query result.
 */

import java.util.List;

public class EvaluateDivision {
    public double[] calcEquation(
    List<List<String>> equations, double[] values, List<List<String>> queries) {
        
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
    // equations    {{"a","b"},{"b","c"}}
    // values       [2.0,3.0]
    // queries      {{"a","c"},{"b","a"},{"a","e"},{"a","a"},{"x","x"}}
    //
    // graph (map):
    // a { b:2.0 }
    // b { a:0.5, c:3.0 }
    // c { b:1.0/3.0 }
    //        
    // answer[[][][][][]]
    //   
    // Map<String, Map<String, Double>> graph = new HashMap<>();
    // for (int i = 0; i < equations.size(); i++) {
    //     String a = equations.get(i).get(0);
    //     String b = equations.get(i).get(1);
    //     graph.computeIfAbsent(a, key -> new HashMap<>()).put(b, values[i]);
    //     graph.computeIfAbsent(b, key -> new HashMap<>()).put(a, 1.0 / values[i]);
    // }
    //
    // double[] answer = new double[queries.size()];
    // for (int i = 0; i < queries.size(); i++) {
    //     String src = queries.get(i).get(0);
    //     String dst = queries.get(i).get(1);
    //     if (!graph.containsKey(src) || !graph.containsKey(dst)) {
    //         answer[i] = -1.0;
    //         continue;
    //     }
    //     if (src.equals(dst)) {
    //         answer[i] = 1.0;
    //         continue;
    //     }
    //     answer[i] = dfs(src, dst, graph, new HashSet<>(), 1.0);
    // }
    // return answer;
    // }

    // private double dfs(
    //     String src,
    //     String dst,
    //     Map<String, Map<String, Double>> graph,
    //     Set<String> seen,
    //     double acc) {
    // if (src.equals(dst)) {
    //     return acc;
    // }
    // seen.add(src);
    // for (Map.Entry<String, Double> e : graph.get(src).entrySet()) {
    //     if (seen.contains(e.getKey())) {
    //         continue;
    //     }
    //     double ans = dfs(e.getKey(), dst, graph, seen, acc * e.getValue());
    //     if (ans != -1.0) {
    //         return ans;
    //     }
    // }
    // return -1.0;
    // }

    

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement calcEquation and add assertions.");
    }
}
