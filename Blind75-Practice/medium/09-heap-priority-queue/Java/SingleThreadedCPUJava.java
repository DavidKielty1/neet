/*
 * 1834. Single-Threaded CPU
 * Difficulty: Medium
 * Pattern: Heap / Sorting
 *
 * Problem:
 * You are given `n` tasks labeled from `0` to `n - 1`, represented by a 2D
 * integer array `tasks`, where `tasks[i] = [enqueueTimei, processingTimei]`
 * means that the `i`th task will be available to process at `enqueueTimei` and
 * will take `processingTimei` to finish.
 *
 * You have a single-threaded CPU that can process at most one task at a time and
 * acts as follows:
 * - If the CPU is idle and there are no available tasks, the CPU remains idle.
 * - If the CPU is idle and there are available tasks, the CPU chooses the one
 *   with the shortest processing time. If multiple tasks have the same
 *   processing time, it chooses the task with the smallest original index.
 * - Once a task starts, the CPU processes it without stopping.
 * - The CPU can finish a task and immediately start a new one.
 *
 * Return the order in which the CPU will process the tasks.
 *
 * Example 1:
 * Input: tasks = [[1,2],[2,4],[3,2],[4,1]]
 * Output: [0,2,3,1]
 * Explanation:
 * At time 1 task 0 starts. By the time it finishes, tasks 1 and 2 are available.
 * The CPU picks task 2 before task 1 because it has smaller processing time.
 *
 * Example 2:
 * Input: tasks = [[7,10],[7,12],[7,5],[7,4],[7,2]]
 * Output: [4,3,2,0,1]
 *
 * Constraints:
 * - tasks.length == n
 * - 1 <= n <= 10^5
 * - 1 <= enqueueTimei, processingTimei <= 10^9
 *
 * Notes:
 * - Sort tasks by enqueue time, then push available work into a min-heap keyed by
 *   processing time and index.
 * - Use `long` for the running clock because total time can exceed `int`.
 */
public class SingleThreadedCPUJava {
    static class Solution {
        public int[] getOrder(int[][] tasks) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // int n = tasks.length;
            // int[][] indexed = new int[n][3];
            // for (int i = 0; i < n; i++) {
            //     indexed[i] = new int[] {tasks[i][0], tasks[i][1], i};
            // }
            // java.util.Arrays.sort(indexed, java.util.Comparator.comparingInt(a -> a[0]));
            //
            // java.util.PriorityQueue<int[]> minHeap = new java.util.PriorityQueue<>(
            //         (a, b) -> a[1] == b[1]
            //                 ? Integer.compare(a[2], b[2])
            //                 : Integer.compare(a[1], b[1]));
            //
            // int[] order = new int[n];
            // int orderIndex = 0;
            // int taskIndex = 0;
            // long time = 0;
            //
            // while (taskIndex < n || !minHeap.isEmpty()) {
            //     if (minHeap.isEmpty() && time < indexed[taskIndex][0]) {
            //         time = indexed[taskIndex][0];
            //     }
            //     while (taskIndex < n && indexed[taskIndex][0] <= time) {
            //         minHeap.offer(indexed[taskIndex++]);
            //     }
            //     int[] current = minHeap.poll();
            //     order[orderIndex++] = current[2];
            //     time += current[1];
            // }
            // return order;
        }
    }

    public static void main(String[] args) {
        System.out.println("SingleThreadedCPUJava practice stub ready.");
    }
}
