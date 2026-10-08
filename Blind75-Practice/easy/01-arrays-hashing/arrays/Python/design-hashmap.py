"""
706. Design HashMap
Difficulty: Easy
Pattern: Arrays & Hashing

Problem:
Design a HashMap without using any built-in hash table libraries. Implement
the MyHashMap class with these operations:
- void put(int key, int value): insert or update the mapping for key.
- int get(int key): return the value mapped to key, or -1 if absent.
- void remove(int key): remove the mapping for key if it exists.
Keys and values are integers.

Example 1:
Input: ["MyHashMap","put","put","get","get","put","get","remove","get"]
[[],[1,1],[2,2],[1],[3],[2,1],[2],[2],[2]]
Output: [null,null,null,1,-1,null,1,null,-1]

Constraints:
- 0 <= key, value <= 10^6
- At most 10^4 calls will be made to put, get, and remove
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
