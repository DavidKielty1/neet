/*
 * 1094. Car Pooling
 * Difficulty: Medium
 * Pattern: Heap / Sweep Line
 *
 * Problem:
 * There is a car with `capacity` empty seats. The vehicle only drives east, so it
 * never turns around.
 *
 * You are given an array `trips` where `trips[i] = [numPassengersi, fromi, toi]`
 * indicates that the `i`th trip has `numPassengersi` passengers and the locations
 * to pick them up and drop them off are `fromi` and `toi` respectively. The
 * locations are given as kilometers due east from the car's starting point.
 *
 * Return `true` if it is possible to pick up and drop off all passengers for all
 * the given trips, or `false` otherwise.
 *
 * Example 1:
 * Input: trips = [[2,1,3],[3,3,7]], capacity = 4
 * Output: false
 * Explanation:
 * At location 3 the car would need to carry 5 passengers at once.
 *
 * Example 2:
 * Input: trips = [[2,1,5],[3,3,7]], capacity = 5
 * Output: true
 *
 * Example 3:
 * Input: trips = [[3,2,7],[3,7,9],[8,3,9]], capacity = 11
 * Output: true
 *
 * Constraints:
 * - 1 <= trips.length <= 1000
 * - trips[i].length == 3
 * - 1 <= numPassengersi <= 100
 * - 0 <= fromi < toi <= 1000
 * - 1 <= capacity <= 10^5
 *
 * Notes:
 * - Sort trips by pickup point and release finished trips with a min-heap keyed by
 *   drop-off point.
 * - A difference-array sweep line is another clean solution here.
 */

public class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //

    // Arrays.sort(trips, Comparator.comparingInt(a -> a[1]));
    // PriorityQueue<int[]> minHeap = new PriorityQueue<>(
    //         Comparator.comparingInt(a -> a[2]));
    // int passengers = 0;
    //
    // for (int[] trip : trips) {
    //     while (!minHeap.isEmpty() && minHeap.peek()[2] <= trip[1]) {
    //         passengers -= minHeap.poll()[0];
    //     }
    //
    //     passengers += trip[0];
    //     if (passengers > capacity) {
    //         return false;
    //     }
    //     minHeap.offer(trip);
    // }
    // return true;
    }
    

    public static void main(String[] args) {
        System.out.println("CarPooling practice stub ready.");
    }
}
