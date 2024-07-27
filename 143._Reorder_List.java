class Solution {
    public void reorderList(ListNode head) {
        if (head.next==null || head.next.next==null)
            return;
        ListNode slow=head,fast=head;
        while (fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        fast=slow.next;
        slow.next=null;
        slow=fast;
        Stack<ListNode> reorder=new Stack<>();
        while(slow!=null)
        {
            reorder.push(slow);
            slow=slow.next;
        }
        slow=head;fast=head.next;
        while (!reorder.empty())
        {
            slow.next=reorder.pop();
            slow.next.next=fast;
            slow=fast;
            if (fast!=null)
                fast=fast.next;
        }
    }
}
