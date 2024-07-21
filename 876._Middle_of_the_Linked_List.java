class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int count=0;
        while (temp!=null)
        {
            count++;
            temp=temp.next;
        }
        temp=head;
        for (int i=0;i<(int)count/2;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
}
