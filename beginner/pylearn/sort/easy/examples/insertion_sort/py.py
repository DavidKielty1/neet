def insertion_sort(arr: list[int]) -> tuple[list[int], int]:
    """
    Sort an array using insertion sort algorithm.
    Return tuple of (sorted_array, number_of_shifts).
    
    Insertion Sort works by building a sorted array one element at a time.
    It takes each element from the unsorted part and inserts it into its correct
    position in the sorted part.
    
    Time Complexity: O(n²) worst case, O(n) best case (already sorted)
    Space Complexity: O(1) - in-place sorting
    Stable Sort: Yes
    
    Example:
    Input: [64, 34, 25, 12, 22, 11, 90]
    Input: [12, 22, 25, 34, 64, 11, 90]
            J
    curr=22

    Output: ([11, 12, 22, 25, 34, 64, 90], 15)
    
    Learning goals:
    - Building sorted array incrementally
    - Shifting elements
    - Best for small arrays
    - Stable sorting
    """
    # Create a copy to avoid modifying original array
    arr_copy = arr.copy()
    n = len(arr_copy)
    shifts = 0
    
    # Start from the second element (index 1)
    for i in range(1, n):
        # Store the current element
        curr = arr_copy[i]
        j = i - 1
        
        # Move elements of arr_copy[0..i-1] that are greater than current
        # to one position ahead of their current position
        while j >= 0 and arr_copy[j] > curr:
            arr_copy[j + 1] = arr_copy[j]
            j -= 1
            shifts += 1
        
        # Place current element in its correct position
        arr_copy[j + 1] = curr
    
    return arr_copy, shifts


# Test cases
if __name__ == "__main__":
    # Test case 1: Random array
    test1 = [64, 34, 25, 12, 22, 11, 90]
    result1, shifts1 = insertion_sort(test1)
    print(f"Original: {test1}")
    print(f"Sorted: {result1}")
    print(f"Shifts: {shifts1}")
    print()
    
    # Test case 2: Already sorted array (best case)
    test2 = [1, 2, 3, 4, 5]
    result2, shifts2 = insertion_sort(test2)
    print(f"Original: {test2}")
    print(f"Sorted: {result2}")
    print(f"Shifts: {shifts2}")
    print()
    
    # Test case 3: Reverse sorted array (worst case)
    test3 = [5, 4, 3, 2, 1]
    result3, shifts3 = insertion_sort(test3)
    print(f"Original: {test3}")
    print(f"Sorted: {result3}")
    print(f"Shifts: {shifts3}")
    print()
    
    # Test case 4: Array with duplicates
    test4 = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
    result4, shifts4 = insertion_sort(test4)
    print(f"Original: {test4}")
    print(f"Sorted: {result4}")
    print(f"Shifts: {shifts4}")
    print()
    
    # Test case 5: Empty array
    test5 = []
    result5, shifts5 = insertion_sort(test5)
    print(f"Original: {test5}")
    print(f"Sorted: {result5}")
    print(f"Shifts: {shifts5}")
    print()
    
    # Test case 6: Single element
    test6 = [42]
    result6, shifts6 = insertion_sort(test6)
    print(f"Original: {test6}")
    print(f"Sorted: {result6}")
    print(f"Shifts: {shifts6}")
    print()
    
    # Test case 7: Nearly sorted array
    test7 = [1, 2, 4, 3, 5, 6, 8, 7, 9]
    result7, shifts7 = insertion_sort(test7)
    print(f"Original: {test7}")
    print(f"Sorted: {result7}")
    print(f"Shifts: {shifts7}")
    print()
    
    # Test case 8: Demonstrate stability
    # Using tuples to show that equal elements maintain their relative order
    test8 = [(3, 'a'), (1, 'b'), (3, 'c'), (2, 'd')]
    # Sort by first element of tuple
    result8, shifts8 = insertion_sort([x[0] for x in test8])
    print(f"Original: {[x[0] for x in test8]}")
    print(f"Sorted: {result8}")
    print(f"Shifts: {shifts8}")
    print("Note: Insertion sort is stable - equal elements maintain relative order")
