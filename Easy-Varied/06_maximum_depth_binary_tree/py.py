class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def max_depth(root):
    """
    Maximum Depth of Binary Tree
    
    Given the root of a binary tree, return its maximum depth.
    
    A binary tree's maximum depth is the number of nodes along the longest path from the root 
    node down to the farthest leaf node.
    
    Example 1:
    Input: root = [3,9,20,null,null,15,7]
    Output: 3
    
    Example 2:
    Input: root = [1,null,2]
    Output: 2
    
    Constraints:
    - The number of nodes in the tree is in the range [0, 104].
    - -100 <= Node.val <= 100
    """
    if not root:
        return 0
    
    return 1 + max(max_depth(root.left), max_depth(root.right))
    

# Test cases
if __name__ == "__main__":
    # Test case 1: [3,9,20,null,null,15,7]
    root1 = TreeNode(3)
    root1.left = TreeNode(9)
    root1.right = TreeNode(20)
    root1.right.left = TreeNode(15)
    root1.right.right = TreeNode(7)
    
    print("Test 1: root = [3,9,20,null,null,15,7]")
    result1 = max_depth(root1)
    print(f"Expected: 3, Got: {result1}")
    
    # Test case 2: [1,null,2]
    root2 = TreeNode(1)
    root2.right = TreeNode(2)
    
    print("Test 2: root = [1,null,2]")
    result2 = max_depth(root2)
    print(f"Expected: 2, Got: {result2}")
    
    # Test case 3: []
    root3 = None
    
    print("Test 3: root = []")
    result3 = max_depth(root3)
    print(f"Expected: 0, Got: {result3}")
    
    # Test case 4: [1]
    root4 = TreeNode(1)
    
    print("Test 4: root = [1]")
    result4 = max_depth(root4)
    print(f"Expected: 1, Got: {result4}")
