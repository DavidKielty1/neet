class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def sum_odd_values(root: TreeNode) -> int:
    """
    Calculate the sum of all odd values in a binary tree using DFS.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: 9 (odd values: 1 + 3 + 5 = 9)
    
    Learning goals:
    - DFS traversal with conditional accumulation
    - Modulo operation for odd/even checking
    - Recursive sum with conditions
    """
    # TODO: Implement your solution here
    if not root:
        return 0
    
    is_odd = root.val if root.val % 2 == 1 else 0

    return is_odd + sum_odd_values(root.left) + sum_odd_values(root.right)


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
    
    print(sum_odd_values(root))  # Should print: 9
    
    # Test with all even numbers
    root2 = TreeNode(2)
    root2.left = TreeNode(4)
    root2.right = TreeNode(6)
    print(sum_odd_values(root2))  # Should print: 0
    
    # Test with all odd numbers
    root3 = TreeNode(1)
    root3.left = TreeNode(3)
    root3.right = TreeNode(5)
    print(sum_odd_values(root3))  # Should print: 9
    
    # Test single odd node
    single = TreeNode(7)
    print(sum_odd_values(single))  # Should print: 7
    
    # Test single even node
    single_even = TreeNode(8)
    print(sum_odd_values(single_even))  # Should print: 0
    
    # Test empty tree
    print(sum_odd_values(None))  # Should print: 0
