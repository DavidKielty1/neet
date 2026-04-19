/*
703. Kth Largest Element in a Stream
Difficulty: Easy
Pattern: Heap

Design KthLargest with constructor and add.

Use a min-heap of size k.
*/

import java.util.PriorityQueue;

public class KthLargestElementStreamJava {

    static class KthLargest {
        private final int k;
        private final PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        public KthLargest(int k, int[] nums) {
            this.k = k;
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

    //

        //

    //

    


            // for (int num : nums) {
            //     minHeap.offer(num);
            //     if (minHeap.size() > k) {
            //         minHeap.poll();
            //     }
            // }
            throw new UnsupportedOperationException("Implement constructor");
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

            // minHeap.offer(val);
            // if (minHeap.size() > k) {
            //     minHeap.poll();
            // }
            // return minHeap.peek();
            throw new UnsupportedOperationException("Implement add");
        }
    }

    public static void main(String[] args) {
        KthLargest kth = new KthLargest(3, new int[] {4, 5, 8, 2});
        System.out.println("Implement add() tests after constructor works.");
    }
}
