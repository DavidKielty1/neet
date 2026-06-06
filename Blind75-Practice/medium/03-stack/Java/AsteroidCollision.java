/*
 * 735. Asteroid Collision
 * Difficulty: Medium
 * Pattern: Stack
 *
 * Problem:
 * We are given an array `asteroids` of integers representing asteroids in a row.
 *
 * For each asteroid, the absolute value represents its size, and the sign represents
 * its direction:
 * - positive means moving right
 * - negative means moving left
 *
 * Each asteroid moves at the same speed.
 *
 * When two asteroids meet, the smaller one explodes. If both are the same size, both
 * explode. Asteroids moving in the same direction never meet.
 *
 * Return the state of the asteroids after all collisions.
 *
 * Example 1:
 * Input: asteroids = [5,10,-5]
 * Output: [5,10]
 *
 * Example 2:
 * Input: asteroids = [8,-8]
 * Output: []
 *
 * Example 3:
 * Input: asteroids = [10,2,-5]
 * Output: [10]
 *
 * Example 1:
 * Input: asteroids = [5,10,-5, -10]
 * Output: [5,10]
 *
 * Constraints:
 * - 2 <= asteroids.length <= 10^4
 * - -1000 <= asteroids[i] <= 1000
 * - asteroids[i] != 0
 *
 * Notes:
 * - A collision is only possible when the stack top is moving right and the current
 *   asteroid is moving left.
 * - Resolve collisions in a loop until the current asteroid is destroyed or survives.
 */

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class AsteroidCollision {
    static class Solution {
        public int[] asteroidCollision(int[] asteroids) {
            Deque<Integer> stack = new ArrayDeque<>();

            for (int asteroid : asteroids) {
                if (asteroid < 0) {
                    while (stack.peek() + asteroid < 0) {
                        stack.pop();
                    }

                    if (stack.peek() + asteroid == 0 ){
                        stack.pop();
                        continue;
                    } else {
                        stack.add(asteroid);
                    }
                } else {
                    stack.offerLast(asteroid);
                }
            }

            int[] result = new int[stack.size()];
            for (int value : stack) {
                result[i++] = value;
            }
            return result;
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // Deque<Integer> stack = new ArrayDeque<>();
            // for (int asteroid : asteroids) {
            //     boolean destroyed = false;
            //     while (!stack.isEmpty() && stack.peekLast() > 0 && asteroid < 0) {
            //         int top = stack.peekLast();
            //         if (top < -asteroid) {
            //             stack.pollLast();
            //             continue;
            //         }
            //         if (top == -asteroid) {
            //             stack.pollLast();
            //         }
            //         destroyed = true;
            //         break;
            //     }
            //     if (!destroyed) {
            //         stack.offerLast(asteroid);
            //     }
            // }
            // int[] result = new int[stack.size()];
            // int i = 0;
            // for (int value : stack) {
            //     result[i++] = value;
            // }
            // return result;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert Arrays.equals(sol.asteroidCollision(new int[] {5, 10, -5}), new int[] {5, 10});
        assert Arrays.equals(sol.asteroidCollision(new int[] {8, -8}), new int[] {});
        assert Arrays.equals(sol.asteroidCollision(new int[] {10, 2, -5}), new int[] {10});
        System.out.println("All test cases passed!");
    }
}
