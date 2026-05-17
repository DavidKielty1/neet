/*
 * 703. Kth Largest Element in a Stream
 * Difficulty: Easy
 * Pattern: Heap
 *
 * Problem:
 * Design a class that always knows the kth largest value seen so far in a stream.
 * You are given an integer `k` and an initial list of numbers `nums`. Each time a
 * new value is added, return the current kth largest element among all values seen.
 *
 * Example 1:
 * Input:
 *   k = 3
 *   nums = [4, 5, 8, 2]
 *   add(3), add(5), add(10), add(9), add(4)
 * Output:
 *   4, 5, 5, 8, 8
 * Explanation:
 * - Stream after add(3):  [4, 5, 8, 2, 3]  -> 3rd largest = 4
 * - Stream after add(5):  [4, 5, 8, 2, 3, 5] -> 3rd largest = 5
 * - Stream after add(10): [4, 5, 8, 2, 3, 5, 10] -> 3rd largest = 5
 * - Stream after add(9):  [4, 5, 8, 2, 3, 5, 10, 9] -> 3rd largest = 8
 * - Stream after add(4):  [4, 5, 8, 2, 3, 5, 10, 9, 4] -> 3rd largest = 8
 *
 * Example 2:
 * Input:
 *   k = 1
 *   nums = []
 *   add(-3), add(-2), add(-4), add(0), add(4)
 * Output:
 *   -3, -2, -2, 0, 4
 * Explanation:
 * When k = 1, we always return the largest value seen so far.
 *
 * Constraints:
 * - 1 <= k <= 10^4
 * - 0 <= nums.length <= 10^4
 * - -10^4 <= nums[i], val <= 10^4
 * - At most 10^4 calls will be made to `add`
 *
 * Why a heap works:
 * Keep only the k largest values in a min-heap. The heap root is then the
 * smallest of those k values, which is exactly the kth largest overall.
 *
 * Time: O(log k) per add
 * Space: O(k)
 */

import java.util.PriorityQueue;

public class KthLargestElementStream {

    static class KthLargest {
        private final int k;
        private final PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        public KthLargest(int k, int[] nums) {
            this.k = k;
            for (int num : nums) {
                add(num);
            }
        }

        // Single place for heap logic: offer, trim, return kth largest.
        public int add(int val) {
            minHeap.offer(val);
            if (minHeap.size() > k) {
                minHeap.poll(); // removes smallest (heap root), not a random leaf
            }
            return minHeap.peek();
        }
    }
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
            //         add(num);
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
