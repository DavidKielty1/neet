/*
997. Find the Town Judge
Difficulty: Easy
Pattern: Graphs (in/out degree)

Trust edges a -> b; judge trusts no one and is trusted by all others.

Time: O(n + t), Space: O(n)
*/
public class FindTheTownJudgeJava {

    public int findJudge(int n, int[][] trust) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

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
        FindTheTownJudgeJava sol = new FindTheTownJudgeJava();
        assert sol.findJudge(2, new int[][] {{1, 2}}) == 2;
        assert sol.findJudge(3, new int[][] {{1, 3}, {2, 3}}) == 3;
        assert sol.findJudge(3, new int[][] {{1, 3}, {2, 3}, {3, 1}}) == -1;
        System.out.println("All tests passed.");
    }
}
