class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def reverse_list(head):
    """
    Reverse Linked List
    
    Given the head of a singly linked list, reverse the list, and return the reversed list.
    
    Example 1:
    Input: head = [1,2,3,4,5]
    Output: [5,4,3,2,1]
    
    Example 2:
    Input: head = [1,2]
    Output: [2,1]
    
    Example 3:
    Input: head = []
    Output: []
    
    Constraints:
    - The number of nodes in the list is the range [0, 5000].
    - -5000 <= Node.val <= 5000
    """
    pass


# Helper function to create linked list from array
def create_linked_list(arr):
    if not arr:
        return None
    head = ListNode(arr[0])
    current = head
    for val in arr[1:]:
        current.next = ListNode(val)
        current = current.next
    return head

# Helper function to convert linked list to array
def linked_list_to_array(head):
    arr = []
    current = head
    while current:
        arr.append(current.val)
        current = current.next
    return arr

# Test cases
if __name__ == "__main__":
    # Test case 1
    head1 = create_linked_list([1, 2, 3, 4, 5])
    print("Test 1: head = [1,2,3,4,5]")
    result1 = reverse_list(head1)
    print(f"Expected: [5,4,3,2,1], Got: {linked_list_to_array(result1)}")
    
    # Test case 2
    head2 = create_linked_list([1, 2])
    print("Test 2: head = [1,2]")
    result2 = reverse_list(head2)
    print(f"Expected: [2,1], Got: {linked_list_to_array(result2)}")
    
    # Test case 3
    head3 = create_linked_list([])
    print("Test 3: head = []")
    result3 = reverse_list(head3)
    print(f"Expected: [], Got: {linked_list_to_array(result3)}")
    
    # Test case 4
    head4 = create_linked_list([1])
    print("Test 4: head = [1]")
    result4 = reverse_list(head4)
    print(f"Expected: [1], Got: {linked_list_to_array(result4)}")
