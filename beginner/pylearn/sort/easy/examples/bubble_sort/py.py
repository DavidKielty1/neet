def bubble_sort(arr: list[int]) -> tuple[list[int], int]:
    """
    Sort an array using bubble sort algorithm.
    Return tuple of (sorted_array, number_of_swaps).
    
    Bubble Sort works by repeatedly stepping through the list,
    comparing adjacent elements and swapping them if they are in the wrong order.
    
    Time Complexity: O(n²)
    Space Complexity: O(1) - in-place sorting
    
    Example:
    Input: [64, 34, 25, 12, 22, 11, 90]
    Output: ([11, 12, 22, 25, 34, 64, 90], 15)
    
    Learning goals:
    - Nested loops for comparison
    - Swapping elements
    - Early termination optimization
    - Counting operations
    """
    # Create a copy to avoid modifying original array
    arr_copy = arr.copy()
    n = len(arr_copy)
    swaps = 0
    
    # Early termination flag
    swapped = True
    
    # Outer loop: number of passes
    for i in range(n):
        # If no swaps occurred in previous pass, array is sorted
        if not swapped:
            break
            
        swapped = False
        
        # Inner loop: compare adjacent elements
        # After each pass, largest element is in correct position
        # So we can reduce the range by i
        for j in range(0, n - i - 1):
            # Compare adjacent elements
            if arr_copy[j] > arr_copy[j + 1]:
                # Swap elements
                arr_copy[j], arr_copy[j + 1] = arr_copy[j + 1], arr_copy[j]
                swaps += 1
                swapped = True
    
    return arr_copy, swaps


# Test cases
if __name__ == "__main__":
    # Test case 1: Random array
    test1 = [64, 34, 25, 12, 22, 11, 90]
    result1, swaps1 = bubble_sort(test1)
    print(f"Original: {test1}")
    print(f"Sorted: {result1}")
    print(f"Swaps: {swaps1}")
    print()
    
    # Test case 2: Already sorted array
    test2 = [1, 2, 3, 4, 5]
    result2, swaps2 = bubble_sort(test2)
    print(f"Original: {test2}")
    print(f"Sorted: {result2}")
    print(f"Swaps: {swaps2}")
    print()
    
    # Test case 3: Reverse sorted array
    test3 = [5, 4, 3, 2, 1]
    result3, swaps3 = bubble_sort(test3)
    print(f"Original: {test3}")
    print(f"Sorted: {result3}")
    print(f"Swaps: {swaps3}")
    print()
    
    # Test case 4: Array with duplicates
    test4 = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
    result4, swaps4 = bubble_sort(test4)
    print(f"Original: {test4}")
    print(f"Sorted: {result4}")
    print(f"Swaps: {swaps4}")
    print()
    
    # Test case 5: Empty array
    test5 = []
    result5, swaps5 = bubble_sort(test5)
    print(f"Original: {test5}")
    print(f"Sorted: {result5}")
    print(f"Swaps: {swaps5}")
    print()
    
    # Test case 6: Single element
    test6 = [42]
    result6, swaps6 = bubble_sort(test6)
    print(f"Original: {test6}")
    print(f"Sorted: {result6}")
    print(f"Swaps: {swaps6}")
    print()
    
    # Test case 7: Step-by-step visualization with comments
    print("=== STEP-BY-STEP BUBBLE SORT VISUALIZATION ===")
    
    # Example: [5, 2, 8, 1, 9] with n=5
    # 
    # PASS 1 (i=0):
    #   j range: range(0, 5-0-1) = range(0, 4) = [0, 1, 2, 3]
    #   j=0: Compare arr[0]=5 with arr[1]=2 → SWAP → [2, 5, 8, 1, 9]
    #   j=1: Compare arr[1]=5 with arr[2]=8 → No swap → [2, 5, 8, 1, 9]
    #   j=2: Compare arr[2]=8 with arr[3]=1 → SWAP → [2, 5, 1, 8, 9]
    #   j=3: Compare arr[3]=8 with arr[4]=9 → No swap → [2, 5, 1, 8, 9]
    #   After Pass 1: [2, 5, 1, 8, 9] (largest element 9 is in position)
    #
    # PASS 2 (i=1):
    #   j range: range(0, 5-1-1) = range(0, 3) = [0, 1, 2]
    #   j=0: Compare arr[0]=2 with arr[1]=5 → No swap → [2, 5, 1, 8, 9]
    #   j=1: Compare arr[1]=5 with arr[2]=1 → SWAP → [2, 1, 5, 8, 9]
    #   j=2: Compare arr[2]=5 with arr[3]=8 → No swap → [2, 1, 5, 8, 9]
    #   After Pass 2: [2, 1, 5, 8, 9] (largest 2 elements are in position)
    #
    # PASS 3 (i=2):
    #   j range: range(0, 5-2-1) = range(0, 2) = [0, 1]
    #   j=0: Compare arr[0]=2 with arr[1]=1 → SWAP → [1, 2, 5, 8, 9]
    #   j=1: Compare arr[1]=2 with arr[2]=5 → No swap → [1, 2, 5, 8, 9]
    #   After Pass 3: [1, 2, 5, 8, 9] (largest 3 elements are in position)
    #
    # PASS 4 (i=3):
    #   j range: range(0, 5-3-1) = range(0, 1) = [0]
    #   j=0: Compare arr[0]=1 with arr[1]=2 → No swap → [1, 2, 5, 8, 9]
    #   After Pass 4: [1, 2, 5, 8, 9] (largest 4 elements are in position)
    #
    # Final result: [1, 2, 5, 8, 9]
    #
    # KEY INSIGHTS:
    # - i represents the pass number (0, 1, 2, 3, ...)
    # - j represents the position within each pass
    # - After each pass, the largest i+1 elements are in their final positions
    # - The range for j shrinks by 1 each pass: range(0, n-i-1)
    # - This is why we don't need to check the last i elements in pass i
    # - Early termination: if no swaps occur in a pass, array is sorted
