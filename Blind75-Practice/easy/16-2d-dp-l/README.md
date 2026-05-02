# Dynamic Programming

## Pattern Overview

Dynamic Programming (DP) is an optimization technique that solves complex problems by breaking them down into simpler subproblems. Key principles:

- **Optimal Substructure**: Optimal solution contains optimal solutions to subproblems
- **Overlapping Subproblems**: Same subproblems solved multiple times
- **Memoization**: Store results to avoid recomputation

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

1. **Top-Down (Memoization)** - Recursive approach with caching
2. **Bottom-Up (Tabulation)** - Iterative approach building up from base cases
3. **State** - Variables that define a subproblem
4. **Transition** - How to compute current state from previous states

## Problems in This Category

### Easy Level

| Problem                  | LeetCode # | DP Type | Key Technique      |
| ------------------------ | ---------- | ------- | ------------------ |
| Climbing Stairs          | 70         | 1D DP   | Fibonacci pattern  |
| Min Cost Climbing Stairs | 746        | 1D DP   | Min of two choices |

### Medium/Hard Level (for reference)

- House Robber (198)
- Coin Change (322)
- Longest Increasing Subsequence (300)
- Word Break (139)
- Unique Paths (62)

## Common Patterns

### 1. Fibonacci Pattern (1D DP)

```python
def fibonacci(n):
    """
    Bottom-up with space optimization
    """
    if n <= 1:
        return n

    prev2, prev1 = 0, 1

    for i in range(2, n + 1):
        current = prev1 + prev2
        prev2 = prev1
        prev1 = current

    return prev1
```

### 2. Top-Down with Memoization

```python
def dp_memo(n):
    memo = {}

    def helper(n):
        if n <= 1:
            return n
        if n in memo:
            return memo[n]

        memo[n] = helper(n-1) + helper(n-2)
        return memo[n]

    return helper(n)
```

### 3. Bottom-Up with Array

```python
def dp_array(n):
    if n <= 1:
        return n

    dp = [0] * (n + 1)
    dp[0] = 0
    dp[1] = 1

    for i in range(2, n + 1):
        dp[i] = dp[i-1] + dp[i-2]

    return dp[n]
```

### 4. Min/Max Decision Pattern

```python
def min_cost(arr):
    n = len(arr)
    dp = [float('inf')] * n
    dp[0] = arr[0]

    for i in range(1, n):
        # Try all possible previous states
        for j in range(i):
            dp[i] = min(dp[i], dp[j] + cost(j, i))

    return dp[n-1]
```

## When to Use DP

✅ **Use when:**

- Problem asks for optimal solution (min/max)
- Problem asks for number of ways
- Can break into overlapping subproblems
- Problem has optimal substructure
- Need to consider all possibilities
- Greedy doesn't work

❌ **Don't use when:**

- Greedy works (simpler)
- No overlapping subproblems
- Problem is NP-complete (exponential anyway)
- Simple recursion without repeated work

## DP Problem Identification

Ask these questions:

1. **Can I break this into subproblems?**
2. **Do subproblems overlap?** (key for DP)
3. **What's my state?** (variables that change)
4. **What's my base case?**
5. **What's my transition?** (how to compute state from previous)

## Steps to Solve DP Problems

### 1. Define State

```
What variables uniquely identify a subproblem?
Example: dp[i] = answer for first i elements
Example: dp[i][j] = answer for substring from i to j
```

### 2. Find Recurrence Relation

```
How does dp[i] relate to previous states?
Example: dp[i] = dp[i-1] + dp[i-2]
Example: dp[i] = min(dp[i-1], dp[i-2]) + cost[i]
```

### 3. Identify Base Cases

```
What are the simplest subproblems?
Example: dp[0] = 0, dp[1] = 1
```

### 4. Determine Computation Order

```
Bottom-up: Compute smaller subproblems first
Example: Loop from i=0 to n
```

### 5. Optimize Space (if possible)

```
If dp[i] only depends on dp[i-1] and dp[i-2],
can use two variables instead of array
```

## Top-Down vs Bottom-Up

### Top-Down (Memoization)

```python
def top_down(n, memo={}):
    # Check cache
    if n in memo:
        return memo[n]

    # Base case
    if n <= 1:
        return n

    # Recursive calls
    memo[n] = top_down(n-1, memo) + top_down(n-2, memo)
    return memo[n]
```

**Pros:**

- Natural to write (like recursion)
- Only computes needed subproblems
- Easy to understand

**Cons:**

- Recursion overhead
- Stack space O(n)
- Can hit recursion limit

### Bottom-Up (Tabulation)

```python
def bottom_up(n):
    # Create DP table
    dp = [0] * (n + 1)

    # Base cases
    dp[0] = 0
    dp[1] = 1

    # Fill table
    for i in range(2, n + 1):
        dp[i] = dp[i-1] + dp[i-2]

    return dp[n]
```

**Pros:**

- No recursion overhead
- Easier to optimize space
- Faster in practice

**Cons:**

- Less intuitive
- Computes all subproblems (even if not needed)
- Harder to write initially

## Space Optimization

### From O(n) to O(1)

```python
# O(n) space
def dp_array(n):
    dp = [0] * (n + 1)
    dp[0] = 0
    dp[1] = 1
    for i in range(2, n + 1):
        dp[i] = dp[i-1] + dp[i-2]
    return dp[n]

# O(1) space - only need last 2 values
def dp_optimized(n):
    if n <= 1:
        return n
    prev2, prev1 = 0, 1
    for i in range(2, n + 1):
        current = prev1 + prev2
        prev2, prev1 = prev1, current
    return prev1
```

## Common DP Patterns

### 1. Linear DP (1D)

- **State**: `dp[i]`
- **Examples**: Climbing Stairs, House Robber, Maximum Subarray

### 2. 2D DP

- **State**: `dp[i][j]`
- **Examples**: Unique Paths, Longest Common Subsequence, Edit Distance

### 3. Knapsack Pattern

- **State**: `dp[i][w]` - first i items, weight limit w
- **Examples**: 0/1 Knapsack, Partition Equal Subset Sum

### 4. String DP

- **State**: `dp[i][j]` - substring from i to j
- **Examples**: Longest Palindromic Substring, Word Break

### 5. Tree DP

- **State**: `dp[node]`
- **Examples**: House Robber III, Binary Tree Cameras

## Tips & Tricks

1. **Start Small**: Solve for small inputs manually
2. **Draw Table**: Visualize dp array filling up
3. **Pattern Recognition**: Many problems follow similar patterns
4. **Space Optimization**: Can you use rolling array?
5. **Bounds Checking**: Watch array indices
6. **Initialization**: Set correct base cases and initial values

## Common Mistakes

❌ **Wrong Base Case**

```python
# BAD: Doesn't handle n=0 or n=1
dp[0] = 1  # Should be 0 for some problems
```

❌ **Wrong Loop Order**

```python
# BAD: Using future values not yet computed
for i in range(n, 0, -1):  # Should be forward for bottom-up
    dp[i] = dp[i+1] + dp[i+2]
```

❌ **Modifying State Incorrectly**

```python
# BAD: Losing previous value
prev = current  # Should save old prev first
current = prev + prev2
```

✅ **Correct Pattern**

```python
current = prev1 + prev2
prev2 = prev1
prev1 = current
```

## Time & Space Complexity

| Approach        | Time   | Space | Notes                    |
| --------------- | ------ | ----- | ------------------------ |
| Naive Recursion | O(2^n) | O(n)  | Fibonacci without memo   |
| Memoization     | O(n)   | O(n)  | Cache + recursion stack  |
| Tabulation      | O(n)   | O(n)  | DP array                 |
| Space Optimized | O(n)   | O(1)  | Only track needed states |

## Edge Cases to Consider

- Empty input
- Single element
- All elements same
- Negative numbers (if applicable)
- Very large n (check recursion limit)
- Zero values

## Template

```python
def dp_template(n):
    """
    1. Define state
    2. Find recurrence
    3. Set base cases
    4. Compute in order
    5. Return answer
    """
    # Base cases
    if n <= 1:
        return base_value

    # Initialize DP
    prev2, prev1 = base1, base2

    # Fill DP table
    for i in range(2, n + 1):
        current = transition(prev1, prev2)
        prev2, prev1 = prev1, current

    # Return result
    return prev1
```

## Related Patterns

- **Recursion** - Foundation of top-down DP
- **Greedy** - Alternative when locally optimal is globally optimal
- **Backtracking** - When need to explore all possibilities
- **Divide & Conquer** - Split problem, but may not have overlapping subproblems
