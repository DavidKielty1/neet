from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def find_max_level_sum(root: TreeNode) -> int:
    """
    Find the level with the maximum sum of node values using BFS.
    Return the maximum sum found.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: 5 (level 2 has sum 4+5=9, which is the maximum)
    
    Learning goals:
    - BFS with level tracking
    - Sum calculation per level
    - Finding maximum value
    """

    pass

    max_sum = float("-inf")
    queue = deque([root])

    while queue:
        level_size = len(queue)
        level_sum = 0

        # Process all nodes at current level
        for _ in range(level_size):
            node = queue.popleft()
            level_sum += node.val

            # Add children to queue for next level
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)

        # Update maximum sum
        max_sum = max(max_sum, level_sum)

    return max_sum


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

    print(find_max_level_sum(root))  # Should print: 9 (level 2: 4+5=9)

    # Test with larger values
    root2 = TreeNode(10)
    root2.left = TreeNode(20)
    root2.right = TreeNode(30)
    root2.left.left = TreeNode(40)
    root2.left.right = TreeNode(50)
    print(find_max_level_sum(root2))  # Should print: 90 (level 2: 40+50=90)

    # Test single node
    single = TreeNode(7)
    print(find_max_level_sum(single))  # Should print: 7

    # Test empty tree
    print(find_max_level_sum(None))  # Should print: 0
