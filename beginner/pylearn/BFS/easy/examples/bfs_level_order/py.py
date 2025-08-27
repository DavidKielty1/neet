from collections import deque

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def level_order_traversal(root: TreeNode) -> list[list[int]]:
    """
    Perform level-order traversal (BFS) on a binary tree.
    Return a list of lists, where each inner list contains nodes at that level.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: [[1], [2, 3], [4, 5]]
    
    Learning goals:
    - BFS using queue (deque)
    - Level-by-level processing
    - Queue operations (append, popleft)
    """
    if not root:
        return []
    
    result = []
    queue = deque([root])
    
    while queue:
        level_size = len(queue)
        current_level = []
        
        # Process all nodes at current level
        for _ in range(level_size):
            node = queue.popleft()
            current_level.append(node.val)
            
            # Add children to queue for next level
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
        
        result.append(current_level)
    
    return result


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
    
    print(level_order_traversal(root))  # Should print: [[1], [2, 3], [4, 5]]
    
    # Test single node
    single = TreeNode(7)
    print(level_order_traversal(single))  # Should print: [[7]]
    
    # Test empty tree
    print(level_order_traversal(None))  # Should print: []
    
    # Test perfect binary tree
    root2 = TreeNode(1)
    root2.left = TreeNode(2)
    root2.right = TreeNode(3)
    root2.left.left = TreeNode(4)
    root2.left.right = TreeNode(5)
    root2.right.left = TreeNode(6)
    root2.right.right = TreeNode(7)
    print(level_order_traversal(root2))  # Should print: [[1], [2, 3], [4, 5, 6, 7]]
