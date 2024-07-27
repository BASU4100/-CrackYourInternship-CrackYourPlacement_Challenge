class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> num1=new Stack(), num2=new Stack();
        while (l1!=null)
        {
            num1.push(l1.val);
            l1=l1.next;
        }
        while (l2!=null)
        {
            num2.push(l2.val);
            l2=l2.next;
        }
        int sum=num1.pop()+num2.pop();
        ListNode prev=new ListNode(sum%10);
        int carry=sum/10;
        while(!num1.empty() || !num2.empty())
        {
            sum=0;
            ListNode temp;
            if (!num1.empty() && !num2.empty())
            {
                sum=num1.pop()+num2.pop()+carry;
                temp=new ListNode(sum%10, prev);
                prev=temp;
                carry=sum/10;
            }
            else if (num1.empty() && !num2.empty())
            {
                sum=num2.pop()+carry;
                temp=new ListNode(sum%10, prev);
                prev=temp;
                carry=sum/10;
            }
            else if (!num1.empty())
            {
                sum=num1.pop()+carry;
                temp=new ListNode(sum%10, prev);
                prev=temp;
                carry=sum/10;
            }
        }
        if (carry>0)
            return new ListNode(carry, prev);
        else
        return prev;
    }
}
