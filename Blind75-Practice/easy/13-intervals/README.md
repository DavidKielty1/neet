# Intervals

## Pattern Overview

Interval problems involve working with ranges or time periods. Common operations include:

- Checking for overlaps
- Merging overlapping intervals
- Finding gaps
- Scheduling problems

**Key insight**: Sorting intervals (usually by start time) often simplifies the problem!

## Key Concepts

1. **Interval Representation**: `[start, end]`
2. **Overlap Condition**: Two intervals `[a,b]` and `[c,d]` overlap if `a < d and c < b`
3. **Merge Condition**: Intervals can be merged if they overlap or are adjacent
4. **Sorting**: Almost always sort intervals first (by start or end time)

## Problems in This Category

### Easy Level

| Problem       | LeetCode # | Sort By | Key Technique  |
| ------------- | ---------- | ------- | -------------- |
| Meeting Rooms | 252        | Start   | Check overlaps |

### Medium/Hard Level (for reference)

- Merge Intervals (56)
- Insert Interval (57)
- Non-overlapping Intervals (435)
- Meeting Rooms II (253)
- Minimum Interval to Include Each Query (Hard)

## Common Patterns

### 1. Check for Overlaps

```python
def has_overlap(intervals):
    """Check if any intervals overlap"""
    intervals.sort()  # Sort by start time

    for i in range(1, len(intervals)):
        if intervals[i][0] < intervals[i-1][1]:
            return True  # Overlap found

    return False
```

### 2. Merge Overlapping Intervals

```python
def merge_intervals(intervals):
    """Merge all overlapping intervals"""
    if not intervals:
        return []

    intervals.sort()  # Sort by start time
    merged = [intervals[0]]

    for current in intervals[1:]:
        last = merged[-1]

        if current[0] <= last[1]:
            # Overlapping, merge
            merged[-1] = [last[0], max(last[1], current[1])]
        else:
            # No overlap, add as new interval
            merged.append(current)

    return merged
```

### 3. Insert Interval

```python
def insert_interval(intervals, new_interval):
    """Insert and merge new interval"""
    result = []
    i = 0
    n = len(intervals)

    # Add all intervals before new_interval
    while i < n and intervals[i][1] < new_interval[0]:
        result.append(intervals[i])
        i += 1

    # Merge overlapping intervals
    while i < n and intervals[i][0] <= new_interval[1]:
        new_interval = [
            min(new_interval[0], intervals[i][0]),
            max(new_interval[1], intervals[i][1])
        ]
        i += 1
    result.append(new_interval)

    # Add remaining intervals
    while i < n:
        result.append(intervals[i])
        i += 1

    return result
```

### 4. Minimum Meeting Rooms

```python
def min_meeting_rooms(intervals):
    """Find minimum number of meeting rooms needed"""
    if not intervals:
        return 0

    starts = sorted([i[0] for i in intervals])
    ends = sorted([i[1] for i in intervals])

    rooms = 0
    max_rooms = 0
    s = e = 0

    while s < len(starts):
        if starts[s] < ends[e]:
            rooms += 1
            max_rooms = max(max_rooms, rooms)
            s += 1
        else:
            rooms -= 1
            e += 1

    return max_rooms
```

## When to Sort By

### Sort by Start Time:

- ✅ Checking for overlaps
- ✅ Merging intervals
- ✅ Finding gaps
- ✅ Most interval problems

### Sort by End Time:

- ✅ Activity selection (maximize meetings attended)
- ✅ Greedy scheduling
- ✅ Interval partitioning

## Overlap Conditions

### Two intervals [a, b] and [c, d]:

**Overlap**: `a < d and c < b`

**No Overlap**:

- `b <= c` (first ends before second starts)
- `d <= a` (second ends before first starts)

**Merge Condition** (sorted by start):

- `c <= b` (second starts before or when first ends)

## Common Techniques

### 1. Two Pointers (Start/End Times)

```python
def count_simultaneous_events(intervals):
    events = []
    for start, end in intervals:
        events.append((start, 1))   # +1 for start
        events.append((end, -1))     # -1 for end

    events.sort()

    current = 0
    max_concurrent = 0

    for time, delta in events:
        current += delta
        max_concurrent = max(max_concurrent, current)

    return max_concurrent
```

### 2. Sweep Line Algorithm

```python
def sweep_line(intervals):
    """Process events as they occur in time"""
    events = []

    for start, end in intervals:
        events.append((start, 'start'))
        events.append((end, 'end'))

    events.sort()

    # Process events in order
    active = 0
    for time, event_type in events:
        if event_type == 'start':
            active += 1
        else:
            active -= 1
```

### 3. Priority Queue for End Times

```python
import heapq

def schedule_intervals(intervals):
    """Use heap to track earliest ending interval"""
    intervals.sort()  # Sort by start time

    heap = []  # Min heap of end times

    for start, end in intervals:
        # Remove all intervals that have ended
        while heap and heap[0] <= start:
            heapq.heappop(heap)

        heapq.heappush(heap, end)

        # Size of heap = concurrent intervals
        max_concurrent = len(heap)
```

## Tips & Tricks

1. **Sort First**: Almost always helps
2. **Draw Timeline**: Visualize on number line
3. **Edge Cases**: Adjacent intervals (touching but not overlapping)
4. **Open/Closed**: Check if endpoints are inclusive
5. **Greedy**: Many interval problems have greedy solutions

## Common Mistakes

❌ **Wrong Overlap Check**

```python
# BAD: Incomplete overlap check
if a < c and b < d:  # Wrong!

# GOOD: Complete overlap check
if a < d and c < b:  # Correct
```

❌ **Not Sorting**

```python
# BAD: Checking overlaps without sorting
for i in range(len(intervals)-1):
    if overlap(intervals[i], intervals[i+1]):
        # Only checks adjacent in original order!
```

❌ **Modifying During Iteration**

```python
# BAD: Modifying list while iterating
for interval in intervals:
    if should_merge:
        intervals.append(merged)  # Don't do this!
```

## Time & Space Complexity

| Operation       | Time       | Space        | Notes              |
| --------------- | ---------- | ------------ | ------------------ |
| Sort intervals  | O(n log n) | O(1) or O(n) | Depends on sort    |
| Check overlaps  | O(n log n) | O(1)         | Sort + linear scan |
| Merge intervals | O(n log n) | O(n)         | Sort + merge       |
| Insert interval | O(n)       | O(n)         | Linear scan        |

## Edge Cases to Consider

- Empty interval list
- Single interval
- All intervals overlap
- No overlaps
- Adjacent intervals (touching)
- Intervals with same start/end
- Negative time values
- Very large time values

## Interval Properties

```python
def intervals_overlap(a, b):
    """Check if [a_start, a_end] and [b_start, b_end] overlap"""
    return a[0] < b[1] and b[0] < a[1]

def intervals_adjacent(a, b):
    """Check if intervals are adjacent (touching)"""
    return a[1] == b[0] or b[1] == a[0]

def can_merge(a, b):
    """Check if intervals can be merged"""
    return intervals_overlap(a, b) or intervals_adjacent(a, b)

def merge(a, b):
    """Merge two overlapping intervals"""
    return [min(a[0], b[0]), max(a[1], b[1])]
```

## Template Pattern

```python
def interval_problem(intervals):
    """General interval problem template"""
    # 1. Handle edge cases
    if not intervals:
        return default_value

    # 2. Sort intervals (usually by start time)
    intervals.sort(key=lambda x: x[0])

    # 3. Initialize result
    result = []

    # 4. Process intervals
    for interval in intervals:
        # Process current interval
        # Compare with previous intervals
        # Update result
        pass

    # 5. Return result
    return result
```

## Related Patterns

- **Sorting** - Almost always needed
- **Greedy** - Many interval problems use greedy
- **Two Pointers** - Sweep line algorithm
- **Heap** - For tracking active/ending intervals
- **Line Sweep** - Process events in time order
