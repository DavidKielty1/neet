/*
1046. Last Stone Weight
Difficulty: Easy
Pattern: Heap

Smash two heaviest stones; return last weight or 0.

Time: O(n log n), Space: O(n)
*/
import java.util.PriorityQueue;

public class LastStoneWeightJava {
    public int lastStoneWeight(int[] stones) {
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

        // Max-heap via PriorityQueue (negate values).

        // java.util.PriorityQueue<Integer> maxHeap =
        //         new java.util.PriorityQueue<>(java.util.Collections.reverseOrder());
        // for (int stone : stones) {
        //     maxHeap.offer(stone);
        // }
        // while (maxHeap.size() > 1) {
        //     int first = maxHeap.poll();
        //     int second = maxHeap.poll();
        //     if (first != second) {
        //         maxHeap.offer(first - second);
        //     }
        // }
        // return maxHeap.isEmpty() ? 0 : maxHeap.peek();
        throw new UnsupportedOperationException("Implement lastStoneWeight");
    }
    public static void main(String[] args) {
        LastStoneWeightJava s = new LastStoneWeightJava();
        assert s.lastStoneWeight(new int[] {2, 7, 4, 1, 8, 1}) == 1;
        System.out.println("All test cases passed!");
    }

}
