/*
219. Contains Duplicate II
Difficulty: Easy
Pattern: Sliding Window

Return true if same value appears twice with index distance at most k.

Approach: HashMap from value to last index; update while scanning.

Time: O(n), Space: O(min(n, k))
*/

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateIIJava {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // Map<Integer, Integer> last = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        // int x = nums[i];
        // if (last.containsKey(x) && i - last.get(x) <= k) {
        // return true;
        // }
        // last.put(x, i);
        // }
        // return false;

        throw new UnsupportedOperationException("Implement containsNearbyDuplicate");
    }

    public static void main(String[] args) {
        ContainsDuplicateIIJava s = new ContainsDuplicateIIJava();
        assert s.containsNearbyDuplicate(new int[] {1, 2, 3, 1}, 3);
        assert s.containsNearbyDuplicate(new int[] {1, 0, 1, 1}, 1);
        assert !s.containsNearbyDuplicate(new int[] {1, 2, 3, 1, 2, 3}, 2);
        System.out.println("All test cases passed!");
    }
}
