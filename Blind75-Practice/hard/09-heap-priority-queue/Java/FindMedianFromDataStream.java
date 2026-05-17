/*
 * 295. Find Median from Data Stream
 * Difficulty: Hard
 * Pattern: Heap / priority queue
 *
 * Problem:
 * The median is the middle value in an ordered integer list. If the size of the
 * list is even, there is no middle value and the median is the mean of the two
 * middle values.
 *
 * Implement the MedianFinder class:
 * - MedianFinder() initializes the MedianFinder object.
 * - void addNum(int num) adds the integer num from the data stream.
 * - double findMedian() returns the median of all elements so far.
 *
 * Example 1:
 * Input:
 * ["MedianFinder","addNum","addNum","findMedian","addNum","findMedian"]
 * [[],[1],[2],[],[3],[]]
 * Output: [null,null,null,1.5,null,2.0]
 *
 * Constraints:
 * - -10^5 <= num <= 10^5
 * - There will be at least one element before each call to findMedian
 * - At most 5 * 10^4 calls will be made to addNum and findMedian
 */
public class FindMedianFromDataStream {
    static class MedianFinder {
        public MedianFinder() {
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

            // PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
            // PriorityQueue<Integer> large = new PriorityQueue<>();
            throw new UnsupportedOperationException("Implement MedianFinder");
        }

        public void addNum(int num) {
            // small.offer(num);
            // large.offer(small.poll());
            // if (large.size() > small.size()) {
            //     small.offer(large.poll());
            // }
            throw new UnsupportedOperationException("Implement addNum");
        }

        public double findMedian() {
            // if (small.size() > large.size()) {
            //     return small.peek();
            // }
            // return (small.peek() + large.peek()) / 2.0;
            throw new UnsupportedOperationException("Implement findMedian");
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement MedianFinder and add checks.");
    }
}
