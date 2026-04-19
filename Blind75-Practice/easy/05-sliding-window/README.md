# Sliding Window

## Pattern Overview

The Sliding Window pattern is used to perform operations on a specific window size of an array or string. It's particularly useful for:

- Finding subarrays/substrings with certain properties
- Maximum/minimum in subarrays
- Problems with contiguous sequences
- Optimization problems with constraints

## Key Concepts

1. **Fixed Window** - Window size remains constant
2. **Variable Window** - Window size changes based on conditions
3. **Window Expansion** - Grow window by moving right pointer
4. **Window Contraction** - Shrink window by moving left pointer

## Problems in This Category

### Easy Level

| Problem                         | LeetCode # | Window Type | Key Technique   |
| ------------------------------- | ---------- | ----------- | --------------- |
| Best Time to Buy and Sell Stock | 121        | Variable    | Track min price |

### Medium Level (for reference)

- Longest Substring Without Repeating Characters (3)
- Longest Repeating Character Replacement (424)
- Permutation in String (567)
- Minimum Window Substring (76)

## Common Patterns

### 1. Fixed Window Size

```python
def fixed_window(arr, k):
    # Calculate first window
    window_sum = sum(arr[:k])
    max_sum = window_sum

    # Slide window
    for i in range(k, len(arr)):
        window_sum = window_sum - arr[i-k] + arr[i]
        max_sum = max(max_sum, window_sum)

    return max_sum
```

### 2. Variable Window (Expand/Contract)

```python
def variable_window(arr, target):
    left = 0
    window_sum = 0
    result = 0

    for right in range(len(arr)):
        # Expand window
        window_sum += arr[right]

        # Contract window while condition met
        while window_sum >= target:
            result = min(result, right - left + 1)
            window_sum -= arr[left]
            left += 1

    return result
```

### 3. Best Time to Buy/Sell Pattern

```python
def max_profit(prices):
    min_price = float('inf')
    max_profit = 0

    for price in prices:
        min_price = min(min_price, price)
        max_profit = max(max_profit, price - min_price)

    return max_profit
```

## When to Use Sliding Window

✅ **Use when:**

- Problems involve subarrays/substrings
- Looking for longest/shortest/maximum/minimum
- Contiguous sequence is required
- Can optimize from O(n²) to O(n)

❌ **Don't use when:**

- Need non-contiguous elements
- Order doesn't matter
- Need global view of all elements

## Time & Space Complexity

| Approach       | Time           | Space        | Notes                       |
| -------------- | -------------- | ------------ | --------------------------- |
| Sliding Window | O(n)           | O(1) or O(k) | k = unique elements tracked |
| Brute Force    | O(n²) or O(n³) | O(1)         | Check all subarrays         |

## Tips & Tricks

1. **Two Pointers**: Sliding window uses left and right pointers
2. **Hash Map**: Often combined to track elements in window
3. **Window State**: Maintain window's state (sum, count, etc.)
4. **Expand First**: Usually expand with right, contract with left
5. **While vs If**: Use `while` for contraction when multiple steps needed

## Common Window States to Track

- **Sum** - Total of elements in window
- **Count** - Number of specific elements
- **Frequency Map** - Character/element frequencies
- **Min/Max** - Extremes within window
- **Unique Count** - Number of distinct elements

## Template Pattern

```python
def sliding_window_template(arr):
    left = 0
    window_state = initialize()  # sum, count, map, etc.
    result = initialize_result()

    for right in range(len(arr)):
        # 1. Add arr[right] to window
        update_window_state(arr[right])

        # 2. Contract window if needed
        while window_invalid():
            # Remove arr[left] from window
            update_window_state(arr[left], remove=True)
            left += 1

        # 3. Update result
        result = update_result(result, window_state)

    return result
```

## Edge Cases to Consider

- Empty array/string
- Single element
- Window size larger than array
- All elements same
- No valid window exists

## Related Patterns

- **Two Pointers** - Base technique for sliding window
- **Hash Map** - Often used to track window contents
- **Monotonic Queue/Stack** - For min/max in sliding window
- **Dynamic Programming** - Some problems can use either approach
