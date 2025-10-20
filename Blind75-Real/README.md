# Blind 75 Real Problems - Two Pointers

This directory contains the actual Blind 75 LeetCode problems that use the **Two Pointers** technique for strings and arrays.

## Problems Included

### Arrays

- **Two Sum** (LeetCode 1) - Hash map + sorted array approaches
- **3Sum** (LeetCode 15) - Fixed element + two pointers on sorted array
- **Container With Most Water** (LeetCode 11) - Opposite ends with area calculation
- **Trapping Rain Water** (LeetCode 42) - Two pointers with height comparison

### Strings

- **Valid Palindrome** (LeetCode 125) - Opposite ends with character validation

## Directory Structure

```
Blind75-Real/
├── README.md
├── arrays/
│   ├── two-sum.py
│   ├── 3sum.py
│   ├── container-with-most-water.py
│   └── trapping-rain-water.py
└── strings/
    └── valid-palindrome.py
```

## Two Pointers Techniques Used

1. **Opposite Ends Pattern** - Start with pointers at both ends, move inward
2. **Fast/Slow Pointers** - One pointer moves faster than the other
3. **Hash Map + Two Pointers** - Combine hash map lookup with pointer movement
4. **Three Pointers** - Fixed element with two moving pointers

## Time & Space Complexity

| Problem                   | Time  | Space | Technique      |
| ------------------------- | ----- | ----- | -------------- |
| Two Sum                   | O(n)  | O(n)  | Hash Map       |
| 3Sum                      | O(n²) | O(1)  | Three Pointers |
| Container With Most Water | O(n)  | O(1)  | Opposite Ends  |
| Trapping Rain Water       | O(n)  | O(1)  | Two Pointers   |
| Valid Palindrome          | O(n)  | O(1)  | Opposite Ends  |

These are the core Blind 75 problems that demonstrate two-pointer techniques for arrays and strings.
