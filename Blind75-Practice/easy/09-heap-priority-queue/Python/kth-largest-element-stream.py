"""
LeetCode 703: Kth Largest Element in a Stream
Difficulty: Easy
Pattern: Heap / Priority Queue

Problem:
Design a class to find the kth largest element in a stream. Note that it is the
kth largest element in the sorted order, not the kth distinct element.

Implement KthLargest class:
- KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of integers nums.
- int add(int val) Appends the integer val to the stream and returns the element representing the kth largest element in the stream.

Example 1:
Input:
["KthLargest", "add", "add", "add", "add", "add"]
[[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
Output:
[null, 4, 5, 5, 8, 8]

Constraints:
- 1 <= k <= 10^4
- 0 <= nums.length <= 10^4
- -10^4 <= nums[i] <= 10^4
- -10^4 <= val <= 10^4
- At most 10^4 calls will be made to add

Time Complexity: O(log k) per add operation
Space Complexity: O(k)
"""

import heapq
from typing import List


class KthLargest:
    """
    Approach: Use min heap of size k

    Strategy:
    1. Maintain a min heap of the k largest elements
    2. The root of the heap (smallest in heap) is kth largest overall
    3. When adding new element:
       - If heap size < k, add element
       - If new element > heap root, remove root and add new element
    4. Return heap root (kth largest)
    """

    def __init__(self, k: int, nums: List[int]):
        self.k = k
        self.heap = []

        # Add all initial elements
        for num in nums:
            self.add(num)

    def add(self, val: int) -> int:
        # If heap not full, add element
        if len(self.heap) < self.k:
            heapq.heappush(self.heap, val)
        # If new element larger than smallest in heap, replace it
        elif val > self.heap[0]:
            heapq.heapreplace(self.heap, val)

        # Return kth largest (root of min heap)
        return self.heap[0]


# Alternative implementation with cleaner logic
class KthLargestAlternative:
    def __init__(self, k: int, nums: List[int]):
        self.k = k
        self.heap = nums
        heapq.heapify(self.heap)

        # Keep only k largest elements
        while len(self.heap) > k:
            heapq.heappop(self.heap)

    def add(self, val: int) -> int:
        heapq.heappush(self.heap, val)

        if len(self.heap) > self.k:
            heapq.heappop(self.heap)

        return self.heap[0]


# Test cases
if __name__ == "__main__":
    # Test case 1
    kthLargest = KthLargest(3, [4, 5, 8, 2])
    assert kthLargest.add(3) == 4  # return 4
    print("✓ Test 1 passed")

    assert kthLargest.add(5) == 5  # return 5
    print("✓ Test 2 passed")

    assert kthLargest.add(10) == 5  # return 5
    print("✓ Test 3 passed")

    assert kthLargest.add(9) == 8  # return 8
    print("✓ Test 4 passed")

    assert kthLargest.add(4) == 8  # return 8
    print("✓ Test 5 passed")

    print("\nAll test cases passed!")
