def binary_search(arr, target):
    """
    Basic Binary Search Implementation

    Problem: Find if a target value exists in a sorted array
    Input: arr = [1, 3, 5, 7, 9, 11, 13, 15], target = 7
    Output: True (7 is found at index 3)

    Learning Goals:
    - Understanding binary search algorithm
    - Working with sorted arrays
    - Time complexity O(log n)
    - Space complexity O(1)
    """
    left = 0
    right = len(arr) - 1

    while left <= right:
        # Calculate middle index (prevents integer overflow)
        mid = left + (right - left) // 2

        print(f"Searching range [{left}, {right}], mid = {mid}, arr[mid] = {arr[mid]}")

        # Found the target
        if arr[mid] == target:
            print(f"Target {target} found at index {mid}")
            return True

        # Target is in left half
        elif arr[mid] > target:
            right = mid - 1
            print(f"Target {target} < {arr[mid]}, search left half")

        # Target is in right half
        else:
            left = mid + 1
            print(f"Target {target} > {arr[mid]}, search right half")

    print(f"Target {target} not found")
    return False


# Test the implementation
if __name__ == "__main__":
    # Test case 1: Target exists
    arr1 = [1, 3, 5, 7, 9, 11, 13, 15]
    target1 = 7
    print(f"Test 1: Searching for {target1} in {arr1}")
    result1 = binary_search(arr1, target1)
    print(f"Result: {result1}\n")

    # Test case 2: Target doesn't exist
    target2 = 6
    print(f"Test 2: Searching for {target2} in {arr1}")
    result2 = binary_search(arr1, target2)
    print(f"Result: {result2}\n")

    # Test case 3: Target at boundaries
    target3 = 1
    print(f"Test 3: Searching for {target3} in {arr1}")
    result3 = binary_search(arr1, target3)
    print(f"Result: {result3}")
