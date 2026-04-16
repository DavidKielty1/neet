# Five medium DP problems — descriptions only

Use these to practise **recognising** when DP fits: optimal substructure, overlapping subproblems, and a clear **state** (often index, prefix, or position in a grid).

---

## 1. LeetCode 322 — Coin Change

You are given an integer array `coins` of distinct positive coin denominations and an integer `amount`. You may use each denomination **as many times as you want** (unlimited supply).

Return the **fewest number of coins** needed to make up exactly `amount`. If that amount cannot be made up, return `-1`.

You may assume you have an infinite number of each kind of coin.

**Pattern signal:** “Minimum steps / minimum count to reach a target” with **reusable** choices → often 1D DP over `0 … amount`, or BFS on sums.

---

## 2. LeetCode 300 — Longest Increasing Subsequence

Given an integer array `nums`, return the **length** of the **longest strictly increasing subsequence**.

A **subsequence** is derived by deleting some elements (possibly none) without changing the order of the remaining elements.

**Pattern signal:** “Best over **subsequences** / order preserved, not necessarily contiguous” → often DP where `dp[i]` = best answer **ending at** index `i`, using earlier indices `j < i`.

---

## 3. LeetCode 63 — Unique Paths II

You are given an `m x n` grid. A robot starts at the **top-left** corner and tries to move to the **bottom-right**. At each step it may move **only down** or **only right**.

The grid contains `0` (empty) and `1` (obstacle). Obstacle cells are **not** passable.

Return the **number of distinct paths** from start to finish that avoid obstacles.

**Pattern signal:** “Count ways / min cost on a **grid** with local moves” → 2D DP (or rolling 1D rows) with transitions from cell above and cell to the left.

---

## 4. LeetCode 91 — Decode Ways

A message containing letters `A–Z` is **encoded** to digits using: `A → "1"`, `B → "2"`, …, `Z → "26"`.

Given a string `s` containing only digits, return the **number of ways** to **decode** it (i.e. split it into one or more valid letter codes). A valid decoding must use the whole string; leading zeros are not valid as a code.

**Pattern signal:** “Ways to parse a **string** where each step consumes 1 or 2 characters, with **validity rules**” → linear DP with branching and guards (like your easy “jump” DP, but with conditions on digits).

---

## 5. LeetCode 139 — Word Break

You are given a string `s` and a dictionary of strings `wordDict` (each word can be used **multiple times** in principle; you are checking **whether** a full segmentation exists).

Return `true` if `s` can be segmented into a space-separated sequence of one or more dictionary words; otherwise return `false`.

Note: The same word may appear multiple times in `wordDict`, but that does not change the set of allowed words.

**Pattern signal:** “Can we partition a sequence / string using allowed **segments**” → boolean DP on prefixes: `dp[i]` = “can we form `s[0..i)`?”.

---

## Quick “is this DP?” checklist (medium)

| Clue                                                        | Often points to                       |
| ----------------------------------------------------------- | ------------------------------------- |
| Min / max / count over **choices** that build an answer     | DP or greedy (verify)                 |
| Same subproblem asked many times                            | DP or memoisation                     |
| Natural state = **prefix length**, **index**, **grid cell** | 1D or 2D DP                           |
| Unlimited use of items (coins, words)                       | Unbounded-style recurrence or BFS     |
| String + local rules                                        | DP with small branching at each index |

These five problems are **not** the only DP shapes at medium difficulty; they are a **spread** of common interview types so you can match **story → state → transition**.
