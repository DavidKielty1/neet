def sort_remove_duplicates_test(arr: list[int]) -> tuple[list[int], int]:
    """
    TODO: Implement sort and remove duplicates function.
    
    Sort an array and remove duplicates, returning (sorted_unique_array, unique_count).
    
    Requirements:
    - Sort the array first
    - Remove duplicate elements while maintaining order
    - Count the number of unique elements
    - Return tuple of (sorted_unique_array, unique_count)
    
    Example:
    Input: [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
    Output: ([1, 2, 3, 4, 5, 6, 9], 7)
    
    Learning goals:
    - Combining sorting with other operations
    - Duplicate removal techniques
    - Counting unique elements
    - Efficient algorithms
    """
    # TODO: Implement your sort and remove duplicates function here
    pass


# Test cases - run these to verify your implementation
if __name__ == "__main__":
    # Test 1: Array with duplicates
    test1 = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
    result1, count1 = sort_remove_duplicates_test(test1)
    print(f"Test 1: {test1} → {result1} (unique: {count1})")
    
    # Test 2: Already sorted with duplicates
    test2 = [1, 1, 2, 2, 3, 3, 4, 4, 5]
    result2, count2 = sort_remove_duplicates_test(test2)
    print(f"Test 2: {test2} → {result2} (unique: {count2})")
    
    # Test 3: No duplicates
    test3 = [5, 2, 8, 1, 9]
    result3, count3 = sort_remove_duplicates_test(test3)
    print(f"Test 3: {test3} → {result3} (unique: {count3})")
    
    # Test 4: Empty array
    test4 = []
    result4, count4 = sort_remove_duplicates_test(test4)
    print(f"Test 4: {test4} → {result4} (unique: {count4})")
    
    # Test 5: All same elements
    test5 = [7, 7, 7, 7, 7]
    result5, count5 = sort_remove_duplicates_test(test5)
    print(f"Test 5: {test5} → {result5} (unique: {count5})") 
