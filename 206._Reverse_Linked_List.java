class Solution {
    ListNode sol=null;
    int f=0;
    ListNode flag=null;
    public ListNode reverseList(ListNode head) {
        if (head==null)
            return null;
        else if (head.next!=null)
        {
            if (f==0)
            {   
                f++;
                flag=head;
            }
            ListNode temp=reverseList(head.next);
            head.next=temp.next;
            temp.next=head;
            if (head==flag)
                return sol;
        }  
        else 
            sol=head;          
        return head;
    }
}
