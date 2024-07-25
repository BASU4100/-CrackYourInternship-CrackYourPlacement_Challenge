class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left==right) return head;
        else 
        {
            int start=1;
            ListNode prev=head;
            ListNode Current=head;
            while (start<left)
            {
                prev=Current;
                Current=Current.next;
                start++;
            }
            ArrayList<ListNode> address = new ArrayList<ListNode>();
            while (start<=right)
            {
                address.add(Current);
                Current=Current.next;
                start++;
            }
            int size=address.size()-1;
            while (size>=0)
            {
                prev.next=address.get(size);
                prev=prev.next;
                size--;
            }
            prev.next=Current;
            if (left==1)
                head=address.get(address.size()-1);
            return head;
        }
    }
}
