# Binary Search

## Pattern Overview

Binary Search is a divide-and-conquer algorithm used to efficiently search sorted arrays or search spaces. It repeatedly divides the search interval in half, achieving O(log n) time complexity. Useful for:

- Searching in sorted arrays
- Finding boundaries or thresholds
- Optimization problems
- Problems with monotonic properties

## Key Concepts

1. **Sorted Data** - Array must be sorted (or search space is ordered)
2. **Divide & Conquer** - Split search space in half each iteration
3. **Three Pointers** - Left, right, and middle
4. **Search Space** - Can be explicit (array) or implicit (answer range)

## Problems in This Category

### Easy Level

| Problem       | LeetCode # | Search Type | Key Technique     |
| ------------- | ---------- | ----------- | ----------------- |
| Binary Search | 704        | Classic     | Standard template |

### Medium Level (for reference)

- Search a 2D Matrix (74)
- Koko Eating Bananas (875)
- Find Minimum in Rotated Sorted Array (153)
- Search in Rotated Sorted Array (33)
- Time Based Key-Value Store (981)

## Common Patterns

### 1. Classic Binary Search

```python
def binary_search(nums, target):
    left, right = 0, len(nums) - 1

    while left <= right:
        mid = left + (right - left) // 2

        if nums[mid] == target:
            return mid
        elif nums[mid] < target:
            left = mid + 1
        else:
            right = mid - 1

    return -1
```

### 2. Finding Left Boundary

```python
def find_left_boundary(nums, target):
    left, right = 0, len(nums) - 1
    result = -1

    while left <= right:
        mid = left + (right - left) // 2

        if nums[mid] == target:
            result = mid
            right = mid - 1  # continue searching left
        elif nums[mid] < target:
            left = mid + 1
        else:
            right = mid - 1

    return result
```

### 3. Finding Right Boundary

```python
def find_right_boundary(nums, target):
    left, right = 0, len(nums) - 1
    result = -1

    while left <= right:
        mid = left + (right - left) // 2

        if nums[mid] == target:
            result = mid
            left = mid + 1  # continue searching right
        elif nums[mid] < target:
            left = mid + 1
        else:
            right = mid - 1

    return result
```

### 4. Binary Search on Answer

```python
def binary_search_answer(nums, target):
    """
    When answer is in a range, not searching array directly
    """
    left, right = 0, max_possible_answer

    while left < right:
        mid = left + (right - left) // 2

        if is_valid(mid):
            right = mid  # try smaller
        else:
            left = mid + 1  # need larger

    return left
```

## When to Use Binary Search

✅ **Use when:**

- Array/list is sorted
- Need O(log n) search time
- Finding boundaries or thresholds
- Optimization problems with monotonic properties
- Can eliminate half of search space each step

❌ **Don't use when:**

- Data is unsorted (and can't be sorted)
- Need to find all occurrences efficiently
- Linear scan is already fast enough
- Search space is very small

## Time & Space Complexity

| Approach                  | Time     | Space    | Notes                    |
| ------------------------- | -------- | -------- | ------------------------ |
| Binary Search (Iterative) | O(log n) | O(1)     | Preferred approach       |
| Binary Search (Recursive) | O(log n) | O(log n) | Call stack overhead      |
| Linear Search             | O(n)     | O(1)     | Alternative for unsorted |

## Binary Search Variations

### 1. Standard Search

- Find exact target
- Return index or -1

### 2. Lower Bound

- Find first position where value >= target
- Insert position in sorted array

### 3. Upper Bound

- Find first position where value > target
- Last position where value <= target

### 4. Rotated Array

- Modified binary search for rotated sorted array
- Determine which half is sorted

### 5. 2D Matrix

- Treat 2D matrix as 1D sorted array
- Convert index: `row = mid // cols, col = mid % cols`

## Tips & Tricks

1. **Mid Calculation**: Use `left + (right - left) // 2` to avoid overflow
2. **Loop Condition**:
   - `left <= right` for exact match
   - `left < right` for boundary/answer search
3. **Update Pointers**:
   - `left = mid + 1` or `right = mid - 1` for exact match
   - `left = mid` or `right = mid` for boundary search (watch infinite loop!)
4. **Integer Division**: In Python, `//` always gives floor division
5. **Return Value**: Consider what to return when not found

## Common Pitfalls

❌ **Infinite Loops**

```python
# BAD: Can cause infinite loop
while left < right:
    mid = (left + right) // 2
    if condition:
        right = mid  # OK
    else:
        left = mid  # DANGER! If left = mid when left = right-1
```

✅ **Correct Approach**

```python
while left < right:
    mid = (left + right) // 2
    if condition:
        right = mid
    else:
        left = mid + 1  # Always make progress
```

## Edge Cases to Consider

- Empty array
- Single element
- Two elements
- Target not in array
- Target at boundaries (first/last element)
- Duplicates (if applicable)
- All elements same

## Template Pattern

```python
def binary_search_template(nums, target):
    """
    Standard template - adjust based on problem
    """
    if not nums:
        return -1

    left, right = 0, len(nums) - 1

    while left <= right:
        mid = left + (right - left) // 2

        if nums[mid] == target:
            return mid  # Found
        elif nums[mid] < target:
            left = mid + 1  # Search right
        else:
            right = mid - 1  # Search left

    return -1  # Not found
```

## Related Patterns

- **Two Pointers** - Binary search uses two pointers
- **Divide & Conquer** - Core principle of binary search
- **Greedy** - Binary search on answer often combined with greedy check
- **Ternary Search** - Variant for unimodal functions
