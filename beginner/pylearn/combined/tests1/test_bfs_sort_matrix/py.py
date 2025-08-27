from collections import deque
from typing import List

def bfs_traverse_and_sort_matrix_test(matrix: list[list[int]]) -> list[int]:
    """
    TODO: BFS traversal of a matrix, then sort the visited elements.
    
    Given a 2D matrix, perform BFS traversal starting from the top-left corner,
    collect all visited elements, and return them in sorted order.
    
    Requirements:
    - Use BFS with a queue to traverse the matrix
    - Start from position (0, 0)
    - Visit right and bottom neighbors only (no diagonals)
    - Use a set to track visited positions
    - Sort the collected elements before returning
    
    Example:
    Input: matrix = [[1, 2, 3],
                     [4, 5, 6],
                     [7, 8, 9]]
    Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    
    Learning goals:
    - BFS matrix traversal
    - Combining traversal with sorting
    - Working with 2D arrays
    """
    if not matrix or matrix[0]:
        return []
    
    rows, cols = len(matrix), len(matrix[0])
    visited = set()
    queue = deque([(0,0)])
    visited.add((0,0))
    elements = []

    while queue:
        row, col = queue.popleft()
        elements.append(matrix[row][col])

        if col + 1 < cols and (row, col + 1) not in visited:
            queue.append((row, col + 1))
            visited.add((row, col + 1))

        if row + 1 < rows and (row, col + 1) not in visited:
            queue.append((row + 1, col))
            visited.add((row + 1, col))

    return sorted(elements)

    
# Test cases - run these to verify your implementation
if __name__ == "__main__":
    # Test 1: Simple matrix
    matrix1 = [[1, 2, 3],
               [4, 5, 6],
               [7, 8, 9]]
    result1 = bfs_traverse_and_sort_matrix_test(matrix1)
    print(f"Matrix: {matrix1}")
    print(f"BFS traversal + sort: {result1}")
    print()
    
    # Test 2: Unsorted matrix
    matrix2 = [[9, 8, 7],
               [6, 5, 4],
               [3, 2, 1]]
    result2 = bfs_traverse_and_sort_matrix_test(matrix2)
    print(f"Matrix: {matrix2}")
    print(f"BFS traversal + sort: {result2}")
    print()
    
    # Test 3: Single row
    matrix3 = [[5, 2, 8, 1, 9]]
    result3 = bfs_traverse_and_sort_matrix_test(matrix3)
    print(f"Matrix: {matrix3}")
    print(f"BFS traversal + sort: {result3}")
    print()
    
    # Test 4: Single column
    matrix4 = [[5], [2], [8], [1], [9]]
    result4 = bfs_traverse_and_sort_matrix_test(matrix4)
    print(f"Matrix: {matrix4}")
    print(f"BFS traversal + sort: {result4}")
    print()
    
    # Test 5: Duplicate elements
    matrix5 = [[3, 1, 3],
               [1, 2, 1],
               [3, 1, 3]]
    result5 = bfs_traverse_and_sort_matrix_test(matrix5)
    print(f"Matrix: {matrix5}")
    print(f"BFS traversal + sort: {result5}")
    print()
    
    # Test 6: Single element
    matrix6 = [[42]]
    result6 = bfs_traverse_and_sort_matrix_test(matrix6)
    print(f"Matrix: {matrix6}")
    print(f"BFS traversal + sort: {result6}")
    print()
    
    # Test 7: Empty matrix
    matrix7 = []
    result7 = bfs_traverse_and_sort_matrix_test(matrix7)
    print(f"Matrix: {matrix7}")
    print(f"BFS traversal + sort: {result7}")
    print()
    
    # Test 8: Large matrix
    matrix8 = [[10, 20, 30],
               [40, 50, 60],
               [70, 80, 90],
               [100, 110, 120]]
    result8 = bfs_traverse_and_sort_matrix_test(matrix8)
    print(f"Matrix: {matrix8}")
    print(f"BFS traversal + sort: {result8}")
    print()
    
    # Test 9: Negative numbers
    matrix9 = [[-1, -2, -3],
               [-4, -5, -6],
               [-7, -8, -9]]
    result9 = bfs_traverse_and_sort_matrix_test(matrix9)
    print(f"Matrix: {matrix9}")
    print(f"BFS traversal + sort: {result9}")
    print()
    
    # Test 10: Mixed positive and negative
    matrix10 = [[1, -2, 3],
                [-4, 5, -6],
                [7, -8, 9]]
    result10 = bfs_traverse_and_sort_matrix_test(matrix10)
    print(f"Matrix: {matrix10}")
    print(f"BFS traversal + sort: {result10}")
