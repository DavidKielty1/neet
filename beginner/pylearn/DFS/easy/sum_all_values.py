class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def sum_all_values(root: TreeNode) -> int:
    """
    Calculate the sum of all values in a binary tree using DFS.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: 15 (1 + 2 + 3 + 4 + 5)
    
    Learning goals:
    - DFS traversal with accumulation
    - Recursive sum calculation
    - Handling empty trees
    """
    if not root:
        return 0

    # Sum current node + left subtree + right subtree
    return root.val + sum_all_values(root.left) + sum_all_values(root.right)


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

    print(sum_all_values(root))  # Should print: 15

    # Test single node
    single = TreeNode(7)
    print(sum_all_values(single))  # Should print: 7

    # Test empty tree
    print(sum_all_values(None))  # Should print: 0

    # Test larger tree
    root2 = TreeNode(10)
    root2.left = TreeNode(5)
    root2.right = TreeNode(15)
    root2.left.left = TreeNode(3)
    root2.left.right = TreeNode(7)
    print(sum_all_values(root2))  # Should print: 40
