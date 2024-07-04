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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head;
        ListNode temp = head.next;
        int sum = 0;
        while(temp != null){
            if(temp.val != 0){
                sum += temp.val;
            }
            else{
                curr.val = sum;
                sum = 0;
                if(temp.next != null){
                    curr = curr.next;
                }
            }
            temp = temp.next;
        }
        curr.next = null;
        return head;
        
    }
}