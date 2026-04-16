/*
257. Binary Tree Paths
Difficulty: Easy
Pattern: Trees / Backtracking

Return all root-to-leaf paths as strings.

Time: O(n), Space: O(h)
*/
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePathsJava {
    public List<String> binaryTreePaths(TreeNode root) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // DFS backtracking with StringBuilder.

        // java.util.List<String> result = new java.util.ArrayList<>();
        // if (root == null) {
        //     return result;
        // }
        // class State {
        //     TreeNode node;
        //     String path;
        //     State(TreeNode node, String path) {
        //         this.node = node;
        //         this.path = path;
        //     }
        // }
        // java.util.Deque<State> stack = new java.util.ArrayDeque<>();
        // stack.push(new State(root, String.valueOf(root.val)));
        // while (!stack.isEmpty()) {
        //     State current = stack.pop();
        //     if (current.node.left == null && current.node.right == null) {
        //         result.add(current.path);
        //         continue;
        //     }
        //     if (current.node.right != null) {
        //         stack.push(new State(current.node.right, current.path + "->" + current.node.right.val));
        //     }
        //     if (current.node.left != null) {
        //         stack.push(new State(current.node.left, current.path + "->" + current.node.left.val));
        //     }
        // }
        // return result;
        throw new UnsupportedOperationException("Implement binaryTreePaths");
    }
    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode() {}

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


}
