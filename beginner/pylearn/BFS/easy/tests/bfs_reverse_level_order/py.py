from collections import deque

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def reverse_level_order(root: TreeNode) -> list[list[int]]:
    """
    Perform reverse level-order traversal (BFS) on a binary tree.
    Return a list of lists, where each inner list contains nodes at that level,
    but levels are returned from bottom to top.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: [[4, 5], [2, 3], [1]] (bottom to top)
    
    Learning goals:
    - BFS with level tracking
    - Reversing level order
    - List manipulation
    """
    # TODO: Implement your solution here
    
    if not root:
        return [];

    result = []
    queue = deque([root])

    while queue:
        level_size = len(queue)
        level_nodes = []

        for _ in range(level_size):
            node = queue.popleft()

            level_nodes.append(node.val)

            if(node.left):
                queue.append(node.left)
            if(node.right):
                queue.append(node.right)

        result.append(level_nodes)

    return level_nodes[::-1]


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
    
    print(reverse_level_order(root))  # Should print: [[4, 5], [2, 3], [1]]
    
    # Test single node
    single = TreeNode(7)
    print(reverse_level_order(single))  # Should print: [[7]]
    
    # Test empty tree
    print(reverse_level_order(None))  # Should print: []
    
    # Test perfect binary tree
    root2 = TreeNode(1)
    root2.left = TreeNode(2)
    root2.right = TreeNode(3)
    root2.left.left = TreeNode(4)
    root2.left.right = TreeNode(5)
    root2.right.left = TreeNode(6)
    root2.right.right = TreeNode(7)
    print(reverse_level_order(root2))  # Should print: [[4, 5, 6, 7], [2, 3], [1]]
