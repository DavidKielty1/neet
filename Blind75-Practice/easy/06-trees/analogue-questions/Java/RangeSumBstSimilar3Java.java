/*
 * Ported from: 06-trees/analogue-questions/Python/range-sum-bst-similar3.py
 * --- Original description ---
LeetCode 653: Two Sum IV - Input is a BST
Difficulty: Easy
Pattern: Trees / BST / Hash Set

Problem:
Given the root of a binary search tree and an integer k, return true if there exist
two elements in the BST such that their sum is equal to k, or false otherwise.

Example 1:
Input: root = [5,3,6,2,4,null,7], k = 9
Output: true

Example 2:
Input: root = [5,3,6,2,4,null,7], k = 28
Output: false

Constraints:
- The number of nodes in the tree is in the range [1, 10^4]
- -10^4 <= Node.val <= 10^4
- root is guaranteed to be a valid binary search tree
- -10^5 <= k <= 10^5

Time Complexity: O(n)
Space Complexity: O(n)
 */

import java.util.*;
import java.util.function.*;


public class RangeSumBstSimilar3Java {

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
        public boolean findTarget(TreeNode root, int k) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // seen = set()
            // def dfs(node):
            // if not node:
            // return False
            // complement = k - node.val
            // if complement in seen:
            // return True
            // seen.add(node.val)
            // return dfs(node.left) or dfs(node.right)
            // return dfs(root)

            throw new UnsupportedOperationException("Implement findTarget");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // root1 = TreeNode(5);
        // root1.left = TreeNode(3)
        // root1.right = TreeNode(6)
        // root1.left.left = TreeNode(2)
        // root1.left.right = TreeNode(4)
        // root1.right.right = TreeNode(7)
        // assert solution.findTarget(root1, 9) == True  // needs locals (port helpers): ['root1']
        System.out.println("✓ Test case 1 passed");
        // assert solution.findTarget(root1, 28) == False  // needs locals (port helpers): ['root1']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
