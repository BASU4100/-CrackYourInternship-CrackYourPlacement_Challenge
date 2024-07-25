class Solution {
    public Node copyRandomList(Node head) {
        if (head==null) return null;
        else
        {
            Node headCopy=null;
            Node Current=new Node(head.val);
            ArrayList<Node> original=new ArrayList<Node>();
            ArrayList<Node> copy=new ArrayList<Node>();
            Node temp=head;
            original.add(temp);
            Current.val=temp.val;
            headCopy=Current;
            copy.add(headCopy);
            int i=0;
            temp=temp.next;
            while (temp!=null)
            {
                original.add(temp);
                Node Copy=new Node(temp.val);
                Copy.val=temp.val;
                if (i==0)
                {
                    Current=Copy;
                    headCopy.next=Current;
                    copy.add(Current);
                    i=1;
                }
                else
                {
                    Current.next=Copy;
                    Current=Current.next;
                    copy.add(Current);
                }
                temp=temp.next;
            }
            temp=head;
            Current=headCopy;
            while(temp!=null)
            {
                if (temp.random==null)
                    Current.random=null;
                else 
                    Current.random=copy.get(original.indexOf(temp.random));
                temp=temp.next;
                Current=Current.next;
            }
            return headCopy;
        }
    }
}
