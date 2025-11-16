# Stack

## Pattern Overview

A Stack is a Last-In-First-Out (LIFO) data structure that is extremely useful for:

- Matching pairs (parentheses, brackets)
- Reversing sequences
- Backtracking problems
- Monotonic sequences
- Expression evaluation

## Key Concepts

1. **LIFO** - Last element added is first to be removed
2. **Push/Pop** - Add to top, remove from top
3. **Peek** - View top element without removing
4. **Monotonic Stack** - Stack maintaining increasing/decreasing order

## Problems in This Category

### Easy Level

| Problem           | LeetCode # | Stack Type  | Key Technique |
| ----------------- | ---------- | ----------- | ------------- |
| Valid Parentheses | 20         | Basic Stack | Match pairs   |

### Medium Level (for reference)

- Min Stack (155)
- Evaluate Reverse Polish Notation (150)
- Generate Parentheses (22)
- Daily Temperatures (739)
- Car Fleet (853)

## Common Patterns

### 1. Matching Pairs (Parentheses)

```python
def is_valid(s):
    stack = []
    pairs = {')': '(', '}': '{', ']': '['}

    for char in s:
        if char in pairs:  # closing bracket
            if not stack or stack[-1] != pairs[char]:
                return False
            stack.pop()
        else:  # opening bracket
            stack.append(char)

    return len(stack) == 0
```

### 2. Monotonic Stack (Next Greater Element)

```python
def next_greater_element(nums):
    result = [-1] * len(nums)
    stack = []  # stores indices

    for i, num in enumerate(nums):
        while stack and nums[stack[-1]] < num:
            idx = stack.pop()
            result[idx] = num
        stack.append(i)

    return result
```

### 3. Min Stack Pattern

```python
class MinStack:
    def __init__(self):
        self.stack = []
        self.min_stack = []

    def push(self, val):
        self.stack.append(val)
        if not self.min_stack or val <= self.min_stack[-1]:
            self.min_stack.append(val)

    def pop(self):
        if self.stack.pop() == self.min_stack[-1]:
            self.min_stack.pop()

    def get_min(self):
        return self.min_stack[-1]
```

## When to Use Stack

✅ **Use when:**

- Need to match pairs or validate sequences
- Processing in reverse order
- Need to backtrack or undo operations
- Finding next greater/smaller element
- Evaluating expressions (postfix, prefix)
- Tree/graph traversal (DFS)

❌ **Don't use when:**

- Need random access to elements
- Need FIFO behavior (use queue)
- Need to search/sort efficiently

## Time & Space Complexity

| Operation | Time | Space | Notes                    |
| --------- | ---- | ----- | ------------------------ |
| Push      | O(1) | O(n)  | n = number of elements   |
| Pop       | O(1) | O(n)  | -                        |
| Peek/Top  | O(1) | O(n)  | -                        |
| Search    | O(n) | O(n)  | Not efficient for search |

## Stack Implementation in Python

```python
# Using list (most common)
stack = []
stack.append(item)  # push
item = stack.pop()  # pop
top = stack[-1]     # peek
is_empty = len(stack) == 0

# Using collections.deque (slightly faster)
from collections import deque
stack = deque()
stack.append(item)
item = stack.pop()
top = stack[-1]
```

## Common Stack Patterns

### 1. Valid Parentheses

**Problem**: Match opening and closing brackets
**Solution**: Push opening, pop and match closing

### 2. Next Greater Element

**Problem**: Find next greater element for each array element
**Solution**: Monotonic decreasing stack

### 3. Daily Temperatures

**Problem**: How many days until warmer temperature
**Solution**: Monotonic stack with indices

### 4. Evaluate RPN

**Problem**: Evaluate postfix expression
**Solution**: Stack operators and operands

### 5. Largest Rectangle in Histogram

**Problem**: Find largest rectangular area
**Solution**: Monotonic increasing stack

## Tips & Tricks

1. **Bracket Matching**: Map closing to opening brackets
2. **Store Indices**: Often more useful than storing values
3. **Monotonic Stack**: Maintain increasing or decreasing order
4. **Multiple Stacks**: Some problems need 2+ stacks
5. **Stack vs Recursion**: Stack can replace recursion for iteration

## Edge Cases to Consider

- Empty stack when trying to pop
- Empty string/array input
- Unmatched opening brackets (stack not empty at end)
- Unmatched closing brackets (stack empty when matching)
- Single element

## Related Patterns

- **Queue** - FIFO counterpart to stack
- **Recursion** - Can be converted to stack iteration
- **DFS** - Uses stack (explicit or call stack)
- **Backtracking** - Stack helps maintain state
- **Monotonic Data Structures** - Monotonic stack/queue/deque
