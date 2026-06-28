/*
 * 973. K Closest Points to Origin
 * Difficulty: Medium
 * Pattern: Heap / Quickselect
 *
 * Problem:
 * Given an array of points where `points[i] = [xi, yi]` represents a point on the
 * X-Y plane and an integer `k`, return the `k` closest points to the origin
 * `(0, 0)`.
 *
 * The distance between two points on the X-Y plane is the Euclidean distance:
 * `sqrt((x1 - x2)^2 + (y1 - y2)^2)`.
 *
 * You may return the answer in any order. The answer is guaranteed to be unique
 * except for ordering.
 *
 * Example 1:
 * Input: points = [[1,3],[-2,2]], k = 1
 * Output: [[-2,2]]
 * Explanation:
 * The squared distances are 10 and 8, so `[-2,2]` is closer.
 *
 * Example 2:
 * Input: points = [[3,3],[5,-1],[-2,4]], k = 2
 * Output: [[3,3],[-2,4]]
 * Explanation:
 * Squared distances are 18, 26, and 20, so the closest two are `[3,3]` and
 * `[-2,4]`.
 *
 * Constraints:
 * - 1 <= k <= points.length <= 10^4
 * - -10^4 <= xi, yi <= 10^4
 *
 * Notes:
 * - Compare squared distances so you never need `sqrt`.
 * - A max-heap of size `k` is the most direct heap-based approach.
 */

public class KClosestPointsToOrigin {
    static class Solution {
        public int[][] kClosest(int[][] points, int k) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

        //     PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) 
        //                     -> Integer.compare(distanceSquared(b), distanceSquared(a)));

        //     for (int[] point : points) {
        //         maxHeap.offer(point);
        //         if (maxHeap.size() > k) {
        //             maxHeap.poll();
        //         }
        //     }
            
        //     int[][] answer = new int[k][2];
        //     for (int i = 0; i < k; i++) {
        //         answer[i] = maxHeap.poll();
        //     }
        //     return answer;
        // }

        // private int distanceSquared(int[] point) {
        //     return point[0] * point[0] + point[1] * point[1];
        // }
    }

    public static void main(String[] args) {
        System.out.println("KClosestPointsToOrigin practice stub ready.");
    }
}
