class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def find_max_value(root: TreeNode) -> int:
    """
    Find the maximum value in a binary tree using DFS.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: 5 (maximum value in the tree)
    
    Learning goals:
    - DFS traversal with value comparison
    - Handling None values
    - Recursive max finding
    """
    if not root:
        return float('-inf')  # Return negative infinity for empty trees
    
    # Find max of: current node, left subtree, right subtree
    left_max = find_max_value(root.left)
    right_max = find_max_value(root.right)
    
    return max(root.val, left_max, right_max)


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
    
    print(find_max_value(root))  # Should print: 5
    
    # Test with larger values
    root2 = TreeNode(10)
    root2.left = TreeNode(25)
    root2.right = TreeNode(15)
    print(find_max_value(root2))  # Should print: 25
    
    # Test single node
    single = TreeNode(7)
    print(find_max_value(single))  # Should print: 7
