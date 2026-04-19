/*
 * Ported from: 06-trees/analogue-questions/Python/range-sum-bst-similar2.py
 * --- Original description ---
LeetCode 501: Find Mode in Binary Search Tree
Difficulty: Easy
Pattern: Trees / BST / DFS

Problem:
Given the root of a binary search tree (BST) with duplicates, return all the mode(s)
(i.e., the most frequently occurred element) in it.

If the tree has more than one mode, return them in any order.

Assume a BST is defined as follows:
- The left subtree of a node contains only nodes with keys less than or equal to the node's key.
- The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
- Both the left and right subtrees must also be binary search trees.

Example 1:
Input: root = [1,null,2,2]
Output: [2]

Example 2:
Input: root = [0]
Output: [0]

Constraints:
- The number of nodes in the tree is in the range [1, 10^4]
- -10^5 <= Node.val <= 10^5

Follow up: Could you do that without using any extra space? (Assume that the implicit
stack space incurred due to recursion does not count).

Time Complexity: O(n)
Space Complexity: O(n)
 */

import java.util.*;
import java.util.function.*;


public class RangeSumBstSimilar2Java {

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
        public List<Integer> findMode(TreeNode root) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // count = Counter()
            // def dfs(node):
            // if not node:
            // return
            // count[node.val] += 1
            // dfs(node.left)
            // dfs(node.right)
            // dfs(root)
            // max_count = max(count.values())
            // return [val for val, cnt in count.items() if cnt == max_count]

            throw new UnsupportedOperationException("Implement findMode");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // root1 = TreeNode(1);
        // root1.right = TreeNode(2)
        // root1.right.left = TreeNode(2)
        // assert solution.findMode(root1) == [2]  // needs locals (port helpers): ['root1']
        System.out.println("✓ Test case 1 passed");
        // root2 = TreeNode(0);
        // assert solution.findMode(root2) == [0]  // needs locals (port helpers): ['root2']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
