def missing_number(nums):
    """
    Missing Number
    
    Given an array nums containing n distinct numbers in the range [0, n], 
    return the only number in the range that is missing from the array.
    
    Example 1:
    Input: nums = [3,0,1]
    Output: 2
    Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
    2 is the missing number since it does not appear in nums.
    
    Example 2:
    Input: nums = [0,1]
    Output: 2
    Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 
    2 is the missing number since it does not appear in nums.
    
    Example 3:
    Input: nums = [9,6,4,2,3,5,7,0,1]
    Output: 8
    Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 
    8 is the missing number since it does not appear in nums.
    
    Constraints:
    - n == nums.length
    - 1 <= n <= 104
    - 0 <= nums[i] <= n
    - All the numbers of nums are unique.
    """
    pass
        



# Test cases
if __name__ == "__main__":
    # Test case 1
    nums1 = [3, 0, 1]
    print(f"Test 1: nums = {nums1}")
    result1 = missing_number(nums1)
    print(f"Expected: 2, Got: {result1}")
    
    # Test case 2
    nums2 = [0, 1]
    print(f"Test 2: nums = {nums2}")
    result2 = missing_number(nums2)
    print(f"Expected: 2, Got: {result2}")
    
    # Test case 3
    nums3 = [9, 6, 4, 2, 3, 5, 7, 0, 1]
    print(f"Test 3: nums = {nums3}")
    result3 = missing_number(nums3)
    print(f"Expected: 8, Got: {result3}")
    
    # Test case 4
    nums4 = [0]
    print(f"Test 4: nums = {nums4}")
    result4 = missing_number(nums4)
    print(f"Expected: 1, Got: {result4}")
    
    # Test case 5
    nums5 = [1]
    print(f"Test 5: nums = {nums5}")
    result5 = missing_number(nums5)
    print(f"Expected: 0, Got: {result5}")
