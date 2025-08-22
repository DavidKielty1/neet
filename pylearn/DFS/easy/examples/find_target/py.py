class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def find_target(root: TreeNode, target: int) -> bool:
    """
    Check if a target value exists in a binary tree using DFS.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    Target: 4
    
    Output: True (4 exists in the tree)
    
    Learning goals:
    - DFS traversal with early termination
    - Boolean return values
    - Recursive search
    """
    if not root:
        return False
    
    # Check current node
    if root.val == target:
        return True
    
    # Search in left and right subtrees
    return find_target(root.left, target) or find_target(root.right, target)


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
    
    print(find_target(root, 4))   # Should print: True
    print(find_target(root, 6))   # Should print: False
    print(find_target(root, 1))   # Should print: True
    print(find_target(root, 3))   # Should print: True
    
    # Test empty tree
    print(find_target(None, 5))   # Should print: False
    
    # Test single node
    single = TreeNode(7)
    print(find_target(single, 7)) # Should print: True
    print(find_target(single, 8)) # Should print: False
