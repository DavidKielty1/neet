def binary_search_insert(nums, target):
    """
    Binary Search for Insert Position
    
    Problem: Given a sorted array and a target value, return the index where it would be inserted
    to maintain the sorted order. If the target already exists, return its index.
    
    Example:
    Input: nums = [1, 3, 5, 6], target = 5
    Output: 2 (5 already exists at index 2)
    
    Input: nums = [1, 3, 5, 6], target = 2
    Output: 1 (2 would be inserted at index 1)
    
    Learning Goals:
    - Binary search for insertion point
    - Understanding when to return left vs right
    - Handling edge cases (beginning, end)
    - Working with sorted arrays
    
    TODO: Implement the solution using binary search
    """
    left = 0
    right = len(nums)  # Note: right = len(nums), not len(nums) - 1

    while left < right:  # Note: left < right, not left <= right
        mid = left + (right - left) // 2

        if nums[mid] == target:
            return mid
        
        elif nums[mid] < target:
            left = mid + 1
        else:
            right = mid

    return left


# Test cases (uncomment to test your implementation)
if __name__ == "__main__":
    # Test case 1: Target exists
    nums1 = [1, 3, 5, 6]
    target1 = 5
    print(f"Test 1: Find insert position for {target1} in {nums1}")
    # result1 = binary_search_insert(nums1, target1)
    # print(f"Expected: 2, Got: {result1}")
    
    # Test case 2: Target doesn't exist, insert in middle
    target2 = 2
    print(f"Test 2: Find insert position for {target2} in {nums1}")
    # result2 = binary_search_insert(nums1, target2)
    # print(f"Expected: 1, Got: {result2}")
    
    # Test case 3: Target should be inserted at beginning
    target3 = 0
    print(f"Test 3: Find insert position for {target3} in {nums1}")
    # result3 = binary_search_insert(nums1, target3)
    # print(f"Expected: 0, Got: {result3}")
    
    # Test case 4: Target should be inserted at end
    target4 = 7
    print(f"Test 4: Find insert position for {target4} in {nums1}")
    # result4 = binary_search_insert(nums1, target4)
    # print(f"Expected: 4, Got: {result4}")
    
    # Test case 5: Empty array
    nums5 = []
    target5 = 5
    print(f"Test 5: Find insert position for {target5} in {nums5}")
    # result5 = binary_search_insert(nums5, target5)
    # print(f"Expected: 0, Got: {result5}")
