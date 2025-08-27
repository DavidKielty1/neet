def merge_sorted_arrays_test(arr1: list[int], arr2: list[int]) -> list[int]:
    """
    TODO: Implement merge sorted arrays function.
    
    Merge two sorted arrays into one sorted array.
    
    Requirements:
    - Use two-pointer technique
    - Compare elements from both arrays
    - Add smaller element to result
    - Handle arrays of different lengths
    - Return merged sorted array
    
    Example:
    Input: arr1 = [1, 3, 5], arr2 = [2, 4, 6]
    Output: [1, 2, 3, 4, 5, 6]
    
    Learning goals:
    - Two-pointer technique
    - Handling different array lengths
    - Efficient merging algorithm
    - Fundamental operation for merge sort
    """
    # TODO: Implement your merge function here
    result = []
    i = 0
    j = 0

    while i < len(arr1) and j < len(arr2):
        if arr1[i] < arr2[j]:
            result.append(arr1[i])
            i += 1
        else:
            result.append(arr2[j])
            j += 1

    while i < len(arr1):
        result.append(arr1[i])
        i += 1

    while j < len(arr2):
        result.append(arr2[j])
        j += 1

    return result




# Test cases - run these to verify your implementation
if __name__ == "__main__":
    # Test 1: Equal length arrays
    test1_arr1 = [1, 3, 5, 7]
    test1_arr2 = [2, 4, 6, 8]
    result1 = merge_sorted_arrays_test(test1_arr1, test1_arr2)
    print(f"Test 1: {test1_arr1} + {test1_arr2} → {result1}")
    
    # Test 2: Different length arrays
    test2_arr1 = [1, 3, 5]
    test2_arr2 = [2, 4, 6, 8, 10]
    result2 = merge_sorted_arrays_test(test2_arr1, test2_arr2)
    print(f"Test 2: {test2_arr1} + {test2_arr2} → {result2}")
    
    # Test 3: One empty array
    test3_arr1 = [1, 2, 3]
    test3_arr2 = []
    result3 = merge_sorted_arrays_test(test3_arr1, test3_arr2)
    print(f"Test 3: {test3_arr1} + {test3_arr2} → {result3}")
    
    # Test 4: Both empty arrays
    test4_arr1 = []
    test4_arr2 = []
    result4 = merge_sorted_arrays_test(test4_arr1, test4_arr2)
    print(f"Test 4: {test4_arr1} + {test4_arr2} → {result4}")
    
    # Test 5: Arrays with duplicates
    test5_arr1 = [1, 2, 2, 3]
    test5_arr2 = [2, 3, 4, 4]
    result5 = merge_sorted_arrays_test(test5_arr1, test5_arr2)
    print(f"Test 5: {test5_arr1} + {test5_arr2} → {result5}")
