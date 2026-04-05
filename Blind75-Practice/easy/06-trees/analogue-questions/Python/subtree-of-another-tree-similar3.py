"""
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
"""

from typing import Optional, List
from collections import deque, Counter


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def findFrequentTreeSum(self, root: Optional[TreeNode]) -> List[int]:
        """
        Approach: DFS to calculate subtree sums

        Strategy:
        1. Calculate sum for each subtree
        2. Count frequency of each sum
        3. Return sums with maximum frequency
        """

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        #

        sum_count = Counter()

        def get_sum(node):
            if not node:
                return 0

            # Calculate subtree sum
            left_sum = get_sum(node.left)
            right_sum = get_sum(node.right)
            total_sum = left_sum + right_sum + node.val

            # Count this sum
            sum_count[total_sum] += 1

            return total_sum

        get_sum(root)

        if not sum_count:
            return []

        # Find maximum frequency
        max_freq = max(sum_count.values())

        # Return all sums with max frequency
        return [s for s, freq in sum_count.items() if freq == max_freq]


# Helper functions
def create_tree(values):
    if not values:
        return None

    root = TreeNode(values[0])
    queue = deque([root])
    i = 1

    while queue and i < len(values):
        node = queue.popleft()

        if i < len(values) and values[i] is not None:
            node.left = TreeNode(values[i])
            queue.append(node.left)
        i += 1

        if i < len(values) and values[i] is not None:
            node.right = TreeNode(values[i])
            queue.append(node.right)
        i += 1

    return root


# Test cases
if __name__ == "__main__":
    solution = Solution()

    # Test case 1
    root = create_tree([5, 2, -3])
    result = sorted(solution.findFrequentTreeSum(root))
    assert result == sorted([2, -3, 4])
    print("✓ Test case 1 passed")

    # Test case 2
    root = create_tree([5, 2, -5])
    assert solution.findFrequentTreeSum(root) == [2]
    print("✓ Test case 2 passed")

    print("\nAll test cases passed!")
