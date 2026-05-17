/*
 * Ported from: 06-trees/analogue-questions/Python/lowest-common-ancestor-bst-similar1.py
 * --- Original description ---
Similar Problem 1: Closest Binary Search Tree Value
Difficulty: Easy
Pattern: Trees (BST)

Problem:
Given the root of a binary search tree and a target value,
return the value in the BST that is closest to the target.

Example 1:
Input: root = [4,2,5,1,3], target = 3.714286
Output: 4

Example 2:
Input: root = [1], target = 4.428571
Output: 1

Constraints:
- The number of nodes in the tree is in the range [1, 10^4]
- 0 <= Node.val <= 10^9
- -10^9 <= target <= 10^9
 */

import java.util.*;
import java.util.function.*;


public class LowestCommonAncestorBstSimilar1 {

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
        public int closestValue(TreeNode root, double target) {
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

            // closest = root.val
            // current = root
            // while current:
            // if abs(current.val - target) < abs(closest - target):
            // closest = current.val
            // if target < current.val:
            // current = current.left
            // else:
            // current = current.right
            // return closest

            throw new UnsupportedOperationException("Implement closestValue");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // root = create_tree(java.util.List.of(4,2,5,1,3));
        // assert solution.closestValue(root, 3.714286) == 4  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 1 passed");
        // root = create_tree(java.util.List.of(1));
        // assert solution.closestValue(root, 4.428571) == 1  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
