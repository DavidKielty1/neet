def search(nums, target):
    """
    Binary Search
    
    Given an array of integers nums which is sorted in ascending order, and an integer target, 
    write a function to search target in nums. If target exists, then return its index. 
    Otherwise, return -1.
    
    You must write an algorithm with O(log n) runtime complexity.
    
    Example 1:
    Input: nums = [-1,0,3,5,9,12], target = 9
    Output: 4
    Explanation: 9 exists in nums and its index is 4
    
    Example 2:
    Input: nums = [-1,0,3,5,9,12], target = 2
    Output: -1
    Explanation: 2 does not exist in nums so return -1
    
    Constraints:
    - 1 <= nums.length <= 104
    - -104 < nums[i], target < 104
    - All the integers in nums are unique.
    - nums is sorted in ascending order.
    """
    left = 0
    right = len(nums) - 1
    print("Right:", right)

    while left <= right:
        mid = left + (right - left) // 2
        print("Mid:", mid)

        if nums[mid] == target:
            return mid
        
        elif target < nums[mid]:
            right = mid - 1

        else:
            left = mid + 1

    return -1




# Test cases
if __name__ == "__main__":
    # Test case 1
    nums1 = [-1, 0, 3, 5, 9, 12]
    target1 = 9
    print(f"Test 1: nums = {nums1}, target = {target1}")
    result1 = search(nums1, target1)
    print(f"Expected: 4, Got: {result1}")
    
    # Test case 2
    target2 = 2
    print(f"Test 2: nums = {nums1}, target = {target2}")
    result2 = search(nums1, target2)
    print(f"Expected: -1, Got: {result2}")
    
    # Test case 3
    nums3 = [5]
    target3 = 5
    print(f"Test 3: nums = {nums3}, target = {target3}")
    result3 = search(nums3, target3)
    print(f"Expected: 0, Got: {result3}")
    
    # Test case 4
    target4 = -5
    print(f"Test 4: nums = {nums3}, target = {target4}")
    result4 = search(nums3, target4)
    print(f"Expected: -1, Got: {result4}")
