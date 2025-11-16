# Neetcode 150 - Easy Problems

## Overview

This directory contains all **easy-level problems** from the Neetcode 150, organized by the **optimal solving pattern**. Each pattern folder includes:

- Problem implementations with detailed explanations
- Multiple solution approaches
- Time & space complexity analysis
- Test cases
- Pattern-specific README with techniques and tips

## Directory Structure

```
easy/
├── 01-two-pointers/              # Opposite ends, fast/slow patterns
├── 02-sliding-window/            # Fixed & variable window problems
├── 04-arrays-hashing/            # Hash maps/sets for O(1) lookup
├── 05-binary-search/             # O(log n) search in sorted data
├── 06-trees/                     # DFS/BFS tree traversal
├── 07-stack/                     # LIFO data structure problems
├── 08-linked-list/               # Pointer manipulation & cycles
├── 09-heap/                      # Priority queue problems
├── 10-dynamic-programming/       # DP optimization problems
├── 11-greedy/                    # Locally optimal choices
├── 12-bit-manipulation/          # Bitwise operations
├── 13-intervals/                 # Interval/range problems
└── 14-math-geometry/             # Mathematical & geometric problems
```

## Pattern Summary

### 1. Two Pointers

**When to use**: Sorted arrays, palindrome checks, pair finding

**Problems**:

- Valid Palindrome (LeetCode 125)

**Key Technique**: Opposite ends moving inward, or fast/slow pointers

---

### 2. Sliding Window

**When to use**: Subarray/substring problems with constraints

**Problems**:

- Best Time to Buy and Sell Stock (LeetCode 121)

**Key Technique**: Expand window, contract when invalid

---

### 3. Arrays & Hashing

**When to use**: Need O(1) lookup, frequency counting, duplicates

**Problems**:

- Contains Duplicate (LeetCode 217)
- Valid Anagram (LeetCode 242)
- Two Sum (LeetCode 1)

**Key Technique**: Hash maps for complement/frequency tracking

---

### 4. Binary Search

**When to use**: Sorted data, finding thresholds, O(log n) required

**Problems**:

- Binary Search (LeetCode 704)

**Key Technique**: Divide search space in half each iteration

---

### 5. Trees (DFS/BFS)

**When to use**: Hierarchical data, tree traversal, path finding

**Problems**:

- Invert Binary Tree (LeetCode 226)
- Maximum Depth of Binary Tree (LeetCode 104)
- Same Tree (LeetCode 100)
- Subtree of Another Tree (LeetCode 572)
- Balanced Binary Tree (LeetCode 110)
- Diameter of Binary Tree (LeetCode 543)
- Lowest Common Ancestor of BST (LeetCode 235)

**Key Technique**: Recursive DFS or iterative BFS with queue

---

### 6. Stack

**When to use**: Matching pairs, reversing, backtracking, LIFO order

**Problems**:

- Valid Parentheses (LeetCode 20)

**Key Technique**: Push/pop operations, monotonic stack

---

### 7. Linked List

**When to use**: Sequential data, in-place operations, cycles

**Problems**:

- Reverse Linked List (LeetCode 206)
- Merge Two Sorted Lists (LeetCode 21)
- Linked List Cycle (LeetCode 141)

**Key Technique**: Pointer manipulation, dummy nodes, fast/slow

---

### 8. Heap / Priority Queue

**When to use**: Finding kth largest/smallest, priority-based problems

**Problems**:

- Kth Largest Element in a Stream (LeetCode 703)
- Last Stone Weight (LeetCode 1046)

**Key Technique**: Min/max heap, O(log n) insert/extract

---

### 9. Dynamic Programming

**When to use**: Optimization, counting ways, overlapping subproblems

**Problems**:

- Climbing Stairs (LeetCode 70)
- Min Cost Climbing Stairs (LeetCode 746)

**Key Technique**: Memoization or tabulation, identify state transitions

---

### 10. Greedy

**When to use**: Local optimum leads to global optimum

**Problems**:

- Maximum Subarray (Kadane's Algorithm) (LeetCode 53)

**Key Technique**: Make best choice at each step

---

### 11. Bit Manipulation

**When to use**: XOR tricks, bit flags, power of 2, efficiency

**Problems**:

- Single Number (LeetCode 136)
- Number of 1 Bits (LeetCode 191)
- Counting Bits (LeetCode 338)
- Reverse Bits (LeetCode 190)
- Missing Number (LeetCode 268)

**Key Technique**: XOR properties, bit masking, shifts

---

### 12. Intervals

**When to use**: Time ranges, scheduling, overlapping periods

**Problems**:

- Meeting Rooms (LeetCode 252)

**Key Technique**: Sort by start/end time, check overlaps

---

### 13. Math & Geometry

**When to use**: Mathematical formulas, number theory, spatial problems

**Problems**:

- Happy Number (LeetCode 202)
- Plus One (LeetCode 66)

**Key Technique**: GCD, primes, modular arithmetic, geometry formulas

---

## Quick Reference Guide

### By Time Complexity

**O(1)** - Constant

- Stack operations
- Hash map lookup
- Bit operations

**O(log n)** - Logarithmic

- Binary search
- Heap operations

**O(n)** - Linear

- Array traversal
- Hash map creation
- Tree traversal (DFS/BFS)
- Two pointers
- Sliding window

**O(n log n)** - Linearithmic

- Sorting
- Heap construction
- Merge sort

**O(n²)** - Quadratic

- Nested loops (avoid when possible!)

### By Space Complexity

**O(1)** - Constant

- Two pointers
- Bit manipulation
- In-place operations

**O(n)** - Linear

- Hash maps
- Stack/Queue
- DP arrays

**O(h)** - Height

- Tree recursion (h = tree height)

## Study Strategy

### For Beginners

1. **Start with**: Arrays & Hashing, Two Pointers
2. **Then**: Sliding Window, Stack, Binary Search
3. **Next**: Linked List, Trees
4. **Advanced**: DP, Bit Manipulation, Heap

### Pattern Recognition Checklist

When solving a problem, ask:

1. **Is the data sorted?** → Consider Binary Search, Two Pointers
2. **Need to find pairs/triplets?** → Two Pointers, Hash Map
3. **Subarray/substring problem?** → Sliding Window
4. **Matching/balancing elements?** → Stack
5. **Need min/max repeatedly?** → Heap
6. **Tree/graph structure?** → DFS/BFS
7. **Optimization/counting ways?** → DP or Greedy
8. **XOR/bit tricks applicable?** → Bit Manipulation
9. **Time intervals/ranges?** → Intervals pattern
10. **Mathematical formula?** → Math

## Tips for Success

### 1. Understand the Pattern First

- Read the pattern README before solving problems
- Understand WHY the pattern works
- Recognize when to apply it

### 2. Master the Templates

- Each pattern has standard templates
- Practice writing them from memory
- Understand the variations

### 3. Analyze Complexity

- Always calculate time and space complexity
- Know the trade-offs
- Optimize when possible

### 4. Test Thoroughly

- Consider edge cases
- Test with small inputs
- Verify with examples

### 5. Practice Consistently

- Solve 2-3 problems daily
- Review previous solutions weekly
- Focus on understanding, not memorization

## Common Mistakes to Avoid

1. ❌ Jumping to code without understanding the problem
2. ❌ Not considering edge cases (empty, single element, etc.)
3. ❌ Ignoring time/space complexity
4. ❌ Using wrong pattern for the problem
5. ❌ Not testing the solution
6. ❌ Memorizing solutions instead of understanding patterns

## Progress Tracking

Create a checklist for each pattern:

- [ ] Read pattern README
- [ ] Understand key techniques
- [ ] Solve all easy problems in pattern
- [ ] Can explain solutions
- [ ] Can code without reference
- [ ] Tested with edge cases

## Next Steps

After mastering easy problems:

1. Move to **medium** difficulty in each pattern
2. Combine patterns (e.g., Binary Search + DFS)
3. Practice **hard** problems
4. Time yourself (aim for 15-20 min for easy)
5. Practice explaining solutions (mock interviews)

## Resources

### Within This Repository

- Each pattern folder has detailed README
- Problem files include multiple approaches
- Test cases provided
- Complexity analysis included

### External Resources

- [Neetcode.io](https://neetcode.io/) - Video explanations
- [LeetCode](https://leetcode.com/) - Problem platform
- [Visualgo](https://visualgo.net/) - Algorithm visualizations

---

## File Naming Convention

Files follow this pattern:

```
pattern-name.py          # Python implementation
problem-name.py          # Descriptive problem name
```

## Running Solutions

### Python

```bash
cd Blind75-Practice/easy/[pattern-folder]
python problem-name.py
```

All files include test cases and will print results when run directly.

---

**Remember**: The goal is to recognize patterns and understand the underlying techniques, not to memorize individual solutions. Happy coding! 🚀
