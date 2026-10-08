"""
239. Sliding Window Maximum
Difficulty: Medium
Pattern: Sliding Window + Deque

Problem:
You are given an array of integers nums. There is a sliding window of size k
which is moving from the very left of the array to the very right. You can
only see the k numbers in the window. Each time the sliding window moves
right by one position. Return an array of the maximum value in each window.

Example 1:
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]

Example 2:
Input: nums = [1], k = 1
Output: [1]

Constraints:
- 1 <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4
- 1 <= k <= nums.length
"""

from collections import deque
from typing import Deque, List


def max_of_all_subarrays(arr: List[int], k: int) -> List[int]:
    """
    Sliding window with deque to maintain max elements
    Time: O(n), Space: O(k)
    """

    queue: Deque[int] = deque()
    output: List[int] = []

    for i in range(len(arr)):
        while queue and queue[0] <= i - k:
            queue.popleft()

        while queue and arr[queue[-1]] <= arr[i]:
            queue.pop()

        queue.append(i)

        if i >= k - 1:
            output.append(arr[queue[0]])

    return output

    #

    #

    #

    #

    #

    #

    #

    #

    #

    #

    #

    #
    # if not arr or k <= 0:
    #     return []

    # queue = deque()  # Store indices, not values
    # output = []

    # for i in range(len(arr)):
    #     # Remove indices outside current window
    #     while queue and queue[0] <= i - k:
    #         queue.popleft()

    #     # Remove indices whose values are smaller than current
    #     while queue and arr[queue[-1]] <= arr[i]:
    #         queue.pop()

    #     queue.append(i)

    #     # begin appending once queue reaches length of k
    #     if i >= k - 1:
    #         output.append(arr[queue[0]])

    # return output


# Test cases
if __name__ == "__main__":
    # Test 1
    arr1, k1 = [1, 3, -1, -3, 5, 3, 6, 7], 3
    print(f"Max of Subarrays: {max_of_all_subarrays(arr1, k1)}")  # [3,3,5,5,6,7]
