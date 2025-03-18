
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    // Time Complexity: O(N) → We traverse the list once.
    // Space Complexity: O(1) → We use only three extra pointers.
    public ListNode reverseList(ListNode head) {
        // prev (to store the previous node)
        ListNode prev = null;
        // current (to traverse the list)
        ListNode current = head;

        while (current != null) {
            // next (to temporarily store the next node)
            ListNode next = current.next;
            // We iterate through the list, reversing the next pointer for each node.
            current.next = prev;
            prev = current;
            current = next;
        }
        // Finally, we return prev as the new head of the reversed list.
        return prev;
    }
}