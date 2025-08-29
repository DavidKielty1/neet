def contains_duplicate(nums):
    """
    Contains Duplicate
    
    Given an integer array nums, return true if any value appears at least twice in the array, 
    and return false if every element is distinct.
    
    Example 1:
    Input: nums = [1,2,3,1]
    Output: true
    
    Example 2:
    Input: nums = [1,2,3,4]
    Output: false
    
    Example 3:
    Input: nums = [1,1,1,3,3,4,3,2,4,2]
    Output: true
    
    Constraints:
    - 1 <= nums.length <= 105
    - -109 <= nums[i] <= 109
    """
    if not nums:
        return False

    seen = set()
    for num in nums:
        if num in seen:
            return True
        seen.add(num)

    return False


# Test cases
if __name__ == "__main__":
    # Test case 1
    nums1 = [1, 2, 3, 1]
    print(f"Test 1: nums = {nums1}")
    result1 = contains_duplicate(nums1)
    print(f"Expected: True, Got: {result1}")
    
    # Test case 2
    nums2 = [1, 2, 3, 4]
    print(f"Test 2: nums = {nums2}")
    result2 = contains_duplicate(nums2)
    print(f"Expected: False, Got: {result2}")
    
    # Test case 3
    nums3 = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
    print(f"Test 3: nums = {nums3}")
    result3 = contains_duplicate(nums3)
    print(f"Expected: True, Got: {result3}")
    
    # Test case 4
    nums4 = [1]
    print(f"Test 4: nums = {nums4}")
    result4 = contains_duplicate(nums4)
    print(f"Expected: False, Got: {result4}")
    
    # Test case 5
    nums5 = []
    print(f"Test 5: nums = {nums5}")
    result5 = contains_duplicate(nums5)
    print(f"Expected: False, Got: {result5}")
