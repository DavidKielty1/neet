# NeetCode 250 — All Breakdown

## Overview

[NeetCode 250](https://neetcode.io/practice/practice/neetcode250) is NeetCode 150 plus 100 more problems — **250 total** aimed at beginners building breadth across core patterns.

**Official targets:** 60 Easy · 155 Medium · 35 Hard

This repo’s `Blind75-Practice/` track mirrors the **18 NeetCode pattern categories** with numbered folders (`01-` … `18-`). Folders suffixed `-l` are extended learner tracks.

**Repo totals (Java, excl. analogue-questions):**

| Difficulty | NeetCode 250 target | In this repo |
| ---------- | ------------------: | -----------: |
| Easy       |                  60 |           96 |
| Medium     |                 155 |          161 |
| Hard       |                  35 |           36 |
| **All**    |             **250** |      **293** |

> Counts exceed 250 because the repo adds extra practice beyond the official list. Use [NeetCode 250](https://neetcode.io/practice/practice/neetcode250) as the canonical checklist; use folder paths here to study by pattern.

---

## 18 categories — NeetCode targets vs repo

| #   | NeetCode category       | NC250 total |   Easy |  Medium |   Hard | Repo total |
| --- | ----------------------- | ----------: | -----: | ------: | -----: | ---------: |
| 01  | Arrays & Hashing        |          22 |     18 |      11 |      2 |     **31** |
| 02  | Two Pointers            |          13 |     11 |       8 |      1 |     **20** |
| 03  | Stack                   |          14 |      4 |       9 |      2 |     **15** |
| 04  | Binary Search           |          14 |      4 |       7 |      3 |     **14** |
| 05  | Sliding Window          |           9 |      4 |       7 |      2 |     **13** |
| 06  | Linked List             |          14 |      6 |       9 |      3 |     **18** |
| 07  | Trees                   |          23 |     13 |      12 |      2 |     **27** |
| 08  | Tries                   |           4 |      0 |       3 |      1 |      **4** |
| 09  | Heap / Priority Queue   |          12 |      3 |       8 |      2 |     **13** |
| 10  | Backtracking            |          17 |      1 |      12 |      3 |     **16** |
| 11  | Graphs                  |          21 |      3 |      17 |      1 |     **21** |
| 12  | 1-D Dynamic Programming |          17 |      3 |      13 |      4 |     **20** |
| 13  | Intervals               |           7 |      1 |       4 |      2 |      **7** |
| 14  | Greedy                  |          14 |      2 |      12 |      1 |     **15** |
| 15  | Advanced Graphs         |          10 |      0 |       4 |      6 |     **10** |
| 16  | 2-D Dynamic Programming |          16 |      5 |      13 |      1 |     **19** |
| 17  | Bit Manipulation        |          10 |      8 |       4 |      0 |     **12** |
| 18  | Math & Geometry         |          13 |      9 |       8 |      0 |     **17** |
|     | **Totals**              |     **250** | **96** | **161** | **36** |    **293** |

_Repo 1-D DP: `easy/12-1d-dp`, `medium/12-1d-dp`, `hard/12-1d-dp-l`._

---

## Folder layout (all difficulties)

```
Blind75-Practice/
├── easy/          # 01–18 (no 08-tries, no 15-advanced-graphs)
├── medium/        # 01–18 (full set)
└── hard/          # 01–16 (no 17-bit, no 18-math)
```

| NeetCode category     | Path prefix               |
| --------------------- | ------------------------- |
| Arrays & Hashing      | `01-arrays-hashing`       |
| Two Pointers          | `02-two-pointers`         |
| Stack                 | `03-stack`                |
| Binary Search         | `04-binary-search`        |
| Sliding Window        | `05-sliding-window`       |
| Linked List           | `06-linked-list-l`        |
| Trees                 | `07-trees`                |
| Tries                 | `08-tries`                |
| Heap / Priority Queue | `09-heap-priority-queue`  |
| Backtracking          | `10-backtracking`         |
| Graphs                | `11-graphs`               |
| 1-D DP                | `12-1d-dp` / `12-1d-dp-l` |
| Intervals             | `13-intervals-l`          |
| Greedy                | `14-greedy`               |
| Advanced Graphs       | `15-advanced-graphs`      |
| 2-D DP                | `16-2d-dp-l`              |
| Bit Manipulation      | `17-bit-manipulation-l`   |
| Math & Geometry       | `18-math-geometry-l`      |

---

## Per-difficulty detail

| Doc                                                                | Contents                          |
| ------------------------------------------------------------------ | --------------------------------- |
| [NeetCode250-Easy-Breakdown.md](NeetCode250-Easy-Breakdown.md)     | All 96 easy problems by folder    |
| [NeetCode250-Medium-Breakdown.md](NeetCode250-Medium-Breakdown.md) | All 161 medium problems by folder |
| [NeetCode250-Hard-Breakdown.md](NeetCode250-Hard-Breakdown.md)     | All 36 hard problems by folder    |

---

## Suggested study order

1. **Foundations** — 01, 02, 05, 04 (arrays, pointers, windows, search)
2. **Structures** — 03, 06, 07 (stack, linked list, trees)
3. **Exploration** — 08, 09, 10, 11 (tries, heap, backtracking, graphs)
4. **Optimization** — 12, 16, 14, 13 (1-D/2-D DP, greedy, intervals)
5. **Advanced** — 15, 17, 18 (weighted graphs, bits, math/geometry)

Work **easy → medium → hard** within each pattern when possible.

---

## Blind 75 vs NeetCode 250

| List             | Problems                            | Doc                                     |
| ---------------- | ----------------------------------- | --------------------------------------- |
| **Blind 75**     | 75 (core interview set)             | [Blind75.md](Blind75.md)                |
| **NeetCode 150** | 150 (Blind 75 + 75 more)            | —                                       |
| **NeetCode 250** | 250 (150 + 100 more easies/mediums) | This file + easy/medium/hard breakdowns |

---

## Related

- Practice README: `Blind75-Practice/README.md`
- Commands & tooling: `CLAUDE.md`
