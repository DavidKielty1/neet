def selection_sort_test(arr: list[int]) -> tuple[list[int], int]:
    """
    TODO: Implement selection sort algorithm.
    
    Sort an array using selection sort and return (sorted_array, number_of_comparisons).
    
    Requirements:
    - Use nested loops with i and j variables
    - Find minimum element in unsorted portion
    - Swap minimum element to correct position
    - Count the number of comparisons performed
    - Return tuple of (sorted_array, comparisons_count)
    
    Example:
    Input: [5, 2, 8, 1, 9]
    Output: ([1, 2, 5, 8, 9], 10)
    
    Learning goals:
    - Finding minimum elements
    - Understanding selection sort logic
    - Counting comparisons vs swaps
    - In-place sorting implementation
    """
    arr_copy = arr.copy()
    n = len(arr_copy)
    comparisons = 0

    for i in range(n):
        min_idx = i

        for j in range(i + 1, n):
            comparisons += 1
            if arr_copy[j] < arr_copy[min_idx]:
                min_idx = j
        
        if min_idx != i:
            arr_copy[i], arr_copy[min_idx] = arr_copy[min_idx], arr_copy[i]

    return arr_copy, comparisons

# Test cases - run these to verify your implementation
if __name__ == "__main__":
    # Test 1: Basic sorting
    test1 = [5, 2, 8, 1, 9]
    result1, comparisons1 = selection_sort_test(test1)
    print(f"Test 1: {test1} → {result1} (comparisons: {comparisons1})")
    
    # Test 2: Already sorted
    test2 = [1, 2, 3, 4, 5]
    result2, comparisons2 = selection_sort_test(test2)
    print(f"Test 2: {test2} → {result2} (comparisons: {comparisons2})")
    
    # Test 3: Reverse sorted
    test3 = [5, 4, 3, 2, 1]
    result3, comparisons3 = selection_sort_test(test3)
    print(f"Test 3: {test3} → {result3} (comparisons: {comparisons3})")
    
    # Test 4: Duplicates
    test4 = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
    result4, comparisons4 = selection_sort_test(test4)
    print(f"Test 4: {test4} → {result4} (comparisons: {comparisons4})")
    
    # Test 5: Single element
    test5 = [42]
    result5, comparisons5 = selection_sort_test(test5)
    print(f"Test 5: {test5} → {result5} (comparisons: {comparisons5})")
