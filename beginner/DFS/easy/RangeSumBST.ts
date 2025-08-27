type TreeNode = {
    val: number;
    left: TreeNode | null;
    right: TreeNode | null;
}

// Create a TreeNode from array representation
function createTree(arr: (number | null)[]): TreeNode | null {
    if (arr.length === 0 || arr[0] === null) return null;

    const root: TreeNode = { val: arr[0], left: null, right: null };
    const queue: TreeNode[] = [root];
    let i = 1;

    while (queue.length > 0 && i < arr.length) {
        const current = queue.shift()!;

        if (i < arr.length && arr[i] !== null) {
            current.left = { val: arr[i]!, left: null, right: null };
            queue.push(current.left);
        }
        i++;

        if (i < arr.length && arr[i] !== null) {
            current.right = { val: arr[i]!, left: null, right: null };
            queue.push(current.right);
        }
        i++;
    }

    return root;
}

function rangeSumBST(root: TreeNode | null, low: number, high: number): number {
    if (!root) return 0;
    
    // If current value is in range, include it in sum and check both subtrees
    if (root.val >= low && root.val <= high) {
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
    
    // If current value is less than low, only check right subtree
    if (root.val < low) {
        return rangeSumBST(root.right, low, high);
    }
    
    // If current value is greater than high, only check left subtree
    return rangeSumBST(root.left, low, high);
}

// Test cases
console.log(rangeSumBST(createTree([10,5,15,3,7,null,18]), 7, 15)); // Should output 32
// console.log(rangeSumBST(createTree([10,5,15,3,7,13,18,1,null,6]), 6, 10)); // Should output 23