/*
 * 787. Cheapest Flights Within K Stops
 * Difficulty: Medium
 * Pattern: Advanced Graphs / Bellman-Ford
 *
 * Problem:
 * There are n cities connected by some number of flights. You are given an
 * array flights where flights[i] = [fromi, toi, pricei] indicates that there is
 * a flight from city fromi to city toi with cost pricei.
 *
 * Given src, dst, and k, return the cheapest price from src to dst with at most
 * k stops. If there is no such route, return -1.
 *
 * Example 1:
 * Input: n = 4, flights = [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]],
 * src = 0, dst = 3, k = 1
 * Output: 700
 * Explanation: The route 0 -> 1 -> 3 has cost 700 and uses one stop.
 *
 * Example 2:
 * Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]],
 * src = 0, dst = 2, k = 1
 * Output: 200
 *
 * Constraints:
 * - 1 <= n <= 100
 * - 0 <= flights.length <= n * (n - 1) / 2
 * - flights[i].length == 3
 * - 0 <= fromi, toi < n
 * - fromi != toi
 * - 1 <= pricei <= 10^4
 * - 0 <= src, dst, k < n
 */
import java.util.Arrays;

public class CheapestFlightsWithinKStops {
    static class Solution {
        public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // int inf = 1_000_000_000;
            // int[] prices = new int[n];
            // Arrays.fill(prices, inf);
            // prices[src] = 0;
            // for (int stops = 0; stops <= k; stops++) {
            //     int[] next = prices.clone();
            //     for (int[] flight : flights) {
            //         int from = flight[0];
            //         int to = flight[1];
            //         int price = flight[2];
            //         if (prices[from] == inf) {
            //             continue;
            //         }
            //         next[to] = Math.min(next[to], prices[from] + price);
            //     }
            //     prices = next;
            // }
            // return prices[dst] == inf ? -1 : prices[dst];
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement findCheapestPrice and add checks.");
    }
}
