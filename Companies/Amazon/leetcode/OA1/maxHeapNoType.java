import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;

/*
 * Same as maxHeap.java, but each request is an int[] instead of a class:
 *   [0] customerId
 *   [1] bidAmount
 *   [2] remaining quantity (mutated)
 *   [3] timestamp
 *   [4] units received so far
 */

public class maxHeapNoType {
    public int countUnfulfilled(int inventoryTotal, List<List<Integer>> requests) {
        PriorityQueue<int[]> maxHeap =
                new PriorityQueue<>(
                        (a, b) ->
                                a[1] != b[1]
                                        ? Integer.compare(b[1], a[1])
                                        : Integer.compare(a[3], b[3]));

        for (List<Integer> row : requests) {
            maxHeap.offer(
                    new int[] {
                        row.get(0), row.get(1), row.get(2), row.get(3), 0
                    });
        }

        int gotNothing = requests.size();
        Deque<int[]> queue = new ArrayDeque<>();

        while (inventoryTotal > 0 && !maxHeap.isEmpty()) {
            int bidLevel = maxHeap.peek()[1];
            while (!maxHeap.isEmpty() && maxHeap.peek()[1] == bidLevel) {
                queue.offer(maxHeap.poll());
            }

            while (inventoryTotal > 0 && !queue.isEmpty()) {
                int[] r = queue.poll();
                r[4]++;
                r[2]--;
                inventoryTotal--;
                if (r[4] == 1) {
                    gotNothing--;
                }
                if (r[2] > 0) {
                    queue.offer(r);
                }
            }
        }
        return gotNothing;
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


    public static void main(String[] args) {
        maxHeapNoType solution = new maxHeapNoType();

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
