class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode first = head;
        ListNode second = head.next;

        ListNode newHead = second;

        ListNode prev = null;

        while (first != null && second != null) {

            ListNode third = second.next;

            // swap
            second.next = first;
            first.next = third;

            if (prev != null) {
                prev.next = second;
            }

            // move pointers
            prev = first;
            first = third;

            if (third != null)
                second = third.next;
            else
                second = null;
        }

        return newHead;
    }
}