from collections import deque

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def count_nodes_bfs(root: TreeNode) -> int:
    """
    Count the total number of nodes in a binary tree using BFS.
    
    Example:
    Input: 
        1
       / \
      2   3
     / \
    4   5
    
    Output: 5 (nodes: 1, 2, 3, 4, 5)
    
    Learning goals:
    - Simple BFS traversal
    - Node counting
    - Queue operations
    """
    # TODO: Implement your solution here
    pass

    if not root:
        return 0
    
    queue = deque([root])
    total_nodes = 0

    while queue:
        node = queue.popleft()
        total_nodes += 1

        if(node.left):
            queue.append(node.left)
        if(node.right):
            queue.append(node.right)

    return total_nodes
        
        


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
    
    print(count_nodes_bfs(root))  # Should print: 5
    
    # Test single node
    single = TreeNode(7)
    print(count_nodes_bfs(single))  # Should print: 1
    
    # Test empty tree
    print(count_nodes_bfs(None))  # Should print: 0
    
    # Test larger tree
    root2 = TreeNode(1)
    root2.left = TreeNode(2)
    root2.right = TreeNode(3)
    root2.left.left = TreeNode(4)
    root2.left.right = TreeNode(5)
    root2.right.left = TreeNode(6)
    root2.right.right = TreeNode(7)
    print(count_nodes_bfs(root2))  # Should print: 7
