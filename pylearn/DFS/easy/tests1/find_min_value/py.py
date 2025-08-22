class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def find_min_value(root: TreeNode) -> int:
    """
    Find the minimum value in a binary tree using DFS.
    
    Example:
    Input: 
        5
       / \
      2   3
     / \
    4   1
    
    Output: 1 (minimum value in the tree)
    
    Learning goals:
    - DFS traversal with min comparison
    - Handling edge cases for min finding
    - Recursive min finding
    """
    # TODO: Implement your solution here
    if not root:
        return float('inf') 

    left_min = find_min_value(root.left)
    right_min = find_min_value(root.right)

    return min(root.val, left_min, right_min)



# Test cases
if __name__ == "__main__":
    # Create test tree:    5
    #                    / \
    #                   2   3
    #                  / \
    #                 4   1
    root = TreeNode(5)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left.left = TreeNode(4)
    root.left.right = TreeNode(1)
    
    print(find_min_value(root))  # Should print: 1
    
    # Test with negative values
    root2 = TreeNode(10)
    root2.left = TreeNode(-5)
    root2.right = TreeNode(15)
    print(find_min_value(root2))  # Should print: -5
    
    # Test single node
    single = TreeNode(7)
    print(find_min_value(single))  # Should print: 7
    
    # Test with all same values
    root3 = TreeNode(5)
    root3.left = TreeNode(5)
    root3.right = TreeNode(5)
    print(find_min_value(root3))  # Should print: 5
