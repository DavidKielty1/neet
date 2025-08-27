def binary_search_range(nums, target):
    """
    Binary Search with Range Checking
    
    Problem: Given a sorted array and a target value, find if the target exists.
    If it exists, return its index. If not, return -1.
    
    Example:
    Input: nums = [1, 3, 5, 7, 9, 11, 13], target = 7
    Output: 3 (7 is found at index 3)
    
    Input: nums = [1, 3, 5, 7, 9, 11, 13], target = 6
    Output: -1 (6 is not in the array)
    
    Learning Goals:
    - Basic binary search implementation
    - Returning index instead of boolean
    - Handling target not found case
    - Understanding search space reduction
    
    TODO: Implement the solution using binary search
    """
    left = 0
    right = len(nums) - 1

    while left <= right:
        mid = left + (right - left) // 2

        if nums[mid] == target:
            return mid
    
        elif nums[mid] > target:
            right = mid - 1
        else:
            left = mid + 1

    return -1  # Target not found

    


# Test cases (uncomment to test your implementation)
if __name__ == "__main__":
    # Test case 1: Target exists in middle
    nums1 = [1, 3, 5, 7, 9, 11, 13]
    target1 = 7
    print(f"Test 1: Search for {target1} in {nums1}")
    # result1 = binary_search_range(nums1, target1)
    # print(f"Expected: 3, Got: {result1}")
    
    # Test case 2: Target doesn't exist
    target2 = 6
    print(f"Test 2: Search for {target2} in {nums1}")
    # result2 = binary_search_range(nums1, target2)
    # print(f"Expected: -1, Got: {result2}")
    
    # Test case 3: Target at beginning
    target3 = 1
    print(f"Test 3: Search for {target3} in {nums1}")
    # result3 = binary_search_range(nums1, target3)
    # print(f"Expected: 0, Got: {result3}")
    
    # Test case 4: Target at end
    target4 = 13
    print(f"Test 4: Search for {target4} in {nums1}")
    # result4 = binary_search_range(nums1, target4)
    # print(f"Expected: 6, Got: {result4}")
    
    # Test case 5: Single element array
    nums5 = [5]
    target5 = 5
    print(f"Test 5: Search for {target5} in {nums5}")
    # result5 = binary_search_range(nums5, target5)
    # print(f"Expected: 0, Got: {result5}")
