# Binary Search Technique

## Overview
**Binary Search** is a fundamental divide-and-conquer algorithm that efficiently searches for a target value in a sorted array by repeatedly dividing the search space in half. It's one of the most important algorithms in computer science.

## When to Use Binary Search

### ✅ **Perfect for:**
- **Sorted arrays** - Any problem involving sorted data
- **Search problems** - Finding specific values or positions
- **Optimization problems** - Finding minimum/maximum values
- **Range problems** - Finding first/last occurrence
- **2D matrix problems** - Searching in sorted 2D arrays

### ❌ **Not ideal for:**
- **Unsorted arrays** (unless you sort first)
- **Problems requiring linear traversal**
- **Dynamic data structures** with frequent insertions/deletions

## Binary Search Patterns

### 1. **Standard Binary Search**
Find exact target value in sorted array.

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

**Use cases:**
- Search in Rotated Sorted Array
- Search a 2D Matrix
- Find Peak Element

### 2. **Find First/Last Occurrence**
Find the first or last position of a target value.

```python
def find_first_occurrence(nums, target):
    left, right = 0, len(nums) - 1
    result = -1
    
    while left <= right:
        mid = left + (right - left) // 2
        
        if nums[mid] == target:
            result = mid
            right = mid - 1  # Continue searching left
        elif nums[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    
    return result
```

**Use cases:**
- Find First and Last Position of Element
- Search Insert Position
- First Bad Version

### 3. **Search in Rotated Array**
Handle arrays that are rotated but still sorted.

```python
def search_rotated(nums, target):
    left, right = 0, len(nums) - 1
    
    while left <= right:
        mid = left + (right - left) // 2
        
        if nums[mid] == target:
            return mid
        
        # Check which half is sorted
        if nums[left] <= nums[mid]:  # Left half is sorted
            if nums[left] <= target < nums[mid]:
                right = mid - 1
            else:
                left = mid + 1
        else:  # Right half is sorted
            if nums[mid] < target <= nums[right]:
                left = mid + 1
            else:
                right = mid - 1
    
    return -1
```

**Use cases:**
- Search in Rotated Sorted Array
- Find Minimum in Rotated Sorted Array
- Search in Rotated Sorted Array II

### 4. **Peak Finding**
Find local maximum in array.

```python
def find_peak_element(nums):
    left, right = 0, len(nums) - 1
    
    while left < right:
        mid = left + (right - left) // 2
        
        if nums[mid] > nums[mid + 1]:
            right = mid
        else:
            left = mid + 1
    
    return left
```

**Use cases:**
- Find Peak Element
- Mountain Array problems
- Local maximum problems

## Problem Categories

### **Arrays**
- **Binary Search** - Basic search in sorted array
- **Search Insert Position** - Find insertion point
- **Find First and Last Position** - Range search
- **Search in Rotated Sorted Array** - Rotated array search
- **Find Peak Element** - Local maximum search
- **Search a 2D Matrix** - 2D binary search

## Time & Space Complexity

| Pattern | Time Complexity | Space Complexity |
|---------|----------------|------------------|
| Standard Search | O(log n) | O(1) |
| First/Last Occurrence | O(log n) | O(1) |
| Rotated Array | O(log n) | O(1) |
| Peak Finding | O(log n) | O(1) |

## Common Binary Search Variations

### **Left Boundary Search:**
```python
# Find leftmost position where condition is true
def find_left_boundary(nums, target):
    left, right = 0, len(nums)
    
    while left < right:
        mid = left + (right - left) // 2
        if nums[mid] < target:
            left = mid + 1
        else:
            right = mid
    
    return left
```

### **Right Boundary Search:**
```python
# Find rightmost position where condition is true
def find_right_boundary(nums, target):
    left, right = 0, len(nums)
    
    while left < right:
        mid = left + (right - left) // 2
        if nums[mid] <= target:
            left = mid + 1
        else:
            right = mid
    
    return left - 1
```

## Common Mistakes to Avoid

1. **Integer overflow** - Use `left + (right - left) // 2` instead of `(left + right) // 2`
2. **Incorrect bounds** - Be careful with `left <= right` vs `left < right`
3. **Missing edge cases** - Empty arrays, single elements, target not found
4. **Wrong termination** - Ensure loop always makes progress
5. **Off-by-one errors** - Check boundary conditions carefully

## Practice Strategy

### **Beginner Level:**
1. **Binary Search** - Master the basic template
2. **Search Insert Position** - Understand insertion point
3. **First Bad Version** - Simple boundary search

### **Intermediate Level:**
1. **Find First and Last Position** - Range search
2. **Search in Rotated Sorted Array** - Handle rotation
3. **Find Peak Element** - Local maximum search

### **Advanced Level:**
1. **Search a 2D Matrix** - 2D binary search
2. **Find Minimum in Rotated Sorted Array** - Rotation handling
3. **Search in Rotated Sorted Array II** - Handle duplicates

## Key Insights

1. **Sorted data is key** - Binary search only works on sorted data
2. **Divide and conquer** - Always eliminate half the search space
3. **Boundary conditions** - Pay attention to `<=` vs `<` and `+1` vs `-1`
4. **Template variations** - Different problems need different templates
5. **Optimization potential** - O(log n) is much better than O(n)

## Interview Tips

1. **Start with basic template** - Get the fundamentals right first
2. **Handle edge cases** - Empty arrays, single elements, not found
3. **Explain the approach** - Walk through the divide-and-conquer logic
4. **Discuss trade-offs** - When to use binary search vs linear search
5. **Code incrementally** - Start simple, then add complexity

## Template for Standard Binary Search

```python
def binary_search_template(nums, target):
    left, right = 0, len(nums) - 1
    
    while left <= right:
        mid = left + (right - left) // 2
        
        if nums[mid] == target:
            return mid
        elif nums[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    
    return -1  # Target not found
```

Remember: **Binary search is about eliminating half the search space with each comparison**. It's the foundation for many advanced algorithms!
