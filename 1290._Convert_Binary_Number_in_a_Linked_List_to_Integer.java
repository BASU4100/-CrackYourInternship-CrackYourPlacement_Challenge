class Solution {
    int pow=0;
    public int getDecimalValue(ListNode head) {
        if (head.next==null)
            return head.val*(int)Math.pow(2,pow++);
        int sum=getDecimalValue(head.next)+(head.val*(int)Math.pow(2,pow++));
        return sum;
    }
}
