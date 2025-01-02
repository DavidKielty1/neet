class TreeNode {
  val: number;
  left: TreeNode | null;
  right: TreeNode | null;
  constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
    this.val = val === undefined ? 0 : val;
    this.left = left === undefined ? null : left;
    this.right = right === undefined ? null : right;
  }
}

function sortedArrayToBST(nums: number[]): TreeNode | null {
  const buildBST = (left: number, right: number): TreeNode | null => {
    if (left > right) {
      return null; // Base case
    }

    const mid = Math.floor((left + right) / 2);
    const node = new TreeNode(nums[mid]);

    // Recursively build the left and right subtrees
    node.left = buildBST(left, mid - 1); // Left subarray
    node.right = buildBST(mid + 1, right); // Right subarray

    return node; // Return the constructed node
  };

  // Start recursion with the entire array
  return buildBST(0, nums.length - 1);
}
