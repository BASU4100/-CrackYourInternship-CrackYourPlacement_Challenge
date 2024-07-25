class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode solstart=new ListNode();
        ListNode current=new ListNode();
        int carry=0;
        int flag=0;
        int overflow=0;
        while (l1!=null || l2!=null || carry>0 )
        {
            ListNode temp=new ListNode();
            if (overflow==2 && carry>0)
            {
                temp.val=carry;
                carry=0;
                overflow=1;
            }
            else if (l1==null && l2!=null)
            {
                temp.val=(carry+l2.val)%10;
                carry=(carry+l2.val)/10;
                l2=l2.next;
                if (l2==null)
                    overflow=2;
            }
            else if (l2==null && l1!=null)
            {
                temp.val=(carry+l1.val)%10;
                carry=(carry+l1.val)/10;
                l1=l1.next;
                if (l1==null)
                    overflow=2;
            }
            else
            {
                temp.val=(carry+l1.val+l2.val)%10;
                carry=(carry+l1.val + l2.val)/10;
                l1=l1.next;
                l2=l2.next;
                if (l1==null && l2==null)
                    overflow=2;
            }
            if (flag==0)
            {
                current=temp;
                solstart=current;
                flag=1;
            }
            else
            {
                current.next=temp;
                current=current.next;
            }
        }
        return solstart;
    }
}
