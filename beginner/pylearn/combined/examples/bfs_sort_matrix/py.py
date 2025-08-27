from collections import deque
from typing import List

def bfs_traverse_and_sort_matrix(matrix: List[List[int]]) -> List[int]:
    """
    BFS traversal of a matrix, then sort the visited elements.
    
    This combines BFS traversal with sorting to collect all elements
    from a matrix in BFS order and then sort them.
    
    Time Complexity: O(M*N + K log K) where M*N is matrix size, K is elements visited
    Space Complexity: O(M*N) for visited set and result list
    
    Example:
    Input: matrix = [[1, 2, 3],
                     [4, 5, 6],
                     [7, 8, 9]]
    Output: [1, 2, 3, 4, 5, 6, 7, 8, 9] (BFS order, then sorted)
    
    Learning goals:
    - BFS matrix traversal
    - Combining traversal with sorting
    - Working with 2D arrays
    """
    if not matrix or not matrix[0]:
        return []
    
    rows, cols = len(matrix), len(matrix[0])
    visited = set()
    queue = deque([(0, 0)])  # Start from top-left
    visited.add((0, 0))
    elements = []
    
    # BFS traversal
    while queue:
        row, col = queue.popleft()
        elements.append(matrix[row][col])
        
        # Add right neighbor
        if col + 1 < cols and (row, col + 1) not in visited:
            queue.append((row, col + 1))
            visited.add((row, col + 1))
        
        # Add bottom neighbor
        if row + 1 < rows and (row + 1, col) not in visited:
            queue.append((row + 1, col))
            visited.add((row + 1, col))
    
    # Sort the collected elements
    return sorted(elements)


# Test cases
if __name__ == "__main__":
    print("=== Testing bfs_traverse_and_sort_matrix ===")
    
    # Test case 1: Simple matrix
    matrix1 = [[1, 2, 3],
               [4, 5, 6],
               [7, 8, 9]]
    result1 = bfs_traverse_and_sort_matrix(matrix1)
    print(f"Matrix: {matrix1}")
    print(f"BFS traversal + sort: {result1}")
    print()
    
    # Test case 2: Unsorted matrix
    matrix2 = [[9, 8, 7],
               [6, 5, 4],
               [3, 2, 1]]
    result2 = bfs_traverse_and_sort_matrix(matrix2)
    print(f"Matrix: {matrix2}")
    print(f"BFS traversal + sort: {result2}")
    print()
    
    # Test case 3: Single row
    matrix3 = [[5, 2, 8, 1, 9]]
    result3 = bfs_traverse_and_sort_matrix(matrix3)
    print(f"Matrix: {matrix3}")
    print(f"BFS traversal + sort: {result3}")
    print()
    
    # Test case 4: Single column
    matrix4 = [[5], [2], [8], [1], [9]]
    result4 = bfs_traverse_and_sort_matrix(matrix4)
    print(f"Matrix: {matrix4}")
    print(f"BFS traversal + sort: {result4}")
    print()
    
    # Test case 5: Duplicate elements
    matrix5 = [[3, 1, 3],
               [1, 2, 1],
               [3, 1, 3]]
    result5 = bfs_traverse_and_sort_matrix(matrix5)
    print(f"Matrix: {matrix5}")
    print(f"BFS traversal + sort: {result5}")
    print()
    
    # Test case 6: Single element
    matrix6 = [[42]]
    result6 = bfs_traverse_and_sort_matrix(matrix6)
    print(f"Matrix: {matrix6}")
    print(f"BFS traversal + sort: {result6}")
    print()
    
    # Test case 7: Empty matrix
    matrix7 = []
    result7 = bfs_traverse_and_sort_matrix(matrix7)
    print(f"Matrix: {matrix7}")
    print(f"BFS traversal + sort: {result7}")

# ----------------------------------------------
# Explanation (commented)
# ----------------------------------------------
# Goal:
# - Traverse a matrix using BFS (layer by layer from top-left), collect elements,
#   then return the sorted list of all visited elements.
#
# Data structures used:
# - queue (deque): holds cell coordinates to visit next in FIFO order.
# - visited (set): prevents revisiting the same cell.
# - elements (list): collects values seen during traversal.
#
# Neighbor policy:
# - We only push Right (row, col+1) and Down (row+1, col) neighbors to keep it simple
#   and non-diagonal, which is common in grid BFS exercises.
#
# Steps:
# 1) Edge case: empty matrix -> return [].
# 2) Initialize queue with (0,0), mark visited.
# 3) While queue not empty: pop a cell, append matrix value to elements, push valid
#    Right and Down neighbors not yet visited.
# 4) After BFS completes, sort elements and return them.
#
# Complexity:
# - BFS visits each reachable cell at most once: O(M*N) time and space.
# - Sorting K collected elements adds O(K log K) time.
