#!/usr/bin/env python3
"""One-off generator for Java practice stubs. Safe to delete after running."""

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



"""


def block_comment(*lines: str) -> str:
    return "/*\n" + "\n".join(lines) + "\n*/\n"


def write_file(path: Path, content: str) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(content, encoding="utf-8")
    print("wrote", path.relative_to(ROOT))


# --- TreeNode / ListNode snippets ---
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
    package_path: str,
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
        + "\n    }\n"
        + main_block
        + "\n"
        + extra_after_class
        + "\n}\n"
    )


# ---------- 04 dynamic programming arrays ----------
write_file(
    ROOT / "04-dynamic-programming/arrays/Java/HouseRobberJava.java",
    java_stub(
        "",
        "HouseRobberJava",
        [
            "198. House Robber",
            "Difficulty: Medium",
            "Pattern: Dynamic Programming",
            "",
            "Return the maximum money you can rob without robbing two adjacent houses.",
            "",
            "Time: O(n), Space: O(1)",
        ],
        "",
        """    public int rob(int[] nums) {""",
        "// int prev2 = 0, prev1 = 0;",
        """    public static void main(String[] args) {
        HouseRobberJava s = new HouseRobberJava();
        assert s.rob(new int[] {1, 2, 3, 1}) == 4;
        assert s.rob(new int[] {2, 7, 9, 3, 1}) == 12;
        System.out.println("All test cases passed!");
    }""",
    ),
)

write_file(
    ROOT / "04-dynamic-programming/arrays/Java/HouseRobberEasyJava.java",
    java_stub(
        "",
        "HouseRobberEasyJava",
        [
            "70. Climbing Stairs (pairs with Python house-robber-easy.py)",
            "Difficulty: Easy",
            "Pattern: Dynamic Programming",
            "",
            "Count distinct ways to reach the top taking 1 or 2 steps at a time.",
            "",
            "Time: O(n), Space: O(1)",
        ],
        "",
        """    public int climbStairs(int n) {""",
        "// Fibonacci-style DP: ways[i] = ways[i-1] + ways[i-2]",
        """    public static void main(String[] args) {
        HouseRobberEasyJava s = new HouseRobberEasyJava();
        assert s.climbStairs(2) == 2;
        assert s.climbStairs(3) == 3;
        System.out.println("All test cases passed!");
    }""",
    ),
)

write_file(
    ROOT / "04-dynamic-programming/arrays/Java/BestTimeToBuyAndSellStockJava.java",
    java_stub(
        "",
        "BestTimeToBuyAndSellStockJava",
        [
            "121. Best Time to Buy and Sell Stock",
            "Difficulty: Easy",
            "Pattern: Dynamic Programming / One Pass",
            "",
            "Max profit from one buy and one sell on a later day; return 0 if no profit.",
            "",
            "Time: O(n), Space: O(1)",
        ],
        "",
        """    public int maxProfit(int[] prices) {""",
        "// Track minimum price seen so far; update max profit.",
        """    public static void main(String[] args) {
        BestTimeToBuyAndSellStockJava s = new BestTimeToBuyAndSellStockJava();
        assert s.maxProfit(new int[] {7, 1, 5, 3, 6, 4}) == 5;
        assert s.maxProfit(new int[] {7, 6, 4, 3, 1}) == 0;
        System.out.println("All test cases passed!");
    }""",
    ),
)

write_file(
    ROOT / "04-dynamic-programming/arrays/Java/BestTimeToBuyAndSellStockEasyJava.java",
    java_stub(
        "",
        "BestTimeToBuyAndSellStockEasyJava",
        [
            "Practice: min and max in array (pairs with best-time-to-buy-and-sell-stock-easy.py)",
            "Difficulty: Easy",
            "Pattern: One Pass",
            "",
            "Return [min, max] for the array values.",
            "",
            "Time: O(n), Space: O(1)",
        ],
        "import java.util.Arrays;",
        """    public int[] findMinMax(int[] nums) {""",
        "// One pass: track running min and max.",
        """    public static void main(String[] args) {
        BestTimeToBuyAndSellStockEasyJava s = new BestTimeToBuyAndSellStockEasyJava();
        assert Arrays.equals(s.findMinMax(new int[] {3, 2, 1, 4, 5}), new int[] {1, 5});
        System.out.println("All test cases passed!");
    }""",
    ),
)

# ---------- 05 binary search ----------
write_file(
    ROOT / "05-binary-search/Java/BinarySearchJava.java",
    java_stub(
        "",
        "BinarySearchJava",
        [
            "704. Binary Search",
            "Difficulty: Easy",
            "Pattern: Binary Search",
            "",
            "Return index of target in sorted nums, or -1. O(log n).",
            "",
            "Time: O(log n), Space: O(1)",
        ],
        "",
        """    public int search(int[] nums, int target) {""",
        "// int lo = 0, hi = nums.length - 1; while (lo <= hi) { int mid = ... }",
        """    public static void main(String[] args) {
        BinarySearchJava s = new BinarySearchJava();
        assert s.search(new int[] {-1, 0, 3, 5, 9, 12}, 9) == 4;
        assert s.search(new int[] {-1, 0, 3, 5, 9, 12}, 2) == -1;
        System.out.println("All test cases passed!");
    }""",
    ),
)

write_file(
    ROOT / "05-binary-search/Java/FirstBadVersionJava.java",
    block_comment(
        "278. First Bad Version",
        "Difficulty: Easy",
        "Pattern: Binary Search",
        "",
        "Find the first bad version using isBadVersion API.",
        "",
        "Time: O(log n), Space: O(1)",
    )
    + """
public class FirstBadVersionJava extends VersionControl {
    protected boolean isBadVersion(int version) {
    }

    public int firstBadVersion(int n) {
"""
    + SLASH
    + """
        // protected boolean isBadVersion(int version) {
        //     return version >= BAD_VERSION;
        // }
        //
        // public int firstBadVersion(int n) {
        //     int lo = 1;
        //     int hi = n;
        //     while (lo < hi) {
        //         int mid = lo + (hi - lo) / 2;
        //         if (isBadVersion(mid)) {
        //             hi = mid;
        //         } else {
        //             lo = mid + 1;
        //         }
        //     }
        //     return lo;
        // }
    }

    public static void main(String[] args) {
        System.out.println("Extend VersionControl with isBadVersion for tests.");
    }
}
""",
)

write_file(
    ROOT / "05-binary-search/Java/SearchInsertPositionJava.java",
    java_stub(
        "",
        "SearchInsertPositionJava",
        [
            "35. Search Insert Position",
            "Difficulty: Easy",
            "Pattern: Binary Search",
            "",
            "Return index of target if present, else index where it would be inserted.",
            "",
            "Time: O(log n), Space: O(1)",
        ],
        "",
        """    public int searchInsert(int[] nums, int target) {""",
        "// Lower bound binary search.",
        """    public static void main(String[] args) {
        SearchInsertPositionJava s = new SearchInsertPositionJava();
        assert s.searchInsert(new int[] {1, 3, 5, 6}, 5) == 2;
        assert s.searchInsert(new int[] {1, 3, 5, 6}, 2) == 1;
        System.out.println("All test cases passed!");
    }""",
    ),
)

write_file(
    ROOT / "05-binary-search/arrays/Java/SearchInRotatedSortedArrayJava.java",
    java_stub(
        "",
        "SearchInRotatedSortedArrayJava",
        [
            "33. Search in Rotated Sorted Array",
            "Difficulty: Medium",
            "Pattern: Binary Search",
            "",
            "Find target in sorted-then-rotated distinct array; return index or -1.",
            "",
            "Time: O(log n), Space: O(1)",
        ],
        "",
        """    public int search(int[] nums, int target) {""",
        "// Compare mid with ends to decide which half is sorted.",
        """    public static void main(String[] args) {
        SearchInRotatedSortedArrayJava s = new SearchInRotatedSortedArrayJava();
        assert s.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0) == 4;
        assert s.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 3) == -1;
        System.out.println("All test cases passed!");
    }""",
    ),
)

write_file(
    ROOT / "05-binary-search/arrays/Java/SearchInRotatedSortedArrayEasyJava.java",
    java_stub(
        "",
        "SearchInRotatedSortedArrayEasyJava",
        [
            "162. Find Peak Element (pairs with search-in-rotated-sorted-array-easy.py)",
            "Difficulty: Medium",
            "Pattern: Binary Search",
            "",
            "Return any index of a peak element.",
            "",
            "Time: O(log n), Space: O(1)",
        ],
        "",
        """    public int findPeakElement(int[] nums) {""",
        "// Compare mid with mid+1 for binary search on slopes.",
        """    public static void main(String[] args) {
        SearchInRotatedSortedArrayEasyJava s = new SearchInRotatedSortedArrayEasyJava();
        int i = s.findPeakElement(new int[] {1, 2, 3, 1});
        assert i == 2;
        System.out.println("All test cases passed!");
    }""",
    ),
)

write_file(
    ROOT / "05-binary-search/arrays/Java/BinarySearchArraysJava.java",
    block_comment(
        "704. Binary Search (duplicate practice file under arrays/; same as root binary-search.py)",
        "Difficulty: Easy",
        "Pattern: Binary Search",
        "",
        "Time: O(log n), Space: O(1)",
    )
    + """
public class BinarySearchArraysJava {
    public int search(int[] nums, int target) {
"""
    + SLASH
    + """
        // int lo = 0, hi = nums.length - 1;

        throw new UnsupportedOperationException("Implement search");
    }

    public static void main(String[] args) {
        BinarySearchArraysJava s = new BinarySearchArraysJava();
        assert s.search(new int[] {-1, 0, 3, 5, 9, 12}, 9) == 4;
        System.out.println("All test cases passed!");
    }
}
""",
)

print("Batch 1 done.")
