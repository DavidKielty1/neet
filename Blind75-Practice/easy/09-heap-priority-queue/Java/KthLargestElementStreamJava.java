/*
 * 703. Kth Largest Element in a Stream
 * Difficulty: Easy
 * Pattern: Heap
 *
 * Problem:
 * Design a class to find the kth largest element in a stream.
 *
 * Implement the `KthLargest` class:
 * - `KthLargest(int k, int[] nums)` initializes the object with the integer `k` and the stream `nums`
 * - `int add(int val)` appends `val` to the stream and returns the kth largest element
 *
 * Example 1:
 * Input:
 * ["KthLargest", "add", "add", "add", "add", "add"]
 * [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
 * Output:
 * [null, 4, 5, 5, 8, 8]
 *
 * Constraints:
 * - 1 <= k <= 10^4
 * - 0 <= nums.length <= 10^4
 * - -10^4 <= nums[i], val <= 10^4
 * - At most 10^4 calls will be made to add
 *
 * Notes:
 * - Keep only the k largest values seen so far.
 * - A min-heap of size k makes the root the current kth largest element.
 */

import java.util.PriorityQueue;

public class KthLargestElementStreamJava {

    static class KthLargest {
        private final int k;
        private final PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        public KthLargest(int k, int[] nums) {
            this.k = k;
        }

        public int add(int val) {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // public KthLargest(int k, int[] nums) {
            //     this.k = k;
            //     for (int num : nums) {
            //         minHeap.offer(num);
            //         if (minHeap.size() > k) {
            //             minHeap.poll();
            //         }
            //     }
            // }
            //
            // public int add(int val) {
            //     minHeap.offer(val);
            //     if (minHeap.size() > k) {
            //         minHeap.poll();
            //     }
            //     return minHeap.peek();
            // }
        }
    }

    public static void main(String[] args) {
        KthLargest kth = new KthLargest(3, new int[] {4, 5, 8, 2});
        assert kth.add(3) == 4;
        assert kth.add(5) == 5;
        assert kth.add(10) == 5;
        assert kth.add(9) == 8;
        assert kth.add(4) == 8;
        System.out.println("All test cases passed!");
    }
}
