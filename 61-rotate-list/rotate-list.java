/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Find length and last node
        ListNode current = head;
        int n = 1;
        while (current.next != null) {
            n++;
            current = current.next;
        }
        current.next = head;
        k = k % n;
        if (k == 0) {
            current.next = null;
            return head;
        }

        current = head;
        for (int i = 1; i < n - k; i++) {
            current = current.next;
        }

        head = current.next;
        current.next = null;

        return head;
    }
}
