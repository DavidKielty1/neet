/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     val: number
 *     left: TreeNode | null
 *     right: TreeNode | null
 *     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.left = (left===undefined ? null : left)
 *         this.right = (right===undefined ? null : null)
 *     }
 * }
 */

export type TreeNode = {
    val: number;
    left: TreeNode | null;
    right: TreeNode | null;
}

// Helper function to create a tree from array representation
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

function evaluateTree(root: TreeNode | null): boolean {
    if(!root) return false;

    // Base case 1: If root is a leaf node (0 or 1)
    if (root.val === 0 || root.val === 1) {
        return root.val === 1;  // 0 → false, 1 → true
    }

    // Base case 2: If root is an operation with two leaf nodes
    if ((root.val === 2 || root.val === 3) && 
        (root.left?.val === 0 || root.left?.val === 1) && 
        (root.right?.val === 0 || root.right?.val === 1)) {
        
        if (root.val === 2) { // OR operation
            return root.left.val === 1 || root.right.val === 1;
        } else { // AND operation
            return root.left.val === 1 && root.right.val === 1;
        }
    }

    // Recursive case: Evaluate left and right subtrees
    const leftResult = evaluateTree(root.left);
    const rightResult = evaluateTree(root.right);

    // Apply the operation (2=OR, 3=AND) to the results
    return root.val === 2 ? (leftResult || rightResult) : (leftResult && rightResult);
}

// Test cases
// Example 1: root = [2,1,3,null,null,0,1]
// This creates a tree where:
// - Root is 2 (OR)
// - Left child is 1 (True)
// - Right child is 3 (AND)
// - Right child of 3 is 0 (False)
// - Left child of 3 is 1 (True)
// Expected output: true
console.log(evaluateTree(createTree([2,1,3,null,null,0,1]))); // Should output true

// Example 2: root = [0]
// This creates a tree with just a leaf node with value 0 (False)
// Expected output: false
console.log(evaluateTree(createTree([0]))); // Should output false

// Additional test case: [3,1,0]
// This creates a tree where:
// - Root is 3 (AND)
// - Left child is 1 (True)
// - Right child is 0 (False)
// Expected output: false (True AND False = False)
console.log(evaluateTree(createTree([3,1,0]))); // Should output false