class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head==null)
            return head;
        else
        {
            ListNode prev=null;
            ListNode curr=head;
            while (curr!=null)
            {
                if (curr.val!=val && prev!=null)
                {
                    prev.next=curr;
                    prev=curr;
                }
                else if (curr.val!=val)
                {
                    head=curr;
                    prev=head;
                }
                curr=curr.next;
            }
            if (prev!=null)
                prev.next=null;
            else
                head=prev;
        }
        return head;
    }
}
