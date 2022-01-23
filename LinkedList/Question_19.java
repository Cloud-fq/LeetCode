class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        int i = 0;
        while(fast != null && i < n) {
            fast = fast.next;
            i++;
        }
        if(fast == null) return head.next;
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
