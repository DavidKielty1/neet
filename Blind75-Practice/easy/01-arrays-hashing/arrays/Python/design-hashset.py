"""
705. Design HashSet
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
Design a HashSet without using any built-in hash table libraries. Implement
the MyHashSet class with these operations:
- void add(int key): insert key into the set.
- void remove(int key): remove key from the set if present.
- boolean contains(int key): return true if key is in the set.
Keys are integers.

Example 1:
Input: ["MyHashSet","add","add","contains","contains","add","contains","remove","contains"]
[[],[1],[2],[1],[3],[2],[2],[2],[2]]
Output: [null,null,null,true,false,null,true,null,false]

Constraints:
- 0 <= key <= 10^6
- At most 10^4 calls will be made to add, remove, and contains
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
