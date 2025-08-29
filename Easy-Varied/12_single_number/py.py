def single_number(nums: list[int]):
    """
    Single Number
    
    Given a non-empty array of integers nums, every element appears twice except for one. 
    Find that single one.
    
    You must implement a solution with a linear runtime complexity and use only constant extra space.
    
    Example 1:
    Input: nums = [2,2,1]
    Output: 1
    
    Example 2:
    Input: nums = [4,1,2,1,2]
    Output: 4
    
    Example 3:
    Input: nums = [1]
    Output: 1
    
    Constraints:
    - 1 <= nums.length <= 3 * 104
    - -3 * 104 <= nums[i] <= 3 * 104
    - Each element in the array appears twice except for one element which appears only once.
    """
    result = 0
    for num in nums:
        result ^= num
    return result


# Test cases
if __name__ == "__main__":
    # Test case 1
    nums1 = [2, 2, 1]
    print(f"Test 1: nums = {nums1}")
    result1 = single_number(nums1)
    print(f"Expected: 1, Got: {result1}")
    
    # Test case 2
    nums2 = [4, 1, 2, 1, 2]
    print(f"Test 2: nums = {nums2}")
    result2 = single_number(nums2)
    print(f"Expected: 4, Got: {result2}")
    
    # Test case 3
    nums3 = [1]
    print(f"Test 3: nums = {nums3}")
    result3 = single_number(nums3)
    print(f"Expected: 1, Got: {result3}")
    
    # Test case 4
    nums4 = [7, 3, 5, 3, 5]
    print(f"Test 4: nums = {nums4}")
    result4 = single_number(nums4)
    print(f"Expected: 7, Got: {result4}")
    
    # Test case 5
    nums5 = [9, 8, 7, 8, 9]
    print(f"Test 5: nums = {nums5}")
    result5 = single_number(nums5)
    print(f"Expected: 7, Got: {result5}")
