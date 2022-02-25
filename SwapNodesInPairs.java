package solved;

public class SwapNodesInPairs {

	public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode finalhead=head.next , currtail=head, currhead=head;
        while(currtail!=null)
        {
            currhead=currtail.next;
            ListNode tmp=currhead.next;
            currhead.next=currtail;
            if(tmp==null || tmp.next==null )
            {
                currtail.next=tmp;
                break;
            }
            currtail.next=tmp.next;
            currtail=tmp;
        }
        return finalhead;
    }
}
