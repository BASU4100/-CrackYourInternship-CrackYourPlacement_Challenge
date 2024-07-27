class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long a=0,b=0;
        while (first!=null)
        {
            a=a*10+first.data;
            a%=1000000007;
            first=first.next;
        }
        while (second!=null)
        {
            b=b*10+second.data;
            b%=1000000007;
            second=second.next;
        }
        return (a*b)%1000000007;
    }
}
