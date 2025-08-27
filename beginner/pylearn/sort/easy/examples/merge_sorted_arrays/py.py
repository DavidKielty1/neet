def merge_sorted_arrays(arr1: list[int], arr2: list[int]) -> list[int]:
    """
    Merge two sorted arrays into one sorted array.
    
    This is a fundamental operation used in merge sort and other algorithms.
    It efficiently combines two sorted arrays by comparing elements from both
    arrays and placing them in the correct order.
    
    Time Complexity: O(n + m) where n and m are lengths of arr1 and arr2
    Space Complexity: O(n + m) for the result array
    
    Example:
    Input: arr1 = [1, 3, 5, 7], arr2 = [2, 4, 6, 8]
    Output: [1, 2, 3, 4, 5, 6, 7, 8]
    
    Learning goals:
    - Two-pointer technique
    - Handling arrays of different lengths
    - Maintaining sorted order
    - Efficient merging
    """
    result = []
    i = 0  # Pointer for arr1
    j = 0  # Pointer for arr2
    
    # Compare elements from both arrays and add the smaller one
    while i < len(arr1) and j < len(arr2):
        if arr1[i] <= arr2[j]:
            result.append(arr1[i])
            i += 1
        else:
            result.append(arr2[j])
            j += 1
    
    # Add remaining elements from arr1 (if any)
    while i < len(arr1):
        result.append(arr1[i])
        i += 1
    
    # Add remaining elements from arr2 (if any)
    while j < len(arr2):
        result.append(arr2[j])
        j += 1
    
    return result


def merge_sorted_arrays_inplace(arr1: list[int], m: int, arr2: list[int], n: int) -> None:
    """
    Merge two sorted arrays in-place (LeetCode style problem).
    
    arr1 has enough space to hold all elements from both arrays.
    m is the number of elements in arr1, n is the number of elements in arr2.
    The result should be stored in arr1.
    
    Example:
    Input: arr1 = [1,2,3,0,0,0], m = 3, arr2 = [2,5,6], n = 3
    Output: arr1 = [1,2,2,3,5,6]
    
    Learning goals:
    - In-place operations
    - Working backwards to avoid overwriting
    - Handling edge cases
    """
    # Start from the end of the merged array
    last = m + n - 1
    i = m - 1  # Last element in arr1
    j = n - 1  # Last element in arr2
    
    # Fill from the end to avoid overwriting elements in arr1
    while i >= 0 and j >= 0:
        if arr1[i] > arr2[j]:
            arr1[last] = arr1[i]
            i -= 1
        else:
            arr1[last] = arr2[j]
            j -= 1
        last -= 1
    
    # If there are remaining elements in arr2, copy them
    while j >= 0:
        arr1[last] = arr2[j]
        j -= 1
        last -= 1


# Test cases
if __name__ == "__main__":
    print("=== Testing merge_sorted_arrays ===")
    
    # Test case 1: Equal length arrays
    arr1_1 = [1, 3, 5, 7]
    arr2_1 = [2, 4, 6, 8]
    result1 = merge_sorted_arrays(arr1_1, arr2_1)
    print(f"arr1: {arr1_1}")
    print(f"arr2: {arr2_1}")
    print(f"Merged: {result1}")
    print()
    
    # Test case 2: Different length arrays
    arr1_2 = [1, 3, 5]
    arr2_2 = [2, 4, 6, 8, 10]
    result2 = merge_sorted_arrays(arr1_2, arr2_2)
    print(f"arr1: {arr1_2}")
    print(f"arr2: {arr2_2}")
    print(f"Merged: {result2}")
    print()
    
    # Test case 3: One empty array
    arr1_3 = [1, 2, 3]
    arr2_3 = []
    result3 = merge_sorted_arrays(arr1_3, arr2_3)
    print(f"arr1: {arr1_3}")
    print(f"arr2: {arr2_3}")
    print(f"Merged: {result3}")
    print()
    
    # Test case 4: Both empty arrays
    arr1_4 = []
    arr2_4 = []
    result4 = merge_sorted_arrays(arr1_4, arr2_4)
    print(f"arr1: {arr1_4}")
    print(f"arr2: {arr2_4}")
    print(f"Merged: {result4}")
    print()
    
    # Test case 5: Arrays with duplicates
    arr1_5 = [1, 2, 2, 3]
    arr2_5 = [2, 3, 4, 4]
    result5 = merge_sorted_arrays(arr1_5, arr2_5)
    print(f"arr1: {arr1_5}")
    print(f"arr2: {arr2_5}")
    print(f"Merged: {result5}")
    print()
    
    print("=== Testing merge_sorted_arrays_inplace ===")
    
    # Test case 6: In-place merge
    arr1_6 = [1, 2, 3, 0, 0, 0]
    arr2_6 = [2, 5, 6]
    print(f"Before merge - arr1: {arr1_6}, arr2: {arr2_6}")
    merge_sorted_arrays_inplace(arr1_6, 3, arr2_6, 3)
    print(f"After merge - arr1: {arr1_6}")
    print()
    
    # Test case 7: arr1 longer than arr2
    arr1_7 = [1, 3, 5, 7, 0, 0]
    arr2_7 = [2, 4]
    print(f"Before merge - arr1: {arr1_7}, arr2: {arr2_7}")
    merge_sorted_arrays_inplace(arr1_7, 4, arr2_7, 2)
    print(f"After merge - arr1: {arr1_7}")
    print()
    
    # Test case 8: arr2 longer than arr1
    arr1_8 = [1, 0, 0, 0, 0]
    arr2_8 = [2, 3, 4, 5]
    print(f"Before merge - arr1: {arr1_8}, arr2: {arr2_8}")
    merge_sorted_arrays_inplace(arr1_8, 1, arr2_8, 4)
    print(f"After merge - arr1: {arr1_8}")
