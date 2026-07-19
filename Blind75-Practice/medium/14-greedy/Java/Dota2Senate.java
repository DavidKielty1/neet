/*
 * 649. Dota2 Senate
 * Difficulty: Medium
 * Pattern: Greedy / Queue
 *
 * Problem:
 * In the world of Dota2, there are two parties: Radiant and Dire. The senate
 * consists of senators from both parties. The voting procedure proceeds in
 * rounds. In each round, every senator who still has rights can either ban one
 * senator from the other party or announce victory if all remaining senators
 * with voting rights are from their own party.
 *
 * Given a string senate, where 'R' represents Radiant and 'D' represents Dire,
 * predict which party will finally announce victory.
 *
 * Example 1:
 * Input: senate = "RD"
 * Output: "Radiant"
 * Explanation: R bans D, so Radiant wins.
 *
 * Example 2:
 * Input: senate = "RDD"
 * Output: "Dire"
 * Explanation: R bans one D, then the remaining D bans R.
 *
 * Constraints:
 * - 1 <= senate.length <= 10^4
 * - senate[i] is either 'R' or 'D'
 */
import java.util.ArrayDeque;
import java.util.Queue;

public class Dota2Senate {
    public String predictPartyVictory(String senate) {
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //

    // int n = senate.length();
    // Queue<Integer> radiant = new ArrayDeque<>();
    // Queue<Integer> dire = new ArrayDeque<>();
    // for (int i = 0; i < n; i++) {
    //     if (senate.charAt(i) == 'R') {
    //         radiant.offer(i);
    //     } else {
    //         dire.offer(i);
    //     }
    // }
    // while (!radiant.isEmpty() && !dire.isEmpty()) {
    //     int r = radiant.poll();
    //     int d = dire.poll();
    //     if (r < d) {
    //         radiant.offer(r + n);
    //     } else {
    //         dire.offer(d + n);
    //     }
    // }
    // return radiant.isEmpty() ? "Dire" : "Radiant";
    }
    

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement predictPartyVictory and add checks.");
    }
}
