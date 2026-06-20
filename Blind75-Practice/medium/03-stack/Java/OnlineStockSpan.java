/*
 * 901. Online Stock Span
 * Difficulty: Medium
 * Pattern: Monotonic Stack / Design
 *
 * Problem:
 * Design an algorithm that collects daily price quotes for some stock and returns the
 * span of that stock's price for the current day.
 *
 * The span of the stock's price today is the maximum number of consecutive days
 * starting from today and going backward for which the price was less than or equal to
 * today's price.
 *
 * Implement the `StockSpanner` class:
 * - `StockSpanner()` initializes the object
 * - `int next(int price)` returns the span of the given price
 *
 * Example 1:
 * Input:
 * ["StockSpanner","next","next","next","next","next","next","next"]
 * [[],[100],[80],[60],[70],[60],[75],[85]]
 * Output:
 * [null,1,1,1,2,1,4,6]
 *
 * Constraints:
 * - 1 <= price <= 10^5
 * - At most 10^4 calls will be made to next
 *
 * Notes:
 * - Keep a decreasing stack of pairs: [price, span].
 * - Merge previous spans while the previous price is <= current price.
 */

import java.util.ArrayDeque;
import java.util.Deque;

class StockSpanner {
    public StockSpanner() {
        
    }

    Deque<int[]> stockSpans = new ArrayDeque<>(); 

    public int next(int price) {
        int span = 1;
        while (!stockSpans.isEmpty() && stockSpans.peek()[0] <= price) {
            span += stockSpans.poll()[1];
        } 
        stockSpans.push(new int[] {price, span});

        return span;
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
            // private final Deque<int[]> stack = new ArrayDeque<>();
            //
            // public int next(int price) {
            //     int span = 1;
            //     while (!stack.isEmpty() && stack.peek()[0] <= price) {
            //         span += stack.pop()[1];
            //     }
            //     stack.push(new int[] {price, span});
            //     return span;
            // }
        }
    }

    public static void main(String[] args) {
        StockSpanner spanner = new StockSpanner();
        assert spanner.next(100) == 1;
        assert spanner.next(80) == 1;
        assert spanner.next(60) == 1;
        assert spanner.next(70) == 2;
        assert spanner.next(60) == 1;
        assert spanner.next(75) == 4;
        assert spanner.next(85) == 6;
        System.out.println("All test cases passed!");
    }
}
