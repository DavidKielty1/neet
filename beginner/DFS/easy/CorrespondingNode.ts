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

// Helper function to find a node by value in the original tree
function findNode(root: TreeNode | null, targetVal: number): TreeNode | null {
    if (!root) return null;
    
    if (root.val === targetVal) {
        return root;
    }
    
    const leftResult = findNode(root.left, targetVal);
    if (leftResult) return leftResult;
    
    return findNode(root.right, targetVal);
}

// Helper function to clone a tree
function cloneTree(root: TreeNode | null): TreeNode | null {
    if (!root) return null;
    
    return {
        val: root.val,
        left: cloneTree(root.left),
        right: cloneTree(root.right)
    };
}

function getTargetCopy(original: TreeNode | null, cloned: TreeNode | null, target: TreeNode | null): TreeNode | null {
    // Base case: if either tree is null or target is null, return null
    if (!original || !cloned || !target) return null;
    
    // If we've found the target in the original tree
    if (original === target) {
        return cloned;
    }
    
    // Check the left subtree
    const leftResult = getTargetCopy(original.left, cloned.left, target);
    if (leftResult) return leftResult;
    
    // Check the right subtree
    return getTargetCopy(original.right, cloned.right, target);
}

// Test cases
// Example 1: tree = [7,4,3,null,null,6,19], target = 3
const originalTree1 = createTree([7,4,3,null,null,6,19]);
const targetNode1 = findNode(originalTree1, 3);
const clonedTree1 = cloneTree(originalTree1);
console.log(getTargetCopy(originalTree1, clonedTree1, targetNode1)?.val); // Should output 3

// Example 2: tree = [7], target = 7
const originalTree2 = createTree([7]);
const targetNode2 = findNode(originalTree2, 7);
const clonedTree2 = cloneTree(originalTree2);
console.log(getTargetCopy(originalTree2, clonedTree2, targetNode2)?.val); // Should output 7

// Example 3: tree = [8,null,6,null,5,null,4,null,3,null,2,null,1], target = 4
const originalTree3 = createTree([8,null,6,null,5,null,4,null,3,null,2,null,1]);
const targetNode3 = findNode(originalTree3, 4);
const clonedTree3 = cloneTree(originalTree3);
console.log(getTargetCopy(originalTree3, clonedTree3, targetNode3)?.val); // Should output 4