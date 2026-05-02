# Heap / Priority Queue

## Pattern Overview

A Heap (Priority Queue) is a specialized tree-based data structure that efficiently maintains:

- **Min Heap**: Root is smallest element
- **Max Heap**: Root is largest element

Key operations: insert, extract min/max, peek - all in O(log n) time.

## Java Practice File Builder

When a Java practice file has only one solution method, keep the usual single spoiler spacer
block in that method.

When the solution naturally spans multiple methods, such as a helper DFS, a comparison
helper, a constructor plus `add`, or an API method plus the main solver:

1. Leave the earlier/helper method bodies unimplemented.
2. Do not add separate 40-60 line `//` spacer blocks to those helper methods.
3. Keep exactly one 40-60 line `//` spacer block in the main method the learner is meant
   to solve from.
4. Put one combined commented reference implementation under that single spacer block,
   including all related methods together.
5. Avoid duplicate commented solutions and do not add `throw new UnsupportedOperationException(...)`
   placeholders.

## Key Concepts

1. **Complete Binary Tree** - All levels filled except possibly last
2. **Heap Property** - Parent ≤ children (min) or parent ≥ children (max)
3. **Priority Queue** - Abstract data type often implemented with heap
4. **Heapify** - Build heap from array in O(n)

## Problems in This Category

### Easy Level

| Problem                       | LeetCode # | Heap Type | Key Technique  |
| ----------------------------- | ---------- | --------- | -------------- |
| Kth Largest Element in Stream | 703        | Min Heap  | Keep k largest |
| Last Stone Weight             | 1046       | Max Heap  | Process pairs  |

### Medium Level (for reference)

- K Closest Points to Origin (973)
- Kth Largest Element in Array (215)
- Task Scheduler (621)
- Find Median from Data Stream (295)

## Common Patterns

### 1. Kth Largest/Smallest Element

```python
import heapq

def find_kth_largest(nums, k):
    # Min heap of size k
    heap = []

    for num in nums:
        heapq.heappush(heap, num)
        if len(heap) > k:
            heapq.heappop(heap)

    return heap[0]  # Kth largest
```

### 2. Max Heap in Python (negate values)

```python
import heapq

# Python only has min heap, so negate for max heap
max_heap = []
for val in values:
    heapq.heappush(max_heap, -val)

# Get max
max_val = -heapq.heappop(max_heap)
```

### 3. Merge K Sorted Arrays/Lists

```python
import heapq

def merge_k_sorted(arrays):
    heap = []
    result = []

    # Add first element from each array
    for i, arr in enumerate(arrays):
        if arr:
            heapq.heappush(heap, (arr[0], i, 0))

    while heap:
        val, arr_idx, elem_idx = heapq.heappop(heap)
        result.append(val)

        # Add next element from same array
        if elem_idx + 1 < len(arrays[arr_idx]):
            next_val = arrays[arr_idx][elem_idx + 1]
            heapq.heappush(heap, (next_val, arr_idx, elem_idx + 1))

    return result
```

### 4. Top K Frequent Elements

```python
import heapq
from collections import Counter

def top_k_frequent(nums, k):
    count = Counter(nums)

    # Use min heap of size k
    heap = []
    for num, freq in count.items():
        heapq.heappush(heap, (freq, num))
        if len(heap) > k:
            heapq.heappop(heap)

    return [num for freq, num in heap]
```

## When to Use Heap

✅ **Use when:**

- Need to repeatedly find min/max element
- K largest/smallest elements
- Merging sorted sequences
- Priority-based processing
- Median maintenance
- Scheduling problems

❌ **Don't use when:**

- Need random access
- Need to search for specific element
- Need all elements sorted (use sort instead)
- K = 1 (just track min/max)

## Time & Space Complexity

| Operation             | Time     | Notes          |
| --------------------- | -------- | -------------- |
| Insert (Push)         | O(log n) | Bubble up      |
| Extract Min/Max (Pop) | O(log n) | Bubble down    |
| Peek (Top)            | O(1)     | Just read root |
| Build Heap (Heapify)  | O(n)     | Bottom-up      |
| Search                | O(n)     | Not efficient  |

## Python heapq Module

```python
import heapq

# Create empty heap
heap = []

# Add elements
heapq.heappush(heap, 5)
heapq.heappush(heap, 3)
heapq.heappush(heap, 7)

# Convert list to heap
nums = [5, 3, 7, 1, 9]
heapq.heapify(nums)  # O(n)

# Get smallest (peek)
smallest = heap[0]  # Don't pop, just look

# Remove and return smallest
smallest = heapq.heappop(heap)

# Push and pop in one operation
heapq.heappushpop(heap, 4)  # Push 4, then pop smallest

# Pop and push in one operation
heapq.heapreplace(heap, 4)  # Pop smallest, then push 4

# N largest/smallest
largest_3 = heapq.nlargest(3, nums)
smallest_3 = heapq.nsmallest(3, nums)
```

## Heap Tricks & Patterns

### 1. Max Heap (Negate Values)

```python
# Python only has min heap
# Negate values to simulate max heap
max_heap = [-x for x in values]
heapq.heapify(max_heap)

max_val = -heapq.heappop(max_heap)
```

### 2. Heap of Tuples

```python
# Heaps compare tuples element by element
heap = []
heapq.heappush(heap, (priority, value))
heapq.heappush(heap, (priority, timestamp, value))

# Lower priority value = higher priority
```

### 3. Fixed Size Heap (Top K)

```python
def top_k(nums, k):
    heap = []
    for num in nums:
        if len(heap) < k:
            heapq.heappush(heap, num)
        elif num > heap[0]:
            heapq.heapreplace(heap, num)
    return heap
```

### 4. Two Heaps (Median)

```python
# Max heap for smaller half
# Min heap for larger half
class MedianFinder:
    def __init__(self):
        self.small = []  # max heap (negate)
        self.large = []  # min heap

    def add(self, num):
        # Add to max heap (smaller half)
        heapq.heappush(self.small, -num)

        # Balance: move largest from small to large
        val = -heapq.heappop(self.small)
        heapq.heappush(self.large, val)

        # Rebalance if needed
        if len(self.large) > len(self.small):
            val = heapq.heappop(self.large)
            heapq.heappush(self.small, -val)

    def find_median(self):
        if len(self.small) > len(self.large):
            return -self.small[0]
        return (-self.small[0] + self.large[0]) / 2
```

## Common Use Cases

### 1. Kth Largest/Smallest

- Maintain heap of size k
- Min heap for k largest, max heap for k smallest

### 2. Merge K Sorted Lists

- Heap of (value, list_index, position)
- Always process smallest available

### 3. Top K Frequent

- Count frequencies
- Min heap of size k with (frequency, element)

### 4. Median of Stream

- Two heaps: max for lower half, min for upper half
- Balance sizes

### 5. Meeting Rooms / Scheduling

- Min heap of end times
- Track number of concurrent events

## Tips & Tricks

1. **Python Min Heap Only**: Negate values for max heap
2. **Stable Priority**: Use tuples `(priority, timestamp, value)`
3. **Heapify vs Repeated Push**: `heapify()` is O(n), better than n pushes
4. **Fixed Size Heaps**: Great for "top k" problems
5. **Peek Before Pop**: Access `heap[0]` without removing

## Common Pitfalls

❌ **Modifying Heap Directly**

```python
# BAD: Don't modify heap array directly
heap[0] = new_value  # Breaks heap property!
```

❌ **Forgetting to Negate for Max Heap**

```python
# BAD: This is still a min heap
heap = [x for x in values]
heapq.heapify(heap)

# GOOD: Negate for max heap
heap = [-x for x in values]
heapq.heapify(heap)
```

❌ **Using Heap for Search**

```python
# BAD: Heap is not for searching
if value in heap:  # O(n) - inefficient!
```

## Edge Cases to Consider

- Empty heap (check before pop)
- Single element
- All elements same
- K larger than array size
- Negative numbers (affects max heap negation)

## Related Patterns

- **Sorting** - Heap sort uses heap
- **Priority Queue** - Abstract type implemented with heap
- **Binary Tree** - Heap is complete binary tree
- **Greedy** - Often combined with heap for optimal selection
- **Two Pointers** - Alternative to heap in some problems
