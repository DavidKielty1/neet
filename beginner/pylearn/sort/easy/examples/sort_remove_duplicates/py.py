def sort_remove_duplicates(arr: list[int]) -> tuple[list[int], int]:
    """
    Sort an array and remove duplicates.
    Return tuple of (sorted_unique_array, number_of_unique_elements).
    
    This is a common problem that combines sorting with duplicate removal.
    It's useful for data cleaning and preparation.
    
    Time Complexity: O(n log n) for sorting + O(n) for duplicate removal = O(n log n)
    Space Complexity: O(n) for the result array
    
    Example:
    Input: [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
    SDups: [1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9]
    Output: ([1, 2, 3, 4, 5, 6, 9], 7)
    
    Learning goals:
    - Combining sorting with other operations
    - Duplicate removal techniques
    - Counting unique elements
    - Efficient algorithms
    """
    if not arr:
        return [], 0
    
    # Sort the array first
    sorted_arr = sorted(arr)
    
    # Remove duplicates while maintaining order
    unique_arr = []
    unique_count = 0
    
    for i, num in enumerate(sorted_arr):
        # Add first element or if current element is different from previous
        if i == 0 or num != sorted_arr[i - 1]:
            unique_arr.append(num)
            unique_count += 1
    
    return unique_arr, unique_count


def sort_remove_duplicates_inplace(arr: list[int]) -> int:
    """
    Sort an array and remove duplicates in-place.
    Return the length of the array after removing duplicates.
    
    This is similar to LeetCode problem "Remove Duplicates from Sorted Array".
    The array should be modified in-place and the function should return
    the new length.
    
    Time Complexity: O(n log n) for sorting + O(n) for duplicate removal = O(n log n)
    Space Complexity: O(1) - in-place modification
    
    Example:
    Input: [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
    Output: 7 (array becomes [1, 2, 3, 4, 5, 6, 9, ...])
    
    Learning goals:
    - In-place array modification
    - Two-pointer technique
    - Returning length instead of array
    """
    if not arr:
        return 0
    
    # Sort the array in-place
    arr.sort()
    
    # Use two-pointer technique to remove duplicates
    write_index = 1  # Position to write next unique element
    
    for read_index in range(1, len(arr)):
        # If current element is different from previous, it's unique
        if arr[read_index] != arr[read_index - 1]:
            arr[write_index] = arr[read_index]
            write_index += 1
    
    return write_index


def sort_remove_duplicates_set(arr: list[int]) -> list[int]:
    """
    Sort an array and remove duplicates using set (alternative approach).
    
    This approach uses Python's set to remove duplicates, then sorts.
    It's more concise but may not preserve the original order of first occurrences.
    
    Time Complexity: O(n log n) for sorting
    Space Complexity: O(n) for the set
    
    Learning goals:
    - Using built-in data structures
    - Set operations
    - Alternative approaches
    """
    # Convert to set to remove duplicates, then sort
    unique_set = set(arr)
    return sorted(unique_set)


# Test cases
if __name__ == "__main__":
    print("=== Testing sort_remove_duplicates ===")
    
    # Test case 1: Array with duplicates
    test1 = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
    result1, count1 = sort_remove_duplicates(test1)
    print(f"Original: {test1}")
    print(f"Sorted unique: {result1}")
    print(f"Unique count: {count1}")
    print()
    
    # Test case 2: Already sorted with duplicates
    test2 = [1, 1, 2, 2, 3, 3, 4, 4, 5]
    result2, count2 = sort_remove_duplicates(test2)
    print(f"Original: {test2}")
    print(f"Sorted unique: {result2}")
    print(f"Unique count: {count2}")
    print()
    
    # Test case 3: No duplicates
    test3 = [5, 2, 8, 1, 9]
    result3, count3 = sort_remove_duplicates(test3)
    print(f"Original: {test3}")
    print(f"Sorted unique: {result3}")
    print(f"Unique count: {count3}")
    print()
    
    # Test case 4: Empty array
    test4 = []
    result4, count4 = sort_remove_duplicates(test4)
    print(f"Original: {test4}")
    print(f"Sorted unique: {result4}")
    print(f"Unique count: {count4}")
    print()
    
    # Test case 5: Single element
    test5 = [42]
    result5, count5 = sort_remove_duplicates(test5)
    print(f"Original: {test5}")
    print(f"Sorted unique: {result5}")
    print(f"Unique count: {count5}")
    print()
    
    print("=== Testing sort_remove_duplicates_inplace ===")
    
    # Test case 6: In-place modification
    test6 = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
    print(f"Original: {test6}")
    new_length = sort_remove_duplicates_inplace(test6)
    print(f"After in-place modification: {test6[:new_length]}")
    print(f"New length: {new_length}")
    print()
    
    # Test case 7: All same elements
    test7 = [7, 7, 7, 7, 7]
    print(f"Original: {test7}")
    new_length7 = sort_remove_duplicates_inplace(test7)
    print(f"After in-place modification: {test7[:new_length7]}")
    print(f"New length: {new_length7}")
    print()
    
    print("=== Testing sort_remove_duplicates_set ===")
    
    # Test case 8: Using set approach
    test8 = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
    result8 = sort_remove_duplicates_set(test8)
    print(f"Original: {test8}")
    print(f"Using set approach: {result8}")
    print()
    
    # Performance comparison
    print("=== Performance Note ===")
    print("1. sort_remove_duplicates: O(n log n) time, O(n) space")
    print("2. sort_remove_duplicates_inplace: O(n log n) time, O(1) space")
    print("3. sort_remove_duplicates_set: O(n log n) time, O(n) space")
    print("Choose based on whether you need in-place modification or not.")
