# Two Pointers

## Pattern Overview

The Two Pointers pattern involves using two pointers to iterate through a data structure, typically an array or string. This pattern is highly efficient for problems involving:

- Searching pairs in sorted arrays
- Palindrome checking
- Removing duplicates
- Comparing elements from different parts of the array

## Key Concepts

1. **Opposite Direction** - Pointers start at opposite ends and move toward each other
2. **Same Direction** - Both pointers move in the same direction (fast/slow)
3. **Fixed Window** - Pointers maintain a fixed distance
4. **Variable Window** - Distance between pointers changes based on conditions

## Problems in This Category

### Easy Level

| Problem                            | LeetCode # | Pointer Type | Key Technique         |
| ---------------------------------- | ---------- | ------------ | --------------------- |
| Valid Palindrome                   | 125        | Opposite     | Skip non-alphanumeric |
| Two Sum II - Input Array Is Sorted | 167        | Opposite     | Complement search     |

### Data Structure Variations

#### Arrays

- Container With Most Water
- 3Sum
- Remove Duplicates from Sorted Array

#### Strings

- Valid Palindrome
- Reverse String
- Longest Substring variations

## Common Patterns

### 1. Opposite Ends Pattern

```python
def opposite_pointers(arr):
    left, right = 0, len(arr) - 1
    while left < right:
        # Process arr[left] and arr[right]
        if condition:
            left += 1
        else:
            right -= 1
```

### 2. Fast/Slow Pointers

```python
def fast_slow(arr):
    slow = fast = 0
    while fast < len(arr):
        # Fast moves ahead
        fast += 1
        # Slow moves conditionally
        if condition:
            slow += 1
```

### 3. Sliding Window (Fixed Size)

```python
def fixed_window(arr, k):
    left = 0
    for right in range(len(arr)):
        # Add arr[right] to window
        if right - left + 1 == k:
            # Process window
            left += 1
```

## When to Use Two Pointers

✅ **Use when:**

- Array/string is sorted or can be sorted
- Looking for pairs/triplets with specific properties
- Need to compare elements from different positions
- Removing duplicates in-place
- Palindrome problems

❌ **Don't use when:**

- Need to track all elements (use hash map)
- Order cannot be changed and array is unsorted
- Need O(n²) comparisons for complex relationships

## Time & Space Complexity

| Approach                | Time  | Space | Notes                 |
| ----------------------- | ----- | ----- | --------------------- |
| Two Pointers            | O(n)  | O(1)  | In-place operations   |
| Brute Force Alternative | O(n²) | O(1)  | Nested loops          |
| Hash Map Alternative    | O(n)  | O(n)  | Trades space for time |

## Tips & Tricks

1. **Sorted Arrays**: Two pointers is often optimal
2. **Skip Duplicates**: Useful in 3Sum/4Sum problems
3. **Boundary Checks**: Always verify `left < right` or `fast < len(array)`
4. **While vs For**: Use `while` for opposite direction, `for` for same direction
5. **Palindromes**: Classic opposite-ends application

## Edge Cases to Consider

- Empty array/string
- Single element
- All duplicates
- No valid solution exists
- Pointers crossing each other

## Related Patterns

- **Sliding Window** - Extension of two pointers with dynamic window
- **Binary Search** - Uses two pointers (start/end) on sorted data
- **Fast & Slow Pointers** - Used in linked list cycle detection
