def intersection(nums1, nums2):
    """
    Intersection of Two Arrays
    
    Given two integer arrays nums1 and nums2, return an array of their intersection. 
    Each element in the result must be unique and you may return the result in any order.
    
    Example 1:
    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2]
    
    Example 2:
    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    Output: [9,4]
    Explanation: [4,9] is also accepted.
    
    Constraints:
    - 1 <= nums1.length, nums2.length <= 1000
    - 0 <= nums1[i], nums2[i] <= 1000
    """
    pass


# Test cases
if __name__ == "__main__":
    # Test case 1
    nums1_1 = [1, 2, 2, 1]
    nums2_1 = [2, 2]
    print(f"Test 1: nums1 = {nums1_1}, nums2 = {nums2_1}")
    result1 = intersection(nums1_1, nums2_1)
    print(f"Expected: [2], Got: {result1}")
    
    # Test case 2
    nums1_2 = [4, 9, 5]
    nums2_2 = [9, 4, 9, 8, 4]
    print(f"Test 2: nums1 = {nums1_2}, nums2 = {nums2_2}")
    result2 = intersection(nums1_2, nums2_2)
    print(f"Expected: [9, 4] or [4, 9], Got: {result2}")
    
    # Test case 3
    nums1_3 = [1, 2, 3]
    nums2_3 = [4, 5, 6]
    print(f"Test 3: nums1 = {nums1_3}, nums2 = {nums2_3}")
    result3 = intersection(nums1_3, nums2_3)
    print(f"Expected: [], Got: {result3}")
    
    # Test case 4
    nums1_4 = [1, 2, 3, 4]
    nums2_4 = [2, 3, 4, 5]
    print(f"Test 4: nums1 = {nums1_4}, nums2 = {nums2_4}")
    result4 = intersection(nums1_4, nums2_4)
    print(f"Expected: [2, 3, 4] (any order), Got: {result4}")
    
    # Test case 5
    nums1_5 = [1]
    nums2_5 = [1]
    print(f"Test 5: nums1 = {nums1_5}, nums2 = {nums2_5}")
    result5 = intersection(nums1_5, nums2_5)
    print(f"Expected: [1], Got: {result5}")
