# Greedy Algorithms

## Pattern Overview

Greedy algorithms make locally optimal choices at each step, hoping to find a global optimum. The key insight is that a local optimum leads to a global optimum for certain problems.

Key principle: **Make the best choice at each step without reconsidering previous choices.**

## Key Concepts

1. **Greedy Choice Property** - Locally optimal choice leads to globally optimal solution
2. **Optimal Substructure** - Optimal solution contains optimal solutions to subproblems
3. **No Backtracking** - Once a choice is made, never reconsider it
4. **Proof Required** - Must prove greedy works for the problem

## Problems in This Category

### Easy Level

| Problem          | LeetCode # | Greedy Strategy    | Key Insight        |
| ---------------- | ---------- | ------------------ | ------------------ |
| Maximum Subarray | 53         | Kadane's Algorithm | Drop negative sums |

### Medium Level (for reference)

- Jump Game (55)
- Gas Station (134)
- Partition Labels (763)
- Hand of Straights (846)

## Common Patterns

### 1. Kadane's Algorithm (Maximum Subarray)

```python
def max_subarray(nums):
    max_sum = float('-inf')
    current_sum = 0

    for num in nums:
        current_sum += num
        max_sum = max(max_sum, current_sum)

        # Greedy: Drop if sum becomes negative
        if current_sum < 0:
            current_sum = 0

    return max_sum
```

### 2. Interval Scheduling

```python
def max_meetings(intervals):
    # Sort by end time (greedy choice)
    intervals.sort(key=lambda x: x[1])

    count = 0
    last_end = 0

    for start, end in intervals:
        if start >= last_end:
            count += 1
            last_end = end

    return count
```

### 3. Activity Selection

```python
def min_platforms(arrivals, departures):
    arrivals.sort()
    departures.sort()

    platforms_needed = 0
    max_platforms = 0
    i = j = 0

    while i < len(arrivals):
        if arrivals[i] < departures[j]:
            platforms_needed += 1
            max_platforms = max(max_platforms, platforms_needed)
            i += 1
        else:
            platforms_needed -= 1
            j += 1

    return max_platforms
```

### 4. Fractional Knapsack

```python
def fractional_knapsack(weights, values, capacity):
    # Greedy: Take items by value-to-weight ratio
    items = [(v/w, w, v) for w, v in zip(weights, values)]
    items.sort(reverse=True)

    total_value = 0
    remaining_capacity = capacity

    for ratio, weight, value in items:
        if remaining_capacity >= weight:
            total_value += value
            remaining_capacity -= weight
        else:
            total_value += ratio * remaining_capacity
            break

    return total_value
```

## When to Use Greedy

✅ **Use when:**

- Problem has greedy choice property
- Can prove local optimum leads to global optimum
- Simple, intuitive solution exists
- DP would work but greedy is simpler
- Sorting helps reveal greedy strategy

❌ **Don't use when:**

- Need to consider all possibilities
- Local optimum doesn't guarantee global optimum
- 0/1 Knapsack (need DP instead)
- Longest path problems (use DP)

## Greedy vs Dynamic Programming

### Use Greedy:

- Faster: O(n) or O(n log n)
- Simpler to implement
- Less space
- Examples: Activity selection, Huffman coding

### Use DP:

- Considers all possibilities
- Guarantees optimal solution
- More complex
- Examples: 0/1 Knapsack, Longest Increasing Subsequence

## Proving Greedy Works

### 1. Greedy Choice Property

- Show that making greedy choice at each step is safe
- Prove local optimum doesn't preclude global optimum

### 2. Optimal Substructure

- Show that problem can be broken into subproblems
- Optimal solution contains optimal subproblem solutions

### 3. Exchange Argument

- Suppose optimal solution differs from greedy
- Show you can exchange to make it greedy without worse result
- Contradiction proves greedy is optimal

## Common Greedy Strategies

### 1. Sort First

Many greedy problems become obvious after sorting:

- Intervals by end time
- Items by value/weight ratio
- Events by time

### 2. Choose Earliest/Latest

- Earliest deadline first
- Latest start time
- Minimize waiting time

### 3. Choose Best Ratio

- Value per weight
- Profit per time
- Efficiency metrics

### 4. Stay Ahead

- Always maintain advantage
- Example: Activity selection

## Examples by Category

### Intervals

- **Merge Intervals**: Sort by start, merge overlapping
- **Non-overlapping Intervals**: Sort by end, count conflicts
- **Meeting Rooms**: Sort and use greedy scheduling

### Arrays

- **Maximum Subarray**: Kadane's algorithm
- **Jump Game**: Check if can reach from each position
- **Gas Station**: Start from first valid station

### Strings

- **Remove K Digits**: Use monotonic stack
- **Partition Labels**: Track last occurrence
- **Valid Parenthesis String**: Two passes

## Tips & Tricks

1. **Try Sorting**: Often reveals greedy strategy
2. **Proof First**: Convince yourself greedy works
3. **Counterexamples**: Try to break your greedy approach
4. **Compare with DP**: Could DP work? Is greedy simpler?
5. **Edge Cases**: Test boundary conditions

## Common Mistakes

❌ **Using Greedy When DP Needed**

```python
# BAD: 0/1 Knapsack with greedy
# Doesn't work! Need DP
def knapsack_greedy(weights, values, capacity):
    items = sorted(zip(weights, values),
                   key=lambda x: x[1]/x[0], reverse=True)
    # This doesn't give optimal solution!
```

❌ **Wrong Greedy Choice**

```python
# BAD: Activity selection sorted by duration
intervals.sort(key=lambda x: x[1] - x[0])
# Should sort by end time!
intervals.sort(key=lambda x: x[1])
```

❌ **Not Proving Correctness**

```python
# BAD: Assuming greedy works without proof
# Always verify with examples and edge cases
```

## Time Complexity

| Strategy        | Time       | Notes              |
| --------------- | ---------- | ------------------ |
| No Sorting      | O(n)       | If already ordered |
| With Sorting    | O(n log n) | Most common        |
| Priority Queue  | O(n log n) | Heap operations    |
| Multiple Passes | O(kn)      | k passes over data |

## Kadane's Algorithm Deep Dive

```python
def kadane_explained(nums):
    """
    Maximum Subarray - Classic Greedy

    Intuition:
    - If current sum is negative, it won't help future sums
    - So drop it and start fresh
    - Always track maximum seen
    """
    max_sum = float('-inf')
    current_sum = 0

    for num in nums:
        # Add current number
        current_sum += num

        # Update maximum
        max_sum = max(max_sum, current_sum)

        # Greedy: Drop negative sum
        if current_sum < 0:
            current_sum = 0

    return max_sum

# Alternative: Track start and end indices
def kadane_with_indices(nums):
    max_sum = float('-inf')
    current_sum = 0
    start = 0
    end = 0
    temp_start = 0

    for i, num in enumerate(nums):
        current_sum += num

        if current_sum > max_sum:
            max_sum = current_sum
            start = temp_start
            end = i

        if current_sum < 0:
            current_sum = 0
            temp_start = i + 1

    return max_sum, start, end
```

## Edge Cases

- Empty array
- All negative numbers
- Single element
- All zeros
- Very large numbers (overflow)

## Related Patterns

- **Dynamic Programming** - More powerful but complex
- **Two Pointers** - Often combined with greedy
- **Sorting** - Usually prerequisite for greedy
- **Priority Queue** - For dynamic greedy choices
- **Backtracking** - When greedy doesn't work
