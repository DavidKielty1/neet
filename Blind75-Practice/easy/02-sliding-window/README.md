# Sliding Window Technique

## Overview

The **Sliding Window** technique is a powerful algorithmic pattern that maintains a "window" of elements in a data structure (usually an array or string) and efficiently slides this window to solve problems involving contiguous subarrays or substrings.

## When to Use Sliding Window

### ✅ **Perfect for:**

- **Contiguous subarray/substring problems**
- **Problems with fixed or variable window size**
- **Finding optimal subarrays** (maximum, minimum, target sum)
- **String problems** with character frequency constraints
- **Problems asking for "longest" or "shortest" subarrays**

### ❌ **Not ideal for:**

- **Non-contiguous elements**
- **Problems requiring backtracking**
- **Complex nested conditions**
- **Problems with random access patterns**

## Sliding Window Patterns

### 1. **Fixed Size Window**

Window size is predetermined and constant.

```python
# Example: Maximum sum of subarray of size k
def max_sum_subarray(nums, k):
    window_sum = sum(nums[:k])
    max_sum = window_sum

    for i in range(k, len(nums)):
        window_sum = window_sum - nums[i-k] + nums[i]
        max_sum = max(max_sum, window_sum)

    return max_sum
```

**Use cases:**

- Maximum Sum Subarray of Size K
- Average of Subarrays of Size K
- First Negative Number in Every Window of Size K

### 2. **Variable Size Window (Expand/Contract)**

Window size changes based on conditions.

```python
# Example: Longest substring without repeating characters
def longest_substring(s):
    char_set = set()
    left = 0
    max_length = 0

    for right in range(len(s)):
        while s[right] in char_set:
            char_set.remove(s[left])
            left += 1

        char_set.add(s[right])
        max_length = max(max_length, right - left + 1)

    return max_length
```

**Use cases:**

- Longest Substring Without Repeating Characters
- Minimum Window Substring
- Longest Substring with At Most K Distinct Characters

### 3. **Two Pointers with Conditions**

Use two pointers to maintain window boundaries.

```python
# Example: Subarray with given sum
def subarray_sum(nums, target):
    left = 0
    current_sum = 0

    for right in range(len(nums)):
        current_sum += nums[right]

        while current_sum > target:
            current_sum -= nums[left]
            left += 1

        if current_sum == target:
            return [left, right]

    return []
```

## Problem Categories

### **Arrays**

- **Maximum Subarray** - Kadane's algorithm variant
- **Minimum Size Subarray Sum** - Variable window with sum constraint
- **Subarray Product Less Than K** - Variable window with product constraint
- **Maximum Sum Subarray of Size K** - Fixed window optimization

### **Strings**

- **Longest Substring Without Repeating Characters** - Variable window with character tracking
- **Minimum Window Substring** - Variable window with character frequency
- **Longest Substring with At Most K Distinct Characters** - Variable window with character count
- **Permutation in String** - Fixed window with character frequency matching

## Time & Space Complexity

| Pattern         | Time Complexity | Space Complexity                   |
| --------------- | --------------- | ---------------------------------- |
| Fixed Window    | O(n)            | O(1)                               |
| Variable Window | O(n)            | O(k) where k is character set size |
| Two Pointers    | O(n)            | O(1)                               |

## Common Window Operations

### **Expand Window:**

```python
# Add new element to window
window.add(nums[right])
right += 1
```

### **Contract Window:**

```python
# Remove element from window
window.remove(nums[left])
left += 1
```

### **Update Result:**

```python
# Check if current window is optimal
if window_meets_condition():
    update_result()
```

## Common Mistakes to Avoid

1. **Incorrect window expansion/contraction** - Ensure proper order of operations
2. **Missing edge cases** - Empty arrays, single elements, no valid windows
3. **Wrong termination conditions** - Know when to stop expanding/contracting
4. **Inefficient data structures** - Use appropriate data structures for window tracking
5. **Off-by-one errors** - Be careful with window size calculations

## Practice Strategy

### **Beginner Level:**

1. **Maximum Sum Subarray of Size K** - Fixed window basics
2. **Longest Substring Without Repeating Characters** - Variable window with set
3. **Minimum Size Subarray Sum** - Variable window with sum constraint

### **Intermediate Level:**

1. **Minimum Window Substring** - Complex variable window
2. **Longest Substring with At Most K Distinct Characters** - Character counting
3. **Subarray Product Less Than K** - Product instead of sum

### **Advanced Level:**

1. **Permutation in String** - Fixed window with frequency matching
2. **Maximum Sum Subarray** - Kadane's algorithm
3. **Sliding Window Maximum** - Deque-based optimization

## Key Insights

1. **Window invariants** - What condition must the window always satisfy?
2. **Expansion vs contraction** - When to grow vs shrink the window
3. **Data structure choice** - Set, map, or array for tracking window state
4. **Optimization opportunities** - Can you avoid recalculating everything?
5. **Edge case handling** - What happens with empty inputs or no valid windows?

## Interview Tips

1. **Start with brute force** - O(n²) solution first, then optimize
2. **Explain the window concept** - Draw it out if helpful
3. **Discuss trade-offs** - Space vs time complexity
4. **Handle edge cases** - Empty inputs, no valid solutions
5. **Code incrementally** - Start with basic window, then add conditions

## Template for Variable Window

```python
def sliding_window_template(s):
    left = 0
    result = 0
    window_data = {}  # or set, or counter

    for right in range(len(s)):
        # Expand window
        window_data[s[right]] = window_data.get(s[right], 0) + 1

        # Contract window if needed
        while window_condition_violated():
            window_data[s[left]] -= 1
            if window_data[s[left]] == 0:
                del window_data[s[left]]
            left += 1

        # Update result
        result = max(result, right - left + 1)

    return result
```

Remember: **Sliding window is about maintaining optimal subarrays efficiently**. It's the go-to technique for contiguous element problems!
