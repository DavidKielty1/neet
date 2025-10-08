# Hash Maps & Sets Technique

## Overview
**Hash Maps** and **Sets** are fundamental data structures that provide O(1) average-case time complexity for insertions, deletions, and lookups. They're essential for solving problems involving frequency counting, caching, and fast lookups.

## When to Use Hash Maps & Sets

### ✅ **Perfect for:**
- **Frequency counting** - Count occurrences of elements
- **Fast lookups** - Check if element exists in O(1) time
- **Caching/Memoization** - Store computed results
- **Set operations** - Union, intersection, difference
- **Two Sum problems** - Find pairs that sum to target
- **Anagram problems** - Compare character frequencies

### ❌ **Not ideal for:**
- **Range queries** - Use segment trees or other structures
- **Ordered operations** - Use balanced trees instead
- **Memory-constrained environments** - Hash maps use extra space
- **Problems requiring sorted order** - Use arrays or trees

## Hash Map & Set Patterns

### 1. **Frequency Counting**
Count occurrences of elements in a collection.

```python
def count_frequencies(nums):
    freq_map = {}
    
    for num in nums:
        freq_map[num] = freq_map.get(num, 0) + 1
    
    return freq_map

# Using Counter (Python)
from collections import Counter
def count_frequencies_counter(nums):
    return Counter(nums)
```

**Use cases:**
- Group Anagrams
- First Unique Character in a String
- Intersection of Two Arrays

### 2. **Two Sum Pattern**
Find pairs that sum to a target value.

```python
def two_sum(nums, target):
    num_map = {}
    
    for i, num in enumerate(nums):
        complement = target - num
        if complement in num_map:
            return [num_map[complement], i]
        num_map[num] = i
    
    return []
```

**Use cases:**
- Two Sum
- 3Sum (with sorting)
- 4Sum (with sorting)

### 3. **Set Operations**
Use sets for membership testing and set operations.

```python
def find_intersection(nums1, nums2):
    set1 = set(nums1)
    set2 = set(nums2)
    
    return list(set1.intersection(set2))

# Alternative: Using list comprehension
def find_intersection_list(nums1, nums2):
    set2 = set(nums2)
    return [num for num in nums1 if num in set2]
```

**Use cases:**
- Intersection of Two Arrays
- Union of Two Arrays
- Contains Duplicate

### 4. **Caching/Memoization**
Store computed results to avoid recalculation.

```python
def fibonacci_memo(n, memo={}):
    if n in memo:
        return memo[n]
    
    if n <= 1:
        return n
    
    memo[n] = fibonacci_memo(n-1, memo) + fibonacci_memo(n-2, memo)
    return memo[n]
```

**Use cases:**
- Fibonacci with memoization
- Climbing Stairs
- Word Break

## Problem Categories

### **Arrays**
- **Two Sum** - Hash map for O(n) solution
- **Contains Duplicate** - Set for membership testing
- **Intersection of Two Arrays** - Set operations
- **Valid Anagram** - Character frequency counting

### **Strings**
- **Group Anagrams** - Character frequency as key
- **First Unique Character** - Character frequency counting
- **Valid Anagram** - Compare character frequencies
- **Longest Substring Without Repeating Characters** - Set for character tracking

## Time & Space Complexity

| Operation | Time Complexity | Space Complexity |
|-----------|----------------|------------------|
| Insert | O(1) average | O(1) |
| Delete | O(1) average | O(1) |
| Lookup | O(1) average | O(1) |
| Frequency Count | O(n) | O(k) where k is unique elements |

## Common Hash Map Operations

### **Basic Operations:**
```python
# Create hash map
hash_map = {}

# Insert/Update
hash_map[key] = value

# Check existence
if key in hash_map:
    # Key exists

# Get value with default
value = hash_map.get(key, default_value)

# Delete
del hash_map[key]
```

### **Advanced Operations:**
```python
# Get all keys
keys = list(hash_map.keys())

# Get all values
values = list(hash_map.values())

# Get all items
items = list(hash_map.items())

# Clear hash map
hash_map.clear()
```

## Common Set Operations

### **Basic Operations:**
```python
# Create set
my_set = set()

# Add element
my_set.add(element)

# Remove element
my_set.remove(element)  # Raises KeyError if not found
my_set.discard(element)  # No error if not found

# Check membership
if element in my_set:
    # Element exists
```

### **Set Operations:**
```python
# Union
union = set1.union(set2)
union = set1 | set2

# Intersection
intersection = set1.intersection(set2)
intersection = set1 & set2

# Difference
difference = set1.difference(set2)
difference = set1 - set2

# Symmetric difference
sym_diff = set1.symmetric_difference(set2)
sym_diff = set1 ^ set2
```

## Common Mistakes to Avoid

1. **Hash collision handling** - Understand that O(1) is average case
2. **Memory usage** - Hash maps use extra space for O(1) operations
3. **Key type restrictions** - Only hashable types can be keys
4. **Order assumptions** - Hash maps don't guarantee order (use OrderedDict if needed)
5. **Default value handling** - Use `.get()` with default values

## Practice Strategy

### **Beginner Level:**
1. **Two Sum** - Basic hash map usage
2. **Contains Duplicate** - Set membership testing
3. **Valid Anagram** - Character frequency counting

### **Intermediate Level:**
1. **Group Anagrams** - Complex key generation
2. **First Unique Character** - Frequency counting with position
3. **Intersection of Two Arrays** - Set operations

### **Advanced Level:**
1. **Longest Substring Without Repeating Characters** - Sliding window with set
2. **Word Pattern** - Bijection mapping
3. **Isomorphic Strings** - Character mapping

## Key Insights

1. **Trade space for time** - Hash maps use extra space for O(1) operations
2. **Frequency is powerful** - Many problems can be solved by counting frequencies
3. **Set operations** - Union, intersection, difference are very useful
4. **Key design** - Sometimes you need to create composite keys
5. **Caching benefits** - Store computed results to avoid recalculation

## Interview Tips

1. **Start with brute force** - O(n²) solution first, then optimize with hash map
2. **Explain the trade-off** - Space vs time complexity
3. **Handle edge cases** - Empty inputs, single elements, no valid solutions
4. **Discuss alternatives** - When to use hash map vs other data structures
5. **Code incrementally** - Start with basic operations, then add complexity

## Template for Frequency Counting

```python
def frequency_count_template(elements):
    freq_map = {}
    
    for element in elements:
        freq_map[element] = freq_map.get(element, 0) + 1
    
    return freq_map
```

## Template for Two Sum

```python
def two_sum_template(nums, target):
    num_map = {}
    
    for i, num in enumerate(nums):
        complement = target - num
        if complement in num_map:
            return [num_map[complement], i]
        num_map[num] = i
    
    return []
```

Remember: **Hash maps and sets are about trading space for time**. They're your go-to tools for O(1) lookups and frequency counting!
