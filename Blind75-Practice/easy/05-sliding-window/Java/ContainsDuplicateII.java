/*
219. Contains Duplicate II
Difficulty: Easy
Pattern: Sliding Window

Return true if same value appears twice with index distance at most k.

Approach: HashMap from value to last index; update while scanning.

Time: O(n), Space: O(min(n, k))
*/

public class ContainsDuplicateII {

    // [1 4 2 3 4 4 1 2 3 4] k = 3
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

        // Set<Integer> seen = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (!seen.add(nums[i])) return true;
        //     if (seen.size() > k) seen.remove(nums[i - k]);
        // }
        // return false;

    }

    public static void main(String[] args) {
        ContainsDuplicateII s = new ContainsDuplicateII();
        assert s.containsNearbyDuplicate(new int[] {1, 2, 3, 1}, 3);
        assert s.containsNearbyDuplicate(new int[] {1, 0, 1, 1}, 1);
        assert !s.containsNearbyDuplicate(new int[] {1, 2, 3, 1, 2, 3}, 2);
        System.out.println("All test cases passed!");
    }
}
