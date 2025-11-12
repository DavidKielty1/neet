from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def find_min_level_sum(root: TreeNode) -> int:
    """
    Find the level with the minimum sum of node values using BFS.
    Return the minimum sum found.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: 1 (level 0 has sum 1, which is the minimum)
    
    Learning goals:
    - BFS with level tracking
    - Sum calculation per level
    - Finding minimum value
    """
    # TODO: Implement your solution here

    if not root:
        return 1

    current_min = float("inf")
    queue = deque([root])

    while queue:
        level_size = len(queue)
        level_sum = 0

        for _ in range(level_size):
            node = queue.popleft()
            level_sum += node.val

            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)

        current_min = min(current_min, level_sum)

    return current_min


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

    print(find_min_level_sum(root))  # Should print: 1 (level 0)

    # Test with larger values
    root2 = TreeNode(10)
    root2.left = TreeNode(5)
    root2.right = TreeNode(15)
    root2.left.left = TreeNode(2)
    root2.left.right = TreeNode(3)
    print(find_min_level_sum(root2))  # Should print: 5 (level 1: 5+15=20)

    # Test single node
    single = TreeNode(7)
    print(find_min_level_sum(single))  # Should print: 7

    # Test with negative values
    root3 = TreeNode(5)
    root3.left = TreeNode(-3)
    root3.right = TreeNode(-2)
    print(find_min_level_sum(root3))  # Should print: -5 (level 1: -3+-2=-5)
