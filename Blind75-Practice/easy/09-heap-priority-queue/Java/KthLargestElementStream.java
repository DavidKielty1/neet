/*
 * 703. Kth Largest Element in a Stream
 * Difficulty: Easy
 * Pattern: Heap
 *
 * Problem:
 * Design a class to find the kth largest element in a stream. Note that it is
 * the kth largest element in the sorted order, not the kth distinct element.
 *
 * Implement KthLargest:
 * - KthLargest(int k, int[] nums) initializes the object with the integer k
 *   and the stream of integers nums.
 * - int add(int val) appends the integer val to the stream and returns the
 *   element representing the kth largest element in the stream.
 *
 * Example 1:
 * Input: ["KthLargest","add","add","add","add","add"]
 *        [[3,[4,5,8,2]],[3],[5],[10],[9],[4]]
 * Output: [null,4,5,5,8,8]
 *
 * Example 2:
 * Input: ["KthLargest","add","add","add","add","add"]
 *        [[1,[]],[-3],[-2],[-4],[0],[4]]
 * Output: [null,-3,-2,-2,0,4]
 *
 * Constraints:
 * - 1 <= k <= 10^4
 * - 0 <= nums.length <= 10^4
 * - -10^4 <= nums[i] <= 10^4
 * - -10^4 <= val <= 10^4
 * - At most 10^4 calls will be made to add
 * - It is guaranteed that there will be at least k elements in the array
 *   when you search for the kth element
 */

public class KthLargestElementStream {
    

    public KthLargestElementStream(int k, int[] nums) {
        
    }

    public int add(int val) {
        
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
