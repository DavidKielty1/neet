# Blind 75 — LeetCode Study Guide

## Overview

The **Blind 75** is a curated list of **75** LeetCode problems across **19 pattern categories**, widely used for technical interview prep. It was popularized from a Blind app post and organized on [NeetCode](https://neetcode.io/practice/practice/blind75).

**NeetCode difficulty split:** 19 Easy · 49 Medium · 7 Hard ([checklist](https://neetcode.io/practice/practice/blind75))

**In this document:** 22 Easy · 48 Medium · 5 Hard _(LeetCode difficulties as listed in the tables below)_

Practice skeletons for many of these live under `Blind75-Practice/` and `Blind75-Real/`. This document is **only** the Blind 75 list — not NeetCode 150/250. See `NeetCode250-All-Breakdown.md` for the broader study track.

---

## Overall breakdown (19 categories)

| #   | NeetCode category       | Blind 75 |   Easy | Medium |  Hard |
| --- | ----------------------- | -------: | -----: | -----: | ----: |
| 01  | Arrays & Hashing        |        8 |      3 |      5 |     0 |
| 02  | Two Pointers            |        3 |      1 |      2 |     0 |
| 03  | Sliding Window          |        4 |      1 |      2 |     1 |
| 04  | Stack                   |        1 |      1 |      0 |     0 |
| 05  | Binary Search           |        2 |      0 |      2 |     0 |
| 06  | Linked List             |        6 |      3 |      3 |     0 |
| 07  | Trees                   |       11 |      6 |      3 |     2 |
| 08  | Heap / Priority Queue   |        1 |      1 |      0 |     0 |
| 09  | Backtracking            |        2 |      0 |      2 |     0 |
| 10  | Tries                   |        3 |      0 |      2 |     1 |
| 11  | Graphs                  |        6 |      0 |      6 |     0 |
| 12  | Advanced Graphs         |        1 |      0 |      0 |     1 |
| 13  | 1-D Dynamic Programming |       10 |      1 |      9 |     0 |
| 14  | 2-D Dynamic Programming |        2 |      0 |      2 |     0 |
| 15  | Greedy                  |        2 |      0 |      2 |     0 |
| 16  | Intervals               |        5 |      1 |      4 |     0 |
| 17  | Math & Geometry         |        3 |      0 |      3 |     0 |
| 18  | Bit Manipulation        |        5 |      4 |      1 |     0 |
|     | **Totals**              |   **75** | **22** | **48** | **5** |

---

## Problems by category

### Arrays & Hashing (8)

| #   | Problem                      |  LC | Difficulty |
| --- | ---------------------------- | --: | ---------- |
| 1   | Contains Duplicate           | 217 | Easy       |
| 2   | Valid Anagram                | 242 | Easy       |
| 3   | Two Sum                      |   1 | Easy       |
| 4   | Group Anagrams               |  49 | Medium     |
| 5   | Top K Frequent Elements      | 347 | Medium     |
| 6   | Encode and Decode Strings    | 271 | Medium     |
| 7   | Product of Array Except Self | 238 | Medium     |
| 8   | Longest Consecutive Sequence | 128 | Medium     |

### Two Pointers (3)

| #   | Problem                   |  LC | Difficulty |
| --- | ------------------------- | --: | ---------- |
| 9   | Valid Palindrome          | 125 | Easy       |
| 10  | 3Sum                      |  15 | Medium     |
| 11  | Container With Most Water |  11 | Medium     |

### Sliding Window (4)

| #   | Problem                                        |  LC | Difficulty |
| --- | ---------------------------------------------- | --: | ---------- |
| 12  | Best Time to Buy and Sell Stock                | 121 | Easy       |
| 13  | Longest Substring Without Repeating Characters |   3 | Medium     |
| 14  | Longest Repeating Character Replacement        | 424 | Medium     |
| 15  | Minimum Window Substring                       |  76 | Hard       |

### Stack (1)

| #   | Problem           |  LC | Difficulty |
| --- | ----------------- | --: | ---------- |
| 16  | Valid Parentheses |  20 | Easy       |

### Binary Search (2)

| #   | Problem                              |  LC | Difficulty |
| --- | ------------------------------------ | --: | ---------- |
| 17  | Find Minimum in Rotated Sorted Array | 153 | Medium     |
| 18  | Search in Rotated Sorted Array       |  33 | Medium     |

### Linked List (6)

| #   | Problem                          |  LC | Difficulty |
| --- | -------------------------------- | --: | ---------- |
| 19  | Reverse Linked List              | 206 | Easy       |
| 20  | Merge Two Sorted Lists           |  21 | Easy       |
| 21  | Reorder List                     | 143 | Medium     |
| 22  | Remove Nth Node From End of List |  19 | Medium     |
| 23  | Linked List Cycle                | 141 | Easy       |
| 24  | Add Two Numbers                  |   2 | Medium     |

### Trees (11)

| #   | Problem                               |  LC | Difficulty |
| --- | ------------------------------------- | --: | ---------- |
| 25  | Invert Binary Tree                    | 226 | Easy       |
| 26  | Maximum Depth of Binary Tree          | 104 | Easy       |
| 27  | Diameter of Binary Tree               | 543 | Easy       |
| 28  | Balanced Binary Tree                  | 110 | Easy       |
| 29  | Same Tree                             | 100 | Easy       |
| 30  | Subtree of Another Tree               | 572 | Easy       |
| 31  | Lowest Common Ancestor of a BST       | 235 | Medium     |
| 32  | Binary Tree Maximum Path Sum          | 124 | Hard       |
| 33  | Serialize and Deserialize Binary Tree | 297 | Hard       |
| 34  | Binary Tree Level Order Traversal     | 102 | Medium     |
| 35  | Validate Binary Search Tree           |  98 | Medium     |

### Heap / Priority Queue (1)

| #   | Problem                         |  LC | Difficulty |
| --- | ------------------------------- | --: | ---------- |
| 36  | Kth Largest Element in a Stream | 703 | Easy       |

### Backtracking (2)

| #   | Problem         |  LC | Difficulty |
| --- | --------------- | --: | ---------- |
| 37  | Combination Sum |  39 | Medium     |
| 38  | Word Search     |  79 | Medium     |

### Tries (3)

| #   | Problem                                    |  LC | Difficulty |
| --- | ------------------------------------------ | --: | ---------- |
| 39  | Implement Trie (Prefix Tree)               | 208 | Medium     |
| 40  | Design Add and Search Words Data Structure | 211 | Medium     |
| 41  | Word Search II                             | 212 | Hard       |

### Graphs (6)

| #   | Problem                                               |  LC | Difficulty |
| --- | ----------------------------------------------------- | --: | ---------- |
| 42  | Number of Islands                                     | 200 | Medium     |
| 43  | Clone Graph                                           | 133 | Medium     |
| 44  | Pacific Atlantic Water Flow                           | 417 | Medium     |
| 45  | Course Schedule                                       | 207 | Medium     |
| 46  | Graph Valid Tree                                      | 261 | Medium     |
| 47  | Number of Connected Components in an Undirected Graph | 323 | Medium     |

### Advanced Graphs (1)

| #   | Problem          |  LC | Difficulty |
| --- | ---------------- | --: | ---------- |
| 48  | Alien Dictionary | 269 | Hard       |

### 1-D Dynamic Programming (10)

| #   | Problem                        |  LC | Difficulty |
| --- | ------------------------------ | --: | ---------- |
| 49  | Climbing Stairs                |  70 | Easy       |
| 50  | House Robber                   | 198 | Medium     |
| 51  | House Robber II                | 213 | Medium     |
| 52  | Longest Palindromic Substring  |   5 | Medium     |
| 53  | Palindromic Substrings         | 647 | Medium     |
| 54  | Decode Ways                    |  91 | Medium     |
| 55  | Coin Change                    | 322 | Medium     |
| 56  | Maximum Product Subarray       | 152 | Medium     |
| 57  | Word Break                     | 139 | Medium     |
| 58  | Longest Increasing Subsequence | 300 | Medium     |

### 2-D Dynamic Programming (2)

| #   | Problem                    |   LC | Difficulty |
| --- | -------------------------- | ---: | ---------- |
| 59  | Unique Paths               |   62 | Medium     |
| 60  | Longest Common Subsequence | 1143 | Medium     |

### Greedy (2)

| #   | Problem          |  LC | Difficulty |
| --- | ---------------- | --: | ---------- |
| 61  | Maximum Subarray |  53 | Medium     |
| 62  | Jump Game        |  55 | Medium     |

### Intervals (5)

| #   | Problem                   |  LC | Difficulty |
| --- | ------------------------- | --: | ---------- |
| 63  | Insert Interval           |  57 | Medium     |
| 64  | Merge Intervals           |  56 | Medium     |
| 65  | Non-overlapping Intervals | 435 | Medium     |
| 66  | Meeting Rooms             | 252 | Easy       |
| 67  | Meeting Rooms II          | 253 | Medium     |

### Math & Geometry (3)

| #   | Problem           |  LC | Difficulty |
| --- | ----------------- | --: | ---------- |
| 68  | Rotate Image      |  48 | Medium     |
| 69  | Spiral Matrix     |  54 | Medium     |
| 70  | Set Matrix Zeroes |  73 | Medium     |

### Bit Manipulation (5)

| #   | Problem             |  LC | Difficulty |
| --- | ------------------- | --: | ---------- |
| 71  | Sum of Two Integers | 371 | Medium     |
| 72  | Reverse Bits        | 190 | Easy       |
| 73  | Number of 1 Bits    | 191 | Easy       |
| 74  | Counting Bits       | 338 | Easy       |
| 75  | Missing Number      | 268 | Easy       |

---

## Summary by difficulty

| Difficulty |  Count |
| ---------- | -----: |
| Easy       |     22 |
| Medium     |     48 |
| Hard       |      5 |
| **Total**  | **75** |

---

## Suggested 8-week plan

| Weeks | Focus categories                                                 |
| ----- | ---------------------------------------------------------------- |
| 1–2   | Arrays & Hashing, Two Pointers, Sliding Window, Stack            |
| 3–4   | Binary Search, Linked List, Trees                                |
| 5–6   | Graphs, Heap, Backtracking, Tries                                |
| 7–8   | 1-D/2-D DP, Greedy, Intervals, Math & Geometry, Bit Manipulation |

**Pace:** ~2 problems per day · **Goal:** pattern recognition, not memorization.

---

## Study tips

1. **Understand** — examples, constraints, edge cases before coding.
2. **Brute force first** — then optimize using the category pattern.
3. **Review** — revisit problems you found hard after 3–7 days.
4. **Track progress** — use [NeetCode Blind 75](https://neetcode.io/practice/practice/blind75) or your own checklist.

---

## Related docs in this repo

| File                              | Contents                          |
| --------------------------------- | --------------------------------- |
| `NeetCode250-Easy-Breakdown.md`   | Easy practice by pattern folder   |
| `NeetCode250-Medium-Breakdown.md` | Medium practice by pattern folder |
| `NeetCode250-Hard-Breakdown.md`   | Hard practice by pattern folder   |
| `NeetCode250-All-Breakdown.md`    | Combined NeetCode 250 view        |

---

**Consistency beats intensity.** Two solid problems per day through the 75 beats cramming.
