def remove_duplicates(nums: list[int]):
    """
    Remove Duplicates from Sorted Array
    
    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place 
    such that each unique element appears only once. The relative order of the elements should 
    be kept the same. Then return the number of unique elements in nums.
    
    Consider the number of unique elements of nums to be k, to get accepted, you need to do 
    the following things:
    
    - Change the array nums such that the first k elements of nums contain the unique elements 
      in the order they were present in nums initially. The remaining elements of nums are not 
      important as well as the size of nums.
    - Return k.
    
    Example 1:
    Input: nums = [1,1,2]
    Output: 2, nums = [1,2,_]
    Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
    It does not matter what you leave beyond the returned k (hence they are underscores).
    
    Example 2:
    Input: nums = [0,0,1,1,1,2,2,3,3,4]
    Input: nums = [0,1,2,3,1,2,2,3,3,4]
                             u       c
    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
    It does not matter what you leave beyond the returned k (hence they are underscores).
    
    Constraints:
    - 1 <= nums.length <= 3 * 104
    - -100 <= nums[i] <= 100
    - nums is sorted in non-decreasing order.
    """
    if len(nums) == 0:
        return 0
    
    i = 1 
    
    for j in range(1, len(nums)):
        # If current element is different from previous, it's unique
        if nums[j] != nums[j-1]:
            nums[i] = nums[j]  # Place unique element at position i
            i += 1  # Move to next position
    
    return i  # Return count of unique elements

# Test cases
if __name__ == "__main__":
    # Test case 1
    nums1 = [1, 1, 2]
    print(f"Test 1: nums = {nums1}")
    result1 = remove_duplicates(nums1)
    print(f"Expected: 2, nums = [1, 2, _], Got: {result1}, nums = {nums1}")
    
    # Test case 2
    nums2 = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
    print(f"Test 2: nums = {nums2}")
    result2 = remove_duplicates(nums2)
    print(f"Expected: 5, nums = [0, 1, 2, 3, 4, _, _, _, _, _], Got: {result2}, nums = {nums2}")
    
    # Test case 3
    nums3 = [1, 2, 3]
    print(f"Test 3: nums = {nums3}")
    result3 = remove_duplicates(nums3)
    print(f"Expected: 3, nums = [1, 2, 3], Got: {result3}, nums = {nums3}")
    
    # Test case 4
    nums4 = [1, 1, 1, 1]
    print(f"Test 4: nums = {nums4}")
    result4 = remove_duplicates(nums4)
    print(f"Expected: 1, nums = [1, _, _, _], Got: {result4}, nums = {nums4}")
