/*
 * 846. Hand of Straights
 * Difficulty: Medium
 * Pattern: Greedy / Sorting / Hash Map
 *
 * Problem:
 * Alice has some number of cards and wants to rearrange the cards into groups
 * so that each group is of size groupSize and consists of groupSize consecutive
 * cards.
 *
 * Given an integer array hand where hand[i] is the value written on the ith card
 * and an integer groupSize, return true if she can rearrange the cards as
 * described, or false otherwise.
 *
 * Example 1:
 * Input: hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
 * Output: true
 * Explanation: The cards can be rearranged as [1,2,3], [2,3,4], [6,7,8].
 *
 * Example 2:
 * Input: hand = [1,2,3,4,5], groupSize = 4
 * Output: false
 *
 * Constraints:
 * - 1 <= hand.length <= 10^4
 * - 0 <= hand[i] <= 10^9
 * - 1 <= groupSize <= hand.length
 */
import java.util.Map;
import java.util.TreeMap;

public class HandOfStraights {
    public boolean isNStraightHand(int[] hand, int groupSize) {
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //

    // if (hand.length % groupSize != 0) {
    //     return false;
    // }
    // TreeMap<Integer, Integer> count = new TreeMap<>();
    // for (int card : hand) {
    //     count.put(card, count.getOrDefault(card, 0) + 1);
    // }
    // while (!count.isEmpty()) {
    //     int start = count.firstKey();
    //     for (int card = start; card < start + groupSize; card++) {
    //         Integer current = count.get(card);
    //         if (current == null) {
    //             return false;
    //         }
    //         if (current == 1) {
    //             count.remove(card);
    //         } else {
    //             count.put(card, current - 1);
    //         }
    //     }
    // }
    // return true;
    }
    

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement isNStraightHand and add checks.");
    }
}
