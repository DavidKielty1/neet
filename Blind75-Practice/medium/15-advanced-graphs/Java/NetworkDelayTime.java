/*
 * 743. Network Delay Time
 * Difficulty: Medium
 * Pattern: Advanced Graphs / Dijkstra
 *
 * Problem:
 * You are given a network of n nodes, labeled from 1 to n. You are also given
 * times, a list of directed travel times where times[i] = [ui, vi, wi] means
 * signal travel time from node ui to node vi is wi.
 *
 * We will send a signal from a given node k. Return the minimum time it takes
 * for all n nodes to receive the signal. If it is impossible for all n nodes to
 * receive the signal, return -1.
 *
 * Example 1:
 * Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
 * Output: 2
 *
 * Example 2:
 * Input: times = [[1,2,1]], n = 2, k = 1
 * Output: 1
 *
 * Example 3:
 * Input: times = [[1,2,1]], n = 2, k = 2
 * Output: -1
 *
 * Constraints:
 * - 1 <= k <= n <= 100
 * - 1 <= times.length <= 6000
 * - times[i].length == 3
 * - 1 <= ui, vi <= n
 * - ui != vi
 * - 0 <= wi <= 100
 */
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkDelayTime {
    public int networkDelayTime(int[][] times, int n, int k) {
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //

    // List<int[]>[] graph = new ArrayList[n + 1];
    // for (int i = 1; i <= n; i++) {
    //     graph[i] = new ArrayList<>();
    // }
    // for (int[] time : times) {
    //     graph[time[0]].add(new int[] {time[1], time[2]});
    // }
    // PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
    // minHeap.offer(new int[] {k, 0});
    // boolean[] visited = new boolean[n + 1];
    // int maxTime = 0;
    // int seen = 0;
    // while (!minHeap.isEmpty()) {
    //     int[] current = minHeap.poll();
    //     int node = current[0];
    //     int time = current[1];
    //     if (visited[node]) {
    //         continue;
    //     }
    //     visited[node] = true;
    //     seen++;
    //     maxTime = time;
    //     for (int[] edge : graph[node]) {
    //         if (!visited[edge[0]]) {
    //             minHeap.offer(new int[] {edge[0], time + edge[1]});
    //         }
    //     }
    // }
    // return seen == n ? maxTime : -1;
    }
    

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement networkDelayTime and add checks.");
    }
}
