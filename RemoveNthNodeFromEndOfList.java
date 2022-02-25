package solved;

public class RemoveNthNodeFromEndOfList {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		 if(head==null)
	         return head;
	     int size=size(head);
	     if(n==size)
	         return head.next;
	     int tmp=0;
	     ListNode cur=head;
	     while(tmp<(size-n-1))
	     {
	      cur=cur.next;    tmp++;
	     }
	    // System.out.println(cur.val);
	     if(cur.next!=null)
	     cur.next=cur.next.next;
	     else 
	         cur.next=null;
	     return head;
	 }
	
	 int size(ListNode head)
	 {
	     ListNode cur=head;
	     int size=0;
	     while(cur!=null)
	     {
	         cur=cur.next;
	         size++;
	     }
	     return size;
	 }
}
