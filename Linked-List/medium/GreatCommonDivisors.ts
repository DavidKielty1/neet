interface ListNode {
    val: number,
    next: ListNode | null
}

function greatestCommonDivisor(a: number, b: number): number {
    console.log(`Finding GCD of ${a} and ${b}`);
    
    while (b !== 0) {
        console.log(`a: ${a}, b: ${b}`);
        let temp = b;
        b = a % b;
        a = temp;
        console.log(`After iteration: a: ${a}, b: ${b}`);
    }
    
    return a;
}

// Helper function to build LinkedList from array
function arrayToLinkedList(arr: number[]): ListNode | null {
    if (arr.length === 0) return null;
    
    // Create the head node
    const head: ListNode = {
        val: arr[0],
        next: null
    };
    
    // Current pointer to build the list
    let current = head;
    
    // Iterate through array starting from index 1
    for (let i = 1; i < arr.length; i++) {
        current.next = {
            val: arr[i],
            next: null
        };
        current = current.next;
    }
    
    return head;
}

// [18, 6, 10, 3]

function insertGreatestCommonDivisors(head: ListNode | null): ListNode | null {
    if (!head) return null;
    if (!head.next) return head;
    
    let current = head;
    while (current && current.next) {
        const gcd = greatestCommonDivisor(current.val, current.next.val);
        const newNode: ListNode = {
            val: gcd,
            next: current.next
        };
        current.next = newNode;
        current = newNode.next;
    }
    
    return head;
};

// Now use the helper function to convert array to LinkedList
const linkedList = arrayToLinkedList([18,6,10,3]);
insertGreatestCommonDivisors(linkedList);
