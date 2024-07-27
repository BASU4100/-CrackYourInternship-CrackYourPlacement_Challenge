class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head.next==null)
            return true;
        ListNode slow=head,fast=head;
        Stack<Integer> half=new Stack<>();
        half.push(slow.val);
        while (fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if (fast.next!=null)
                half.push(slow.val);
        }
        slow=slow.next;
        while (slow!=null)
        {
            if (slow.val==half.peek())
            {
                slow=slow.next;
                half.pop();
            }
            else
                break;
        }
        return half.empty();
    }
}
