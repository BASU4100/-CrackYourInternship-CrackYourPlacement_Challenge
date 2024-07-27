class Solution {
    public void layerHelper(Node temp)
    {
        Node cont=temp.next;
        temp.next=temp.child;
        temp.child=null;
        temp.next.prev=temp;
        temp=temp.next;
        while (temp.child!=null || temp.next!=null)
        {
            if (temp.child!=null)
                layerHelper(temp);
            else
                temp=temp.next;
        }
        temp.next=cont;
        if (cont!=null)
            cont.prev=temp;
        temp=temp.next;
    }

    public Node flatten(Node head) {
        if (head==null)
            return head;
        Node temp=head;
        while (temp.child!=null || temp.next!=null)
        {
            if (temp.child!=null)
                layerHelper(temp);
            else
                temp=temp.next;
        }
        return head;
    }
}
