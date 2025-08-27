def binary_search_first(nums, target):
    """
    Binary Search for First Occurrence
    
    Problem: Given a sorted array with duplicates, find the index of the first occurrence of target.
    If the target doesn't exist, return -1.
    
    Example:
    Input: nums = [1, 2, 2, 2, 3, 4, 5], target = 2
    Output: 1 (first occurrence of 2 is at index 1)
    
    Input: nums = [1, 2, 2, 2, 3, 4, 5], target = 6
    Output: -1 (6 doesn't exist in the array)
    
    Learning Goals:
    - Binary search with duplicates
    - Finding leftmost occurrence
    - Handling edge cases
    - Understanding when to continue searching vs return
    """
    left = 0
    right = len(nums) - 1
    result = -1  

    while left <= right:
        mid = left + (right - left) // 2

        if nums[mid] == target:
            result = mid
            right = mid - 1
        
        elif nums[mid] > target:
            right = mid - 1

        else: 
            left = mid + 1

    return result





# Test cases (uncomment to test your implementation)
if __name__ == "__main__":
    # Test case 1: Multiple occurrences
    nums1 = [1, 2, 2, 2, 3, 4, 5]
    target1 = 2
    print(f"Test 1: Find first occurrence of {target1} in {nums1}")
    result1 = binary_search_first(nums1, target1)
    print(f"Expected: 1, Got: {result1}")
    
    # Test case 2: Single occurrence
    target2 = 3
    print(f"Test 2: Find first occurrence of {target2} in {nums1}")
    result2 = binary_search_first(nums1, target2)
    print(f"Expected: 4, Got: {result2}")
    
    # Test case 3: Target doesn't exist
    target3 = 6
    print(f"Test 3: Find first occurrence of {target3} in {nums1}")
    result3 = binary_search_first(nums1, target3)
    print(f"Expected: -1, Got: {result3}")
    
    # Test case 4: Target at beginning
    target4 = 1
    print(f"Test 4: Find first occurrence of {target4} in {nums1}")
    result4 = binary_search_first(nums1, target4)
    print(f"Expected: 0, Got: {result4}")
    
    # Test case 5: Target at end
    target5 = 5
    print(f"Test 5: Find first occurrence of {target5} in {nums1}")
    result5 = binary_search_first(nums1, target5)
    print(f"Expected: 6, Got: {result5}")
    
    # Test case 6: All same elements
    nums6 = [2, 2, 2, 2]
    target6 = 2
    print(f"Test 6: Find first occurrence of {target6} in {nums6}")
    result6 = binary_search_first(nums6, target6)
    print(f"Expected: 0, Got: {result6}")
