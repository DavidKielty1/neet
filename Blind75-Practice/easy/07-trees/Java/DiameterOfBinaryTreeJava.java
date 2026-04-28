/*
543. Diameter of Binary Tree
Difficulty: Easy
Pattern: Trees / DFS

Given the root of a binary tree, return the diameter of the tree. The diameter
is the length of the longest path between any two nodes, measured in edges.
That path may or may not pass through the root.

Example:
root = [1,2,3,4,5] -> 3
One longest path is 4 -> 2 -> 1 -> 3, which contains 3 edges.

Example:
root = [1,2] -> 1

Idea:
Use DFS to compute the depth of each subtree. At every node, the path passing
through it has length leftDepth + rightDepth, so track the maximum seen.

Time: O(n), Space: O(h)
*/

public class DiameterOfBinaryTreeJava {
    public int diameterOfBinaryTree(TreeNode root) {        
        class Solver {
            int diameter = 0;
            int depth(TreeNode node) {
                if (node == null) {
                    return 0;
                }
                int left = depth(node.left);
                int right = depth(node.right);
                diameter = Math.max(diameter, left + right);
                return 1 + Math.max(left, right);
            }
        }
        Solver solver = new Solver();
        solver.depth(root);
        return solver.diameter;
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // Track max path through each node: leftHeight + rightHeight.

        // class Solver {
        //     int diameter = 0;
        //     int depth(TreeNode node) {
        //         if (node == null) {
        //             return 0;
        //         }
        //         int left = depth(node.left);
        //         int right = depth(node.right);
        //         diameter = Math.max(diameter, left + right);
        //         return 1 + Math.max(left, right);
        //     }
        // }
        // Solver solver = new Solver();
        // solver.depth(root);
        // return solver.diameter;
        throw new UnsupportedOperationException("Implement diameterOfBinaryTree");
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
