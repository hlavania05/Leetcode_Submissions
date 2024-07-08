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
    public ListNode partition(ListNode head, int x) {
        ListNode lowerhead = new ListNode(0);
        ListNode l1 = lowerhead;
        ListNode highhead = new ListNode(0);
        ListNode l2 = highhead;
        ListNode curr = head;
        while(curr != null){
            ListNode nn = new ListNode(curr.val);
            if(curr.val < x){
                l1.next = nn;
                l1 = l1.next;
            }
            else{
                l2.next = nn;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        l1.next = highhead.next;
        return lowerhead.next;
    }
    
}