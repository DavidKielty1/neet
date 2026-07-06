/*
 * 133. Clone Graph
 * Difficulty: Medium
 * Pattern: Graphs / DFS-BFS
 *
 * Problem:
 * Given a reference of a node in a connected undirected graph, return a deep
 * copy (clone) of the graph.
 *
 * Each node contains an integer value and a list of its neighbours:
 * class Node {
 *     public int val;
 *     public List<Node> neighbours;
 * }
 *
 * The graph is represented in the test cases as an adjacency list. The given
 * node will always be the node with value 1, and you must return the cloned
 * node corresponding to that same logical start node.
 *
 * Example 1:
 * Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
 * Output: [[2,4],[1,3],[2,4],[1,3]]
 *
 * Example 2:
 * Input: adjList = [[]]
 * Output: [[]]
 *
 * Example 3:
 * Input: adjList = []
 * Output: []
 *
 * Constraints:
 * - The number of nodes in the graph is in the range [0, 100]
 * - 1 <= Node.val <= 100
 * - Node.val is unique for each node
 * - There are no repeated edges and no self-loops
 * - The graph is connected starting from the given node
 *
 * Notes:
 * - Use a map from original node to cloned node.
 * - DFS and BFS both work as long as neighbours are linked through the map.
 */

import java.util.ArrayList;
import java.util.List;

public class CloneGraph {
    static class Node {
        public int val;
        public List<Node> neighbours;

        public Node() {
            this(0, new ArrayList<>());
        }

        public Node(int val) {
            this(val, new ArrayList<>());
        }

        public Node(int val, List<Node> neighbours) {
            this.val = val;
            this.neighbours = neighbours;
        }
    }

    public Node cloneGraph(Node node) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            // if (node == null) {
            //     return null;
            // }
            //
            // Map<Node, Node> clones = new HashMap<>();
            // Queue<Node> queue = new ArrayDeque<>();
            // queue.offer(node);
            // clones.put(node, new Node(node.val));
            //
            // while (!queue.isEmpty()) {
            //     Node current = queue.poll();
            //     for (Node neighbour : current.neighbours) {
            //         if (!clones.containsKey(neighbour)) {
            //             clones.put(neighbour, new Node(neighbour.val));
            //             queue.offer(neighbour);
            //         }
            //         clones.get(current).neighbours.add(clones.get(neighbour));
            //     }
            // }
            //
            // return clones.get(node);
        
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        one.neighbours.add(two);
        two.neighbours.add(one);

        System.out.println("Practice stub ready. Implement cloneGraph and verify deep copy.");
    }
}
