def two_sum(nums, target):
    """
    Two Sum
    
    Given an array of integers nums and an integer target, return indices of the two numbers 
    such that they add up to target.
    
    You may assume that each input would have exactly one solution, and you may not use 
    the same element twice.
    
    You can return the answer in any order.
    
    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    
    Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    
    Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]
    
    Constraints:
    - 2 <= nums.length <= 104
    - -109 <= nums[i] <= 109
    - -109 <= target <= 109
    - Only one valid answer exists.
    """
    # map = {2:0, 7:1}

    map = {}

    for i, current in enumerate(nums):
        requiredNumber = target - current
        if requiredNumber in map:
            return [map[requiredNumber], i]
        map[current] = i
    
    return [-1, -1]



# Test cases
if __name__ == "__main__":
    # Test case 1
    nums1 = [2, 7, 11, 15]
    target1 = 9
    print(f"Test 1: nums = {nums1}, target = {target1}")
    result1 = two_sum(nums1, target1)
    print(f"Expected: [0, 1], Got: {result1}")
    
    # Test case 2
    nums2 = [3, 2, 4]
    target2 = 6
    print(f"Test 2: nums = {nums2}, target = {target2}")
    result2 = two_sum(nums2, target2)
    print(f"Expected: [1, 2], Got: {result2}")
    
    # Test case 3
    nums3 = [3, 3]
    target3 = 6
    print(f"Test 3: nums = {nums3}, target = {target3}")
    result3 = two_sum(nums3, target3)
    print(f"Expected: [0, 1], Got: {result3}")
