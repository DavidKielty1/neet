/*
997. Find the Town Judge
Difficulty: Easy
Pattern: Graphs (in/out degree)

Problem:
In a town of `n` people labeled from `1` to `n`, there may be a town judge.
If the judge exists, then:
- The judge trusts nobody.
- Everybody else trusts the judge.
- There is exactly one person who satisfies both conditions.

You are given `trust` where `trust[i] = [a, b]` means person `a` trusts person `b`.
Return the label of the judge if the judge exists, otherwise return `-1`.

Example 1:
Input: n = 2, trust = [[1,2]]
Output: 2
Explanation:
Person 1 trusts person 2, and person 2 trusts nobody, so person 2 is the judge.

Example 2:
Input: n = 3, trust = [[1,3],[2,3]]
Output: 3
Explanation:
Both other people trust person 3, and person 3 has no outgoing trust edge.

Example 3:
Input: n = 3, trust = [[1,3],[2,3],[3,1]]
Output: -1
Explanation:
Person 3 is trusted by others, but also trusts person 1, so they cannot be the judge.

Constraints:
- 1 <= n <= 1000
- 0 <= trust.length <= 10^4
- trust[i].length == 2
- a != b

Why degree counting works:
The judge must have in-degree `n - 1` and out-degree `0`. We can count incoming
and outgoing trust for each person and then scan once for the only valid candidate.

Time: O(n + t)
Space: O(n)
*/
public class FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        // go through each n in trust 
        // make count map for people who trust x
        // if any person has everyone in the town trusting them, but also trusts no one, they are judge

        // create two arrays for trusts; trusted
        // go through n,
        // append [[1,3],[2,3]] e.g:

        // go through i of n
        // if trusted[i] == n and trusts[i] == 0 -- this is the judge

        int[] trustsOthersCount = new int[n + 1];
        int[] trustedByOthersCount = new int[n + 1];

        for(int i = 0; i < trust.length; i++) {
            trustsOthersCount[trust[i][0]]++;
            trustedByOthersCount[trust[i][1]]++;
        }

        for(int person = 0; person <= n; person++) {
            if (trustsOthersCount[person] == 0 && trustedByOthersCount[person] == n - 1) {
                return person;
            }
        }
        
        return -1;
        
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

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
    }

    public static void main(String[] args) {
        FindTheTownJudge sol = new FindTheTownJudge();
        assert sol.findJudge(2, new int[][] {{1, 2}}) == 2;
        assert sol.findJudge(3, new int[][] {{1, 3}, {2, 3}}) == 3;
        assert sol.findJudge(3, new int[][] {{1, 3}, {2, 3}, {3, 1}}) == -1;
        System.out.println("All tests passed.");
    }
}
