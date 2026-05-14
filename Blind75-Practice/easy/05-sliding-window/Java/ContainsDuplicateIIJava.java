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

    // [1 4 2 3 4 4 1 2 3 4] k = 3
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            count.merge(nums[r], 1, Integer::sum);

            int window = r - l + 1;
            if (window > k) {
                count.put(nums[r], count.get(nums[r]) - 1);
                l++;
            }

            if (count.get(nums[r]) > 1) return true;
        }

        return false;

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // Set<Integer> seen = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (!seen.add(nums[i])) return true;
        //     if (seen.size() > k) seen.remove(nums[i - k]);
        // }
        // return false;

    }

    public static void main(String[] args) {
        ContainsDuplicateIIJava s = new ContainsDuplicateIIJava();
        assert s.containsNearbyDuplicate(new int[] {1, 2, 3, 1}, 3);
        assert s.containsNearbyDuplicate(new int[] {1, 0, 1, 1}, 1);
        assert !s.containsNearbyDuplicate(new int[] {1, 2, 3, 1, 2, 3}, 2);
        System.out.println("All test cases passed!");
    }
}
