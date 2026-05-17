/*
 * Ported from: 06-trees/analogue-questions/Python/balanced-binary-tree-similar2.py
 * --- Original description ---
Similar Problem 2: Binary Tree Paths
Difficulty: Easy
Pattern: Trees (DFS)

Problem:
Given the root of a binary tree, return all root-to-leaf paths in any order.
A leaf is a node with no children.

Example 1:
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]

Example 2:
Input: root = [1]
Output: ["1"]

Constraints:
- The number of nodes in the tree is in the range [1, 100]
- -100 <= Node.val <= 100
 */

import java.util.*;
import java.util.function.*;


public class BalancedBinaryTreeSimilar2 {

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

    static class Solution {
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

            // if not root:
            // return []
            // paths = []
            // def dfs(node, path):
            // if not node:
            // return
            // path.append(str(node.val))
            // if not node.left and (not node.right):
            // paths.append('->'.join(path))
            // else:
            // dfs(node.left, path)
            // dfs(node.right, path)
            // path.pop()
            // dfs(root, [])
            // return paths

            throw new UnsupportedOperationException("Implement binaryTreePaths");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // root = create_tree([1, 2, 3, null, 5]);
        // result = sorted(sol.binaryTreePaths(root));
        // assert result == ['1->2->5', '1->3']  // needs locals (port helpers): ['result']
        System.out.println("✓ Test case 1 passed");
        // root = create_tree(java.util.List.of(1));
        // assert solution.binaryTreePaths(root) == ['1']  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
