def find_insert_position(arr, target):
    """
    Find Insert Position using Binary Search
    
    Problem: Given a sorted array and a target value, return the index where it would be inserted
    to maintain the sorted order.
    Input: arr = [1, 3, 5, 6], target = 5
    Output: 2 (5 would be inserted at index 2, but it already exists there)
    
    Learning Goals:
    - Binary search for insertion point
    - Handling edge cases (beginning, end, duplicates)
    - Understanding when to return left vs right pointer
    """
    left = 0
    right = len(arr)
    
    while left < right:
        mid = left + (right - left) // 2
        
        print(f"Searching range [{left}, {right}), mid = {mid}, arr[mid] = {arr[mid] if mid < len(arr) else 'N/A'}")
        
        if arr[mid] == target:
            print(f"Found target {target} at index {mid}")
            return mid
        elif arr[mid] < target:
            left = mid + 1
            print(f"Target {target} > {arr[mid]}, search right half")
        else:
            right = mid
            print(f"Target {target} < {arr[mid]}, search left half")
    
    print(f"Insert position for {target} is at index {left}")
    return left


# Test the implementation
if __name__ == "__main__":
    # Test case 1: Target exists
    arr1 = [1, 3, 5, 6]
    target1 = 5
    print(f"Test 1: Find insert position for {target1} in {arr1}")
    result1 = find_insert_position(arr1, target1)
    print(f"Result: {result1}\n")
    
    # Test case 2: Target doesn't exist, insert in middle
    target2 = 2
    print(f"Test 2: Find insert position for {target2} in {arr1}")
    result2 = find_insert_position(arr1, target2)
    print(f"Result: {result2}\n")
    
    # Test case 3: Target should be inserted at beginning
    target3 = 0
    print(f"Test 3: Find insert position for {target3} in {arr1}")
    result3 = find_insert_position(arr1, target3)
    print(f"Result: {result3}\n")
    
    # Test case 4: Target should be inserted at end
    target4 = 7
    print(f"Test 4: Find insert position for {target4} in {arr1}")
    result4 = find_insert_position(arr1, target4)
    print(f"Result: {result4}")
