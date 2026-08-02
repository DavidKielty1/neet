/*
*1046. Last Stone Weight
* Difficulty: Easy
* Pattern: Heap
* 
* Problem:
* You are given an array `stones` where each value is a stone's weight.
* On each turn, choose the two heaviest stones and smash them together:
* - If the stones have equal weight, both are destroyed.
* - If the stones have different weights `x` and `y` with `x <= y`,
*   the stone of weight `x` is destroyed and the stone of weight `y`
*   becomes `y - x`.
* 
* Return the weight of the last remaining stone. If no stones remain, return 0.
* 
* Example 1:
* Input:  stones = [2, 7, 4, 1, 8, 1]
* Output: 1
* Explanation:
* - Smash 8 and 7 -> 1, remaining [2, 4, 1, 1, 1]
* - Smash 4 and 2 -> 2, remaining [2, 1, 1, 1]
* - Smash 2 and 1 -> 1, remaining [1, 1, 1]
* - Smash 1 and 1 -> 0, remaining [1]
* So the last remaining stone has weight 1.
* 
* Example 2:
* Input:  stones = [1]
* Output: 1
* Explanation:
* There is only one stone, so it is already the answer.
* 
* Constraints:
* - 1 <= stones.length <= 30
* - 1 <= stones[i] <= 1000
* 
* Why a heap works:
* We repeatedly need the two heaviest stones, so a max-heap lets us remove
* the largest two values efficiently after every smash.
* 
* Time: O(n log n)
* Space: O(n)
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
