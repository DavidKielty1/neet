/*
572. Subtree of Another Tree
Difficulty: Easy
Pattern: Trees / DFS

Given the roots of two binary trees root and subRoot, return true if there is a
node in root whose entire subtree is exactly the same as subRoot.

Example:
root = [3,4,5,1,2], subRoot = [4,1,2] -> true
The subtree rooted at node 4 in root matches subRoot exactly.

Example:
root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2] -> false
The extra 0 changes the structure, so the subtree is not an exact match.

Idea:
At each node in root, check whether the subtree starting there is the same as
subRoot. If not, continue searching in the left and right children.

Time: O(m * n) in the simple recursive approach, Space: O(h)
*/

public class SubtreeOfAnotherTreeJava {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        class Solver {
            public boolean isSame(TreeNode a, TreeNode b) {
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

            private boolean dfs (TreeNode node) {
                if (node == null) {
                    return false;
                }
                return isSame(node, subRoot) || dfs(root.left) || dfs(root.right);
            }
        }

        if (subRoot == null) {
            return true;
        }

        return new Solver().dfs(root);


        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

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
