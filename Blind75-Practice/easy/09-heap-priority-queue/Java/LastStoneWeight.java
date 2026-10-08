/*
 * 1046. Last Stone Weight
 * Difficulty: Easy
 * Pattern: Heap
 *
 * Problem:
 * You are given an array stones where stones[i] is the weight of the ith stone.
 * On each turn, choose the two heaviest stones and smash them together. Suppose
 * the heaviest two stones have weights x and y with x <= y. If x == y, both
 * stones are destroyed. If x != y, the stone of weight x is destroyed and the
 * stone of weight y becomes y - x. At the end of the game, there is at most one
 * stone left. Return the weight of the last remaining stone. If there are no
 * stones left, return 0.
 *
 * Example 1:
 * Input: stones = [2,7,4,1,8,1]
 * Output: 1
 *
 * Example 2:
 * Input: stones = [1]
 * Output: 1
 *
 * Constraints:
 * - 1 <= stones.length <= 30
 * - 1 <= stones[i] <= 1000
 */

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

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

        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(reverseOrder());
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
    }
    public static void main(String[] args) {
        LastStoneWeight s = new LastStoneWeight();
        assert s.lastStoneWeight(new int[] {2, 7, 4, 1, 8, 1}) == 1;
        System.out.println("All test cases passed!");
    }

}
