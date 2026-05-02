# Trees (DFS/BFS)

## Pattern Overview

Trees are hierarchical data structures with a root node and child nodes. Tree traversal and manipulation are fundamental algorithms that use:

- **DFS (Depth-First Search)** - Explore as deep as possible before backtracking
- **BFS (Breadth-First Search)** - Explore level by level

## Java Practice File Builder

When a Java practice file has only one solution method, keep the usual single spoiler spacer
block in that method.

When the solution naturally spans multiple methods, such as a helper DFS, a comparison
helper, a constructor plus `add`, or an API method plus the main solver:

1. Leave the earlier/helper method bodies unimplemented.
2. Do not add separate 40-60 line `//` spacer blocks to those helper methods.
3. Keep exactly one 40-60 line `//` spacer block in the main method the learner is meant
   to solve from.
4. Put one combined commented reference implementation under that single spacer block,
   including all related methods together.
5. Avoid duplicate commented solutions and do not add `throw new UnsupportedOperationException(...)`
   placeholders.

## Key Concepts

1. **Binary Tree** - Each node has at most 2 children (left, right)
2. **Binary Search Tree (BST)** - Left < Root < Right (ordered)
3. **Traversals**:
   - **Preorder**: Root → Left → Right
   - **Inorder**: Left → Root → Right (gives sorted order for BST)
   - **Postorder**: Left → Right → Root
   - **Level Order**: BFS, level by level

## Problems in This Category

### Easy Level

| Problem                      | LeetCode # | Pattern | Key Technique      |
| ---------------------------- | ---------- | ------- | ------------------ |
| Invert Binary Tree           | 226        | DFS     | Swap children      |
| Maximum Depth of Binary Tree | 104        | DFS     | Recursive height   |
| Same Tree                    | 100        | DFS     | Parallel traversal |
| Subtree of Another Tree      | 572        | DFS     | Tree matching      |
| Balanced Binary Tree         | 110        | DFS     | Height difference  |
| Diameter of Binary Tree      | 543        | DFS     | Path through node  |
| Lowest Common Ancestor (BST) | 235        | BST     | BST property       |

## Common Patterns

### 1. DFS Recursive Template

```python
def dfs(root):
    # Base case
    if not root:
        return base_value

    # Recursive calls
    left_result = dfs(root.left)
    right_result = dfs(root.right)

    # Process current node
    current_result = process(root.val, left_result, right_result)

    return current_result
```

### 2. BFS Level Order Template

```python
from collections import deque

def bfs(root):
    if not root:
        return []

    queue = deque([root])
    result = []

    while queue:
        level_size = len(queue)
        level = []

        for _ in range(level_size):
            node = queue.popleft()
            level.append(node.val)

            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)

        result.append(level)

    return result
```

### 3. Invert Tree

```python
def invert_tree(root):
    if not root:
        return None

    # Swap children
    root.left, root.right = root.right, root.left

    # Recursively invert subtrees
    invert_tree(root.left)
    invert_tree(root.right)

    return root
```

### 4. Tree Height

```python
def max_depth(root):
    if not root:
        return 0

    return 1 + max(max_depth(root.left), max_depth(root.right))
```

### 5. Validate BST

```python
def is_valid_bst(root, min_val=float('-inf'), max_val=float('inf')):
    if not root:
        return True

    if root.val <= min_val or root.val >= max_val:
        return False

    return (is_valid_bst(root.left, min_val, root.val) and
            is_valid_bst(root.right, root.val, max_val))
```

## When to Use DFS vs BFS

### Use DFS when:

- ✅ Finding paths
- ✅ Checking properties (balanced, symmetric)
- ✅ Tree construction/modification
- ✅ Memory constrained (uses less space for wide trees)
- ✅ Problem involves subtrees

### Use BFS when:

- ✅ Level order traversal
- ✅ Finding shortest path (in unweighted trees)
- ✅ Problems involving levels/depths
- ✅ Finding nodes at specific level
- ✅ Printing tree level by level

## Time & Space Complexity

| Operation        | DFS      | BFS  | Notes               |
| ---------------- | -------- | ---- | ------------------- |
| Traversal        | O(n)     | O(n) | Visit all nodes     |
| Space (Balanced) | O(log n) | O(n) | Recursion vs queue  |
| Space (Skewed)   | O(n)     | O(1) | Call stack vs queue |

## Tree Node Definition

```python
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
```

## Common Techniques

### 1. Recursion (DFS)

- Most natural for tree problems
- Base case: `None` node
- Recursive case: process left, right, current

### 2. Iteration with Stack (DFS)

```python
def iterative_dfs(root):
    if not root:
        return []

    stack = [root]
    result = []

    while stack:
        node = stack.pop()
        result.append(node.val)

        # Push right first (so left is processed first)
        if node.right:
            stack.append(node.right)
        if node.left:
            stack.append(node.left)

    return result
```

### 3. Iteration with Queue (BFS)

```python
from collections import deque

def iterative_bfs(root):
    if not root:
        return []

    queue = deque([root])
    result = []

    while queue:
        node = queue.popleft()
        result.append(node.val)

        if node.left:
            queue.append(node.left)
        if node.right:
            queue.append(node.right)

    return result
```

### 4. Global/Class Variable Pattern

```python
class Solution:
    def problem(self, root):
        self.result = initial_value

        def dfs(node):
            if not node:
                return

            # Update global result
            self.result = update(self.result, node.val)

            dfs(node.left)
            dfs(node.right)

        dfs(root)
        return self.result
```

## BST Specific Properties

1. **Inorder Traversal** - Gives sorted order
2. **Search** - O(h) where h is height
3. **Insert/Delete** - O(h)
4. **LCA** - Use BST ordering property

```python
def search_bst(root, target):
    if not root or root.val == target:
        return root

    if target < root.val:
        return search_bst(root.left, target)
    else:
        return search_bst(root.right, target)
```

## Tips & Tricks

1. **Draw It**: Visualize the tree structure
2. **Base Case**: Always handle `None` node
3. **Return Values**: Think about what each recursive call returns
4. **Leaf Nodes**: Special case where both children are `None`
5. **Height vs Depth**: Height from bottom up, depth from top down
6. **Balanced**: Height difference ≤ 1 at every node

## Common Pitfalls

❌ **Forgetting Base Case**

```python
# BAD: No null check
def dfs(node):
    return 1 + dfs(node.left)  # Crashes on leaf!
```

❌ **Not Handling Single Child**

```python
# BAD: Assumes both children exist
if node.left.val < node.right.val:  # Crash if one is None!
```

❌ **Wrong Return Type**

```python
# BAD: Mixing return types
def dfs(node):
    if not node:
        return None
    return 1 + dfs(node.left)  # None + 1 = Error!
```

✅ **Correct Patterns**

```python
def dfs(node):
    if not node:
        return 0  # Consistent return type

    left = dfs(node.left)
    right = dfs(node.right)

    return 1 + max(left, right)
```

## Edge Cases to Consider

- Empty tree (`root = None`)
- Single node
- Skewed tree (like linked list)
- Balanced tree
- BST with duplicates (if allowed)
- Negative values
- Very deep tree (stack overflow for recursive DFS)

## Helper Functions

```python
from collections import deque

def create_tree(values):
    """Create tree from level-order list"""
    if not values:
        return None

    root = TreeNode(values[0])
    queue = deque([root])
    i = 1

    while queue and i < len(values):
        node = queue.popleft()

        if i < len(values) and values[i] is not None:
            node.left = TreeNode(values[i])
            queue.append(node.left)
        i += 1

        if i < len(values) and values[i] is not None:
            node.right = TreeNode(values[i])
            queue.append(node.right)
        i += 1

    return root

def tree_to_list(root):
    """Convert tree to level-order list"""
    if not root:
        return []

    result = []
    queue = deque([root])

    while queue:
        node = queue.popleft()
        if node:
            result.append(node.val)
            queue.append(node.left)
            queue.append(node.right)
        else:
            result.append(None)

    # Remove trailing None values
    while result and result[-1] is None:
        result.pop()

    return result
```

## Related Patterns

- **Recursion** - Natural fit for tree problems
- **Backtracking** - DFS with state restoration
- **Dynamic Programming** - Tree DP problems
- **Divide & Conquer** - Split into subtrees
- **Graph Traversal** - Trees are special graphs
