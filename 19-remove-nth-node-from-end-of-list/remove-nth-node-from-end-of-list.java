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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        // size 
        int size=0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }

        if(n == size){
            return head.next;
        }

        //  find prev element to nth item
        int idx = size - n;
        ListNode prev = head;
        int i = 1; 
        while(i < idx){
            prev = prev.next;
            i++;
        }
        
        // deleting nth element
        prev.next = prev.next.next;
        return head;
    }
}