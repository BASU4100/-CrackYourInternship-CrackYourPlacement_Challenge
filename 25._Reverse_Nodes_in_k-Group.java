class Solution {
    public void reverse(ListNode head, ListNode target) {
        ListNode prev = head, temp = head.next, current = head;
        while (temp != target) {
            current = temp;
            temp = temp.next;
            current.next = prev;
            head.next = temp;
            prev = current;
        }
        if (target != null) {
            head.next = target.next;
            target.next = prev;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k==1)
            return head;
        int t = k;
        ListNode temp = head, prev = null, first = head, last;
        while (temp != null) {
            last = temp;
            temp = temp.next;
            t--;
            if (t == 0) {
                reverse(first, last);
                t = k;
                if (prev == null)
                    head = last;
                else
                    prev.next = last;
                prev = first;
                first=temp;
            }
        }
        return head;
    }
}
