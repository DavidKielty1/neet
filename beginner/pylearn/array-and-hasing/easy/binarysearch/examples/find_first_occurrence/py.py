def find_first_occurrence(arr, target):
    """
    Find First Occurrence using Binary Search
    
    Problem: Given a sorted array with duplicates, find the index of the first occurrence of target
    Input: arr = [1, 2, 2, 2, 3, 4, 5], target = 2
    Output: 1 (first occurrence of 2 is at index 1)
    
    Learning Goals:
    - Binary search with duplicates
    - Finding leftmost occurrence
    - Handling edge cases
    - Understanding when to continue searching vs return
    """
    left = 0
    right = len(arr) - 1
    result = -1  # Store the best candidate found so far
    
    while left <= right:
        mid = left + (right - left) // 2
        
        print(f"Searching range [{left}, {right}], mid = {mid}, arr[mid] = {arr[mid]}")
        
        if arr[mid] == target:
            # Found target, but keep searching left for earlier occurrence
            result = mid
            right = mid - 1
            print(f"Found target {target} at index {mid}, continue searching left for earlier occurrence")
        elif arr[mid] < target:
            left = mid + 1
            print(f"Target {target} > {arr[mid]}, search right half")
        else:
            right = mid - 1
            print(f"Target {target} < {arr[mid]}, search left half")
    
    if result != -1:
        print(f"First occurrence of {target} is at index {result}")
    else:
        print(f"Target {target} not found")
    
    return result


# Test the implementation
if __name__ == "__main__":
    # Test case 1: Multiple occurrences
    arr1 = [1, 2, 2, 2, 3, 4, 5]
    target1 = 2
    print(f"Test 1: Find first occurrence of {target1} in {arr1}")
    result1 = find_first_occurrence(arr1, target1)
    print(f"Result: {result1}\n")
    
    # Test case 2: Single occurrence
    target2 = 3
    print(f"Test 2: Find first occurrence of {target2} in {arr1}")
    result2 = find_first_occurrence(arr1, target2)
    print(f"Result: {result2}\n")
    
    # Test case 3: Target doesn't exist
    target3 = 6
    print(f"Test 3: Find first occurrence of {target3} in {arr1}")
    result3 = find_first_occurrence(arr1, target3)
    print(f"Result: {result3}\n")
    
    # Test case 4: Target at boundaries
    target4 = 1
    print(f"Test 4: Find first occurrence of {target4} in {arr1}")
    result4 = find_first_occurrence(arr1, target4)
    print(f"Result: {result4}")
