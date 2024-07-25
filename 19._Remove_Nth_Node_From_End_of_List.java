class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=1;
        ListNode temp=head;
        while(temp.next!=null)
        {
            count++;
            temp=temp.next;
        }
        if (count==1)
            return null;
        if (n==count && count>1)
        {
            return head.next;
        }
        temp=head;
        while (temp.next!=null)
        {
            if (count-1==n)
            {
                temp.next=temp.next.next;
                if (temp.next==null)
                {
                    break;
                }
            }
            temp=temp.next;
            count--;
        }
        return head;
    }
}
