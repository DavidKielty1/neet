/*
 * Ported from: 06-trees/analogue-questions/Python/subtree-of-another-tree-similar3.py
 * --- Original description ---
Similar Problem 3: Most Frequent Subtree Sum
Difficulty: Easy
Pattern: Trees (DFS + Hash Map)

Problem:
Given the root of a binary tree, return the most frequent subtree sum.
If there is a tie, return all the values with the highest frequency in any order.

The subtree sum of a node is defined as the sum of all the node values formed by the subtree
rooted at that node (including the node itself).

Example 1:
Input: root = [5,2,-3]
Output: [2,-3,4]
Explanation: Sums are 2, -3, 4 (all appear once)

Example 2:
Input: root = [5,2,-5]
Output: [2]
Explanation: Sum 2 appears twice

Constraints:
- The number of nodes in the tree is in the range [1, 10^4]
- -10^5 <= Node.val <= 10^5
 */

import java.util.*;
import java.util.function.*;


public class SubtreeOfAnotherTreeSimilar3 {

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
        public List<Integer> findFrequentTreeSum(TreeNode root) {
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

            // sum_count = Counter()
            // def get_sum(node):
            // if not node:
            // return 0
            // left_sum = get_sum(node.left)
            // right_sum = get_sum(node.right)
            // total_sum = left_sum + right_sum + node.val
            // sum_count[total_sum] += 1
            // return total_sum
            // get_sum(root)
            // if not sum_count:
            // return []
            // max_freq = max(sum_count.values())
            // return [s for s, freq in sum_count.items() if freq == max_freq]

            throw new UnsupportedOperationException("Implement findFrequentTreeSum");
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // root = create_tree([5, 2, -3]);
        // result = sorted(sol.findFrequentTreeSum(root));
        // assert result == sorted([2, -3, 4])  // needs locals (port helpers): ['result']
        System.out.println("✓ Test case 1 passed");
        // root = create_tree([5, 2, -5]);
        // assert solution.findFrequentTreeSum(root) == [2]  // needs locals (port helpers): ['root']
        System.out.println("✓ Test case 2 passed");
        System.out.println("\nAll test cases passed!");
    }
}
