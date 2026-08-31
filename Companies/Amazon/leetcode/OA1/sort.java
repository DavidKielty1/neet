import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * Amazon OA — Unfulfilled Customers by Inventory Priority
 * Approach: TreeMap by bid (desc), sort each tier by timestamp, round-robin.
 *
 * Each request: [customerId, bidAmount, quantity, timestamp]
 * Return how many customers received 0 units.
 *
 * Time:  O(n log n) grouping/sort + O(n) allocation with round skipping
 * Space: O(n)
 */

public class sort {

    public int countUnfulfilled(int inventoryTotal, List<List<Integer>> requests) {
        Map<Integer, List<Request>> byBid =
                new TreeMap<>(Comparator.reverseOrder());
        List<Request> all = new ArrayList<>();

        for (List<Integer> row : requests) {
            Request r =
                    new Request(
                            row.get(0), row.get(1), row.get(2), row.get(3));
            all.add(r);
            byBid.computeIfAbsent(r.bid, k -> new ArrayList<>()).add(r);
        }

        long stock = inventoryTotal;
        for (List<Request> group : byBid.values()) {
            if (stock == 0) {
                break;
            }
            group.sort(Comparator.comparingInt(a -> a.timestamp));
            allocateRoundRobin(group, stock);
            stock = remainingStock(group, stock);
        }

        int none = 0;
        for (Request r : all) {
            if (r.got == 0) {
                none++;
            }
        }
        return none;
    }

    /** One unit per still-hungry customer, in timestamp order, jumping whole rounds. */
    private void allocateRoundRobin(List<Request> group, long stock) {
        Deque<Request> q = new ArrayDeque<>();
        for (Request r : group) {
            if (r.remaining > 0) {
                q.offer(r);
            }
        }

        while (stock > 0 && !q.isEmpty()) {
            int m = q.size();
            if (stock < m) {
                for (int i = 0; i < stock; i++) {
                    Request r = q.poll();
                    r.got++;
                    r.remaining--;
                }
                return;
            }

            int minNeed = Integer.MAX_VALUE;
            for (Request r : q) {
                minNeed = Math.min(minNeed, r.remaining);
            }
            int rounds = (int) Math.min(minNeed, stock / m);
            for (Request r : q) {
                r.got += rounds;
                r.remaining -= rounds;
            }
            stock -= (long) rounds * m;

            int n = q.size();
            for (int i = 0; i < n; i++) {
                Request r = q.poll();
                if (r.remaining > 0) {
                    q.offer(r);
                }
            }
        }
    }

    private long remainingStock(List<Request> group, long stockBefore) {
        long given = 0;
        for (Request r : group) {
            given += r.got;
        }
        return stockBefore - given;
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

    public static void main(String[] args) {
        sort solution = new sort();

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
