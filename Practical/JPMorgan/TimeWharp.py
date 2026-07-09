def getMinOperations(computationalTime: list[int]) -> int:
    """
    Strategy: Keep dividing the largest even numbers by 2 until all are odd
    Use a dictionary to track counts of each unique value
    """
    operations = 0

    # Create a dictionary to track values and their frequencies
    value_map = {}
    for time in computationalTime:
        value_map[time] = value_map.get(time, 0) + 1

    # Keep processing until all values are odd
    while True:
        # Find the maximum even value
        max_even = -1
        for value in value_map:
            if value % 2 == 0 and value > max_even:
                max_even = value

        # If no even values found, we're done
        if max_even == -1:
            break

        # Divide all instances of max_even by 2
        count = value_map[max_even]
        del value_map[max_even]
        new_value = max_even // 2
        value_map[new_value] = value_map.get(new_value, 0) + count

        operations += 1

    return operations


# Test cases
print(getMinOperations([2, 4, 8, 16]))  # Expected: 4
print(getMinOperations([3, 24]))  # Expected: 3
print(getMinOperations([1, 9, 5]))  # Expected: 0 (all odd already)
