/*
 * 572. Subtree of Another Tree
 * Difficulty: Easy
 * Pattern: Trees / DFS
 *
 * Problem:
 * Given the roots of two binary trees root and subRoot, return true if there
 * is a subtree of root with the same structure and node values as subRoot, and
 * false otherwise. A subtree of a binary tree consists of a node in the tree
 * and all of that node's descendants. The tree itself may also be considered a
 * subtree of itself.
 *
 * Example 1:
 * Input: root = [3,4,5,1,2], subRoot = [4,1,2]
 * Output: true
 *
 * Example 2:
 * Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
 * Output: false
 *
 * Constraints:
 * - The number of nodes in the root tree is in the range [1, 2000]
 * - The number of nodes in the subRoot tree is in the range [1, 1000]
 * - -10^4 <= root.val <= 10^4
 * - -10^4 <= subRoot.val <= 10^4
 */

public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }
        return hasSubtree(root, subRoot);
    }

    private boolean hasSubtree(TreeNode node, TreeNode subRoot) {
        if (node == null) {
            return false;
        }
        return isSame(node, subRoot)
            || hasSubtree(node.left, subRoot)
            || hasSubtree(node.right, subRoot);
    }

    private boolean isSame(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        return a.val == b.val
            && isSame(a.left, b.left)
            && isSame(a.right, b.right);
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

        // Compare structures / same-tree helper.

        // class Solver {
        //     boolean same(TreeNode a, TreeNode b) {
        //         if (a == null && b == null) {
        //             return true;
        //         }
        //         if (a == null || b == null) {
        //             return false;
        //         }
        //         return a.val == b.val
        //                 && same(a.left, b.left)
        //                 && same(a.right, b.right);
        //     }
        //     boolean dfs(TreeNode node) {
        //         if (node == null) {
        //             return false;
        //         }
        //         return same(node, subRoot) || dfs(node.left) || dfs(node.right);
        //     }
        // }

        // if (subRoot == null) {
        //     return true;
        // }

        // return new Solver().dfs(root);
    
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


