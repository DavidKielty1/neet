# Blind75-Practice — NeetCode-style patterns (all difficulties)

## Overview

This folder groups LeetCode / [NeetCode](https://neetcode.io/) style practice by **solving pattern** and **difficulty**. The **easy** track is populated with solutions, analogue questions, and notes. **Medium** and **hard** use the **same topic names** as scaffolding.

**Current study focus:** Java. Existing Python material is still useful as reference, but new additions can be Java-only when that better matches the active study plan. For `medium/` and `hard/`, the current scaffold is **Java folders and filenames only**; no Python folders or tests are required yet.

Across difficulties, each populated pattern folder aims to include:

- Problem implementations with detailed explanations
- Multiple solution approaches where useful
- Time and space complexity analysis
- Analogue questions (see `easy/` for `analogue-questions/Python`, `analogue-questions/Java`)
- Java practice files are the primary implementation target going forward
- Pattern-specific README with techniques and tips (`easy/`)

## Directory structure (top level)

```
Blind75-Practice/
├── README.md                 # This file — applies to easy, medium, and hard
├── easy/                     # Populated: NeetCode 150 / 250 easy-style problems by pattern
├── medium/                   # Scaffold: same pattern folders; add NeetCode mediums over time
└── hard/                     # Scaffold: same pattern folders; add NeetCode hards over time
```

## Topic folders (mirrored under `easy/`, `medium/`, and `hard/`)

Numbering matches `easy/` plus roadmap topics (e.g. tries, graphs) for NeetCode 250–style coverage:

```
├── 01-two-pointers/
├── 02-sliding-window/
├── 03-hash-maps-sets/
├── 04-arrays-hashing/
├── 04-dynamic-programming/     # Legacy parallel to 10-dp on easy; optional merge when filling
├── 05-binary-search/
├── 06-trees/
├── 07-stack/
├── 08-linked-list/
├── 09-heap/
├── 10-dynamic-programming/
├── 11-greedy/
├── 12-bit-manipulation/
├── 13-intervals/
├── 14-math-geometry/
├── 15-prefix-sum/
├── 16-tries/
├── 17-backtracking/
├── 18-graphs/
└── 19-advanced-graphs/
```

See [`medium/README.md`](medium/README.md) and [`hard/README.md`](hard/README.md) for scaffold status. **Easy** detail and examples live under [`easy/`](easy/) (including `easy/tools/` for Java test generation).

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

## Next steps

After mastering easy problems:

1. Add solutions under [`medium/`](medium/) per pattern (folders are ready; READMEs describe intent).
2. Combine patterns (e.g., Binary Search + DFS).
3. Add **hard** problems under [`hard/`](hard/) when ready.
4. Time yourself (aim for roughly 15–20 minutes on easies in interview conditions).
5. Practice explaining solutions (mock interviews).

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

**Remember:** The goal is to recognize patterns and understand the underlying techniques, not to memorize individual solutions.
