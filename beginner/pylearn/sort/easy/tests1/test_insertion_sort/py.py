def insertion_sort_test(arr: list[int]) -> tuple[list[int], int]:
    """
    TODO: Implement insertion sort algorithm.
    
    Sort an array using insertion sort and return (sorted_array, number_of_shifts).
    
    Requirements:
    - Build sorted array incrementally
    - Insert each element into correct position in sorted portion
    - Shift elements as needed to make space
    - Count the number of shifts performed
    - Return tuple of (sorted_array, shifts_count)
    
    Example:
    Input: [5, 2, 8, 1, 9]
    Output: ([1, 2, 5, 8, 9], 6)
    
    Learning goals:
    - Building sorted array incrementally
    - Understanding insertion sort logic
    - Counting shifts vs swaps
    - Stable sorting implementation
    """
    arr_copy = arr.copy()
    n = len(arr_copy)
    shifts = 0

    for i in range(1, n):
        current = arr_copy[i]
        j = i - 1

        while j >= 0 and arr_copy[j] > current:
            arr_copy[j + 1] = arr_copy[j]
            shifts += 1
            j -= 1
        
        arr_copy[j + 1] = current

    return arr_copy, shifts


# Test cases - run these to verify your implementation
if __name__ == "__main__":
    # Test 1: Basic sorting
    test1 = [5, 2, 8, 1, 9]
    result1, shifts1 = insertion_sort_test(test1)
    print(f"Test 1: {test1} → {result1} (shifts: {shifts1})")
    
    # Test 2: Already sorted (best case)
    test2 = [1, 2, 3, 4, 5]
    result2, shifts2 = insertion_sort_test(test2)
    print(f"Test 2: {test2} → {result2} (shifts: {shifts2})")
    
    # Test 3: Reverse sorted (worst case)
    test3 = [5, 4, 3, 2, 1]
    result3, shifts3 = insertion_sort_test(test3)
    print(f"Test 3: {test3} → {result3} (shifts: {shifts3})")
    
    # Test 4: Nearly sorted
    test4 = [1, 2, 4, 3, 5, 6, 8, 7, 9]
    result4, shifts4 = insertion_sort_test(test4)
    print(f"Test 4: {test4} → {result4} (shifts: {shifts4})")
    
    # Test 5: Duplicates
    test5 = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
    result5, shifts5 = insertion_sort_test(test5)
    print(f"Test 5: {test5} → {result5} (shifts: {shifts5})")
