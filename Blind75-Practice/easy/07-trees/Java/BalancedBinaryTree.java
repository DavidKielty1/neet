/*
110. Balanced Binary Tree
Difficulty: Easy
Pattern: Trees / DFS

Given the root of a binary tree, return true if the tree is height-balanced.
A binary tree is height-balanced when, for every node, the heights of the
left and right subtrees differ by at most 1.

Example:
root = [3,9,20,null,null,15,7] -> true
The left subtree has height 1 and the right subtree has height 2, so the tree
is balanced at every node.

Example:
root = [1,2,2,3,3,null,null,4,4] -> false
The left side is too deep compared with the right side, so some node has a
height difference greater than 1.

Idea:
Use bottom-up DFS. For each node, compute subtree height. If a subtree is
already unbalanced, bubble up a sentinel such as -1 to stop extra work.

Time: O(n), Space: O(h)
*/

//   1
//  /\      
// 2  3
//    \
//     4
//      \
//       5

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return dfs(root) == -1 ? false : true;
    }

    private int dfs (TreeNode node) {
        if (node == null) return 0;

        int left = dfs(node.left);
        if (left == -1) {
            return -1;
        }

        int right = dfs(node.right);
        if (right == -1) {
            return -1;
        }

        int difference = Math.abs(left - right);
        if (difference > 1) {
            return -1;
        }

        return 1 + Math.max(left, right);
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
        // Bottom-up height or check depth per node.

        // public boolean isBalanced(TreeNode root) {
        //     return height(root) != -1;
        // }

        // int height(TreeNode node) {
        //     if (node == null) {
        //         return 0;
        //     }
        //     int left = height(node.left);
        //     if (left == -1) {
        //         return -1;
        //     }
        //     int right = height(node.right);
        //     if (right == -1) {
        //         return -1;
        //     }
        //     if (Math.abs(left - right) > 1) {
        //         return -1;
        //     }
        //     return 1 + Math.max(left, right);
        // }
        
    
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
