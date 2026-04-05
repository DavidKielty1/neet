"""
LeetCode 706: Design HashMap
Difficulty: Easy
Pattern: Arrays & Hashing

Implement MyHashMap with put, get, and remove. Keys and values are in [0, 10^6];
get/remove for missing keys returns -1.

Approach: Parallel presence flags and value array — O(1) per op.

Time Complexity: O(1) per operation
Space Complexity: O(10^6)
"""

from typing import List


class MyHashMap:
    def __init__(self) -> None:
        self._has: List[bool] = [False] * 1_000_001
        self._vals: List[int] = [0] * 1_000_001

    def put(self, key: int, value: int) -> None:
        self._has[key] = True
        self._vals[key] = value

    def get(self, key: int) -> int:
        return self._vals[key] if self._has[key] else -1

    def remove(self, key: int) -> None:
        self._has[key] = False


if __name__ == "__main__":
    hm = MyHashMap()
    hm.put(1, 1)
    hm.put(2, 2)
    assert hm.get(1) == 1
    assert hm.get(3) == -1
    hm.put(2, 1)
    assert hm.get(2) == 1
    hm.remove(2)
    assert hm.get(2) == -1
    print("All test cases passed!")
