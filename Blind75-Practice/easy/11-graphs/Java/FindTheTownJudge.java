/*
 * 997. Find the Town Judge
 * Difficulty: Easy
 * Pattern: Graphs (in/out degree)
 *
 * Problem:
 * In a town of n people labeled from 1 to n, there is a rumor that one of
 * these people is secretly the town judge. If the town judge exists, then:
 * the town judge trusts nobody; everybody (except the town judge) trusts the
 * town judge; and there is exactly one person that satisfies these conditions.
 * You are given an array trust where trust[i] = [ai, bi] representing that
 * the person labeled ai trusts the person labeled bi. Return the label of
 * the town judge if the town judge exists and can be identified, or return
 * -1 otherwise.
 *
 * Example 1:
 * Input: n = 2, trust = [[1,2]]
 * Output: 2
 *
 * Example 2:
 * Input: n = 3, trust = [[1,3],[2,3]]
 * Output: 3
 *
 * Example 3:
 * Input: n = 3, trust = [[1,3],[2,3],[3,1]]
 * Output: -1
 *
 * Constraints:
 * - 1 <= n <= 1000
 * - 0 <= trust.length <= 10^4
 * - trust[i].length == 2
 * - All the pairs of trust are unique
 * - ai != bi
 * - 1 <= ai, bi <= n
 */

public class FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        
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

        // int[] inDegree = new int[n + 1];
        // int[] outDegree = new int[n + 1];
        // for (int[] edge : trust) {
        //     int a = edge[0];
        //     int b = edge[1];
        //     outDegree[a]++;
        //     inDegree[b]++;
        // }
        // for (int person = 1; person <= n; person++) {
        //     if (inDegree[person] == n - 1 && outDegree[person] == 0) {
        //         return person;
        //     }
        // }
        // return -1;
        throw new UnsupportedOperationException("Implement findJudge");

    public static void main(String[] args) {
        FindTheTownJudge sol = new FindTheTownJudge();
        assert sol.findJudge(2, new int[][] {{1, 2}}) == 2;
        assert sol.findJudge(3, new int[][] {{1, 3}, {2, 3}}) == 3;
        assert sol.findJudge(3, new int[][] {{1, 3}, {2, 3}, {3, 1}}) == -1;
        System.out.println("All tests passed.");
    }
}
