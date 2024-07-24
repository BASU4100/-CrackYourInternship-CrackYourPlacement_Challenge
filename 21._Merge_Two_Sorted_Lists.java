class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        if (list1 == null)
        {
            head = list2;
        }
        else if (list2 == null)
        {
            head = list1;
        }
        else if (list1.val < list2.val)
        {
            head = list1;
            list1 = list1.next;
            if (list1==null)
            {
                head.next=list2;
            }
        }
        else
        {
            head = list2;
            list2 = list2.next;
            if (list2==null)
            {
                head.next=list1;
            }
        }
        ListNode current = head;
        while (list1!=null && list2!=null)
        {
            if (list1.val < list2.val)
            {
                current.next = list1;
                list1 = list1.next;
                current = current.next;
                if (list1 == null)
                {
                    current.next = list2;
                }
            }
            else
            {
                current.next = list2;
                list2 = list2.next;
                current = current.next;
                if (list2 == null)
                {
                    current.next = list1;
                }
            }
        }
        return head;
    }
}
