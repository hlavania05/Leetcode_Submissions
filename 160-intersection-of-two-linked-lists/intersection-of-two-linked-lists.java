/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        int lenA = len(headA);
        int lenB = len(headB);
        int diff = Math.abs(lenA - lenB);
        while(lenA > lenB){
            headA = headA.next;
            lenA--;        
        }
        while(lenB > lenA){
            headB = headB.next;
            lenB--;
        }
        return compare(headA, headB);
    }

    public ListNode compare(ListNode h1, ListNode h2){
        if(h1 == null || h2 == null){
            return null;
        }
        if(h1 == h2){
            return h1;
        }
        return compare(h1.next, h2.next);
    }
    public int len(ListNode head){
        int cnt = 0;
        ListNode temp = head;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
}