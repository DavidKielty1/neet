import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;

/*
 * Amazon OA — Unfulfilled Customers by Inventory Priority
 * Approach: max-heap (bid desc, timestamp asc), poll one bid tier into a
 * queue, round-robin (1 unit, still hungry → back of queue).
 *
 * Each request: [customerId, bidAmount, quantity, timestamp]
 * Return how many customers received 0 units.
 *
 * Do not poll one customer and dump their whole quantity — that skips
 * same-bid round-robin.
 *
 * Time:  O(n log n) heap + O(inventory) naive round-robin
 * Space: O(n)
 */

public class maxHeap {
    public int countUnfulfilled(int inventoryTotal, List<List<Integer>> requests) {
        PriorityQueue<Request> maxHeap =
                new PriorityQueue<>(
                        (a, b) ->
                                a.bid != b.bid
                                        ? Integer.compare(b.bid, a.bid)
                                        : Integer.compare(a.timestamp, b.timestamp));

        for (List<Integer> row : requests) {
            maxHeap.offer(
                    new Request(
                            row.get(0), row.get(1), row.get(2), row.get(3)));
        }

        int gotNothing = requests.size();
        Deque<Request> q = new ArrayDeque<>();
        
        while (inventoryTotal > 0 && !maxHeap.isEmpty()) {
            int bidLevel = maxHeap.peek().bid;
            while (!maxHeap.isEmpty() && maxHeap.peek().bid == bidLevel) {
                q.offer(maxHeap.poll());
            }

            while (inventoryTotal > 0 && !q.isEmpty()) {
                Request r = q.poll();
                r.got++;
                r.remaining--;
                inventoryTotal--;
                if (r.got == 1) {
                    gotNothing--;
                }
                if (r.remaining > 0) {
                    q.offer(r);
                }
            }
        }
        return gotNothing;
    }

    static final class Request {
        final int id;
        final int bid;
        final int timestamp;
        int remaining;
        int got;

        Request(int id, int bid, int quantity, int timestamp) {
            this.id = id;
            this.bid = bid;
            this.timestamp = timestamp;
            this.remaining = quantity;
        }
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

    

    public static void main(String[] args) {
        maxHeap solution = new maxHeap();

        List<List<Integer>> ex1 =
                Arrays.asList(
                        Arrays.asList(1, 5, 5, 0),
                        Arrays.asList(2, 8, 7, 1),
                        Arrays.asList(3, 5, 7, 1),
                        Arrays.asList(4, 3, 10, 3));
        assert solution.countUnfulfilled(18, ex1) == 1;

        List<List<Integer>> ex2 =
                Arrays.asList(
                        Arrays.asList(1, 10, 3, 1),
                        Arrays.asList(2, 10, 3, 2),
                        Arrays.asList(3, 5, 1, 3));
        assert solution.countUnfulfilled(3, ex2) == 1;

        List<List<Integer>> alreadySorted =
                Arrays.asList(
                        Arrays.asList(1, 10, 2, 0), Arrays.asList(2, 5, 2, 1));
        assert solution.countUnfulfilled(10, alreadySorted) == 0;

        assert solution.countUnfulfilled(0, ex1) == 4;

        System.out.println("All test cases passed!");
    }
}
