from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def find_target_level(root: TreeNode, target: int) -> int:
    """
    Find the level (0-indexed) where a target value first appears using BFS.
    Return -1 if target is not found.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    Target: 4
    
    Output: 2 (4 appears at level 2)
    
    Learning goals:
    - BFS with level tracking
    - Early termination when target found
    - Level counting
    """
    if not root:
        return -1

    queue = deque([root])
    level = 0

    while queue:
        level_size = len(queue)

        # Process all nodes at current level
        for _ in range(level_size):
            node = queue.popleft()

            # Check if current node is target
            if node.val == target:
                return level

            # Add children to queue for next level
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)

        level += 1

    return -1  # Target not found


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

    print(find_target_level(root, 4))  # Should print: 2
    print(find_target_level(root, 1))  # Should print: 0
    print(find_target_level(root, 2))  # Should print: 1
    print(find_target_level(root, 6))  # Should print: -1

    # Test single node
    single = TreeNode(7)
    print(find_target_level(single, 7))  # Should print: 0
    print(find_target_level(single, 8))  # Should print: -1

    # Test empty tree
    print(find_target_level(None, 5))  # Should print: -1
