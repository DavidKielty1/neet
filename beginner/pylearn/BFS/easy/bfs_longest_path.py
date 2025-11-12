from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def longest_path_to_leaf(root: TreeNode) -> int:
    """
    Find the longest path from root to any leaf node using BFS.
    Return the maximum number of nodes in the path.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: 3 (longest path: 1 -> 2 -> 4, length = 3)
    
    Learning goals:
    - BFS for path finding
    - Distance tracking with tuples
    - Finding maximum distance
    """
    # TODO: Implement your solution here
    if not root:
        return 0

    max_dist = float("-inf")
    queue = deque([root, 0])

    while queue:
        level_size = len(queue)

        for _ in range(level_size):
            node, distance = queue.popleft()

            if not node.left and not node.right:
                max_dist = max(max_dist, distance)

            if node.left:
                queue.append(node.left, distance + 1)
            if node.right:
                queue.append(node.right, distance + 1)

    return max_dist


# Test cases
if __name__ == "__main__":
    # Create test tree:    1
    #                    / \
    #                   2   3
    #                  / \
    #                 4   5
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left.left = TreeNode(4)
    root.left.right = TreeNode(5)

    print(longest_path_to_leaf(root))  # Should print: 3 (1->2->4)

    # Test with deeper tree
    root2 = TreeNode(1)
    root2.left = TreeNode(2)
    root2.right = TreeNode(3)
    root2.left.left = TreeNode(4)
    root2.left.right = TreeNode(5)
    root2.left.left.left = TreeNode(6)
    print(longest_path_to_leaf(root2))  # Should print: 4 (1->2->4->6)

    # Test single node (is a leaf)
    single = TreeNode(7)
    print(longest_path_to_leaf(single))  # Should print: 1

    # Test empty tree
    print(longest_path_to_leaf(None))  # Should print: 0

    # Test unbalanced tree
    root3 = TreeNode(1)
    root3.left = TreeNode(2)
    root3.left.left = TreeNode(3)
    root3.left.left.left = TreeNode(4)
    print(longest_path_to_leaf(root3))  # Should print: 4 (1->2->3->4)
