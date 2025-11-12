from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def shortest_path_to_leaf(root: TreeNode) -> int:
    """
    Find the shortest path from root to any leaf node using BFS.
    Return the minimum number of nodes in the path.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: 2 (shortest path: 1 -> 3, length = 2)
    
    Learning goals:
    - BFS for shortest path problems
    - Early termination when leaf found
    - Distance tracking with tuples
    """
    if not root:
        return 0

    # Queue stores (node, distance) tuples
    queue = deque([(root, 1)])

    while queue:
        node, distance = queue.popleft()

        # If we found a leaf, return the distance
        if not node.left and not node.right:
            return distance

        # Add children with incremented distance
        if node.left:
            queue.append((node.left, distance + 1))
        if node.right:
            queue.append((node.right, distance + 1))

    return 0


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

    print(shortest_path_to_leaf(root))  # Should print: 2 (1->3)

    # Test with deeper tree
    root2 = TreeNode(1)
    root2.left = TreeNode(2)
    root2.right = TreeNode(3)
    root2.left.left = TreeNode(4)
    root2.left.right = TreeNode(5)
    root2.left.left.left = TreeNode(6)
    print(shortest_path_to_leaf(root2))  # Should print: 2 (1->3)

    # Test single node (is a leaf)
    single = TreeNode(7)
    print(shortest_path_to_leaf(single))  # Should print: 1

    # Test empty tree
    print(shortest_path_to_leaf(None))  # Should print: 0
