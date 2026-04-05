"""
LeetCode 705: Design HashSet
Difficulty: Easy
Pattern: Arrays & Hashing

Implement MyHashSet with add, remove, and contains. Keys are in [0, 10^6].

Approach: Direct-address table (boolean array) — O(1) per op, O(U) space for universe U.

Time Complexity: O(1) per operation
Space Complexity: O(10^6) for the presence bitmap
"""

from typing import List


class MyHashSet:
    def __init__(self) -> None:
        self._present: List[bool] = [False] * 1_000_001

    def add(self, key: int) -> None:
        self._present[key] = True

    def remove(self, key: int) -> None:
        self._present[key] = False

    def contains(self, key: int) -> bool:
        return self._present[key]


if __name__ == "__main__":
    hs = MyHashSet()
    hs.add(1)
    hs.add(2)
    assert hs.contains(1) is True
    assert hs.contains(3) is False
    hs.add(2)
    assert hs.contains(2) is True
    hs.remove(2)
    assert hs.contains(2) is False
    print("All test cases passed!")
