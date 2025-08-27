def selection_sort(arr: list[int]) -> tuple[list[int], int]:
    """
    Sort an array using selection sort algorithm.
    Return tuple of (sorted_array, number_of_comparisons).
    
    Selection Sort works by dividing the array into a sorted and unsorted region.
    In each iteration, it finds the minimum element from the unsorted region
    and places it at the end of the sorted region.
    
    Time Complexity: O(n²)
    Space Complexity: O(1) - in-place sorting
    
    Example:
    Input: [64, 34, 25, 12, 22, 11, 90]
    Output: ([11, 12, 22, 25, 34, 64, 90], 21)
    
    Learning goals:
    - Finding minimum element
    - Swapping elements
    - In-place sorting
    - Counting comparisons
    """
    # Create a copy to avoid modifying original array
    arr_copy = arr.copy()
    n = len(arr_copy)
    comparisons = 0
    
    # Traverse through all array elements
    for i in range(n):
        # Find the minimum element in remaining unsorted array
        min_idx = i
        for j in range(i + 1, n):
            comparisons += 1
            if arr_copy[j] < arr_copy[min_idx]:
                min_idx = j
        
        # Swap the found minimum element with the first element
        if min_idx != i:
            arr_copy[i], arr_copy[min_idx] = arr_copy[min_idx], arr_copy[i]
    
    return arr_copy, comparisons


# Test cases
if __name__ == "__main__":
    # Test case 1: Random array
    test1 = [64, 34, 25, 12, 22, 11, 90]
    result1, comparisons1 = selection_sort(test1)
    print(f"Original: {test1}")
    print(f"Sorted: {result1}")
    print(f"Comparisons: {comparisons1}")
    print()
    
    # Test case 2: Already sorted array
    test2 = [1, 2, 3, 4, 5]
    result2, comparisons2 = selection_sort(test2)
    print(f"Original: {test2}")
    print(f"Sorted: {result2}")
    print(f"Comparisons: {comparisons2}")
    print()
    
    # Test case 3: Reverse sorted array
    test3 = [5, 4, 3, 2, 1]
    result3, comparisons3 = selection_sort(test3)
    print(f"Original: {test3}")
    print(f"Sorted: {result3}")
    print(f"Comparisons: {comparisons3}")
    print()
    
    # Test case 4: Array with duplicates
    test4 = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
    result4, comparisons4 = selection_sort(test4)
    print(f"Original: {test4}")
    print(f"Sorted: {result4}")
    print(f"Comparisons: {comparisons4}")
    print()
    
    # Test case 5: Empty array
    test5 = []
    result5, comparisons5 = selection_sort(test5)
    print(f"Original: {test5}")
    print(f"Sorted: {result5}")
    print(f"Comparisons: {comparisons5}")
    print()
    
    # Test case 6: Single element
    test6 = [42]
    result6, comparisons6 = selection_sort(test6)
    print(f"Original: {test6}")
    print(f"Sorted: {result6}")
    print(f"Comparisons: {comparisons6}")
    print()
    
    # Test case 7: All same elements
    test7 = [7, 7, 7, 7, 7]
    result7, comparisons7 = selection_sort(test7)
    print(f"Original: {test7}")
    print(f"Sorted: {result7}")
    print(f"Comparisons: {comparisons7}")
