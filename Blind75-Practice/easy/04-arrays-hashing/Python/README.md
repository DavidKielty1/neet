# Arrays & Hashing

## Pattern Overview

Arrays & Hashing problems typically involve using hash maps (dictionaries) or hash sets to achieve O(1) lookup time. This pattern is extremely useful for:

- Frequency counting
- Finding duplicates
- Checking for existence
- Mapping relationships

## Key Concepts

1. **Hash Maps** - Store key-value pairs for O(1) lookup
2. **Hash Sets** - Store unique elements for O(1) membership testing
3. **Trade-off** - Use extra space O(n) to gain time efficiency

## Problems in This Category

### Easy Level

| Problem            | LeetCode # | Key Technique           |
| ------------------ | ---------- | ----------------------- |
| Contains Duplicate | 217        | Hash Set                |
| Valid Anagram      | 242        | Hash Map / Counter      |
| Two Sum            | 1          | Hash Map for complement |

## Common Patterns

### 1. Frequency Counting

```python
from collections import Counter
freq = Counter(array)
```

### 2. Complement Pattern (Two Sum)

```python
seen = {}
for i, num in enumerate(nums):
    complement = target - num
    if complement in seen:
        return [seen[complement], i]
    seen[num] = i
```

### 3. Duplicate Detection

```python
seen = set()
for item in array:
    if item in seen:
        return True  # duplicate found
    seen.add(item)
```

## Time & Space Complexity

| Operation | Hash Map | Hash Set |
| --------- | -------- | -------- |
| Insert    | O(1)     | O(1)     |
| Lookup    | O(1)     | O(1)     |
| Delete    | O(1)     | O(1)     |
| Space     | O(n)     | O(n)     |

## Tips

1. Consider hash map when you need to track relationships or counts
2. Use hash set when you only need to check existence
3. Watch out for hash collisions (rare in Python)
4. Consider sorting as an alternative if O(n log n) is acceptable

## Related Patterns

- **Two Pointers** - Can sometimes be used instead if array is sorted
- **Sliding Window** - Often combined with hash maps for substring problems
