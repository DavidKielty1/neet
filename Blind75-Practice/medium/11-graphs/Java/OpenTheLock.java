/*
 * 752. Open the Lock
 * Difficulty: Medium
 * Pattern: Graphs / BFS
 *
 * Problem:
 * You have a lock in front of you with 4 circular wheels. Each wheel has 10
 * slots: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'. The wheels can
 * rotate freely and wrap around, meaning '9' can become '0' and '0' can
 * become '9'. Each move consists of turning exactly one wheel one slot.
 *
 * The lock starts at "0000", which is also the initial node in the state
 * graph. You are given a list of deadends; if the lock ever displays one of
 * those combinations, the lock becomes stuck and you can no longer turn it.
 * You are also given a target combination. Return the minimum number of moves
 * required to open the lock, or -1 if it is impossible.
 *
 * Example 1:
 * Input: deadends = ["0201","0101","0102","1212","2002"], target = "0202"
 * Output: 6
 * Explanation: One shortest path is
 * "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202".
 *
 * Example 2:
 * Input: deadends = ["8888"], target = "0009"
 * Output: 1
 *
 * Example 3:
 * Input: deadends = ["0000"], target = "8888"
 * Output: -1
 *
 * Constraints:
 * - 1 <= deadends.length <= 500
 * - deadends[i].length == 4
 * - target.length == 4
 * - target will not be in deadends
 * - target and deadends[i] consist of digits only
 *
 * Notes:
 * - Treat each 4-digit string as a graph node.
 * - Because every move has equal cost, BFS gives the shortest path length.
 */

public class OpenTheLock {
    public int openLock(String[] deadends, String target) {
        
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
    // Set<String> blocked = new HashSet<>(Arrays.asList(deadends));
    // if (blocked.contains("0000")) {
    //     return -1;
    // }
    //
    // Queue<String> queue = new ArrayDeque<>();
    // Set<String> visited = new HashSet<>();
    // queue.offer("0000");
    // visited.add("0000");
    //
    // int steps = 0;
    // while (!queue.isEmpty()) {
    //     int size = queue.size();
    //     for (int i = 0; i < size; i++) {
    //         String current = queue.poll();
    //         if (current.equals(target)) {
    //             return steps;
    //         }
    //
    //         char[] chars = current.toCharArray();
    //         for (int pos = 0; pos < 4; pos++) {
    //             char original = chars[pos];
    //
    //             chars[pos] = original == '9' ? '0' : (char) (original + 1);
    //             String up = new String(chars);
    //             if (!blocked.contains(up) && visited.add(up)) {
    //                 queue.offer(up);
    //             }
    //
    //             chars[pos] = original == '0' ? '9' : (char) (original - 1);
    //             String down = new String(chars);
    //             if (!blocked.contains(down) && visited.add(down)) {
    //                 queue.offer(down);
    //             }
    //
    //             chars[pos] = original;
    //         }
    //     }
    //     steps++;
    // }
    //
    // return -1;
    }
    

    public static void main(String[] args) {
        OpenTheLock solution = new OpenTheLock();
        assert solution.openLock(
                new String[] {"0201", "0101", "0102", "1212", "2002"},
                "0202") == 6;
        assert solution.openLock(new String[] {"8888"}, "0009") == 1;
        assert solution.openLock(new String[] {"0000"}, "8888") == -1;
        System.out.println("All test cases passed!");
    }
}
