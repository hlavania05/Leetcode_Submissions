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
    public int pairSum(ListNode head) {
        ListNode head1 = divide(head);
        ListNode head2 = reverse(head1);
        ListNode curr1 = head;
        ListNode curr2 = head2;
        int sum = Integer.MIN_VALUE;
        while(curr1 != null && curr2 != null){
            int d1 = curr1.val;
            int d2 = curr2.val;
            sum = Math.max(sum, d1+d2);
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return sum;
    }
    public ListNode divide(ListNode head){
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode slow = prev;
        ListNode fast = head;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        return head2;

    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
}