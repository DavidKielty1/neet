/*
 * LeetCode 102. Binary Tree Level Order Traversal
 *
 * Given the root of a binary tree, return the level order traversal of its
 * nodes' values. In other words, return the values level by level from left
 * to right.
 *
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[3],[9,20],[15,7]]
 *
 * Example 2:
 * Input: root = [1]
 * Output: [[1]]
 *
 * Example 3:
 * Input: root = []
 * Output: []
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [0, 2000].
 * - -1000 <= Node.val <= 1000
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) {
            return levels;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {    
            int n = queue.size();
            List<Integer> currLevel = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                TreeNode currNode = queue.poll();
                currLevel.add(currNode.val);
                if (currNode.left != null) {
                    queue.offer(currNode.left);
                }
                if (currNode.right != null) {
                    queue.offer(currNode.right);
                }
            }
            levels.add(currLevel);
        }
        return levels;


        
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        // Breadth-first search with a queue.
        // Process one queue-size batch at a time to capture a level.
        //
        // List<List<Integer>> result = new ArrayList<>();
        // if (root == null) {
        //     return result;
        // }
        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.offer(root);
        // while (!queue.isEmpty()) {
        //     int size = queue.size();
        //     List<Integer> level = new ArrayList<>();

        //     for (int i = 0; i < size; i++) {
        //         TreeNode node = queue.poll();
        //         level.add(node.val);
        //         if (node.left != null) {
        //             queue.offer(node.left);
        //         }
        //         if (node.right != null) {
        //             queue.offer(node.right);
        //         }
        //     }
        //     result.add(level);
        // }
        // return result;
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
