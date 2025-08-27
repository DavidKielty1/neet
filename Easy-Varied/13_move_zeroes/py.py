def move_zeroes(nums):
    """
    Move Zeroes
    
    Given an integer array nums, move all 0's to the end of it while maintaining the relative 
    order of the non-zero elements.
    
    Note that you must do this in-place without making a copy of the array.
    
    Example 1:
    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
    
    Example 2:
    Input: nums = [0]
    Output: [0]
    
    Constraints:
    - 1 <= nums.length <= 104
    - -231 <= nums[i] <= 231 - 1
    """
    pass


# Test cases
if __name__ == "__main__":
    # Test case 1
    nums1 = [0, 1, 0, 3, 12]
    print(f"Test 1: nums = {nums1}")
    move_zeroes(nums1)
    print(f"Expected: [1, 3, 12, 0, 0], Got: {nums1}")
    
    # Test case 2
    nums2 = [0]
    print(f"Test 2: nums = {nums2}")
    move_zeroes(nums2)
    print(f"Expected: [0], Got: {nums2}")
    
    # Test case 3
    nums3 = [1, 2, 3, 4, 5]
    print(f"Test 3: nums = {nums3}")
    move_zeroes(nums3)
    print(f"Expected: [1, 2, 3, 4, 5], Got: {nums3}")
    
    # Test case 4
    nums4 = [0, 0, 0, 1]
    print(f"Test 4: nums = {nums4}")
    move_zeroes(nums4)
    print(f"Expected: [1, 0, 0, 0], Got: {nums4}")
    
    # Test case 5
    nums5 = [1, 0, 0, 0, 2]
    print(f"Test 5: nums = {nums5}")
    move_zeroes(nums5)
    print(f"Expected: [1, 2, 0, 0, 0], Got: {nums5}")
