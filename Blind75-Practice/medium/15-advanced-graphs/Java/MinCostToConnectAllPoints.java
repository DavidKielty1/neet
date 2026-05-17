/*
 * 1584. Min Cost to Connect All Points
 * Difficulty: Medium
 * Pattern: Advanced Graphs / Minimum Spanning Tree
 *
 * Problem:
 * You are given an array points representing integer coordinates of some points
 * on a 2D-plane, where points[i] = [xi, yi].
 *
 * The cost of connecting two points [xi, yi] and [xj, yj] is the Manhattan
 * distance between them: |xi - xj| + |yi - yj|. Return the minimum cost to make
 * all points connected. All points are connected if there is exactly one simple
 * path between any two points.
 *
 * Example 1:
 * Input: points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
 * Output: 20
 *
 * Example 2:
 * Input: points = [[3,12],[-2,5],[-4,1]]
 * Output: 18
 *
 * Constraints:
 * - 1 <= points.length <= 1000
 * - -10^6 <= xi, yi <= 10^6
 * - All pairs (xi, yi) are distinct.
 */
import java.util.PriorityQueue;

public class MinCostToConnectAllPoints {
    static class Solution {
        public int minCostConnectPoints(int[][] points) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // int n = points.length;
            // boolean[] visited = new boolean[n];
            // PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
            // minHeap.offer(new int[] {0, 0});
            // int total = 0;
            // int used = 0;
            // while (used < n) {
            //     int[] current = minHeap.poll();
            //     int cost = current[0];
            //     int index = current[1];
            //     if (visited[index]) {
            //         continue;
            //     }
            //     visited[index] = true;
            //     total += cost;
            //     used++;
            //     for (int next = 0; next < n; next++) {
            //         if (!visited[next]) {
            //             int distance = Math.abs(points[index][0] - points[next][0])
            //                     + Math.abs(points[index][1] - points[next][1]);
            //             minHeap.offer(new int[] {distance, next});
            //         }
            //     }
            // }
            // return total;
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement minCostConnectPoints and add checks.");
    }
}
