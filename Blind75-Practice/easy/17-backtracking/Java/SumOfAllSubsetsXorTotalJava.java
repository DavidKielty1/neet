/*
1863. Sum of All Subsets XOR Total
Difficulty: Easy
Pattern: Backtracking

For each subset, XOR its elements (empty subset XOR = 0). Return sum of all subset XORs.

Time: O(2^n), Space: O(n) recursion depth
*/
public class SumOfAllSubsetsXorTotalJava {

    public int subsetXORSum(int[] nums) {
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

        // return dfs(nums, 0, 0);

        throw new UnsupportedOperationException("Implement subsetXORSum");
    }

    // Outline: at index i, add branches with xor including nums[i] and skipping it
    private int dfs(int[] nums, int i, int curXor) {
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

        // if (i == nums.length) {
            // return curXor;
        // }
        // return dfs(nums, i + 1, curXor ^ nums[i]) + dfs(nums, i + 1, curXor);

        throw new UnsupportedOperationException("Implement dfs");
    }

    public static void main(String[] args) {
        SumOfAllSubsetsXorTotalJava sol = new SumOfAllSubsetsXorTotalJava();
        assert sol.subsetXORSum(new int[] {1, 3}) == 6;
        assert sol.subsetXORSum(new int[] {5, 1, 6}) == 28;
        assert sol.subsetXORSum(new int[] {3}) == 3;
        System.out.println("All tests passed.");
    }
}
