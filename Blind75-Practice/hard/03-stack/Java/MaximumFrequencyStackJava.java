/*
 * 895. Maximum Frequency Stack
 * Difficulty: Hard
 * Pattern: Stack and hash map
 *
 * Problem:
 * Design a stack-like data structure to push elements to the stack and pop the
 * most frequent element from the stack.
 *
 * Implement the FreqStack class:
 * - FreqStack() constructs an empty frequency stack.
 * - void push(int val) pushes an integer val onto the top of the stack.
 * - int pop() removes and returns the most frequent element in the stack.
 *
 * If there is a tie for the most frequent element, the element closest to the
 * stack's top is removed and returned.
 *
 * Example 1:
 * Input:
 * ["FreqStack","push","push","push","push","push","push","pop","pop","pop","pop"]
 * [[],[5],[7],[5],[7],[4],[5],[],[],[],[]]
 * Output: [null,null,null,null,null,null,null,5,7,5,4]
 *
 * Explanation:
 * 5 appears three times, so the first pop returns 5. Then 5 and 7 both appear
 * twice, and 7 is closer to the top, so the second pop returns 7.
 *
 * Constraints:
 * - 0 <= val <= 10^9
 * - At most 2 * 10^4 calls will be made to push and pop
 * - It is guaranteed that there will be at least one element in the stack before pop is called
 */
public class MaximumFrequencyStackJava {
    static class FreqStack {
        public FreqStack() {
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // Map<Integer, Integer> frequency = new HashMap<>();
            // Map<Integer, Deque<Integer>> groups = new HashMap<>();
            // int maxFrequency = 0;
            throw new UnsupportedOperationException("Implement FreqStack");
        }

        public void push(int val) {
            // int nextFrequency = frequency.getOrDefault(val, 0) + 1;
            // frequency.put(val, nextFrequency);
            // maxFrequency = Math.max(maxFrequency, nextFrequency);
            // groups.computeIfAbsent(nextFrequency, key -> new ArrayDeque<>()).push(val);
            throw new UnsupportedOperationException("Implement push");
        }

        public int pop() {
            // int value = groups.get(maxFrequency).pop();
            // frequency.put(value, frequency.get(value) - 1);
            // if (groups.get(maxFrequency).isEmpty()) {
            //     maxFrequency--;
            // }
            // return value;
            throw new UnsupportedOperationException("Implement pop");
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement FreqStack and add checks.");
    }
}
