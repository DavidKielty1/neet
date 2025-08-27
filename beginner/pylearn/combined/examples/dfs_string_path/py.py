from typing import List, Set

def dfs_find_string_in_grid(grid: List[List[str]], target: str) -> bool:
    """
    Find if a string exists in a grid using DFS.
    
    This combines DFS traversal with string manipulation to check
    if a target string can be formed by connecting adjacent characters.
    
    Time Complexity: O(M*N * 4^L) where M*N is grid size, L is string length
    Space Complexity: O(L) for recursion depth
    
    Example:
    Input: grid = [['A', 'B', 'C'],
                   ['D', 'E', 'F'],
                   ['G', 'H', 'I']], target = "BEH"
    Output: True (can form "BEH" by going B->E->H)
    
    Learning goals:
    - DFS with backtracking
    - String character matching
    - Grid traversal with constraints
    """
    if not grid or not grid[0] or not target:
        return False
    
    rows, cols = len(grid), len(grid[0])
    
    def dfs(row: int, col: int, index: int, visited: Set[tuple]) -> bool:
        # Base case: found the complete string
        if index == len(target):
            return True
        
        # Check bounds and if current cell matches
        if (row < 0 or row >= rows or col < 0 or col >= cols or 
            (row, col) in visited or grid[row][col] != target[index]):
            return False
        
        # Mark current cell as visited
        visited.add((row, col))
        
        # Explore all 4 directions
        directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]  # right, down, left, up
        for dr, dc in directions:
            new_row, new_col = row + dr, col + dc
            if dfs(new_row, new_col, index + 1, visited):
                return True
        
        # Backtrack
        visited.remove((row, col))
        return False
    
    # Start DFS from each cell that matches the first character
    for row in range(rows):
        for col in range(cols):
            if grid[row][col] == target[0]:
                if dfs(row, col, 0, set()):
                    return True
    
    return False


# Test cases
if __name__ == "__main__":
    print("=== Testing dfs_find_string_in_grid ===")
    
    # Test case 1: String exists
    grid1 = [['A', 'B', 'C'],
             ['D', 'E', 'F'],
             ['G', 'H', 'I']]
    target1 = "BEH"
    result1 = dfs_find_string_in_grid(grid1, target1)
    print(f"Grid: {grid1}")
    print(f"Target: '{target1}'")
    print(f"Exists: {result1}")
    print()
    
    # Test case 2: String doesn't exist
    grid2 = [['A', 'B', 'C'],
             ['D', 'E', 'F'],
             ['G', 'H', 'I']]
    target2 = "XYZ"
    result2 = dfs_find_string_in_grid(grid2, target2)
    print(f"Grid: {grid2}")
    print(f"Target: '{target2}'")
    print(f"Exists: {result2}")
    print()
    
    # Test case 3: Single character
    grid3 = [['A', 'B', 'C'],
             ['D', 'E', 'F']]
    target3 = "E"
    result3 = dfs_find_string_in_grid(grid3, target3)
    print(f"Grid: {grid3}")
    print(f"Target: '{target3}'")
    print(f"Exists: {result3}")
    print()
    
    # Test case 4: Diagonal not allowed (should fail)
    grid4 = [['A', 'B'],
             ['C', 'D']]
    target4 = "AD"  # Can't go diagonal
    result4 = dfs_find_string_in_grid(grid4, target4)
    print(f"Grid: {grid4}")
    print(f"Target: '{target4}'")
    print(f"Exists: {result4}")
    print()
    
    # Test case 5: Reuse characters not allowed
    grid5 = [['A', 'B'],
             ['C', 'D']]
    target5 = "ABA"  # Can't reuse A
    result5 = dfs_find_string_in_grid(grid5, target5)
    print(f"Grid: {grid5}")
    print(f"Target: '{target5}'")
    print(f"Exists: {result5}")
    print()
    
    # Test case 6: Empty string
    grid6 = [['A', 'B'], ['C', 'D']]
    target6 = ""
    result6 = dfs_find_string_in_grid(grid6, target6)
    print(f"Grid: {grid6}")
    print(f"Target: '{target6}'")
    print(f"Exists: {result6}")
    print()
    
    # Test case 7: Larger grid
    grid7 = [['A', 'B', 'C', 'D'],
             ['E', 'F', 'G', 'H'],
             ['I', 'J', 'K', 'L']]
    target7 = "FGH"
    result7 = dfs_find_string_in_grid(grid7, target7)
    print(f"Grid: {grid7}")
    print(f"Target: '{target7}'")
    print(f"Exists: {result7}")
    print()
    
    # Test case 8: Empty grid
    grid8 = []
    target8 = "ABC"
    result8 = dfs_find_string_in_grid(grid8, target8)
    print(f"Grid: {grid8}")
    print(f"Target: '{target8}'")
    print(f"Exists: {result8}")

# ----------------------------------------------
# Explanation (commented)
# ----------------------------------------------
# Goal:
# - Determine if the target string can be formed by walking adjacent cells
#   (up, down, left, right) in the grid without reusing cells.
#
# Approach (DFS + backtracking):
# - Try to match characters one by one; at each step, move to a neighbor
#   and recurse. If we hit a mismatch or go out of bounds, backtrack.
#
# Data structures used:
# - visited (set of (row, col)): ensures a cell is not reused in the same path.
#
# Steps:
# 1) For every cell matching target[0], launch DFS(row, col, index=0, visited=∅).
# 2) In DFS, if index == len(target), we've matched all characters -> True.
# 3) Check bounds, visited, and character match; if any fail -> False.
# 4) Mark cell visited, explore 4 neighbors with index+1; if any returns True,
#    bubble up True.
# 5) Remove from visited (backtrack) and return False if none succeed.
#
# Complexity:
# - Worst-case time: O(M*N * 4^L). Space: O(L) recursion depth + visited tracking.
