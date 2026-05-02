# Linked List

## Pattern Overview

A Linked List is a linear data structure where elements are stored in nodes, and each node points to the next node. Key patterns include:

- Pointer manipulation
- Fast & slow pointers (Floyd's algorithm)
- Dummy nodes for simplification
- Reversal techniques
- Merging and splitting

## Java Practice File Builder

When a Java practice file has only one solution method, keep the usual single spoiler spacer
block in that method.

When the solution naturally spans multiple methods, such as a helper DFS, a comparison
helper, a constructor plus `add`, or an API method plus the main solver:

1. Leave the earlier/helper method bodies unimplemented.
2. Do not add separate 40-60 line `//` spacer blocks to those helper methods.
3. Keep exactly one 40-60 line `//` spacer block in the main method the learner is meant
   to solve from.
4. Put one combined commented reference implementation under that single spacer block,
   including all related methods together.
5. Avoid duplicate commented solutions and do not add `throw new UnsupportedOperationException(...)`
   placeholders.

## Key Concepts

1. **Node Structure** - Contains value and pointer(s) to next (and/or previous) node
2. **Head Pointer** - Reference to first node
3. **Traversal** - Follow next pointers
4. **No Random Access** - Must traverse from head to reach any node

## Problems in This Category

### Easy Level

| Problem                | LeetCode # | Pattern              | Key Technique     |
| ---------------------- | ---------- | -------------------- | ----------------- |
| Reverse Linked List    | 206        | Pointer Manipulation | Three pointers    |
| Merge Two Sorted Lists | 21         | Two Pointers         | Dummy node        |
| Linked List Cycle      | 141        | Fast & Slow          | Floyd's algorithm |

### Medium Level (for reference)

- Remove Nth Node From End of List (19)
- Reorder List (143)
- Copy List with Random Pointer (138)
- Add Two Numbers (2)
- LRU Cache (146)

## Common Patterns

### 1. Dummy Node Pattern

```python
def merge_lists(l1, l2):
    dummy = ListNode(0)  # Simplifies edge cases
    current = dummy

    # Build new list
    while l1 and l2:
        if l1.val < l2.val:
            current.next = l1
            l1 = l1.next
        else:
            current.next = l2
            l2 = l2.next
        current = current.next

    current.next = l1 or l2
    return dummy.next  # Skip dummy
```

### 2. Fast & Slow Pointers (Floyd's Cycle Detection)

```python
def has_cycle(head):
    slow = fast = head

    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next

        if slow == fast:
            return True

    return False
```

### 3. Reverse Linked List

```python
def reverse_list(head):
    prev = None
    current = head

    while current:
        next_temp = current.next
        current.next = prev
        prev = current
        current = next_temp

    return prev
```

### 4. Find Middle Node

```python
def find_middle(head):
    slow = fast = head

    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next

    return slow  # Middle node
```

## When to Use Linked Lists

✅ **Use when:**

- Need O(1) insertion/deletion at known positions
- Don't need random access
- Memory is fragmented
- Don't know size in advance
- Implementing queues, stacks, or graphs

❌ **Don't use when:**

- Need fast random access (use array)
- Need to search frequently (use hash table)
- Memory overhead is concern (pointers take space)
- Cache locality important (arrays better)

## Time & Space Complexity

| Operation      | Singly Linked  | Doubly Linked | Array          |
| -------------- | -------------- | ------------- | -------------- |
| Access         | O(n)           | O(n)          | O(1)           |
| Search         | O(n)           | O(n)          | O(n)           |
| Insert at Head | O(1)           | O(1)          | O(n)           |
| Insert at Tail | O(n) or O(1)\* | O(1)\*\*      | O(1) amortized |
| Delete at Head | O(1)           | O(1)          | O(n)           |
| Delete at Tail | O(n)           | O(1)\*\*      | O(1)           |

\* O(1) if we maintain tail pointer  
\*\* O(1) with tail pointer

## Linked List Variations

### 1. Singly Linked List

```python
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
```

### 2. Doubly Linked List

```python
class DListNode:
    def __init__(self, val=0, prev=None, next=None):
        self.val = val
        self.prev = prev
        self.next = next
```

### 3. Circular Linked List

- Last node points back to head
- Useful for round-robin scheduling

## Common Techniques

### 1. Dummy Head

- Simplifies edge cases (empty list, insert at head)
- Return `dummy.next` as actual head

### 2. Two Pointers

- **Fast & Slow**: Cycle detection, find middle
- **Previous & Current**: Deletion, reversal
- **Two Lists**: Merging sorted lists

### 3. Recursion

- Natural fit for linked lists
- Base case: `None` or single node
- Recursive case: process current, recurse on `next`

### 4. In-Place Manipulation

- Reverse pointers without extra space
- Modify existing nodes rather than creating new ones

## Tips & Tricks

1. **Draw It Out**: Visual representation helps with pointer manipulation
2. **Dummy Node**: Use for operations that modify head
3. **Null Checks**: Always check `node` and `node.next` before accessing
4. **Edge Cases**: Empty list, single node, two nodes
5. **Fast & Slow**: When fast reaches end, slow is at middle
6. **Reverse**: Remember to save `next` before changing pointers

## Common Pitfalls

❌ **Losing References**

```python
# BAD: Lose access to rest of list
head = head.next
head.next = None
```

❌ **Not Checking for None**

```python
# BAD: Will crash if head is None
return head.val
```

❌ **Infinite Loops**

```python
# BAD: Creates cycle
node.next = head
head = node
```

✅ **Correct Patterns**

```python
# Save reference
temp = head.next
# Check for None
if head and head.next:
    # Safe operations
# Use dummy node
dummy = ListNode(0)
dummy.next = head
```

## Edge Cases to Consider

- Empty list (`head = None`)
- Single node
- Two nodes
- List with cycle
- Lists of different lengths (for merge operations)
- Removing head node
- Removing last node

## ListNode Class Template

```python
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def create_list(values):
    """Helper: Create linked list from array"""
    if not values:
        return None
    head = ListNode(values[0])
    current = head
    for val in values[1:]:
        current.next = ListNode(val)
        current = current.next
    return head

def to_array(head):
    """Helper: Convert linked list to array"""
    result = []
    while head:
        result.append(head.val)
        head = head.next
    return result
```

## Related Patterns

- **Two Pointers** - Base for many linked list algorithms
- **Recursion** - Natural fit for linked list operations
- **Stack** - Can be implemented with linked list
- **Queue** - Efficient with linked list (O(1) enqueue/dequeue)
- **Hash Table** - Can track visited nodes
