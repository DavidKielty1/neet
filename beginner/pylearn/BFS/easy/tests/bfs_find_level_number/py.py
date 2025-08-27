from collections import deque

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def find_level_number(root: TreeNode, target: int) -> int:
    """
    Find the level number (1-indexed) where a target value first appears using BFS.
    Return the level number, or -1 if target is not found.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    Target: 4
    
    Output: 3 (4 appears at level 3)
    
    Learning goals:
    - BFS with level tracking
    - 1-indexed level counting
    - Early termination when target found
    """
    # TODO: Implement your solution here
    if not root:
        return -1;

    queue = deque([root])
    level = 1

    while queue:
        level_size = len(queue)

        for _ in range(level_size):
            node = queue.popleft()

            if node.val == target:
                return level

            if(node.left):
                queue.append(node.left)
            if(node.right):
                queue.append(node.right)

        level += 1

    return -1







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
    
    print(find_level_number(root, 4))   # Should print: 3
    print(find_level_number(root, 1))   # Should print: 1
    print(find_level_number(root, 2))   # Should print: 2
    print(find_level_number(root, 6))   # Should print: -1
    
    # Test single node
    single = TreeNode(7)
    print(find_level_number(single, 7)) # Should print: 1
    print(find_level_number(single, 8)) # Should print: -1
    
    # Test empty tree
    print(find_level_number(None, 5))   # Should print: -1
    
    # Test with duplicates
    root2 = TreeNode(1)
    root2.left = TreeNode(1)
    root2.right = TreeNode(2)
    print(find_level_number(root2, 1))  # Should print: 1 (first occurrence)
