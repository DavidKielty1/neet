class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def check_if_exists(root: TreeNode, target: int) -> bool:
    """
    Check if a target value exists in a binary tree using DFS.
    Return True if found, False otherwise.
    
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
    - Recursive search with OR logic
    """
    # TODO: Implement your solution here
    if not root:
        return False
    
    if root.val == target:
        return True
    
    return check_if_exists(root.left, target) or check_if_exists(root.right, target)


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
    
    print(check_if_exists(root, 4))   # Should print: True
    print(check_if_exists(root, 6))   # Should print: False
    print(check_if_exists(root, 1))   # Should print: True
    print(check_if_exists(root, 3))   # Should print: True
    print(check_if_exists(root, 2))   # Should print: True
    print(check_if_exists(root, 5))   # Should print: True
    
    # Test empty tree
    print(check_if_exists(None, 5))   # Should print: False
    
    # Test single node
    single = TreeNode(7)
    print(check_if_exists(single, 7)) # Should print: True
    print(check_if_exists(single, 8)) # Should print: False
    
    # Test with duplicates
    root2 = TreeNode(1)
    root2.left = TreeNode(1)
    root2.right = TreeNode(2)
    print(check_if_exists(root2, 1))  # Should print: True
