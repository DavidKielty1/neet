#!/usr/bin/env python3
"""Generate Java stubs for easy topics 06–15. Run after _generate_java_stubs_batch.py."""

from pathlib import Path

ROOT = Path(__file__).resolve().parent

SLASH = r"""        //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

    

"""


def block_comment(*lines: str) -> str:
    return "/*\n" + "\n".join(lines) + "\n*/\n"


def write_file(path: Path, content: str) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(content, encoding="utf-8")
    print("wrote", path.relative_to(ROOT))


TREE_NODE = """
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode() {}

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
"""

LIST_NODE = """
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
"""


def java_stub(
    class_name: str,
    header_lines: list[str],
    imports: str,
    method_body: str,
    commented_hint: str,
    main_block: str,
    extra_after_class: str = "",
) -> str:
    imp = (imports.rstrip() + "\n\n") if imports.strip() else ""
    return (
        block_comment(*header_lines)
        + imp
        + f"public class {class_name} {{\n"
        + method_body
        + "\n"
        + SLASH
        + "\n        "
        + commented_hint.strip().replace("\n", "\n        ")
        + "\n\n        throw new UnsupportedOperationException(\"Implement solution\");\n    }\n"
        + main_block
        + "\n"
        + extra_after_class
        + "\n}\n"
    )


# ---------- 06 trees ----------
T = "import java.util.ArrayList;\nimport java.util.List;"

write_file(
    ROOT / "06-trees/Java/InvertBinaryTreeJava.java",
    java_stub(
        "InvertBinaryTreeJava",
        [
            "226. Invert Binary Tree",
            "Difficulty: Easy",
            "Pattern: Trees / DFS",
            "",
            "Invert the tree by swapping each node's left and right children.",
            "",
            "Time: O(n), Space: O(h) recursion stack",
        ],
        T,
        """    public TreeNode invertTree(TreeNode root) {""",
        "// DFS or BFS swap children.",
        """    public static void main(String[] args) {
        System.out.println("Implement tests with TreeNode builders.");
    }"""
        + TREE_NODE,
        "",
    ),
)

write_file(
    ROOT / "06-trees/Java/SubtreeOfAnotherTreeJava.java",
    java_stub(
        "SubtreeOfAnotherTreeJava",
        [
            "572. Subtree of Another Tree",
            "Difficulty: Easy",
            "Pattern: Trees",
            "",
            "Return true if root has a subtree equal to subRoot.",
            "",
            "Time: O(m * n) naive, better with hashing",
        ],
        T,
        """    public boolean isSubtree(TreeNode root, TreeNode subRoot) {""",
        "// Compare structures / same-tree helper.",
        """    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }"""
        + TREE_NODE,
        "",
    ),
)

write_file(
    ROOT / "06-trees/Java/SameTreeJava.java",
    java_stub(
        "SameTreeJava",
        [
            "100. Same Tree",
            "Difficulty: Easy",
            "Pattern: Trees",
            "",
            "Return whether two binary trees are identical.",
            "",
            "Time: O(n), Space: O(h)",
        ],
        T,
        """    public boolean isSameTree(TreeNode p, TreeNode q) {""",
        "// Recursion: same val and same left/right.",
        """    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }"""
        + TREE_NODE,
        "",
    ),
)

write_file(
    ROOT / "06-trees/Java/BalancedBinaryTreeJava.java",
    java_stub(
        "BalancedBinaryTreeJava",
        [
            "110. Balanced Binary Tree",
            "Difficulty: Easy",
            "Pattern: Trees",
            "",
            "Height-balanced: left and right subtree heights differ by at most 1.",
            "",
            "Time: O(n), Space: O(h)",
        ],
        T,
        """    public boolean isBalanced(TreeNode root) {""",
        "// Bottom-up height or check depth per node.",
        """    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }"""
        + TREE_NODE,
        "",
    ),
)

write_file(
    ROOT / "06-trees/Java/DiameterOfBinaryTreeJava.java",
    java_stub(
        "DiameterOfBinaryTreeJava",
        [
            "543. Diameter of Binary Tree",
            "Difficulty: Easy",
            "Pattern: Trees",
            "",
            "Length of longest path between any two nodes (edges count).",
            "",
            "Time: O(n), Space: O(h)",
        ],
        T,
        """    public int diameterOfBinaryTree(TreeNode root) {""",
        "// Track max path through each node: leftHeight + rightHeight.",
        """    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }"""
        + TREE_NODE,
        "",
    ),
)

write_file(
    ROOT / "06-trees/Java/BinaryTreePathsJava.java",
    java_stub(
        "BinaryTreePathsJava",
        [
            "257. Binary Tree Paths",
            "Difficulty: Easy",
            "Pattern: Trees / Backtracking",
            "",
            "Return all root-to-leaf paths as strings.",
            "",
            "Time: O(n), Space: O(h)",
        ],
        T,
        """    public List<String> binaryTreePaths(TreeNode root) {""",
        "// DFS backtracking with StringBuilder.",
        """    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }"""
        + TREE_NODE,
        "",
    ),
)

write_file(
    ROOT / "06-trees/Java/MaximumDepthBinaryTreeJava.java",
    java_stub(
        "MaximumDepthBinaryTreeJava",
        [
            "104. Maximum Depth of Binary Tree",
            "Difficulty: Easy",
            "Pattern: Trees",
            "",
            "Maximum number of nodes along root-to-leaf path (depth).",
            "",
            "Time: O(n), Space: O(h)",
        ],
        T,
        """    public int maxDepth(TreeNode root) {""",
        "// max(left, right) + 1",
        """    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }"""
        + TREE_NODE,
        "",
    ),
)

write_file(
    ROOT / "06-trees/Java/RangeSumBstJava.java",
    java_stub(
        "RangeSumBstJava",
        [
            "938. Range Sum of BST",
            "Difficulty: Easy",
            "Pattern: Trees / BST",
            "",
            "Sum values in BST between low and high inclusive.",
            "",
            "Time: O(n), Space: O(h)",
        ],
        T,
        """    public int rangeSumBST(TreeNode root, int low, int high) {""",
        "// Prune search using BST property.",
        """    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }"""
        + TREE_NODE,
        "",
    ),
)

write_file(
    ROOT / "06-trees/Java/MergeTwoBinaryTreesJava.java",
    java_stub(
        "MergeTwoBinaryTreesJava",
        [
            "617. Merge Two Binary Trees",
            "Difficulty: Easy",
            "Pattern: Trees",
            "",
            "Merge roots by summing vals; if one child missing, use the other.",
            "",
            "Time: O(n), Space: O(h)",
        ],
        T,
        """    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {""",
        "// Recursion: new val = v1 + v2",
        """    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }"""
        + TREE_NODE,
        "",
    ),
)

write_file(
    ROOT / "06-trees/Java/LowestCommonAncestorBstJava.java",
    java_stub(
        "LowestCommonAncestorBstJava",
        [
            "235. Lowest Common Ancestor of a Binary Search Tree",
            "Difficulty: Easy",
            "Pattern: BST",
            "",
            "LCA of p and q in a BST (all values unique).",
            "",
            "Time: O(h), Space: O(1) iterative",
        ],
        T,
        """    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {""",
        "// Walk from root using BST ordering.",
        """    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }"""
        + TREE_NODE,
        "",
    ),
)

# ---------- 07 stack ----------
write_file(
    ROOT / "07-stack/Java/ValidParenthesesJava.java",
    java_stub(
        "ValidParenthesesJava",
        [
            "20. Valid Parentheses",
            "Difficulty: Easy",
            "Pattern: Stack",
            "",
            "Return true if brackets are valid and properly nested.",
            "",
            "Time: O(n), Space: O(n)",
        ],
        "import java.util.ArrayDeque;\nimport java.util.Deque;",
        """    public boolean isValid(String s) {""",
        "// Stack of opening chars; match closing.",
        """    public static void main(String[] args) {
        ValidParenthesesJava x = new ValidParenthesesJava();
        assert x.isValid("()");
        assert x.isValid("()[]{}");
        assert !x.isValid("(]");
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

write_file(
    ROOT / "07-stack/Java/BackspaceStringCompareJava.java",
    java_stub(
        "BackspaceStringCompareJava",
        [
            "844. Backspace String Compare",
            "Difficulty: Easy",
            "Pattern: Stack / Two Pointers",
            "",
            "# means backspace on the previous char (empty string stays empty).",
            "",
            "Time: O(n), Space: O(1) possible with reverse iteration",
        ],
        "",
        """    public boolean backspaceCompare(String s, String t) {""",
        "// Build stack or two-pointer from end.",
        """    public static void main(String[] args) {
        BackspaceStringCompareJava x = new BackspaceStringCompareJava();
        assert x.backspaceCompare("ab#c", "ad#c");
        assert x.backspaceCompare("ab##", "c#d#");
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

write_file(
    ROOT / "07-stack/Java/ImplementQueueUsingStacksJava.java",
    block_comment(
        "232. Implement Queue using Stacks",
        "Difficulty: Easy",
        "Pattern: Stack",
        "",
        "FIFO queue using only stack operations.",
        "",
        "Amortized O(1) per operation typical.",
    )
    + """
import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementQueueUsingStacksJava {

    static class MyQueue {
        private final Deque<Integer> in = new ArrayDeque<>();
        private final Deque<Integer> out = new ArrayDeque<>();

        public void push(int x) {
"""
    + SLASH
    + """
            throw new UnsupportedOperationException("Implement push");
        }

        public int pop() {
            throw new UnsupportedOperationException("Implement pop");
        }

        public int peek() {
            throw new UnsupportedOperationException("Implement peek");
        }

        public boolean empty() {
            throw new UnsupportedOperationException("Implement empty");
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        assert q.peek() == 1;
        assert q.pop() == 1;
        assert !q.empty();
        System.out.println("All test cases passed!");
    }
}
""",
)

# ---------- 08 linked list ----------
L = "import java.util.HashSet;\nimport java.util.Set;"

write_file(
    ROOT / "08-linked-list/Java/ReverseLinkedListJava.java",
    java_stub(
        "ReverseLinkedListJava",
        [
            "206. Reverse Linked List",
            "Difficulty: Easy",
            "Pattern: Linked List",
            "",
            "Reverse nodes iteratively or recursively.",
            "",
            "Time: O(n), Space: O(1)",
        ],
        "",
        """    public ListNode reverseList(ListNode head) {""",
        "// prev/curr iteration.",
        """    public static void main(String[] args) {
        System.out.println("Build ListNodes for tests.");
    }"""
        + LIST_NODE,
        "",
    ),
)

write_file(
    ROOT / "08-linked-list/Java/MergeTwoSortedListsJava.java",
    java_stub(
        "MergeTwoSortedListsJava",
        [
            "21. Merge Two Sorted Lists",
            "Difficulty: Easy",
            "Pattern: Linked List",
            "",
            "Merge two sorted linked lists into one sorted list.",
            "",
            "Time: O(n + m), Space: O(1)",
        ],
        "",
        """    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {""",
        "// Dummy head + merge.",
        """    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }"""
        + LIST_NODE,
        "",
    ),
)

write_file(
    ROOT / "08-linked-list/Java/LinkedListCycleJava.java",
    java_stub(
        "LinkedListCycleJava",
        [
            "141. Linked List Cycle",
            "Difficulty: Easy",
            "Pattern: Linked List / Fast-Slow",
            "",
            "Return true if the list has a cycle.",
            "",
            "Time: O(n), Space: O(1) Floyd",
        ],
        L,
        """    public boolean hasCycle(ListNode head) {""",
        "// Floyd tortoise and hare.",
        """    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }"""
        + LIST_NODE,
        "",
    ),
)

write_file(
    ROOT / "08-linked-list/Java/MiddleOfLinkedListJava.java",
    java_stub(
        "MiddleOfLinkedListJava",
        [
            "876. Middle of the Linked List",
            "Difficulty: Easy",
            "Pattern: Linked List",
            "",
            "If two middles, return the second.",
            "",
            "Time: O(n), Space: O(1)",
        ],
        "",
        """    public ListNode middleNode(ListNode head) {""",
        "// Fast moves 2 steps, slow 1 step.",
        """    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }"""
        + LIST_NODE,
        "",
    ),
)

write_file(
    ROOT / "08-linked-list/Java/PalindromeLinkedListJava.java",
    java_stub(
        "PalindromeLinkedListJava",
        [
            "234. Palindrome Linked List",
            "Difficulty: Easy",
            "Pattern: Linked List",
            "",
            "Return true if values form a palindrome.",
            "",
            "Time: O(n), Space: O(1) reverse half",
        ],
        "",
        """    public boolean isPalindrome(ListNode head) {""",
        "// Reverse second half and compare.",
        """    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }"""
        + LIST_NODE,
        "",
    ),
)

write_file(
    ROOT / "08-linked-list/Java/RemoveLinkedListElementsJava.java",
    java_stub(
        "RemoveLinkedListElementsJava",
        [
            "203. Remove Linked List Elements",
            "Difficulty: Easy",
            "Pattern: Linked List",
            "",
            "Remove all nodes with value val.",
            "",
            "Time: O(n), Space: O(1)",
        ],
        "",
        """    public ListNode removeElements(ListNode head, int val) {""",
        "// Dummy head simplifies removal.",
        """    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }"""
        + LIST_NODE,
        "",
    ),
)

write_file(
    ROOT / "08-linked-list/Java/DeleteNodeInLinkedListJava.java",
    java_stub(
        "DeleteNodeInLinkedListJava",
        [
            "237. Delete Node in a Linked List",
            "Difficulty: Easy",
            "Pattern: Linked List",
            "",
            "Delete given node (not tail); only access to that node.",
            "",
            "Time: O(1), Space: O(1)",
        ],
        "",
        """    public void deleteNode(ListNode node) {""",
        "// Copy next val forward; skip next.",
        """    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }"""
        + LIST_NODE,
        "",
    ),
)

# ---------- 09 heap ----------
write_file(
    ROOT / "09-heap/Java/LastStoneWeightJava.java",
    java_stub(
        "LastStoneWeightJava",
        [
            "1046. Last Stone Weight",
            "Difficulty: Easy",
            "Pattern: Heap",
            "",
            "Smash two heaviest stones; return last weight or 0.",
            "",
            "Time: O(n log n), Space: O(n)",
        ],
        "import java.util.PriorityQueue;",
        """    public int lastStoneWeight(int[] stones) {""",
        "// Max-heap via PriorityQueue (negate values).",
        """    public static void main(String[] args) {
        LastStoneWeightJava s = new LastStoneWeightJava();
        assert s.lastStoneWeight(new int[] {2, 7, 4, 1, 8, 1}) == 1;
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

write_file(
    ROOT / "09-heap/Java/RelativeRanksJava.java",
    java_stub(
        "RelativeRanksJava",
        [
            "506. Relative Ranks",
            "Difficulty: Easy",
            "Pattern: Heap / Sorting",
            "",
            "Map scores to Gold/Silver/Bronze/4..n strings.",
            "",
            "Time: O(n log n), Space: O(n)",
        ],
        "import java.util.ArrayList;\nimport java.util.List;",
        """    public String[] findRelativeRanks(int[] score) {""",
        "// Sort indices by score descending.",
        """    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }""",
        "",
    ),
)

write_file(
    ROOT / "09-heap/Java/KthLargestElementStreamJava.java",
    block_comment(
        "703. Kth Largest Element in a Stream",
        "Difficulty: Easy",
        "Pattern: Heap",
        "",
        "Design KthLargest with constructor and add.",
        "",
        "Use a min-heap of size k.",
    )
    + """
import java.util.PriorityQueue;

public class KthLargestElementStreamJava {

    static class KthLargest {
        private final int k;
        private final PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        public KthLargest(int k, int[] nums) {
            this.k = k;
"""
    + SLASH
    + """
            throw new UnsupportedOperationException("Implement constructor");
        }

        public int add(int val) {
            throw new UnsupportedOperationException("Implement add");
        }
    }

    public static void main(String[] args) {
        KthLargest kth = new KthLargest(3, new int[] {4, 5, 8, 2});
        System.out.println("Implement add() tests after constructor works.");
    }
}
""",
)

# ---------- 10 DP ----------
write_file(
    ROOT / "10-dynamic-programming/Java/ClimbingStairsJava.java",
    java_stub(
        "ClimbingStairsJava",
        [
            "70. Climbing Stairs",
            "Difficulty: Easy",
            "Pattern: Dynamic Programming",
            "",
            "Ways to reach step n with steps of 1 or 2.",
            "",
            "Time: O(n), Space: O(1)",
        ],
        "",
        """    public int climbStairs(int n) {""",
        "// Fibonacci recurrence.",
        """    public static void main(String[] args) {
        ClimbingStairsJava s = new ClimbingStairsJava();
        assert s.climbStairs(2) == 2;
        assert s.climbStairs(3) == 3;
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

write_file(
    ROOT / "10-dynamic-programming/Java/MinCostClimbingStairsJava.java",
    java_stub(
        "MinCostClimbingStairsJava",
        [
            "746. Min Cost Climbing Stairs",
            "Difficulty: Easy",
            "Pattern: Dynamic Programming",
            "",
            "Min cost to reach top; can start at index 0 or 1.",
            "",
            "Time: O(n), Space: O(1)",
        ],
        "",
        """    public int minCostClimbingStairs(int[] cost) {""",
        "// dp[i] = cost[i] + min(dp[i-1], dp[i-2])",
        """    public static void main(String[] args) {
        MinCostClimbingStairsJava s = new MinCostClimbingStairsJava();
        assert s.minCostClimbingStairs(new int[] {10, 15, 20}) == 15;
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

write_file(
    ROOT / "10-dynamic-programming/Java/PascalsTriangleIiJava.java",
    java_stub(
        "PascalsTriangleIiJava",
        [
            "119. Pascal's Triangle II",
            "Difficulty: Easy",
            "Pattern: Dynamic Programming",
            "",
            "Return rowIndex-th row of Pascal's triangle (0-indexed).",
            "",
            "Time: O(rowIndex), Space: O(rowIndex)",
        ],
        "import java.util.ArrayList;\nimport java.util.List;",
        """    public List<Integer> getRow(int rowIndex) {""",
        "// Build row iteratively.",
        """    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }""",
        "",
    ),
)

write_file(
    ROOT / "10-dynamic-programming/Java/TribonacciNumberJava.java",
    java_stub(
        "TribonacciNumberJava",
        [
            "1137. N-th Tribonacci Number",
            "Difficulty: Easy",
            "Pattern: Dynamic Programming",
            "",
            "T(0)=0, T(1)=1, T(2)=1, T(n)=T(n-1)+T(n-2)+T(n-3).",
            "",
            "Time: O(n), Space: O(1)",
        ],
        "",
        """    public int tribonacci(int n) {""",
        "// Rolling three values.",
        """    public static void main(String[] args) {
        TribonacciNumberJava s = new TribonacciNumberJava();
        assert s.tribonacci(4) == 4;
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

write_file(
    ROOT / "10-dynamic-programming/Java/DivisorGameJava.java",
    java_stub(
        "DivisorGameJava",
        [
            "1025. Divisor Game",
            "Difficulty: Easy",
            "Pattern: Dynamic Programming / Math",
            "",
            "Alice and Bob; return true iff Alice wins optimal play.",
            "",
            "Time: O(1), Space: O(1)",
        ],
        "",
        """    public boolean divisorGame(int n) {""",
        "// Pattern on parity / DP small states.",
        """    public static void main(String[] args) {
        DivisorGameJava s = new DivisorGameJava();
        assert s.divisorGame(2);
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

# ---------- 11 greedy ----------
write_file(
    ROOT / "11-greedy/Java/MaximumSubarrayJava.java",
    java_stub(
        "MaximumSubarrayJava",
        [
            "53. Maximum Subarray",
            "Difficulty: Easy",
            "Pattern: Greedy / Kadane",
            "",
            "Maximum sum of a contiguous subarray.",
            "",
            "Time: O(n), Space: O(1)",
        ],
        "",
        """    public int maxSubArray(int[] nums) {""",
        "// Kadane: best ending here.",
        """    public static void main(String[] args) {
        MaximumSubarrayJava s = new MaximumSubarrayJava();
        assert s.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}) == 6;
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

write_file(
    ROOT / "11-greedy/Java/AssignCookiesJava.java",
    java_stub(
        "AssignCookiesJava",
        [
            "455. Assign Cookies",
            "Difficulty: Easy",
            "Pattern: Greedy",
            "",
            "Maximize children satisfied with cookie sizes.",
            "",
            "Time: O(n log n), Space: O(1) excluding sort",
        ],
        "import java.util.Arrays;",
        """    public int findContentChildren(int[] g, int[] s) {""",
        "// Sort both; two pointers.",
        """    public static void main(String[] args) {
        AssignCookiesJava x = new AssignCookiesJava();
        assert x.findContentChildren(new int[] {1, 2, 3}, new int[] {1, 1}) == 1;
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

write_file(
    ROOT / "11-greedy/Java/LemonadeChangeJava.java",
    java_stub(
        "LemonadeChangeJava",
        [
            "860. Lemonade Change",
            "Difficulty: Easy",
            "Pattern: Greedy",
            "",
            "Bills 5, 10, 20 — make change if possible.",
            "",
            "Time: O(n), Space: O(1)",
        ],
        "",
        """    public boolean lemonadeChange(int[] bills) {""",
        "// Track counts of 5s and 10s.",
        """    public static void main(String[] args) {
        LemonadeChangeJava x = new LemonadeChangeJava();
        assert x.lemonadeChange(new int[] {5, 5, 5, 10, 20});
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

# ---------- 12 bit manipulation ----------
write_file(
    ROOT / "12-bit-manipulation/Java/SingleNumberJava.java",
    java_stub(
        "SingleNumberJava",
        [
            "136. Single Number",
            "Difficulty: Easy",
            "Pattern: Bit Manipulation",
            "",
            "Every element appears twice except one; find it.",
            "",
            "Time: O(n), Space: O(1)",
        ],
        "",
        """    public int singleNumber(int[] nums) {""",
        "// XOR all elements.",
        """    public static void main(String[] args) {
        SingleNumberJava s = new SingleNumberJava();
        assert s.singleNumber(new int[] {2, 2, 1}) == 1;
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

write_file(
    ROOT / "12-bit-manipulation/Java/NumberOf1BitsJava.java",
    java_stub(
        "NumberOf1BitsJava",
        [
            "191. Number of 1 Bits",
            "Difficulty: Easy",
            "Pattern: Bit Manipulation",
            "",
            "Hamming weight of unsigned 32-bit n.",
            "",
            "Time: O(32), Space: O(1)",
        ],
        "",
        """    public int hammingWeight(int n) {""",
        "// n &= n - 1 clears lowest set bit.",
        """    public static void main(String[] args) {
        NumberOf1BitsJava s = new NumberOf1BitsJava();
        assert s.hammingWeight(11) == 3;
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

write_file(
    ROOT / "12-bit-manipulation/Java/CountingBitsJava.java",
    java_stub(
        "CountingBitsJava",
        [
            "338. Counting Bits",
            "Difficulty: Easy",
            "Pattern: Bit Manipulation / DP",
            "",
            "For each i in [0, n], count 1-bits in binary i.",
            "",
            "Time: O(n), Space: O(n)",
        ],
        "",
        """    public int[] countBits(int n) {""",
        "// ans[i] = ans[i >> 1] + (i & 1)",
        """    public static void main(String[] args) {
        CountingBitsJava s = new CountingBitsJava();
        assert java.util.Arrays.equals(s.countBits(2), new int[] {0, 1, 1});
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

write_file(
    ROOT / "12-bit-manipulation/Java/MissingNumberJava.java",
    java_stub(
        "MissingNumberJava",
        [
            "268. Missing Number",
            "Difficulty: Easy",
            "Pattern: Bit Manipulation / Math",
            "",
            "Find missing number in [0..n] from nums length n.",
            "",
            "Time: O(n), Space: O(1)",
        ],
        "",
        """    public int missingNumber(int[] nums) {""",
        "// XOR or sum formula.",
        """    public static void main(String[] args) {
        MissingNumberJava s = new MissingNumberJava();
        assert s.missingNumber(new int[] {3, 0, 1}) == 2;
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

write_file(
    ROOT / "12-bit-manipulation/Java/AddBinaryJava.java",
    java_stub(
        "AddBinaryJava",
        [
            "67. Add Binary",
            "Difficulty: Easy",
            "Pattern: Bit Manipulation / Strings",
            "",
            "Binary sum of two binary strings.",
            "",
            "Time: O(max(a,b)), Space: O(max(a,b))",
        ],
        "",
        """    public String addBinary(String a, String b) {""",
        "// Carry from right to left.",
        """    public static void main(String[] args) {
        AddBinaryJava s = new AddBinaryJava();
        assert s.addBinary("11", "1").equals("100");
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

write_file(
    ROOT / "12-bit-manipulation/Java/ReverseBitsJava.java",
    java_stub(
        "ReverseBitsJava",
        [
            "190. Reverse Bits",
            "Difficulty: Easy",
            "Pattern: Bit Manipulation",
            "",
            "Reverse bits of a 32-bit unsigned integer.",
            "",
            "Time: O(32), Space: O(1)",
        ],
        "",
        """    public int reverseBits(int n) {""",
        "// Shift result left; take lowest bit of n.",
        """    public static void main(String[] args) {
        System.out.println("Implement tests with known bit patterns.");
    }""",
        "",
    ),
)

write_file(
    ROOT / "12-bit-manipulation/Java/PowerOfTwoJava.java",
    java_stub(
        "PowerOfTwoJava",
        [
            "231. Power of Two",
            "Difficulty: Easy",
            "Pattern: Bit Manipulation",
            "",
            "Return true if n is a power of two.",
            "",
            "Time: O(1), Space: O(1)",
        ],
        "",
        """    public boolean isPowerOfTwo(int n) {""",
        "// n > 0 && (n & (n - 1)) == 0",
        """    public static void main(String[] args) {
        PowerOfTwoJava s = new PowerOfTwoJava();
        assert s.isPowerOfTwo(1);
        assert !s.isPowerOfTwo(3);
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

write_file(
    ROOT / "12-bit-manipulation/Java/PowerOfFourJava.java",
    java_stub(
        "PowerOfFourJava",
        [
            "342. Power of Four",
            "Difficulty: Easy",
            "Pattern: Bit Manipulation",
            "",
            "Return true if n is a power of four.",
            "",
            "Time: O(1), Space: O(1)",
        ],
        "",
        """    public boolean isPowerOfFour(int n) {""",
        "// Power of two and n % 3 == 1",
        """    public static void main(String[] args) {
        PowerOfFourJava s = new PowerOfFourJava();
        assert s.isPowerOfFour(16);
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

# ---------- 13 intervals ----------
write_file(
    ROOT / "13-intervals/Java/MeetingRoomsJava.java",
    java_stub(
        "MeetingRoomsJava",
        [
            "252. Meeting Rooms",
            "Difficulty: Easy",
            "Pattern: Intervals / Sorting",
            "",
            "Given intervals [start,end], can one person attend all?",
            "",
            "Time: O(n log n), Space: O(1) excluding sort",
        ],
        "import java.util.Arrays;",
        """    public boolean canAttendMeetings(int[][] intervals) {""",
        "// Sort by start; check non-overlap.",
        """    public static void main(String[] args) {
        MeetingRoomsJava s = new MeetingRoomsJava();
        assert s.canAttendMeetings(new int[][] {{0, 30}, {5, 10}, {15, 20}}) == false;
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

# ---------- 14 math geometry ----------
write_file(
    ROOT / "14-math-geometry/Java/PlusOneJava.java",
    java_stub(
        "PlusOneJava",
        [
            "66. Plus One",
            "Difficulty: Easy",
            "Pattern: Math",
            "",
            "Increment big integer represented as digit array.",
            "",
            "Time: O(n), Space: O(1) output aside",
        ],
        "",
        """    public int[] plusOne(int[] digits) {""",
        "// Propagate carry from end.",
        """    public static void main(String[] args) {
        PlusOneJava s = new PlusOneJava();
        assert java.util.Arrays.equals(s.plusOne(new int[] {1, 2, 3}), new int[] {1, 2, 4});
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

write_file(
    ROOT / "14-math-geometry/Java/SqrtXJava.java",
    java_stub(
        "SqrtXJava",
        [
            "69. Sqrt(x)",
            "Difficulty: Easy",
            "Pattern: Math / Binary Search",
            "",
            "Integer square root truncated.",
            "",
            "Time: O(log x), Space: O(1)",
        ],
        "",
        """    public int mySqrt(int x) {""",
        "// Binary search on [0, x]",
        """    public static void main(String[] args) {
        SqrtXJava s = new SqrtXJava();
        assert s.mySqrt(8) == 2;
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

write_file(
    ROOT / "14-math-geometry/Java/PalindromeNumberJava.java",
    java_stub(
        "PalindromeNumberJava",
        [
            "9. Palindrome Number",
            "Difficulty: Easy",
            "Pattern: Math",
            "",
            "Return true if x reads same forwards/backwards (no string conv trick allowed in some variants).",
            "",
            "Time: O(log10 x), Space: O(1)",
        ],
        "",
        """    public boolean isPalindrome(int x) {""",
        "// Reverse half of digits.",
        """    public static void main(String[] args) {
        PalindromeNumberJava s = new PalindromeNumberJava();
        assert s.isPalindrome(121);
        assert !s.isPalindrome(10);
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

write_file(
    ROOT / "14-math-geometry/Java/HappyNumberJava.java",
    java_stub(
        "HappyNumberJava",
        [
            "202. Happy Number",
            "Difficulty: Easy",
            "Pattern: Math / HashSet",
            "",
            "Replace n by sum of squares of digits until 1 or a cycle.",
            "",
            "Time: O(log n) per step, Space: O(1) Floyd variant",
        ],
        "",
        """    public boolean isHappy(int n) {""",
        "// Cycle detection or mathematical endpoint.",
        """    public static void main(String[] args) {
        HappyNumberJava s = new HappyNumberJava();
        assert s.isHappy(19);
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

write_file(
    ROOT / "14-math-geometry/Java/PowerOfThreeJava.java",
    java_stub(
        "PowerOfThreeJava",
        [
            "326. Power of Three",
            "Difficulty: Easy",
            "Pattern: Math",
            "",
            "Return true if n is a power of three.",
            "",
            "Time: O(1) with bounds, Space: O(1)",
        ],
        "",
        """    public boolean isPowerOfThree(int n) {""",
        "// Loop divide by 3 or log trick.",
        """    public static void main(String[] args) {
        PowerOfThreeJava s = new PowerOfThreeJava();
        assert s.isPowerOfThree(27);
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

write_file(
    ROOT / "14-math-geometry/Java/ReverseIntegerJava.java",
    java_stub(
        "ReverseIntegerJava",
        [
            "7. Reverse Integer",
            "Difficulty: Medium",
            "Pattern: Math",
            "",
            "Reverse digits; return 0 on 32-bit overflow.",
            "",
            "Time: O(log10 n), Space: O(1)",
        ],
        "",
        """    public int reverse(int x) {""",
        "// Pop/push digits; check overflow.",
        """    public static void main(String[] args) {
        ReverseIntegerJava s = new ReverseIntegerJava();
        assert s.reverse(123) == 321;
        System.out.println("All test cases passed!");
    }""",
        "",
    ),
)

# ---------- 15 prefix sum (empty python) ----------
write_file(
    ROOT / "15-prefix-sum/Java/.gitkeep",
    "",
)

write_file(
    ROOT / "15-prefix-sum/Python/.gitkeep",
    "",
)

print("Rest batch done.")
