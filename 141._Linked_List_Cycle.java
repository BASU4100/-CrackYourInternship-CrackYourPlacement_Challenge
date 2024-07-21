public class Solution {
    public boolean hasCycle(ListNode head) {
        List<ListNode> visited=new ArrayList();
        while (head!=null)
        {
            if (visited.contains(head))
                return true;
            visited.add(head);
            head=head.next;
        }
        return false;
    }
}
