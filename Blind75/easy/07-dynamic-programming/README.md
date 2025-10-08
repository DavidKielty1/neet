# Dynamic Programming (DP) Technique

## Overview
**Dynamic Programming (DP)** is a powerful algorithmic technique that solves complex problems by breaking them down into simpler subproblems and storing the results to avoid redundant calculations. It's essential for solving optimization problems with overlapping subproblems.

## When to Use Dynamic Programming

### ✅ **Perfect for:**
- **Optimization problems** - Find minimum/maximum values
- **Counting problems** - Count number of ways to do something
- **Decision problems** - Make optimal choices at each step
- **Overlapping subproblems** - Same subproblems appear multiple times
- **Optimal substructure** - Optimal solution contains optimal solutions to subproblems

### ❌ **Not ideal for:**
- **Problems without overlapping subproblems** - Use greedy algorithms instead
- **Problems without optimal substructure** - Use other techniques
- **Memory-constrained environments** - DP can use significant space
- **Problems with exponential state space** - Consider approximation algorithms

## DP Patterns

### 1. **Fibonacci Pattern**
Solve problems with recurrence relations.

```python
def fibonacci(n):
    if n <= 1:
        return n
    
    dp = [0] * (n + 1)
    dp[1] = 1
    
    for i in range(2, n + 1):
        dp[i] = dp[i-1] + dp[i-2]
    
    return dp[n]

# Space-optimized version
def fibonacci_optimized(n):
    if n <= 1:
        return n
    
    prev2, prev1 = 0, 1
    
    for i in range(2, n + 1):
        current = prev1 + prev2
        prev2, prev1 = prev1, current
    
    return prev1
```

**Use cases:**
- Climbing Stairs
- Fibonacci Number
- House Robber

### 2. **Knapsack Pattern**
Solve problems involving selection with constraints.

```python
def knapsack(weights, values, capacity):
    n = len(weights)
    dp = [[0] * (capacity + 1) for _ in range(n + 1)]
    
    for i in range(1, n + 1):
        for w in range(1, capacity + 1):
            if weights[i-1] <= w:
                dp[i][w] = max(
                    dp[i-1][w],  # Don't take item
                    dp[i-1][w-weights[i-1]] + values[i-1]  # Take item
                )
            else:
                dp[i][w] = dp[i-1][w]
    
    return dp[n][capacity]
```

**Use cases:**
- 0/1 Knapsack
- Partition Equal Subset Sum
- Target Sum

### 3. **Longest Common Subsequence (LCS)**
Find common subsequences between sequences.

```python
def longest_common_subsequence(text1, text2):
    m, n = len(text1), len(text2)
    dp = [[0] * (n + 1) for _ in range(m + 1)]
    
    for i in range(1, m + 1):
        for j in range(1, n + 1):
            if text1[i-1] == text2[j-1]:
                dp[i][j] = dp[i-1][j-1] + 1
            else:
                dp[i][j] = max(dp[i-1][j], dp[i][j-1])
    
    return dp[m][n]
```

**Use cases:**
- Longest Common Subsequence
- Edit Distance
- Longest Palindromic Subsequence

### 4. **Coin Change Pattern**
Solve problems involving making change or combinations.

```python
def coin_change(coins, amount):
    dp = [float('inf')] * (amount + 1)
    dp[0] = 0
    
    for coin in coins:
        for i in range(coin, amount + 1):
            dp[i] = min(dp[i], dp[i-coin] + 1)
    
    return dp[amount] if dp[amount] != float('inf') else -1
```

**Use cases:**
- Coin Change
- Combination Sum
- Perfect Squares

## Problem Categories

### **Arrays**
- **Climbing Stairs** - Basic Fibonacci pattern
- **House Robber** - Fibonacci with constraints
- **Coin Change** - Coin change pattern
- **Longest Increasing Subsequence** - LIS pattern
- **Maximum Subarray** - Kadane's algorithm

## Time & Space Complexity

| Pattern | Time Complexity | Space Complexity |
|---------|----------------|------------------|
| Fibonacci | O(n) | O(1) optimized |
| Knapsack | O(n × W) | O(n × W) |
| LCS | O(m × n) | O(m × n) |
| Coin Change | O(amount × coins) | O(amount) |

## Common DP Approaches

### **Top-Down (Memoization):**
```python
def dp_top_down(n, memo={}):
    if n in memo:
        return memo[n]
    
    if n <= 1:
        return n
    
    memo[n] = dp_top_down(n-1, memo) + dp_top_down(n-2, memo)
    return memo[n]
```

### **Bottom-Up (Tabulation):**
```python
def dp_bottom_up(n):
    dp = [0] * (n + 1)
    dp[1] = 1
    
    for i in range(2, n + 1):
        dp[i] = dp[i-1] + dp[i-2]
    
    return dp[n]
```

### **Space Optimization:**
```python
def dp_optimized(n):
    if n <= 1:
        return n
    
    prev2, prev1 = 0, 1
    
    for i in range(2, n + 1):
        current = prev1 + prev2
        prev2, prev1 = prev1, current
    
    return prev1
```

## Common Mistakes to Avoid

1. **Missing base cases** - Always handle the smallest subproblems
2. **Wrong recurrence relation** - Ensure the relation is correct
3. **Index errors** - Be careful with array bounds
4. **Space optimization** - Don't optimize too early
5. **Overlapping subproblems** - Ensure subproblems actually overlap

## Practice Strategy

### **Beginner Level:**
1. **Climbing Stairs** - Basic Fibonacci pattern
2. **House Robber** - Fibonacci with constraints
3. **Fibonacci Number** - Classic DP problem

### **Intermediate Level:**
1. **Coin Change** - Coin change pattern
2. **Longest Increasing Subsequence** - LIS pattern
3. **Maximum Subarray** - Kadane's algorithm

### **Advanced Level:**
1. **Edit Distance** - String DP
2. **Longest Common Subsequence** - LCS pattern
3. **Word Break** - String DP with optimization

## Key Insights

1. **Identify subproblems** - Break down the problem into smaller parts
2. **Find recurrence relation** - Express solution in terms of subproblems
3. **Handle base cases** - Define solutions for smallest subproblems
4. **Optimize space** - Use rolling arrays or variables when possible
5. **Consider both approaches** - Top-down vs bottom-up

## Interview Tips

1. **Start with brute force** - Understand the problem first
2. **Identify overlapping subproblems** - Look for repeated calculations
3. **Define state** - What does dp[i] represent?
4. **Find recurrence relation** - How to compute dp[i] from smaller states?
5. **Handle edge cases** - Empty inputs, single elements, boundary conditions

## Template for 1D DP

```python
def dp_1d_template(n):
    # Initialize DP array
    dp = [0] * (n + 1)
    
    # Base cases
    dp[0] = base_case_0
    dp[1] = base_case_1
    
    # Fill DP array
    for i in range(2, n + 1):
        dp[i] = recurrence_relation(dp, i)
    
    return dp[n]
```

## Template for 2D DP

```python
def dp_2d_template(m, n):
    # Initialize DP table
    dp = [[0] * (n + 1) for _ in range(m + 1)]
    
    # Base cases
    for i in range(m + 1):
        dp[i][0] = base_case_i
    for j in range(n + 1):
        dp[0][j] = base_case_j
    
    # Fill DP table
    for i in range(1, m + 1):
        for j in range(1, n + 1):
            dp[i][j] = recurrence_relation(dp, i, j)
    
    return dp[m][n]
```

Remember: **Dynamic Programming is about solving problems by solving smaller versions of the same problem**. It's the key to many optimization problems!
