/*
 * 621. Task Scheduler
 * Difficulty: Medium
 * Pattern: Heap / Greedy
 *
 * Problem:
 * You are given an array of CPU tasks represented by capital letters `A` through
 * `Z`, where each letter represents a different task, and an integer `n`.
 * Each CPU interval can be idle or allow the completion of one task. Tasks can be
 * completed in any order, but there must be at least `n` intervals between two
 * executions of the same task.
 *
 * Return the least number of CPU intervals required to finish all tasks.
 *
 * Example 1:
 * Input: tasks = ['A','A','A','B','B','B'], n = 2
 * Output: 8
 * Explanation:
 * A possible schedule is A -> B -> idle -> A -> B -> idle -> A -> B.
 *
 * Example 2:
 * Input: tasks = ['A','C','A','B','D','B'], n = 1
 * Output: 6
 * Explanation:
 * One valid schedule is A -> B -> C -> D -> A -> B.
 *
 * Example 3:
 * Input: tasks = ['A','A','A','B','B','B'], n = 3
 * Output: 10
 * Explanation:
 * A possible schedule is A -> B -> idle -> idle -> A -> B -> idle -> idle
 * -> A -> B.
 * 
 * Constraints:
 * - 1 <= tasks.length <= 10^4
 * - tasks[i] is an uppercase English letter.
 * - 0 <= n <= 100
 *
 * Notes:
 * - The greedy counting formula is often simpler than simulating every interval.
 * - You can also solve it with a max-heap plus cooldown queue.
 */

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        
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

    // int[] counts = new int[26];
    // for (char task : tasks) {
    //     counts[task - 'A']++;
    // }
    //
    // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    // for (int count : counts) {
    //     if (count > 0) {
    //         maxHeap.offer(count);
    //     }
    // }
    //
    // Queue<int[]> cooldown = new ArrayDeque<>();
    // int time = 0;
    // while (!maxHeap.isEmpty() || !cooldown.isEmpty()) {
    //     time++;
    //     if (!maxHeap.isEmpty()) {
    //         int remaining = maxHeap.poll() - 1;
    //         if (remaining > 0) {
    //             cooldown.offer(new int[] {remaining, time + n});
    //         }
    //     }
    //     if (!cooldown.isEmpty() && cooldown.peek()[1] == time) {
    //         maxHeap.offer(cooldown.poll()[0]);
    //     }
    // }
    // return time;
    }
    

    public static void main(String[] args) {
        System.out.println("TaskScheduler practice stub ready.");
    }
}
