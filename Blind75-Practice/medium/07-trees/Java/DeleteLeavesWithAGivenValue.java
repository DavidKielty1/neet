/*
 * LeetCode 1325. Delete Leaves With a Given Value
 *
 * Given a binary tree root and an integer target, delete all the leaf nodes
 * with value target.
 *
 * After deleting a leaf node with value target, if its parent becomes a leaf
 * node and also has value target, it should also be deleted. Continue until no
 * more nodes can be removed.
 *
 * Example 1:
 * Input: root = [1,2,3,2,null,2,4], target = 2
 * Output: [1,null,3,null,4]
 *
 * Example 2:
 * Input: root = [1,3,3,3,2], target = 3
 * Output: [1,3,null,null,2]
 *
 * Example 3:
 * Input: root = [1,2,null,2,null,2], target = 2
 * Output: [1]
 *
 * Constraints:
 * - The number of nodes in the tree is in the range [1, 3000].
 * - 1 <= Node.val, target <= 1000
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DeleteLeavesWithAGivenValue {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) {
            return null;
        }
        
        Set<TreeNode> visited = new HashSet<>(); 
        Deque<TreeNode> stack = new ArrayDeque<>();
        Map<TreeNode, TreeNode> parent = new HashMap<>();

        stack.offerLast(root);
        parent.put(root, null);

        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            boolean childrenDone = node.left == null && node.right == null || visited.contains(node);

            if (!childrenDone) {
                visited.add(node);
                if (node.left != null) {
                    parent.put(node.left, node);
                    stack.offerLast(node.left);
                }
                if (node.right != null) {
                    parent.put(node.right, node);
                    stack.offerLast(node.right);
                }
                continue;
            }

            node = stack.pop();

            if (node.right == null && node.left == null && node.val == target) {
                TreeNode p = parent.get(node);

                if (p == null) {
                    return null;
                }
                if (p.left == node) {
                    p.left = null;
                } else {
                    p.right = null;
                }
            }   
        }

        return root;
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        // Stack + visited set + parent map.
        //
        // if (root == null) {
        //     return null;
        // }
        //
        // Deque<TreeNode> stack = new ArrayDeque<>();
        // Set<TreeNode> visited = new HashSet<>();
        // Map<TreeNode, TreeNode> parent = new HashMap<>();

        // stack.push(root);
        // parent.put(root, null);
        //
        // while (!stack.isEmpty()) {
        //     TreeNode node = stack.peek();
        //     boolean childrenDone = node.left == null && node.right == null
        //             || visited.contains(node);
        //     if (!childrenDone) {
        //         visited.add(node);
        //         if (node.right != null) {
        //             parent.put(node.right, node);
        //             stack.push(node.right);
        //         }
        //         if (node.left != null) {
        //             parent.put(node.left, node);
        //             stack.push(node.left);
        //         }
        //         continue;
        //     }
        //     stack.pop();
        //     if (node.left == null && node.right == null && node.val == target) {
        //         TreeNode p = parent.get(node);
        //         if (p == null) {
        //             return null;
        //         }
        //         if (p.left == node) {
        //             p.left = null;
        //         } else {
        //             p.right = null;
        //         }
        //     }
        // }
        //
        // return root;
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
