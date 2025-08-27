def num_jewels_in_stones(jewels: str, stones: str) -> int:
    """
    Count how many stones are also jewels.
    Example: jewels = "aA", stones = "aAAbbbb" -> 3
    
    How it works:
    1. Look at each stone one by one
    2. Check if that stone is in our jewels string
    3. Add 1 to count if it is
    
    Note: Case sensitive, so:
    - "a" is different from "A"
    - "aA" means both "a" and "A" are jewels
    
    Alternative one-liner (less readable):
    return sum(stone in jewels for stone in stones)
    """
    count = 0
    for stone in stones:
        if stone in jewels:
            count += 1
    return count


# Test cases
print(num_jewels_in_stones("aA", "aAAbbbb"))    # 3 (a,A,A are jewels)
print(num_jewels_in_stones("z", "ZZ"))          # 0 (no matches - case sensitive)