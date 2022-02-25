package solved;

public class AddTwoNumbers {

	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        if(l1==null) return l2;
	        if(l2==null) return l1;
	        ListNode t1=l1, t2=l2;
	        ListNode nlist=new ListNode(-1);
	        ListNode head=nlist;
	        int carry=0;
	        while(t1!=null || t2!=null)
	        {
	        	if(t1!=null && t2!=null) {
		            int tmp=t1.val+t2.val+carry;
		            nlist.next=new ListNode(tmp%10);
		            carry=tmp/10;
		            nlist=nlist.next;
		            t1=t1.next;
		            t2=t2.next;
	        	}
	        	else if(t1!=null)
	        	{
	        		int tmp=t1.val+carry;
		            nlist.next=new ListNode(tmp%10);
		            carry=tmp/10;
		            nlist=nlist.next;
		            t1=t1.next;
	        	}
	        	else if(t2!=null)
	        	{
	        		int tmp=t2.val+carry;
		            nlist.next=new ListNode(tmp%10);
		            carry=tmp/10;
		            nlist=nlist.next;
		            t2=t2.next;
	        	}
	        }
	        while(carry!=0)
	        {
	        	nlist.next=new ListNode(carry%10);
	        	carry/=10;
	        }
	        return head.next;
	    }
}
