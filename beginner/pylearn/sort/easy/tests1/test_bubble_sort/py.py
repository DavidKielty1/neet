def bubble_sort_test(arr: list[int]) -> tuple[list[int], int]:
    """
    TODO: Implement bubble sort algorithm.
    
    Sort an array using bubble sort and return (sorted_array, number_of_swaps).
    
    Requirements:
    - Use nested loops with i and j variables
    - Compare adjacent elements and swap if needed
    - Count the number of swaps performed
    - Include early termination optimization
    - Return tuple of (sorted_array, swaps_count)
    
    Example:
    Input: [5, 2, 8, 1, 9]
    Output: ([1, 2, 5, 8, 9], 4)
    
    Learning goals:
    - Understanding nested loop patterns
    - Implementing in-place sorting
    - Counting operations
    - Early termination optimization
    """
    arr_copy = arr.copy()
    n = len(arr_copy)
    swaps = 0

    swapped = True

    for i in range(n - 1):
        if not swapped:
            break

        swapped = False

        for j in range(0, n - i - 1):
            if arr_copy[j] > arr_copy[j + 1]:
                arr_copy[j], arr_copy[j + 1] = arr_copy[j + 1], arr_copy[j]
                swaps += 1
                swapped = True

    return arr_copy, swaps



# Test cases - run these to verify your implementation
if __name__ == "__main__":
    # Test 1: Basic sorting
    test1 = [5, 2, 8, 1, 9]
    result1, swaps1 = bubble_sort_test(test1)
    print(f"Test 1: {test1} → {result1} (swaps: {swaps1})")
    
    # Test 2: Already sorted
    test2 = [1, 2, 3, 4, 5]
    result2, swaps2 = bubble_sort_test(test2)
    print(f"Test 2: {test2} → {result2} (swaps: {swaps2})")
    
    # Test 3: Reverse sorted
    test3 = [5, 4, 3, 2, 1]
    result3, swaps3 = bubble_sort_test(test3)
    print(f"Test 3: {test3} → {result3} (swaps: {swaps3})")
    
    # Test 4: Duplicates
    test4 = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
    result4, swaps4 = bubble_sort_test(test4)
    print(f"Test 4: {test4} → {result4} (swaps: {swaps4})")
    
    # Test 5: Empty array
    test5 = []
    result5, swaps5 = bubble_sort_test(test5)
    print(f"Test 5: {test5} → {result5} (swaps: {swaps5})")
