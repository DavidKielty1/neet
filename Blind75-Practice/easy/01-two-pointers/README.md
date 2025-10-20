# Two Pointers Technique

## Overview
The **Two Pointers** technique is a fundamental algorithmic pattern that uses two pointers to traverse data structures (usually arrays or strings) in a single pass. It's one of the most efficient ways to solve problems involving searching, comparing, or manipulating elements.

## When to Use Two Pointers

### ✅ **Perfect for:**
- **Sorted arrays** - Finding pairs, triplets, or ranges
- **Palindrome problems** - Checking symmetry from both ends
- **In-place operations** - Removing duplicates, moving elements
- **Subarray problems** - Finding optimal subarrays
- **String manipulation** - Reversing, comparing, validating

### ❌ **Not ideal for:**
- **Unsorted arrays** (unless you sort first)
- **Complex nested structures**
- **Problems requiring backtracking**

## Two Pointers Patterns

### 1. **Opposite Ends Pattern**
Start with pointers at both ends, move inward based on conditions.

```python
# Example: Valid Palindrome
left, right = 0, len(s) - 1
while left < right:
    if s[left] != s[right]:
        return False
    left += 1
    right -= 1
```

**Use cases:**
- Valid Palindrome
- Container With Most Water
- Two Sum (on sorted array)

### 2. **Fast/Slow Pointers Pattern**
One pointer moves faster than the other, often for in-place operations.

```python
# Example: Remove Duplicates
slow = 0
for fast in range(1, len(nums)):
    if nums[fast] != nums[slow]:
        slow += 1
        nums[slow] = nums[fast]
```

**Use cases:**
- Remove Duplicates from Sorted Array
- Move Zeroes
- Remove Element

### 3. **Sliding Window Pattern**
Two pointers maintain a window of elements that meet certain criteria.

```python
# Example: Maximum Subarray
left = 0
for right in range(len(nums)):
    # Expand window
    while window_condition_violated:
        # Contract window
        left += 1
```

**Use cases:**
- Longest Substring Without Repeating Characters
- Minimum Window Substring
- Maximum Subarray

## Problem Categories

### **Arrays**
- **Two Sum** - Hash map + sorted array approaches
- **Container With Most Water** - Opposite ends with area calculation
- **3Sum** - Fixed element + two pointers on sorted array
- **Remove Duplicates** - Fast/slow pointers for in-place removal
- **Move Zeroes** - Fast/slow pointers with swapping
- **Remove Element** - Fast/slow pointers for filtering
- **Merge Sorted Array** - Two pointers from the end

### **Strings**
- **Valid Palindrome** - Opposite ends with character validation
- **Reverse String** - Opposite ends with swapping
- **Valid Palindrome II** - Opposite ends with one deletion allowed
- **Valid Parentheses** - Stack approach (two pointers for simple cases)

## Time & Space Complexity

| Pattern | Time Complexity | Space Complexity |
|---------|----------------|------------------|
| Opposite Ends | O(n) | O(1) |
| Fast/Slow | O(n) | O(1) |
| Sliding Window | O(n) | O(1) |
| Three Pointers | O(n²) | O(1) |

## Common Mistakes to Avoid

1. **Off-by-one errors** - Be careful with pointer bounds
2. **Infinite loops** - Ensure pointers always move
3. **Wrong initialization** - Start pointers at correct positions
4. **Missing edge cases** - Empty arrays, single elements
5. **Incorrect termination** - Know when to stop the loop

## Practice Strategy

### **Beginner Level:**
1. Start with **Valid Palindrome** - simplest opposite ends
2. Try **Reverse String** - basic swapping
3. Practice **Remove Duplicates** - fast/slow pattern

### **Intermediate Level:**
1. **Container With Most Water** - opposite ends with optimization
2. **3Sum** - three pointers with sorting
3. **Valid Palindrome II** - opposite ends with backtracking

### **Advanced Level:**
1. **Two Sum** - multiple approaches
2. **Merge Sorted Array** - two pointers from end
3. **Move Zeroes** - in-place manipulation

## Key Insights

1. **Sorting helps** - Many two-pointer problems work best on sorted data
2. **Think about invariants** - What condition must always be true?
3. **Consider both directions** - Sometimes moving inward, sometimes outward
4. **Optimize space** - Two pointers often enable O(1) space solutions
5. **Handle duplicates** - Many problems have duplicate elements to consider

## Interview Tips

1. **Start simple** - Begin with brute force, then optimize
2. **Explain the approach** - Walk through your two-pointer logic
3. **Consider edge cases** - Empty inputs, single elements, all same values
4. **Discuss trade-offs** - When to use two pointers vs other approaches
5. **Code cleanly** - Clear variable names, proper bounds checking

Remember: **Two pointers is about efficiency and elegance**. It transforms O(n²) brute force solutions into O(n) elegant ones!
